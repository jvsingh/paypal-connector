/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal.soap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.mule.module.paypal.LocaleCode;
import org.mule.module.paypal.PaypalFacade;

import ebay.api.paypal.*;

/**
 * https://cms.paypal.com/us/cgi-bin/?cmd=_render-content&content_ID=developer/
 * e_howto_api_soap_PayPalSOAPAPIArchitecture
 */
public class SoapPaypalFacade implements PaypalFacade {
	private final String username;
	private final String password;
	private final String signature;

	private String paypalEndpoint = "https://api-3t.sandbox.paypal.com/2.0/";
	private final String subject;

	public String getPaypalEndpoint() {
		return paypalEndpoint;
	}

	public void setPaypalEndpoint(String paypalEndpoint) {
		this.paypalEndpoint = paypalEndpoint;
	}

	private String apiVersion = "98.0";
	private PayPalAPIInterface api;
	private PayPalAPIAAInterface extendedApi;

	/**
	 * Creates the SoapPaypalFacade.
	 * 
	 * @param username
	 *            Paypal username
	 * @param password
	 *            Paypal password
	 * @param signature
	 *            PayPal-generated unique digital signature (a line of text, or
	 *            hash) that you copy from PayPal's website and include in your
	 *            API calls. An alternative to API Certificate security.
	 * @param subject
	 *            An indicator in an API call of the account for whom the call
	 *            is being made
	 * @param endpoint
	 *            If not provided the endpoint that will be used is the sanbox
	 *            endpoint: Live: https://api-3t.paypal.com/2.0/ Sandbox:
	 *            https://api-3t.sandbox.paypal.com/2.0/
	 */
	public SoapPaypalFacade(final String username, final String password,
			final String signature, final String subject, final String endpoint) {
		Validate.notEmpty(password, "paypal password not specified");
		Validate.notEmpty(signature, "paypal signature not specified");
		Validate.notEmpty(username, "paypal username not specified");

		this.username = username;
		this.password = password;
		this.signature = signature;
		this.subject = subject;

		if (endpoint != null && !endpoint.isEmpty())
			this.paypalEndpoint = endpoint;
	}

	protected PayPalAPIInterface getApi() {
		if (api == null) {
			final JaxWsProxyFactoryBean factory = getProxyFactory(
					PayPalAPIInterface.class, paypalEndpoint);
			api = (PayPalAPIInterface) factory.create();
			addAuthenticationHeaders((BindingProvider) api);
		}
		return api;
	}

	protected PayPalAPIAAInterface getExtendedApi() {
		if (extendedApi == null) {
			final JaxWsProxyFactoryBean factory = getProxyFactory(
					PayPalAPIAAInterface.class, paypalEndpoint);
			extendedApi = (PayPalAPIAAInterface) factory.create();
			addAuthenticationHeaders((BindingProvider) extendedApi);

		}
		return extendedApi;
	}

	private void addAuthenticationHeaders(BindingProvider provider) {
		final List<Header> headers = new ArrayList<Header>();
		final CustomSecurityHeaderType h = new CustomSecurityHeaderType();
		final UserIdPasswordType creds = new UserIdPasswordType();
		creds.setUsername(username);
		creds.setPassword(password);
		creds.setSignature(signature);
		if (subject != null) {
			creds.setSubject(subject);
		}
		h.setCredentials(creds);

		Header authHeader;
		try {
			authHeader = new Header(new QName("urn:ebay:api:PayPalAPI",
					"RequesterCredentials"), h, new JAXBDataBinding(
					h.getClass()));
			headers.add(authHeader);

			// client side:
			provider.getRequestContext().put(Header.HEADER_LIST, headers);
		} catch (final JAXBException e) {
			throw new UnhandledException(e);
		}
	}

