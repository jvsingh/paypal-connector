/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.XMLGregorianCalendar;

import ebay.api.paypal.APIType;
import ebay.api.paypal.AddressType;
import ebay.api.paypal.AddressVerifyResponseType;
import ebay.api.paypal.AutoBillType;
import ebay.api.paypal.BMCreateButtonRequestType;
import ebay.api.paypal.BMCreateButtonResponseType;
import ebay.api.paypal.BMGetButtonDetailsRequestType;
import ebay.api.paypal.BMGetButtonDetailsResponseType;
import ebay.api.paypal.BMManageButtonStatusRequestType;
import ebay.api.paypal.BMManageButtonStatusResponseType;
import ebay.api.paypal.BMUpdateButtonRequestType;
import ebay.api.paypal.BMUpdateButtonResponseType;
import ebay.api.paypal.BillOutstandingAmountResponseType;
import ebay.api.paypal.BillingAgreementDetailsType;
import ebay.api.paypal.BillingPeriodDetailsTypeUpdate;
import ebay.api.paypal.CancelRecoupRequestType;
import ebay.api.paypal.CancelRecoupResponseType;
import ebay.api.paypal.CompleteRecoupRequestType;
import ebay.api.paypal.CompleteRecoupResponseType;
import ebay.api.paypal.CreateBillingAgreementResponseType;
import ebay.api.paypal.CreateRecurringPaymentsProfileResponseType;
import ebay.api.paypal.DetailLevelCodeType;
import ebay.api.paypal.DoAuthorizationResponseType;
import ebay.api.paypal.DoCancelResponseType;
import ebay.api.paypal.DoCaptureResponseType;
import ebay.api.paypal.DoDirectPaymentResponseType;
import ebay.api.paypal.DoExpressCheckoutPaymentResponseType;
import ebay.api.paypal.DoNonReferencedCreditResponseType;
import ebay.api.paypal.DoReauthorizationResponseType;
import ebay.api.paypal.DoReferenceTransactionResponseType;
import ebay.api.paypal.DoVoidResponseType;
import ebay.api.paypal.GetBalanceResponseType;
import ebay.api.paypal.GetBillingAgreementCustomerDetailsResponseType;
import ebay.api.paypal.GetExpressCheckoutDetailsResponseType;
import ebay.api.paypal.GetPalDetailsResponseType;
import ebay.api.paypal.GetRecurringPaymentsProfileDetailsResponseType;
import ebay.api.paypal.GetTransactionDetailsResponseType;
import ebay.api.paypal.InitiateRecoupRequestType;
import ebay.api.paypal.InitiateRecoupResponseType;
import ebay.api.paypal.InvoiceItemType;
import ebay.api.paypal.ManagePendingTransactionStatusResponseType;
import ebay.api.paypal.ManageRecurringPaymentsProfileStatusResponseType;
import ebay.api.paypal.MassPayRequestItemType;
import ebay.api.paypal.MassPayResponseType;
import ebay.api.paypal.MerchantPullPaymentCodeType;
import ebay.api.paypal.MerchantStoreDetailsType;
import ebay.api.paypal.RecurringPaymentsProfileDetailsType;
import ebay.api.paypal.RefundSourceCodeType;
import ebay.api.paypal.RefundTransactionResponseType;
import ebay.api.paypal.BasicAmountType;
import ebay.api.paypal.CompleteCodeType;
import ebay.api.paypal.CreditCardDetailsType;
import ebay.api.paypal.FMFPendingTransactionActionType;
import ebay.api.paypal.PaymentActionCodeType;
import ebay.api.paypal.PaymentDetailsType;
import ebay.api.paypal.ReceiverInfoCodeType;
import ebay.api.paypal.RefundType;
import ebay.api.paypal.ScheduleDetailsType;
import ebay.api.paypal.SetCustomerBillingAgreementResponseType;
import ebay.api.paypal.SetExpressCheckoutResponseType;
import ebay.api.paypal.ShippingOptionType;
import ebay.api.paypal.StatusChangeActionType;
import ebay.api.paypal.TransactionEntityType;
import ebay.api.paypal.UpdateRecurringPaymentsProfileResponseType;
import ebay.api.paypal.UserSelectedOptionType;

/**
 * @author juanedi
 */
public interface PaypalFacade
{

    GetBalanceResponseType getBalance(boolean returnAllCurrencies);
    
    AddressVerifyResponseType addressVerify(String email, String street, String zip);
    
    DoCaptureResponseType capture(String authorizationId, CompleteCodeType complete,
                                 BasicAmountType amount, String invoiceId, 
                                 String note, String softDescriptor, MerchantStoreDetailsType storeDetails, String msgSubId);