	private JaxWsProxyFactoryBean getProxyFactory(
			@SuppressWarnings("rawtypes") final Class clazz,
			final String address) {
		final JaxWsProxyFactoryBean ret = new JaxWsProxyFactoryBean();
		ret.getInInterceptors().add(new LoggingInInterceptor());
		ret.getOutInterceptors().add(new LoggingOutInterceptor());
		ret.setServiceClass(clazz);
		ret.setAddress(address);
		return ret;
	}

	public GetBalanceResponseType getBalance(final boolean returnAllCurrencies) {
		final GetBalanceReq balanceRequest = new GetBalanceReq();
		final GetBalanceRequestType payload = new GetBalanceRequestType();
		payload.setVersion(apiVersion);
		payload.setReturnAllCurrencies(tostring(returnAllCurrencies));
		balanceRequest.setGetBalanceRequest(payload);
		final GetBalanceResponseType ret = getApi().getBalance(balanceRequest);
		handleError(ret);

		return ret;
	}

	public AddressVerifyResponseType addressVerify(final String email,
			final String street, final String zip) {
		Validate.notNull(email, "email is null");
		Validate.notNull(street, "street is null");
		Validate.notNull(zip, "zip is null");

		final AddressVerifyReq request = new AddressVerifyReq();
		final AddressVerifyRequestType payload = new AddressVerifyRequestType();
		payload.setVersion(apiVersion);
		payload.setEmail(email);
		payload.setStreet(street);
		payload.setZip(zip);
		request.setAddressVerifyRequest(payload);
		final AddressVerifyResponseType ret = getApi().addressVerify(request);
		handleError(ret);

		return ret;
	}

	public DoCaptureResponseType capture(final String authorizationId,
			final CompleteCodeType complete, final BasicAmountType amount,
			final String invoiceId, final String note,
			final String softDescriptor,
			final MerchantStoreDetailsType storeDetails, final String msgSubId) {
		Validate.isTrue(StringUtils.isNotBlank(authorizationId),
				"authorizationId is null");
		Validate.notNull(amount, "amount is null");

		final DoCaptureReq request = new DoCaptureReq();
		final DoCaptureRequestType payload = new DoCaptureRequestType();
		payload.setVersion(apiVersion);
		payload.setAuthorizationID(authorizationId);
		payload.setCompleteType(complete);
		payload.setAmount(amount);
		payload.setMsgSubID(msgSubId);
		if (invoiceId != null) {
			payload.setInvoiceID(invoiceId);
		}
		if (note != null) {
			payload.setNote(note);
		}
		if (softDescriptor != null) {
			payload.setDescriptor(softDescriptor);
		}
		request.setDoCaptureRequest(payload);
		final DoCaptureResponseType ret = getExtendedApi().doCapture(request);
		handleError(ret);

		return ret;
	}

	public DoAuthorizationResponseType authorize(final String transactionId,
			final BasicAmountType amount,
			final TransactionEntityType transactionEntity, final String msgSubId) {
		Validate.isTrue(StringUtils.isNotBlank(transactionId),
				"transactionId is null");
		Validate.notNull(amount, "amount is null");

		final DoAuthorizationReq request = new DoAuthorizationReq();
		final DoAuthorizationRequestType payload = new DoAuthorizationRequestType();
		payload.setVersion(apiVersion);
		payload.setTransactionID(transactionId);
		payload.setAmount(amount);
		payload.setMsgSubID(msgSubId);
		if (transactionEntity != null) {
			payload.setTransactionEntity(transactionEntity);
		}
		request.setDoAuthorizationRequest(payload);
		final DoAuthorizationResponseType ret = getExtendedApi()
				.doAuthorization(request);
		handleError(ret);

		return ret;
	}

	public DoReauthorizationResponseType reAuthorize(String authorizationId,
			BasicAmountType amount, String msgSubId) {
		Validate.isTrue(StringUtils.isNotBlank(authorizationId),
				"authorizationId is null");
		Validate.notNull(amount, "amount is null");

		final DoReauthorizationReq request = new DoReauthorizationReq();
		final DoReauthorizationRequestType payload = new DoReauthorizationRequestType();
		payload.setVersion(apiVersion);
		payload.setAuthorizationID(authorizationId);
		payload.setAmount(amount);
		payload.setMsgSubID(msgSubId);
		request.setDoReauthorizationRequest(payload);

		final DoReauthorizationResponseType ret = getExtendedApi()
				.doReauthorization(request);
		handleError(ret);

		return ret;
	}

	public DoVoidResponseType doVoid(String authorizationId, String note,
			String msgSubId) {
		Validate.isTrue(StringUtils.isNotBlank(authorizationId));

		final DoVoidReq request = new DoVoidReq();
		final DoVoidRequestType payload = new DoVoidRequestType();
		payload.setVersion(apiVersion);
		payload.setAuthorizationID(authorizationId);
		payload.setMsgSubID(msgSubId);
		if (note != null) {
			payload.setNote(note);
		}
		request.setDoVoidRequest(payload);

		final DoVoidResponseType ret = getExtendedApi().doVoid(request);
		handleError(ret);

		return ret;
	}

	public GetTransactionDetailsResponseType getTransactionDetails(
			String transactionId) {
		Validate.isTrue(StringUtils.isNotBlank(transactionId));

		final GetTransactionDetailsReq request = new GetTransactionDetailsReq();
		final GetTransactionDetailsRequestType payload = new GetTransactionDetailsRequestType();
		payload.setVersion(apiVersion);
		payload.setTransactionID(transactionId);
		request.setGetTransactionDetailsRequest(payload);

		final GetTransactionDetailsResponseType ret = getApi()
				.getTransactionDetails(request);
		handleError(ret);

		return ret;
	}

	public ManagePendingTransactionStatusResponseType managePendingTransactionStatus(
			final String transactionId,
			final FMFPendingTransactionActionType action) {
		Validate.isTrue(StringUtils.isNotBlank(transactionId));
		Validate.notNull(action);

		final ManagePendingTransactionStatusReq request = new ManagePendingTransactionStatusReq();
		final ManagePendingTransactionStatusRequestType payload = new ManagePendingTransactionStatusRequestType();
		payload.setVersion(apiVersion);
		payload.setTransactionID(transactionId);
		payload.setAction(action);
		request.setManagePendingTransactionStatusRequest(payload);

		final ManagePendingTransactionStatusResponseType ret = getExtendedApi()
				.managePendingTransactionStatus(request);
		handleError(ret);

		return ret;
	}

	public GetPalDetailsResponseType getPalDetails() {
		final GetPalDetailsReq request = new GetPalDetailsReq();
		GetPalDetailsRequestType payload = new GetPalDetailsRequestType();
		payload.setVersion(apiVersion);
		request.setGetPalDetailsRequest(payload);

		final GetPalDetailsResponseType ret = getApi().getPalDetails(request);
		handleError(ret);

		return ret;
	}

	public RefundTransactionResponseType refundTransaction(
			String transactionId, String payerId, String invoiceId,
			RefundType refundType, BasicAmountType amount, String memo,
			Date retryUntil, RefundSourceCodeType refundSource,
			MerchantStoreDetailsType merchantStoreDetails,
			boolean refundAdvice, InvoiceItemType refundItemDetails,
			String msgSubId) {
		Validate.isTrue(StringUtils.isNotBlank(transactionId));
		Validate.notNull(refundType);

		final RefundTransactionReq request = new RefundTransactionReq();
		final RefundTransactionRequestType payload = new RefundTransactionRequestType();
		payload.setVersion(apiVersion);
		payload.setTransactionID(transactionId);
		payload.setRefundType(refundType);
		payload.setAmount(amount);
		if (invoiceId != null) {
			payload.setInvoiceID(invoiceId);
		}
		if (memo != null) {
			payload.setMemo(memo);
		}
		request.setRefundTransactionRequest(payload);

		final RefundTransactionResponseType ret = getApi().refundTransaction(
				request);
		handleError(ret);

		return ret;
	}