    DoAuthorizationResponseType authorize(String transactionId, BasicAmountType amount, 
                                  TransactionEntityType transactionEntity,String msgSubId);
    
    DoReauthorizationResponseType reAuthorize(String authorizationId, BasicAmountType amount, String msgSubId);
    
    DoVoidResponseType doVoid(String authorizationId, String note, String msgSubId);
    
    GetTransactionDetailsResponseType getTransactionDetails(String transactionId);
    
    ManagePendingTransactionStatusResponseType managePendingTransactionStatus(String transactionId,
                                  FMFPendingTransactionActionType action);
    
    GetPalDetailsResponseType getPalDetails();
    
	RefundTransactionResponseType refundTransaction(String transactionId,
			String payerId, String invoiceId, RefundType refundType,
			BasicAmountType amount, String memo, Date retryUntil,
			RefundSourceCodeType refundSource,
			MerchantStoreDetailsType merchantStoreDetails,
			boolean refundAdvice, InvoiceItemType refundItemDetails,
			String msgSubId);
    
    MassPayResponseType massPay(String emailSubject, List<MassPayRequestItemType> massPayItems,
                                  ReceiverInfoCodeType receiverType);
    
    DoDirectPaymentResponseType doDirectPayment(String ipAddress, CreditCardDetailsType cardDetails, 
                                  PaymentDetailsType paymentDetails, PaymentActionCodeType paymentAction, 
                                  Integer setReturnFMFDetails, String merchantSessionId);

    DoCancelResponseType doCancel(String cancelMsgSubId, APIType apiType, String msgSubId);

	DoNonReferencedCreditResponseType doNonReferencedCredit(
			BasicAmountType amount, BasicAmountType netAmount,
			BasicAmountType taxAmount, BasicAmountType shippingAmount,
			CreditCardDetailsType cardDetails, String recieverEmail,
			String comment);

	SetExpressCheckoutResponseType setExpressCheckout(
			List<PaymentDetailsType> paymentDetails, BasicAmountType maxAmount,
			String returnUrl, String cancelUrl, String callbackUrl,
			int callbackTimeout, boolean reqConfirmShipping, String noShipping,
			List<ShippingOptionType> flatRateShippingOptions, boolean allowNote,
			boolean addressOverride);

	GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(String token);

	DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(String token, String payerId,
			List<PaymentDetailsType> paymentDetails,
			UserSelectedOptionType userSelectedOptions,
			Integer returnFMFDetails, String giftMessage,
			boolean giftRecieptEnabled, String giftWrapName,
			BasicAmountType giftWrapAmount, String buyerMarketingEmail,
			String surveyQuestion,
			List<String> surveyChoiceSelected,
			String buttonSource);

	GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(
			String token);

	GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(
			String profileId);

	BillOutstandingAmountResponseType billOutstandingAmount(String profileId,
			BasicAmountType amount, String note);

	SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(
			BillingAgreementDetailsType billingAgreementDetails,
			String returnUrl, String cancelUrl, LocaleCode localCode,
			String pageStyle, String cppHeaderImage,
			String cppHeaderBorderColor, String cppHeaderBackColor,
			String cppPayflowColor, String buyerEmail);

	DoReferenceTransactionResponseType doReferenceTransaction(
			String referenceId, PaymentActionCodeType paymentAction,
			MerchantPullPaymentCodeType paymentType,
			PaymentDetailsType paymentDetails, String ipAddress,
			boolean reqConfirmShipping, String merchantSessionId,
			Integer returnFMFDetails, String softDescriptor, String msgSubId);

	CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(
			String token,
			CreditCardDetailsType creditCardDetails,
			RecurringPaymentsProfileDetailsType recurringPaumentsProfileDetails,
			ScheduleDetailsType scheduleDetails);

	ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(
			String profileId, StatusChangeActionType action, String note);

	CreateBillingAgreementResponseType createBillingAgreement(String token);

	UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(
			String profileId, String note, String description,
			String subscriberName, AddressType shippingAddress,
			String profileReference, Integer additionalBillingCycles,
			BasicAmountType amount, BasicAmountType shippingAmount,
			BasicAmountType taxAmount, BasicAmountType outstandingBalance,
			AutoBillType autoBillOutstandingAmount, Integer maxFailedPayments,
			XMLGregorianCalendar date,
			BillingPeriodDetailsTypeUpdate trialPeriod,
			BillingPeriodDetailsTypeUpdate paymentPeriod,
			CreditCardDetailsType creditCard);

}