	public MassPayResponseType massPay(final String emailSubject,
			final List<MassPayRequestItemType> massPayItems,
			final ReceiverInfoCodeType receiverType) {
		Validate.notNull(massPayItems);

		final MassPayReq request = new MassPayReq();
		final MassPayRequestType payload = new MassPayRequestType();

		for (MassPayRequestItemType item : massPayItems) {
			payload.getMassPayItem().add(item);
		}
		if (StringUtils.isNotBlank(emailSubject)) {
			payload.setEmailSubject(emailSubject);
		}
		if (receiverType != null) {
			payload.setReceiverType(receiverType);
		}
		payload.setVersion(apiVersion);
		request.setMassPayRequest(payload);
		final MassPayResponseType response = getApi().massPay(request);
		handleError(response);

		return response;
	}

	public DoDirectPaymentResponseType doDirectPayment(final String ipAddress,
			final CreditCardDetailsType cardDetails,
			final PaymentDetailsType paymentDetails,
			final PaymentActionCodeType paymentAction,
			final Integer setReturnFMFDetails, final String merchantSessionId) {
		Validate.isTrue(StringUtils.isNotBlank(ipAddress));
		Validate.notNull(cardDetails);
		Validate.notNull(paymentDetails);

		final DoDirectPaymentRequestDetailsType details = new DoDirectPaymentRequestDetailsType();
		details.setIPAddress(ipAddress);
		details.setCreditCard(cardDetails);
		details.setPaymentDetails(paymentDetails);
		if (paymentAction != null) {
			details.setPaymentAction(paymentAction);
		}

		details.setMerchantSessionId(merchantSessionId);

		final DoDirectPaymentRequestType payload = new DoDirectPaymentRequestType();
		payload.setVersion(apiVersion);
		payload.setDoDirectPaymentRequestDetails(details);

		final DoDirectPaymentReq request = new DoDirectPaymentReq();
		request.setDoDirectPaymentRequest(payload);

		final DoDirectPaymentResponseType response = getExtendedApi()
				.doDirectPayment(request);
		handleError(response);

		return response;
	}

	/**
	 * @param apiVersion
	 *            the apiVersion to set
	 */
	public void setApiVersion(final String apiVersion) {
		Validate.isTrue(StringUtils.isNotBlank(apiVersion));

		this.apiVersion = apiVersion;
	}

	protected void handleError(final AbstractResponseType type) {
		final AckCodeType ack = type.getAck();

		if (AckCodeType.FAILURE.equals(ack)
				|| AckCodeType.FAILURE_WITH_WARNING.equals(ack)) {
			throw new PaypalInvocationException(type);
		}
	}

	/**
	 * Several methods expects "1" as true and "0" as false
	 */
	private static String tostring(final boolean b) {
		return b ? "1" : "0";
	}

	@Override
	public DoCancelResponseType doCancel(String cancelMsgSubId,
			APIType apiType, String msgSubId) {

		Validate.notNull(cancelMsgSubId);
		Validate.notNull(apiType);

		final DoCancelReq request = new DoCancelReq();
		final DoCancelRequestType payload = new DoCancelRequestType();

		payload.setAPIType(apiType);
		payload.setCancelMsgSubID(cancelMsgSubId);
		payload.setMsgSubID(msgSubId);
		payload.setVersion(apiVersion);

		request.setDoCancelRequest(payload);

		final DoCancelResponseType response = this.getExtendedApi().doCancel(
				request);
		handleError(response);

		return response;
	}

	@Override
	public DoNonReferencedCreditResponseType doNonReferencedCredit(
			final BasicAmountType amount, final BasicAmountType netAmount,
			final BasicAmountType taxAmount,
			final BasicAmountType shippingAmount,
			final CreditCardDetailsType cardDetails,
			final String recieverEmail, final String comment) {

		Validate.notNull(amount);
		Validate.notNull(cardDetails);
		DoNonReferencedCreditRequestType payload = new DoNonReferencedCreditRequestType();

		payload.setVersion(apiVersion);
		DoNonReferencedCreditReq request = new DoNonReferencedCreditReq();

		request.setDoNonReferencedCreditRequest(payload);

		final DoNonReferencedCreditResponseType response = this
				.getExtendedApi().doNonReferencedCredit(request);
		handleError(response);

		return response;
	}

	@Override
	public SetExpressCheckoutResponseType setExpressCheckout(
			final List<PaymentDetailsType> paymentDetails,
			final BasicAmountType maxAmount, final String returnUrl,
			final String cancelUrl, final String callbackUrl,
			final int callbackTimeout, final boolean reqConfirmShipping,
			final String noShipping,
			final List<ShippingOptionType> flatRateShippingOptions,
			final boolean allowNote, final boolean addressOverride) {

		Validate.notNull(paymentDetails);
		Validate.notNull(returnUrl);
		Validate.notNull(cancelUrl);
		Validate.notNull(callbackUrl);

		SetExpressCheckoutRequestType payload = new SetExpressCheckoutRequestType();

		SetExpressCheckoutReq request = new SetExpressCheckoutReq();

		request.setSetExpressCheckoutRequest(payload);

		SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();

		details.setPaymentDetails(paymentDetails);
		details.setMaxAmount(maxAmount);
		details.setReturnURL(returnUrl);
		details.setCancelURL(cancelUrl);
		details.setCallbackURL(callbackUrl);
		details.setCallbackTimeout(String.valueOf(callbackTimeout));
		details.setReqConfirmShipping(tostring(reqConfirmShipping));
		details.setNoShipping(noShipping);
		details.setAllowNote(tostring(allowNote));
		details.setAddressOverride(tostring(addressOverride));
		details.setFlatRateShippingOptions(flatRateShippingOptions);
		payload.setSetExpressCheckoutRequestDetails(details);
		payload.setVersion(apiVersion);
		final SetExpressCheckoutResponseType response = this.getExtendedApi()
				.setExpressCheckout(request);
		handleError(response);

		return response;
	}

	@Override
	public GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(
			final String token) {

		Validate.notNull(token);

		GetExpressCheckoutDetailsRequestType payload = new GetExpressCheckoutDetailsRequestType();
		payload.setToken(token);

		GetExpressCheckoutDetailsReq request = new GetExpressCheckoutDetailsReq();
		payload.setVersion(apiVersion);
		request.setGetExpressCheckoutDetailsRequest(payload);

		final GetExpressCheckoutDetailsResponseType response = this
				.getExtendedApi().getExpressCheckoutDetails(request);
		handleError(response);

		return response;
	}

	@Override
	public DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(
			final String token, final String payerId,
			final List<PaymentDetailsType> paymentDetails,
			final UserSelectedOptionType userSelectedOptions,
			final Integer returnFMFDetails, final String giftMessage,
			final boolean giftRecieptEnabled, final String giftWrapName,
			final BasicAmountType giftWrapAmount,
			final String buyerMarketingEmail, final String surveyQuestion,
			final List<String> surveyChoiceSelected, final String buttonSource) {

		Validate.notNull(token);
		Validate.notNull(paymentDetails);

		DoExpressCheckoutPaymentRequestType payload = new DoExpressCheckoutPaymentRequestType();

		DoExpressCheckoutPaymentRequestDetailsType details = new DoExpressCheckoutPaymentRequestDetailsType();
		details.setToken(token);
		details.setPayerID(payerId);
		details.setPaymentDetails(paymentDetails);
		details.setUserSelectedOptions(userSelectedOptions);
		details.setGiftMessage(giftMessage);
		details.setGiftReceiptEnable(giftRecieptEnabled ? "true" : "false");
		details.setGiftWrapName(giftWrapName);
		details.setGiftWrapAmount(giftWrapAmount);
		details.setBuyerMarketingEmail(buyerMarketingEmail);
		details.setSurveyQuestion(surveyQuestion);
		details.setSurveyChoiceSelected(surveyChoiceSelected);
		details.setButtonSource(buttonSource);
		payload.setDoExpressCheckoutPaymentRequestDetails(details);
		payload.setReturnFMFDetails(returnFMFDetails);

		DoExpressCheckoutPaymentReq request = new DoExpressCheckoutPaymentReq();
		payload.setVersion(apiVersion);
		request.setDoExpressCheckoutPaymentRequest(payload);

		final DoExpressCheckoutPaymentResponseType response = this
				.getExtendedApi().doExpressCheckoutPayment(request);

		handleError(response);

		return response;
	}

	@Override
	public CreateBillingAgreementResponseType createBillingAgreement(
			String token) {

		final CreateBillingAgreementReq request = new CreateBillingAgreementReq();
		final CreateBillingAgreementRequestType payload = new CreateBillingAgreementRequestType();

		CreateBillingAgreementRequestType details = new CreateBillingAgreementRequestType();
		details.setToken(token);
		request.setCreateBillingAgreementRequest(details);

		payload.setVersion(apiVersion);
		request.setCreateBillingAgreementRequest(payload);

		final CreateBillingAgreementResponseType response = this
				.getExtendedApi().createBillingAgreement(request);
		handleError(response);

		return response;
	}

	@Override
	public GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(
			final String token) {

		Validate.notNull(token);

		GetBillingAgreementCustomerDetailsRequestType payload = new GetBillingAgreementCustomerDetailsRequestType();

		payload.setToken(token);

		GetBillingAgreementCustomerDetailsReq request = new GetBillingAgreementCustomerDetailsReq();
		payload.setVersion(apiVersion);
		request.setGetBillingAgreementCustomerDetailsRequest(payload);

		final GetBillingAgreementCustomerDetailsResponseType response = this
				.getExtendedApi().getBillingAgreementCustomerDetails(request);

		handleError(response);

		return response;
	}

	@Override
	public GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(
			final String profileId) {

		Validate.notNull(profileId);

		GetRecurringPaymentsProfileDetailsRequestType payload = new GetRecurringPaymentsProfileDetailsRequestType();

		payload.setProfileID(profileId);
		payload.setVersion(apiVersion);

		GetRecurringPaymentsProfileDetailsReq request = new GetRecurringPaymentsProfileDetailsReq();
		request.setGetRecurringPaymentsProfileDetailsRequest(payload);

		final GetRecurringPaymentsProfileDetailsResponseType response = this
				.getExtendedApi().getRecurringPaymentsProfileDetails(request);

		handleError(response);

		return response;
	}

	@Override
	public BillOutstandingAmountResponseType billOutstandingAmount(
			final String profileId, final BasicAmountType amount,
			final String note) {

		Validate.notNull(profileId);

		BillOutstandingAmountRequestType payload = new BillOutstandingAmountRequestType();

		BillOutstandingAmountRequestDetailsType details = new BillOutstandingAmountRequestDetailsType();

		details.setProfileID(profileId);
		details.setAmount(amount);
		details.setNote(note);

		payload.setBillOutstandingAmountRequestDetails(details);
		payload.setVersion(apiVersion);
		BillOutstandingAmountReq request = new BillOutstandingAmountReq();
		request.setBillOutstandingAmountRequest(payload);

		final BillOutstandingAmountResponseType response = this
				.getExtendedApi().billOutstandingAmount(request);

		handleError(response);

		return response;
	}

	@Override
	public SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(
			final BillingAgreementDetailsType billingAgreementDetails,
			final String returnUrl, final String cancelUrl,
			final LocaleCode localCode, final String pageStyle,
			final String cppHeaderImage, final String cppHeaderBorderColor,
			final String cppHeaderBackColor, final String cppPayflowColor,
			final String buyerEmail) {

		Validate.notNull(billingAgreementDetails);
		Validate.notNull(billingAgreementDetails.getPaymentType());
		Validate.notNull(returnUrl);
		Validate.notNull(cancelUrl);

		final SetCustomerBillingAgreementReq request = new SetCustomerBillingAgreementReq();
		final SetCustomerBillingAgreementRequestType payload = new SetCustomerBillingAgreementRequestType();

		SetCustomerBillingAgreementRequestDetailsType details = new SetCustomerBillingAgreementRequestDetailsType();

		details.setBillingAgreementDetails(billingAgreementDetails);
		details.setReturnURL(returnUrl);
		details.setCancelURL(cancelUrl);
		details.setLocaleCode(localCode.value());
		details.setPageStyle(pageStyle);
		details.setCppHeaderImage(cppHeaderImage);
		details.setCppHeaderBorderColor(cppHeaderBorderColor);
		details.setCppHeaderBackColor(cppHeaderBackColor);
		details.setCppPayflowColor(cppPayflowColor);
		details.setBuyerEmail(buyerEmail);

		payload.setSetCustomerBillingAgreementRequestDetails(details);

		request.setSetCustomerBillingAgreementRequest(payload);
		payload.setVersion(apiVersion);

		final SetCustomerBillingAgreementResponseType response = this
				.getExtendedApi().setCustomerBillingAgreement(request);
		handleError(response);

		return response;
	}

	@Override
	public DoReferenceTransactionResponseType doReferenceTransaction(
			String referenceId, PaymentActionCodeType paymentAction,
			MerchantPullPaymentCodeType paymentType,
			PaymentDetailsType paymentDetails, String ipAddress,
			boolean reqConfirmShipping, String merchantSessionId,
			Integer returnFMFDetails, String softDescriptor, String msgSubId) {

		final DoReferenceTransactionReq request = new DoReferenceTransactionReq();
		final DoReferenceTransactionRequestType payload = new DoReferenceTransactionRequestType();

		DoReferenceTransactionRequestDetailsType details = new DoReferenceTransactionRequestDetailsType();
		details.setReferenceID(referenceId);
		details.setPaymentAction(paymentAction);
		details.setPaymentType(paymentType);
		details.setPaymentDetails(paymentDetails);
		details.setIPAddress(ipAddress);
		details.setReqConfirmShipping(tostring(reqConfirmShipping));
		details.setMerchantSessionId(merchantSessionId);
		payload.setReturnFMFDetails(returnFMFDetails);
		details.setSoftDescriptor(softDescriptor);
		details.setMsgSubID(msgSubId);
		payload.setDoReferenceTransactionRequestDetails(details);
		payload.setVersion(apiVersion);
		request.setDoReferenceTransactionRequest(payload);

		final DoReferenceTransactionResponseType response = this
				.getExtendedApi().doReferenceTransaction(request);
		handleError(response);

		return response;
	}

	@Override
	public CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(
			String token,
			CreditCardDetailsType creditCardDetails,
			RecurringPaymentsProfileDetailsType recurringPaumentsProfileDetails,
			ScheduleDetailsType scheduleDetails) {

		Validate.notNull(token);
		Validate.notNull(creditCardDetails);
		Validate.notNull(recurringPaumentsProfileDetails);
		Validate.notNull(scheduleDetails);

		final CreateRecurringPaymentsProfileReq request = new CreateRecurringPaymentsProfileReq();
		final CreateRecurringPaymentsProfileRequestType payload = new CreateRecurringPaymentsProfileRequestType();

		CreateRecurringPaymentsProfileRequestDetailsType details = new CreateRecurringPaymentsProfileRequestDetailsType();
		details.setToken(token);
		details.setCreditCard(creditCardDetails);
		details.setRecurringPaymentsProfileDetails(recurringPaumentsProfileDetails);
		details.setScheduleDetails(scheduleDetails);
		payload.setCreateRecurringPaymentsProfileRequestDetails(details);

		payload.setVersion(apiVersion);
		request.setCreateRecurringPaymentsProfileRequest(payload);

		final CreateRecurringPaymentsProfileResponseType response = this
				.getExtendedApi().createRecurringPaymentsProfile(request);
		handleError(response);

		return response;
	}

	@Override
	public ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(
			String profileId, StatusChangeActionType action, String note) {
		Validate.notNull(profileId);
		Validate.notNull(action);

		final ManageRecurringPaymentsProfileStatusReq request = new ManageRecurringPaymentsProfileStatusReq();
		final ManageRecurringPaymentsProfileStatusRequestType payload = new ManageRecurringPaymentsProfileStatusRequestType();

		ManageRecurringPaymentsProfileStatusRequestDetailsType details = new ManageRecurringPaymentsProfileStatusRequestDetailsType();

		details.setProfileID(profileId);
		details.setAction(action);
		details.setNote(note);
		payload.setManageRecurringPaymentsProfileStatusRequestDetails(details);

		payload.setVersion(apiVersion);
		request.setManageRecurringPaymentsProfileStatusRequest(payload);

		final ManageRecurringPaymentsProfileStatusResponseType response = this
				.getExtendedApi().manageRecurringPaymentsProfileStatus(request);
		handleError(response);

		return response;
	}

	@Override
	public UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(
			String profileId, String note, String description,
			String subscriberName, AddressType shippingAddress,
			String profileReference, Integer additionalBillingCycles,
			BasicAmountType amount, BasicAmountType shippingAmount,
			BasicAmountType taxAmount, BasicAmountType outstandingBalance,
			AutoBillType autoBillOutstandingAmount, Integer maxFailedPayments,
			XMLGregorianCalendar date,
			BillingPeriodDetailsTypeUpdate trialPeriod,
			BillingPeriodDetailsTypeUpdate paymentPeriod,
			CreditCardDetailsType creditCard) {

		Validate.notNull(profileId);

		final UpdateRecurringPaymentsProfileReq request = new UpdateRecurringPaymentsProfileReq();
		final UpdateRecurringPaymentsProfileRequestType payload = new UpdateRecurringPaymentsProfileRequestType();

		UpdateRecurringPaymentsProfileRequestType details = new UpdateRecurringPaymentsProfileRequestType();

		UpdateRecurringPaymentsProfileRequestDetailsType requestDetails = new UpdateRecurringPaymentsProfileRequestDetailsType();

		requestDetails.setProfileID(profileId);
		requestDetails.setNote(note);
		requestDetails.setDescription(description);
		requestDetails.setSubscriberName(subscriberName);
		requestDetails.setSubscriberShippingAddress(shippingAddress);
		requestDetails.setProfileReference(profileReference);
		requestDetails.setAdditionalBillingCycles(additionalBillingCycles);
		requestDetails.setAmount(amount);
		requestDetails.setShippingAmount(shippingAmount);
		requestDetails.setTaxAmount(taxAmount);
		requestDetails.setOutstandingBalance(outstandingBalance);
		requestDetails.setAutoBillOutstandingAmount(autoBillOutstandingAmount);
		requestDetails.setMaxFailedPayments(maxFailedPayments);
		requestDetails.setBillingStartDate(date);
		requestDetails.setTrialPeriod(trialPeriod);
		requestDetails.setPaymentPeriod(paymentPeriod);
		requestDetails.setCreditCard(creditCard);

		details.setUpdateRecurringPaymentsProfileRequestDetails(requestDetails);

		request.setUpdateRecurringPaymentsProfileRequest(details);

		payload.setVersion(apiVersion);
		request.setUpdateRecurringPaymentsProfileRequest(payload);

		final UpdateRecurringPaymentsProfileResponseType response = this
				.getExtendedApi().updateRecurringPaymentsProfile(request);
		handleError(response);

		return response;
	}

}
