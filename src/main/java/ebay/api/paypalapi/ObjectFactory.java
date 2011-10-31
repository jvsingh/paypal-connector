/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.api.paypalapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ebay.apis.eblbasecomponents.CustomSecurityHeaderType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebay.api.paypalapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoAuthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponse");
    private final static QName _SetAuthFlowParamResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamResponse");
    private final static QName _AddressVerifyRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequest");
    private final static QName _EnterBoardingRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "EnterBoardingRequest");
    private final static QName _ManageRecurringPaymentsProfileStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequest");
    private final static QName _GetBoardingDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsRequest");
    private final static QName _GetMobileStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetMobileStatusRequest");
    private final static QName _BMGetButtonDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsResponse");
    private final static QName _BMButtonSearchRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMButtonSearchRequest");
    private final static QName _DoUATPExpressCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentRequest");
    private final static QName _DoCaptureResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCaptureResponse");
    private final static QName _CreateBillingAgreementRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementRequest");
    private final static QName _GetBillingAgreementCustomerDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponse");
    private final static QName _ManageRecurringPaymentsProfileStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusResponse");
    private final static QName _BillUserRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillUserRequest");
    private final static QName _BillOutstandingAmountResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountResponse");
    private final static QName _UpdateAccessPermissionsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsRequest");
    private final static QName _DoMobileCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentRequest");
    private final static QName _SetMobileCheckoutResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutResponse");
    private final static QName _DoReauthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponse");
    private final static QName _EnterBoardingResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "EnterBoardingResponse");
    private final static QName _GetAuthDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsRequest");
    private final static QName _UpdateRecurringPaymentsProfileResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileResponse");
    private final static QName _CreateBillingAgreementResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementResponse");
    private final static QName _GetRecurringPaymentsProfileDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsRequest");
    private final static QName _GetAccessPermissionDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsRequest");
    private final static QName _CreateRecurringPaymentsProfileResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileResponse");
    private final static QName _BMSetInventoryResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMSetInventoryResponse");
    private final static QName _TransactionSearchResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "TransactionSearchResponse");
    private final static QName _BMButtonSearchResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMButtonSearchResponse");
    private final static QName _GetBoardingDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsResponse");
    private final static QName _BillOutstandingAmountRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountRequest");
    private final static QName _GetAuthDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsResponse");
    private final static QName _DoReferenceTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionResponse");
    private final static QName _GetBillingAgreementCustomerDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsRequest");
    private final static QName _BMCreateButtonRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMCreateButtonRequest");
    private final static QName _DoVoidResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoVoidResponse");
    private final static QName _BMGetButtonDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsRequest");
    private final static QName _SetExpressCheckoutRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequest");
    private final static QName _ManagePendingTransactionStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusResponse");
    private final static QName _BMUpdateButtonResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonResponse");
    private final static QName _DoUATPAuthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequest");
    private final static QName _BMManageButtonStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusResponse");
    private final static QName _BMGetInventoryResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetInventoryResponse");
    private final static QName _GetRecurringPaymentsProfileDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsResponse");
    private final static QName _DoUATPAuthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationResponse");
    private final static QName _SetCustomerBillingAgreementRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementRequest");
    private final static QName _ManagePendingTransactionStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusRequest");
    private final static QName _DoUATPExpressCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponse");
    private final static QName _SetAuthFlowParamRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamRequest");
    private final static QName _BAUpdateResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BAUpdateResponse");
    private final static QName _GetIncentiveEvaluationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationResponse");
    private final static QName _AddressVerifyResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "AddressVerifyResponse");
    private final static QName _BMSetInventoryRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMSetInventoryRequest");
    private final static QName _GetPalDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetPalDetailsResponse");
    private final static QName _CreateMobilePaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentResponse");
    private final static QName _RequesterCredentials_QNAME = new QName("urn:ebay:api:PayPalAPI", "RequesterCredentials");
    private final static QName _BillUserResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillUserResponse");
    private final static QName _DoExpressCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponse");
    private final static QName _CreateRecurringPaymentsProfileRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileRequest");
    private final static QName _UpdateRecurringPaymentsProfileRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileRequest");
    private final static QName _DoVoidRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoVoidRequest");
    private final static QName _BMGetInventoryRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequest");
    private final static QName _SetAccessPermissionsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsResponse");
    private final static QName _CancelRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CancelRecoupResponse");
    private final static QName _InitiateRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "InitiateRecoupResponse");
    private final static QName _GetExpressCheckoutDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponse");
    private final static QName _ReverseTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequest");
    private final static QName _MassPayResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "MassPayResponse");
    private final static QName _RefundTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionResponse");
    private final static QName _CompleteRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CompleteRecoupRequest");
    private final static QName _DoAuthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoAuthorizationRequest");
    private final static QName _GetIncentiveEvaluationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationRequest");
    private final static QName _CompleteRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CompleteRecoupResponse");
    private final static QName _DoDirectPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequest");
    private final static QName _GetMobileStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetMobileStatusResponse");
    private final static QName _SetCustomerBillingAgreementResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementResponse");
    private final static QName _GetBalanceResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBalanceResponse");
    private final static QName _DoNonReferencedCreditRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditRequest");
    private final static QName _DoMobileCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentResponse");
    private final static QName _SetAccessPermissionsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsRequest");
    private final static QName _SetMobileCheckoutRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequest");
    private final static QName _DoCaptureRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCaptureRequest");
    private final static QName _SetExpressCheckoutResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutResponse");
    private final static QName _DoNonReferencedCreditResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditResponse");
    private final static QName _GetTransactionDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsRequest");
    private final static QName _BMUpdateButtonRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonRequest");
    private final static QName _DoReferenceTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionRequest");
    private final static QName _TransactionSearchRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequest");
    private final static QName _GetTransactionDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsResponse");
    private final static QName _GetBalanceRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBalanceRequest");
    private final static QName _BMCreateButtonResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMCreateButtonResponse");
    private final static QName _RefundTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequest");
    private final static QName _CreateMobilePaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentRequest");
    private final static QName _BMManageButtonStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequest");
    private final static QName _DoReauthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequest");
    private final static QName _UpdateAccessPermissionsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsResponse");
    private final static QName _GetAccessPermissionDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsResponse");
    private final static QName _DoDirectPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponse");
    private final static QName _CancelRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CancelRecoupRequest");
    private final static QName _DoExpressCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequest");
    private final static QName _InitiateRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequest");
    private final static QName _BAUpdateRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BAUpdateRequest");
    private final static QName _MassPayRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "MassPayRequest");
    private final static QName _GetExpressCheckoutDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsRequest");
    private final static QName _ReverseTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ReverseTransactionResponse");
    private final static QName _GetPalDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetPalDetailsRequest");
    private final static QName _RefundTransactionResponseTypeRefundTransactionID_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebay.api.paypalapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentResponseType }
     * 
     */
    public DoMobileCheckoutPaymentResponseType createDoMobileCheckoutPaymentResponseType() {
        return new DoMobileCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationRequestType }
     * 
     */
    public GetIncentiveEvaluationRequestType createGetIncentiveEvaluationRequestType() {
        return new GetIncentiveEvaluationRequestType();
    }

    /**
     * Create an instance of {@link DoReauthorizationResponseType }
     * 
     */
    public DoReauthorizationResponseType createDoReauthorizationResponseType() {
        return new DoReauthorizationResponseType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsRequestType }
     * 
     */
    public GetAccessPermissionDetailsRequestType createGetAccessPermissionDetailsRequestType() {
        return new GetAccessPermissionDetailsRequestType();
    }

    /**
     * Create an instance of {@link BMGetInventoryRequestType }
     * 
     */
    public BMGetInventoryRequestType createBMGetInventoryRequestType() {
        return new BMGetInventoryRequestType();
    }

    /**
     * Create an instance of {@link DoReauthorizationReq }
     * 
     */
    public DoReauthorizationReq createDoReauthorizationReq() {
        return new DoReauthorizationReq();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsReq }
     * 
     */
    public SetAccessPermissionsReq createSetAccessPermissionsReq() {
        return new SetAccessPermissionsReq();
    }

    /**
     * Create an instance of {@link InstallmentDetailsType }
     * 
     */
    public InstallmentDetailsType createInstallmentDetailsType() {
        return new InstallmentDetailsType();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsRequestType }
     * 
     */
    public GetBillingAgreementCustomerDetailsRequestType createGetBillingAgreementCustomerDetailsRequestType() {
        return new GetBillingAgreementCustomerDetailsRequestType();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsReq }
     * 
     */
    public BMGetButtonDetailsReq createBMGetButtonDetailsReq() {
        return new BMGetButtonDetailsReq();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentRequestType }
     * 
     */
    public DoExpressCheckoutPaymentRequestType createDoExpressCheckoutPaymentRequestType() {
        return new DoExpressCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileResponseType }
     * 
     */
    public CreateRecurringPaymentsProfileResponseType createCreateRecurringPaymentsProfileResponseType() {
        return new CreateRecurringPaymentsProfileResponseType();
    }

    /**
     * Create an instance of {@link AddressVerifyRequestType }
     * 
     */
    public AddressVerifyRequestType createAddressVerifyRequestType() {
        return new AddressVerifyRequestType();
    }

    /**
     * Create an instance of {@link BillUserReq }
     * 
     */
    public BillUserReq createBillUserReq() {
        return new BillUserReq();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsReq }
     * 
     */
    public UpdateAccessPermissionsReq createUpdateAccessPermissionsReq() {
        return new UpdateAccessPermissionsReq();
    }

    /**
     * Create an instance of {@link BAUpdateResponseType }
     * 
     */
    public BAUpdateResponseType createBAUpdateResponseType() {
        return new BAUpdateResponseType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutReq }
     * 
     */
    public SetExpressCheckoutReq createSetExpressCheckoutReq() {
        return new SetExpressCheckoutReq();
    }

    /**
     * Create an instance of {@link BMUpdateButtonRequestType }
     * 
     */
    public BMUpdateButtonRequestType createBMUpdateButtonRequestType() {
        return new BMUpdateButtonRequestType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutResponseType }
     * 
     */
    public SetExpressCheckoutResponseType createSetExpressCheckoutResponseType() {
        return new SetExpressCheckoutResponseType();
    }

    /**
     * Create an instance of {@link TransactionSearchResponseType }
     * 
     */
    public TransactionSearchResponseType createTransactionSearchResponseType() {
        return new TransactionSearchResponseType();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsResponseType }
     * 
     */
    public UpdateAccessPermissionsResponseType createUpdateAccessPermissionsResponseType() {
        return new UpdateAccessPermissionsResponseType();
    }

    /**
     * Create an instance of {@link GetMobileStatusRequestType }
     * 
     */
    public GetMobileStatusRequestType createGetMobileStatusRequestType() {
        return new GetMobileStatusRequestType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountReq }
     * 
     */
    public BillOutstandingAmountReq createBillOutstandingAmountReq() {
        return new BillOutstandingAmountReq();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileRequestType }
     * 
     */
    public UpdateRecurringPaymentsProfileRequestType createUpdateRecurringPaymentsProfileRequestType() {
        return new UpdateRecurringPaymentsProfileRequestType();
    }

    /**
     * Create an instance of {@link GetBalanceRequestType }
     * 
     */
    public GetBalanceRequestType createGetBalanceRequestType() {
        return new GetBalanceRequestType();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusReq }
     * 
     */
    public BMManageButtonStatusReq createBMManageButtonStatusReq() {
        return new BMManageButtonStatusReq();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusRequestType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusRequestType createManageRecurringPaymentsProfileStatusRequestType() {
        return new ManageRecurringPaymentsProfileStatusRequestType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionRequestType }
     * 
     */
    public DoReferenceTransactionRequestType createDoReferenceTransactionRequestType() {
        return new DoReferenceTransactionRequestType();
    }

    /**
     * Create an instance of {@link CompleteRecoupReq }
     * 
     */
    public CompleteRecoupReq createCompleteRecoupReq() {
        return new CompleteRecoupReq();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementReq }
     * 
     */
    public CreateBillingAgreementReq createCreateBillingAgreementReq() {
        return new CreateBillingAgreementReq();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsReq }
     * 
     */
    public GetTransactionDetailsReq createGetTransactionDetailsReq() {
        return new GetTransactionDetailsReq();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionResponseType }
     * 
     */
    public DoReferenceTransactionResponseType createDoReferenceTransactionResponseType() {
        return new DoReferenceTransactionResponseType();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationResponseType }
     * 
     */
    public DoUATPAuthorizationResponseType createDoUATPAuthorizationResponseType() {
        return new DoUATPAuthorizationResponseType();
    }

    /**
     * Create an instance of {@link MassPayResponseType }
     * 
     */
    public MassPayResponseType createMassPayResponseType() {
        return new MassPayResponseType();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationRequestType }
     * 
     */
    public DoUATPAuthorizationRequestType createDoUATPAuthorizationRequestType() {
        return new DoUATPAuthorizationRequestType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsRequestType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsRequestType createGetRecurringPaymentsProfileDetailsRequestType() {
        return new GetRecurringPaymentsProfileDetailsRequestType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsResponseType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsResponseType createGetRecurringPaymentsProfileDetailsResponseType() {
        return new GetRecurringPaymentsProfileDetailsResponseType();
    }

    /**
     * Create an instance of {@link BMCreateButtonRequestType }
     * 
     */
    public BMCreateButtonRequestType createBMCreateButtonRequestType() {
        return new BMCreateButtonRequestType();
    }

    /**
     * Create an instance of {@link RefundTransactionRequestType }
     * 
     */
    public RefundTransactionRequestType createRefundTransactionRequestType() {
        return new RefundTransactionRequestType();
    }

    /**
     * Create an instance of {@link EnterBoardingReq }
     * 
     */
    public EnterBoardingReq createEnterBoardingReq() {
        return new EnterBoardingReq();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutRequestType }
     * 
     */
    public SetMobileCheckoutRequestType createSetMobileCheckoutRequestType() {
        return new SetMobileCheckoutRequestType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileReq }
     * 
     */
    public CreateRecurringPaymentsProfileReq createCreateRecurringPaymentsProfileReq() {
        return new CreateRecurringPaymentsProfileReq();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementResponseType }
     * 
     */
    public SetCustomerBillingAgreementResponseType createSetCustomerBillingAgreementResponseType() {
        return new SetCustomerBillingAgreementResponseType();
    }

    /**
     * Create an instance of {@link GetBalanceReq }
     * 
     */
    public GetBalanceReq createGetBalanceReq() {
        return new GetBalanceReq();
    }

    /**
     * Create an instance of {@link GetAuthDetailsRequestType }
     * 
     */
    public GetAuthDetailsRequestType createGetAuthDetailsRequestType() {
        return new GetAuthDetailsRequestType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementReq }
     * 
     */
    public SetCustomerBillingAgreementReq createSetCustomerBillingAgreementReq() {
        return new SetCustomerBillingAgreementReq();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentResponseType }
     * 
     */
    public DoUATPExpressCheckoutPaymentResponseType createDoUATPExpressCheckoutPaymentResponseType() {
        return new DoUATPExpressCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link DoAuthorizationResponseType }
     * 
     */
    public DoAuthorizationResponseType createDoAuthorizationResponseType() {
        return new DoAuthorizationResponseType();
    }

    /**
     * Create an instance of {@link MassPayReq }
     * 
     */
    public MassPayReq createMassPayReq() {
        return new MassPayReq();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentResponseType }
     * 
     */
    public CreateMobilePaymentResponseType createCreateMobilePaymentResponseType() {
        return new CreateMobilePaymentResponseType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsResponseType }
     * 
     */
    public GetExpressCheckoutDetailsResponseType createGetExpressCheckoutDetailsResponseType() {
        return new GetExpressCheckoutDetailsResponseType();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsRequestType }
     * 
     */
    public SetAccessPermissionsRequestType createSetAccessPermissionsRequestType() {
        return new SetAccessPermissionsRequestType();
    }

    /**
     * Create an instance of {@link DoCaptureRequestType }
     * 
     */
    public DoCaptureRequestType createDoCaptureRequestType() {
        return new DoCaptureRequestType();
    }

    /**
     * Create an instance of {@link GetPalDetailsReq }
     * 
     */
    public GetPalDetailsReq createGetPalDetailsReq() {
        return new GetPalDetailsReq();
    }

    /**
     * Create an instance of {@link BMUpdateButtonResponseType }
     * 
     */
    public BMUpdateButtonResponseType createBMUpdateButtonResponseType() {
        return new BMUpdateButtonResponseType();
    }

    /**
     * Create an instance of {@link CancelRecoupResponseType }
     * 
     */
    public CancelRecoupResponseType createCancelRecoupResponseType() {
        return new CancelRecoupResponseType();
    }

    /**
     * Create an instance of {@link GetBalanceResponseType }
     * 
     */
    public GetBalanceResponseType createGetBalanceResponseType() {
        return new GetBalanceResponseType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsResponseType }
     * 
     */
    public GetAuthDetailsResponseType createGetAuthDetailsResponseType() {
        return new GetAuthDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetMobileStatusResponseType }
     * 
     */
    public GetMobileStatusResponseType createGetMobileStatusResponseType() {
        return new GetMobileStatusResponseType();
    }

    /**
     * Create an instance of {@link CompleteRecoupResponseType }
     * 
     */
    public CompleteRecoupResponseType createCompleteRecoupResponseType() {
        return new CompleteRecoupResponseType();
    }

    /**
     * Create an instance of {@link CancelRecoupReq }
     * 
     */
    public CancelRecoupReq createCancelRecoupReq() {
        return new CancelRecoupReq();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamReq }
     * 
     */
    public SetAuthFlowParamReq createSetAuthFlowParamReq() {
        return new SetAuthFlowParamReq();
    }

    /**
     * Create an instance of {@link GetPalDetailsResponseType }
     * 
     */
    public GetPalDetailsResponseType createGetPalDetailsResponseType() {
        return new GetPalDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetPalDetailsRequestType }
     * 
     */
    public GetPalDetailsRequestType createGetPalDetailsRequestType() {
        return new GetPalDetailsRequestType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsRequestType }
     * 
     */
    public GetExpressCheckoutDetailsRequestType createGetExpressCheckoutDetailsRequestType() {
        return new GetExpressCheckoutDetailsRequestType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountRequestType }
     * 
     */
    public BillOutstandingAmountRequestType createBillOutstandingAmountRequestType() {
        return new BillOutstandingAmountRequestType();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsResponseType }
     * 
     */
    public GetTransactionDetailsResponseType createGetTransactionDetailsResponseType() {
        return new GetTransactionDetailsResponseType();
    }

    /**
     * Create an instance of {@link OptionSelectionDetailsType }
     * 
     */
    public OptionSelectionDetailsType createOptionSelectionDetailsType() {
        return new OptionSelectionDetailsType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutReq }
     * 
     */
    public SetMobileCheckoutReq createSetMobileCheckoutReq() {
        return new SetMobileCheckoutReq();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusReq }
     * 
     */
    public ManageRecurringPaymentsProfileStatusReq createManageRecurringPaymentsProfileStatusReq() {
        return new ManageRecurringPaymentsProfileStatusReq();
    }

    /**
     * Create an instance of {@link DoAuthorizationRequestType }
     * 
     */
    public DoAuthorizationRequestType createDoAuthorizationRequestType() {
        return new DoAuthorizationRequestType();
    }

    /**
     * Create an instance of {@link AddressVerifyReq }
     * 
     */
    public AddressVerifyReq createAddressVerifyReq() {
        return new AddressVerifyReq();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusRequestType }
     * 
     */
    public BMManageButtonStatusRequestType createBMManageButtonStatusRequestType() {
        return new BMManageButtonStatusRequestType();
    }

    /**
     * Create an instance of {@link BillUserResponseType }
     * 
     */
    public BillUserResponseType createBillUserResponseType() {
        return new BillUserResponseType();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentReq }
     * 
     */
    public DoUATPExpressCheckoutPaymentReq createDoUATPExpressCheckoutPaymentReq() {
        return new DoUATPExpressCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link RefundTransactionResponseType }
     * 
     */
    public RefundTransactionResponseType createRefundTransactionResponseType() {
        return new RefundTransactionResponseType();
    }

    /**
     * Create an instance of {@link DoVoidReq }
     * 
     */
    public DoVoidReq createDoVoidReq() {
        return new DoVoidReq();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsResponseType }
     * 
     */
    public BMGetButtonDetailsResponseType createBMGetButtonDetailsResponseType() {
        return new BMGetButtonDetailsResponseType();
    }

    /**
     * Create an instance of {@link BMSetInventoryRequestType }
     * 
     */
    public BMSetInventoryRequestType createBMSetInventoryRequestType() {
        return new BMSetInventoryRequestType();
    }

    /**
     * Create an instance of {@link BMButtonSearchResponseType }
     * 
     */
    public BMButtonSearchResponseType createBMButtonSearchResponseType() {
        return new BMButtonSearchResponseType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionReq }
     * 
     */
    public DoReferenceTransactionReq createDoReferenceTransactionReq() {
        return new DoReferenceTransactionReq();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditRequestType }
     * 
     */
    public DoNonReferencedCreditRequestType createDoNonReferencedCreditRequestType() {
        return new DoNonReferencedCreditRequestType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsResponseType }
     * 
     */
    public GetAccessPermissionDetailsResponseType createGetAccessPermissionDetailsResponseType() {
        return new GetAccessPermissionDetailsResponseType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentResponseType }
     * 
     */
    public DoDirectPaymentResponseType createDoDirectPaymentResponseType() {
        return new DoDirectPaymentResponseType();
    }

    /**
     * Create an instance of {@link BMCreateButtonReq }
     * 
     */
    public BMCreateButtonReq createBMCreateButtonReq() {
        return new BMCreateButtonReq();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsResponseType }
     * 
     */
    public GetBillingAgreementCustomerDetailsResponseType createGetBillingAgreementCustomerDetailsResponseType() {
        return new GetBillingAgreementCustomerDetailsResponseType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementRequestType }
     * 
     */
    public SetCustomerBillingAgreementRequestType createSetCustomerBillingAgreementRequestType() {
        return new SetCustomerBillingAgreementRequestType();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusRequestType }
     * 
     */
    public ManagePendingTransactionStatusRequestType createManagePendingTransactionStatusRequestType() {
        return new ManagePendingTransactionStatusRequestType();
    }

    /**
     * Create an instance of {@link BMButtonSearchRequestType }
     * 
     */
    public BMButtonSearchRequestType createBMButtonSearchRequestType() {
        return new BMButtonSearchRequestType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationReq }
     * 
     */
    public GetIncentiveEvaluationReq createGetIncentiveEvaluationReq() {
        return new GetIncentiveEvaluationReq();
    }

    /**
     * Create an instance of {@link ReverseTransactionRequestType }
     * 
     */
    public ReverseTransactionRequestType createReverseTransactionRequestType() {
        return new ReverseTransactionRequestType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamRequestType }
     * 
     */
    public SetAuthFlowParamRequestType createSetAuthFlowParamRequestType() {
        return new SetAuthFlowParamRequestType();
    }

    /**
     * Create an instance of {@link MassPayRequestItemType }
     * 
     */
    public MassPayRequestItemType createMassPayRequestItemType() {
        return new MassPayRequestItemType();
    }

    /**
     * Create an instance of {@link OptionDetailsType }
     * 
     */
    public OptionDetailsType createOptionDetailsType() {
        return new OptionDetailsType();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusReq }
     * 
     */
    public ManagePendingTransactionStatusReq createManagePendingTransactionStatusReq() {
        return new ManagePendingTransactionStatusReq();
    }

    /**
     * Create an instance of {@link BMUpdateButtonReq }
     * 
     */
    public BMUpdateButtonReq createBMUpdateButtonReq() {
        return new BMUpdateButtonReq();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationResponseType }
     * 
     */
    public GetIncentiveEvaluationResponseType createGetIncentiveEvaluationResponseType() {
        return new GetIncentiveEvaluationResponseType();
    }

    /**
     * Create an instance of {@link DoCaptureReq }
     * 
     */
    public DoCaptureReq createDoCaptureReq() {
        return new DoCaptureReq();
    }

    /**
     * Create an instance of {@link DoAuthorizationReq }
     * 
     */
    public DoAuthorizationReq createDoAuthorizationReq() {
        return new DoAuthorizationReq();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutRequestType }
     * 
     */
    public SetExpressCheckoutRequestType createSetExpressCheckoutRequestType() {
        return new SetExpressCheckoutRequestType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsRequestType }
     * 
     */
    public GetBoardingDetailsRequestType createGetBoardingDetailsRequestType() {
        return new GetBoardingDetailsRequestType();
    }

    /**
     * Create an instance of {@link DoVoidRequestType }
     * 
     */
    public DoVoidRequestType createDoVoidRequestType() {
        return new DoVoidRequestType();
    }

    /**
     * Create an instance of {@link AddressVerifyResponseType }
     * 
     */
    public AddressVerifyResponseType createAddressVerifyResponseType() {
        return new AddressVerifyResponseType();
    }

    /**
     * Create an instance of {@link InitiateRecoupRequestType }
     * 
     */
    public InitiateRecoupRequestType createInitiateRecoupRequestType() {
        return new InitiateRecoupRequestType();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsRequestType }
     * 
     */
    public GetTransactionDetailsRequestType createGetTransactionDetailsRequestType() {
        return new GetTransactionDetailsRequestType();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentReq }
     * 
     */
    public CreateMobilePaymentReq createCreateMobilePaymentReq() {
        return new CreateMobilePaymentReq();
    }

    /**
     * Create an instance of {@link MassPayRequestType }
     * 
     */
    public MassPayRequestType createMassPayRequestType() {
        return new MassPayRequestType();
    }

    /**
     * Create an instance of {@link DoReauthorizationRequestType }
     * 
     */
    public DoReauthorizationRequestType createDoReauthorizationRequestType() {
        return new DoReauthorizationRequestType();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementResponseType }
     * 
     */
    public CreateBillingAgreementResponseType createCreateBillingAgreementResponseType() {
        return new CreateBillingAgreementResponseType();
    }

    /**
     * Create an instance of {@link ReverseTransactionReq }
     * 
     */
    public ReverseTransactionReq createReverseTransactionReq() {
        return new ReverseTransactionReq();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusResponseType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusResponseType createManageRecurringPaymentsProfileStatusResponseType() {
        return new ManageRecurringPaymentsProfileStatusResponseType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentRequestType }
     * 
     */
    public DoDirectPaymentRequestType createDoDirectPaymentRequestType() {
        return new DoDirectPaymentRequestType();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationReq }
     * 
     */
    public DoUATPAuthorizationReq createDoUATPAuthorizationReq() {
        return new DoUATPAuthorizationReq();
    }

    /**
     * Create an instance of {@link InitiateRecoupResponseType }
     * 
     */
    public InitiateRecoupResponseType createInitiateRecoupResponseType() {
        return new InitiateRecoupResponseType();
    }

    /**
     * Create an instance of {@link BMGetInventoryResponseType }
     * 
     */
    public BMGetInventoryResponseType createBMGetInventoryResponseType() {
        return new BMGetInventoryResponseType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamResponseType }
     * 
     */
    public SetAuthFlowParamResponseType createSetAuthFlowParamResponseType() {
        return new SetAuthFlowParamResponseType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentReq }
     * 
     */
    public DoDirectPaymentReq createDoDirectPaymentReq() {
        return new DoDirectPaymentReq();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileResponseType }
     * 
     */
    public UpdateRecurringPaymentsProfileResponseType createUpdateRecurringPaymentsProfileResponseType() {
        return new UpdateRecurringPaymentsProfileResponseType();
    }

    /**
     * Create an instance of {@link CancelRecoupRequestType }
     * 
     */
    public CancelRecoupRequestType createCancelRecoupRequestType() {
        return new CancelRecoupRequestType();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentRequestType }
     * 
     */
    public CreateMobilePaymentRequestType createCreateMobilePaymentRequestType() {
        return new CreateMobilePaymentRequestType();
    }

    /**
     * Create an instance of {@link BMSetInventoryResponseType }
     * 
     */
    public BMSetInventoryResponseType createBMSetInventoryResponseType() {
        return new BMSetInventoryResponseType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentReq }
     * 
     */
    public DoExpressCheckoutPaymentReq createDoExpressCheckoutPaymentReq() {
        return new DoExpressCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link InitiateRecoupReq }
     * 
     */
    public InitiateRecoupReq createInitiateRecoupReq() {
        return new InitiateRecoupReq();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileReq }
     * 
     */
    public UpdateRecurringPaymentsProfileReq createUpdateRecurringPaymentsProfileReq() {
        return new UpdateRecurringPaymentsProfileReq();
    }

    /**
     * Create an instance of {@link ReverseTransactionResponseType }
     * 
     */
    public ReverseTransactionResponseType createReverseTransactionResponseType() {
        return new ReverseTransactionResponseType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountResponseType }
     * 
     */
    public BillOutstandingAmountResponseType createBillOutstandingAmountResponseType() {
        return new BillOutstandingAmountResponseType();
    }

    /**
     * Create an instance of {@link EnterBoardingRequestType }
     * 
     */
    public EnterBoardingRequestType createEnterBoardingRequestType() {
        return new EnterBoardingRequestType();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsReq }
     * 
     */
    public GetBillingAgreementCustomerDetailsReq createGetBillingAgreementCustomerDetailsReq() {
        return new GetBillingAgreementCustomerDetailsReq();
    }

    /**
     * Create an instance of {@link TransactionSearchRequestType }
     * 
     */
    public TransactionSearchRequestType createTransactionSearchRequestType() {
        return new TransactionSearchRequestType();
    }

    /**
     * Create an instance of {@link EnterBoardingResponseType }
     * 
     */
    public EnterBoardingResponseType createEnterBoardingResponseType() {
        return new EnterBoardingResponseType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutResponseType }
     * 
     */
    public SetMobileCheckoutResponseType createSetMobileCheckoutResponseType() {
        return new SetMobileCheckoutResponseType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsReq }
     * 
     */
    public GetBoardingDetailsReq createGetBoardingDetailsReq() {
        return new GetBoardingDetailsReq();
    }

    /**
     * Create an instance of {@link DoVoidResponseType }
     * 
     */
    public DoVoidResponseType createDoVoidResponseType() {
        return new DoVoidResponseType();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsRequestType }
     * 
     */
    public BMGetButtonDetailsRequestType createBMGetButtonDetailsRequestType() {
        return new BMGetButtonDetailsRequestType();
    }

    /**
     * Create an instance of {@link BMSetInventoryReq }
     * 
     */
    public BMSetInventoryReq createBMSetInventoryReq() {
        return new BMSetInventoryReq();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsReq }
     * 
     */
    public GetExpressCheckoutDetailsReq createGetExpressCheckoutDetailsReq() {
        return new GetExpressCheckoutDetailsReq();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsReq }
     * 
     */
    public GetAccessPermissionDetailsReq createGetAccessPermissionDetailsReq() {
        return new GetAccessPermissionDetailsReq();
    }

    /**
     * Create an instance of {@link BAUpdateRequestType }
     * 
     */
    public BAUpdateRequestType createBAUpdateRequestType() {
        return new BAUpdateRequestType();
    }

    /**
     * Create an instance of {@link TransactionSearchReq }
     * 
     */
    public TransactionSearchReq createTransactionSearchReq() {
        return new TransactionSearchReq();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusResponseType }
     * 
     */
    public BMManageButtonStatusResponseType createBMManageButtonStatusResponseType() {
        return new BMManageButtonStatusResponseType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentResponseType }
     * 
     */
    public DoExpressCheckoutPaymentResponseType createDoExpressCheckoutPaymentResponseType() {
        return new DoExpressCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link BMButtonSearchReq }
     * 
     */
    public BMButtonSearchReq createBMButtonSearchReq() {
        return new BMButtonSearchReq();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsResponseType }
     * 
     */
    public SetAccessPermissionsResponseType createSetAccessPermissionsResponseType() {
        return new SetAccessPermissionsResponseType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentReq }
     * 
     */
    public DoMobileCheckoutPaymentReq createDoMobileCheckoutPaymentReq() {
        return new DoMobileCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link GetMobileStatusReq }
     * 
     */
    public GetMobileStatusReq createGetMobileStatusReq() {
        return new GetMobileStatusReq();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentRequestType }
     * 
     */
    public DoUATPExpressCheckoutPaymentRequestType createDoUATPExpressCheckoutPaymentRequestType() {
        return new DoUATPExpressCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link BillAgreementUpdateReq }
     * 
     */
    public BillAgreementUpdateReq createBillAgreementUpdateReq() {
        return new BillAgreementUpdateReq();
    }

    /**
     * Create an instance of {@link CompleteRecoupRequestType }
     * 
     */
    public CompleteRecoupRequestType createCompleteRecoupRequestType() {
        return new CompleteRecoupRequestType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsReq }
     * 
     */
    public GetAuthDetailsReq createGetAuthDetailsReq() {
        return new GetAuthDetailsReq();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsResponseType }
     * 
     */
    public GetBoardingDetailsResponseType createGetBoardingDetailsResponseType() {
        return new GetBoardingDetailsResponseType();
    }

    /**
     * Create an instance of {@link BMGetInventoryReq }
     * 
     */
    public BMGetInventoryReq createBMGetInventoryReq() {
        return new BMGetInventoryReq();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditResponseType }
     * 
     */
    public DoNonReferencedCreditResponseType createDoNonReferencedCreditResponseType() {
        return new DoNonReferencedCreditResponseType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileRequestType }
     * 
     */
    public CreateRecurringPaymentsProfileRequestType createCreateRecurringPaymentsProfileRequestType() {
        return new CreateRecurringPaymentsProfileRequestType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditReq }
     * 
     */
    public DoNonReferencedCreditReq createDoNonReferencedCreditReq() {
        return new DoNonReferencedCreditReq();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentRequestType }
     * 
     */
    public DoMobileCheckoutPaymentRequestType createDoMobileCheckoutPaymentRequestType() {
        return new DoMobileCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsRequestType }
     * 
     */
    public UpdateAccessPermissionsRequestType createUpdateAccessPermissionsRequestType() {
        return new UpdateAccessPermissionsRequestType();
    }

    /**
     * Create an instance of {@link BillUserRequestType }
     * 
     */
    public BillUserRequestType createBillUserRequestType() {
        return new BillUserRequestType();
    }

    /**
     * Create an instance of {@link DoCaptureResponseType }
     * 
     */
    public DoCaptureResponseType createDoCaptureResponseType() {
        return new DoCaptureResponseType();
    }

    /**
     * Create an instance of {@link BMCreateButtonResponseType }
     * 
     */
    public BMCreateButtonResponseType createBMCreateButtonResponseType() {
        return new BMCreateButtonResponseType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsReq }
     * 
     */
    public GetRecurringPaymentsProfileDetailsReq createGetRecurringPaymentsProfileDetailsReq() {
        return new GetRecurringPaymentsProfileDetailsReq();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusResponseType }
     * 
     */
    public ManagePendingTransactionStatusResponseType createManagePendingTransactionStatusResponseType() {
        return new ManagePendingTransactionStatusResponseType();
    }

    /**
     * Create an instance of {@link RefundTransactionReq }
     * 
     */
    public RefundTransactionReq createRefundTransactionReq() {
        return new RefundTransactionReq();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementRequestType }
     * 
     */
    public CreateBillingAgreementRequestType createCreateBillingAgreementRequestType() {
        return new CreateBillingAgreementRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAuthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoAuthorizationResponse")
    public JAXBElement<DoAuthorizationResponseType> createDoAuthorizationResponse(DoAuthorizationResponseType value) {
        return new JAXBElement<DoAuthorizationResponseType>(_DoAuthorizationResponse_QNAME, DoAuthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAuthFlowParamResponse")
    public JAXBElement<SetAuthFlowParamResponseType> createSetAuthFlowParamResponse(SetAuthFlowParamResponseType value) {
        return new JAXBElement<SetAuthFlowParamResponseType>(_SetAuthFlowParamResponse_QNAME, SetAuthFlowParamResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressVerifyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "AddressVerifyRequest")
    public JAXBElement<AddressVerifyRequestType> createAddressVerifyRequest(AddressVerifyRequestType value) {
        return new JAXBElement<AddressVerifyRequestType>(_AddressVerifyRequest_QNAME, AddressVerifyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "EnterBoardingRequest")
    public JAXBElement<EnterBoardingRequestType> createEnterBoardingRequest(EnterBoardingRequestType value) {
        return new JAXBElement<EnterBoardingRequestType>(_EnterBoardingRequest_QNAME, EnterBoardingRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManageRecurringPaymentsProfileStatusRequest")
    public JAXBElement<ManageRecurringPaymentsProfileStatusRequestType> createManageRecurringPaymentsProfileStatusRequest(ManageRecurringPaymentsProfileStatusRequestType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusRequestType>(_ManageRecurringPaymentsProfileStatusRequest_QNAME, ManageRecurringPaymentsProfileStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBoardingDetailsRequest")
    public JAXBElement<GetBoardingDetailsRequestType> createGetBoardingDetailsRequest(GetBoardingDetailsRequestType value) {
        return new JAXBElement<GetBoardingDetailsRequestType>(_GetBoardingDetailsRequest_QNAME, GetBoardingDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetMobileStatusRequest")
    public JAXBElement<GetMobileStatusRequestType> createGetMobileStatusRequest(GetMobileStatusRequestType value) {
        return new JAXBElement<GetMobileStatusRequestType>(_GetMobileStatusRequest_QNAME, GetMobileStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetButtonDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetButtonDetailsResponse")
    public JAXBElement<BMGetButtonDetailsResponseType> createBMGetButtonDetailsResponse(BMGetButtonDetailsResponseType value) {
        return new JAXBElement<BMGetButtonDetailsResponseType>(_BMGetButtonDetailsResponse_QNAME, BMGetButtonDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMButtonSearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMButtonSearchRequest")
    public JAXBElement<BMButtonSearchRequestType> createBMButtonSearchRequest(BMButtonSearchRequestType value) {
        return new JAXBElement<BMButtonSearchRequestType>(_BMButtonSearchRequest_QNAME, BMButtonSearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPExpressCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPExpressCheckoutPaymentRequest")
    public JAXBElement<DoUATPExpressCheckoutPaymentRequestType> createDoUATPExpressCheckoutPaymentRequest(DoUATPExpressCheckoutPaymentRequestType value) {
        return new JAXBElement<DoUATPExpressCheckoutPaymentRequestType>(_DoUATPExpressCheckoutPaymentRequest_QNAME, DoUATPExpressCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCaptureResponse")
    public JAXBElement<DoCaptureResponseType> createDoCaptureResponse(DoCaptureResponseType value) {
        return new JAXBElement<DoCaptureResponseType>(_DoCaptureResponse_QNAME, DoCaptureResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillingAgreementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateBillingAgreementRequest")
    public JAXBElement<CreateBillingAgreementRequestType> createCreateBillingAgreementRequest(CreateBillingAgreementRequestType value) {
        return new JAXBElement<CreateBillingAgreementRequestType>(_CreateBillingAgreementRequest_QNAME, CreateBillingAgreementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBillingAgreementCustomerDetailsResponse")
    public JAXBElement<GetBillingAgreementCustomerDetailsResponseType> createGetBillingAgreementCustomerDetailsResponse(GetBillingAgreementCustomerDetailsResponseType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsResponseType>(_GetBillingAgreementCustomerDetailsResponse_QNAME, GetBillingAgreementCustomerDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManageRecurringPaymentsProfileStatusResponse")
    public JAXBElement<ManageRecurringPaymentsProfileStatusResponseType> createManageRecurringPaymentsProfileStatusResponse(ManageRecurringPaymentsProfileStatusResponseType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusResponseType>(_ManageRecurringPaymentsProfileStatusResponse_QNAME, ManageRecurringPaymentsProfileStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillUserRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillUserRequest")
    public JAXBElement<BillUserRequestType> createBillUserRequest(BillUserRequestType value) {
        return new JAXBElement<BillUserRequestType>(_BillUserRequest_QNAME, BillUserRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillOutstandingAmountResponse")
    public JAXBElement<BillOutstandingAmountResponseType> createBillOutstandingAmountResponse(BillOutstandingAmountResponseType value) {
        return new JAXBElement<BillOutstandingAmountResponseType>(_BillOutstandingAmountResponse_QNAME, BillOutstandingAmountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccessPermissionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAccessPermissionsRequest")
    public JAXBElement<UpdateAccessPermissionsRequestType> createUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType value) {
        return new JAXBElement<UpdateAccessPermissionsRequestType>(_UpdateAccessPermissionsRequest_QNAME, UpdateAccessPermissionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoMobileCheckoutPaymentRequest")
    public JAXBElement<DoMobileCheckoutPaymentRequestType> createDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType value) {
        return new JAXBElement<DoMobileCheckoutPaymentRequestType>(_DoMobileCheckoutPaymentRequest_QNAME, DoMobileCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetMobileCheckoutResponse")
    public JAXBElement<SetMobileCheckoutResponseType> createSetMobileCheckoutResponse(SetMobileCheckoutResponseType value) {
        return new JAXBElement<SetMobileCheckoutResponseType>(_SetMobileCheckoutResponse_QNAME, SetMobileCheckoutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReauthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReauthorizationResponse")
    public JAXBElement<DoReauthorizationResponseType> createDoReauthorizationResponse(DoReauthorizationResponseType value) {
        return new JAXBElement<DoReauthorizationResponseType>(_DoReauthorizationResponse_QNAME, DoReauthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "EnterBoardingResponse")
    public JAXBElement<EnterBoardingResponseType> createEnterBoardingResponse(EnterBoardingResponseType value) {
        return new JAXBElement<EnterBoardingResponseType>(_EnterBoardingResponse_QNAME, EnterBoardingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAuthDetailsRequest")
    public JAXBElement<GetAuthDetailsRequestType> createGetAuthDetailsRequest(GetAuthDetailsRequestType value) {
        return new JAXBElement<GetAuthDetailsRequestType>(_GetAuthDetailsRequest_QNAME, GetAuthDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateRecurringPaymentsProfileResponse")
    public JAXBElement<UpdateRecurringPaymentsProfileResponseType> createUpdateRecurringPaymentsProfileResponse(UpdateRecurringPaymentsProfileResponseType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileResponseType>(_UpdateRecurringPaymentsProfileResponse_QNAME, UpdateRecurringPaymentsProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillingAgreementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateBillingAgreementResponse")
    public JAXBElement<CreateBillingAgreementResponseType> createCreateBillingAgreementResponse(CreateBillingAgreementResponseType value) {
        return new JAXBElement<CreateBillingAgreementResponseType>(_CreateBillingAgreementResponse_QNAME, CreateBillingAgreementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetRecurringPaymentsProfileDetailsRequest")
    public JAXBElement<GetRecurringPaymentsProfileDetailsRequestType> createGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsRequestType>(_GetRecurringPaymentsProfileDetailsRequest_QNAME, GetRecurringPaymentsProfileDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAccessPermissionDetailsRequest")
    public JAXBElement<GetAccessPermissionDetailsRequestType> createGetAccessPermissionDetailsRequest(GetAccessPermissionDetailsRequestType value) {
        return new JAXBElement<GetAccessPermissionDetailsRequestType>(_GetAccessPermissionDetailsRequest_QNAME, GetAccessPermissionDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateRecurringPaymentsProfileResponse")
    public JAXBElement<CreateRecurringPaymentsProfileResponseType> createCreateRecurringPaymentsProfileResponse(CreateRecurringPaymentsProfileResponseType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileResponseType>(_CreateRecurringPaymentsProfileResponse_QNAME, CreateRecurringPaymentsProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMSetInventoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMSetInventoryResponse")
    public JAXBElement<BMSetInventoryResponseType> createBMSetInventoryResponse(BMSetInventoryResponseType value) {
        return new JAXBElement<BMSetInventoryResponseType>(_BMSetInventoryResponse_QNAME, BMSetInventoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "TransactionSearchResponse")
    public JAXBElement<TransactionSearchResponseType> createTransactionSearchResponse(TransactionSearchResponseType value) {
        return new JAXBElement<TransactionSearchResponseType>(_TransactionSearchResponse_QNAME, TransactionSearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMButtonSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMButtonSearchResponse")
    public JAXBElement<BMButtonSearchResponseType> createBMButtonSearchResponse(BMButtonSearchResponseType value) {
        return new JAXBElement<BMButtonSearchResponseType>(_BMButtonSearchResponse_QNAME, BMButtonSearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBoardingDetailsResponse")
    public JAXBElement<GetBoardingDetailsResponseType> createGetBoardingDetailsResponse(GetBoardingDetailsResponseType value) {
        return new JAXBElement<GetBoardingDetailsResponseType>(_GetBoardingDetailsResponse_QNAME, GetBoardingDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillOutstandingAmountRequest")
    public JAXBElement<BillOutstandingAmountRequestType> createBillOutstandingAmountRequest(BillOutstandingAmountRequestType value) {
        return new JAXBElement<BillOutstandingAmountRequestType>(_BillOutstandingAmountRequest_QNAME, BillOutstandingAmountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAuthDetailsResponse")
    public JAXBElement<GetAuthDetailsResponseType> createGetAuthDetailsResponse(GetAuthDetailsResponseType value) {
        return new JAXBElement<GetAuthDetailsResponseType>(_GetAuthDetailsResponse_QNAME, GetAuthDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReferenceTransactionResponse")
    public JAXBElement<DoReferenceTransactionResponseType> createDoReferenceTransactionResponse(DoReferenceTransactionResponseType value) {
        return new JAXBElement<DoReferenceTransactionResponseType>(_DoReferenceTransactionResponse_QNAME, DoReferenceTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBillingAgreementCustomerDetailsRequest")
    public JAXBElement<GetBillingAgreementCustomerDetailsRequestType> createGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsRequestType>(_GetBillingAgreementCustomerDetailsRequest_QNAME, GetBillingAgreementCustomerDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCreateButtonRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMCreateButtonRequest")
    public JAXBElement<BMCreateButtonRequestType> createBMCreateButtonRequest(BMCreateButtonRequestType value) {
        return new JAXBElement<BMCreateButtonRequestType>(_BMCreateButtonRequest_QNAME, BMCreateButtonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoVoidResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoVoidResponse")
    public JAXBElement<DoVoidResponseType> createDoVoidResponse(DoVoidResponseType value) {
        return new JAXBElement<DoVoidResponseType>(_DoVoidResponse_QNAME, DoVoidResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetButtonDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetButtonDetailsRequest")
    public JAXBElement<BMGetButtonDetailsRequestType> createBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType value) {
        return new JAXBElement<BMGetButtonDetailsRequestType>(_BMGetButtonDetailsRequest_QNAME, BMGetButtonDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetExpressCheckoutRequest")
    public JAXBElement<SetExpressCheckoutRequestType> createSetExpressCheckoutRequest(SetExpressCheckoutRequestType value) {
        return new JAXBElement<SetExpressCheckoutRequestType>(_SetExpressCheckoutRequest_QNAME, SetExpressCheckoutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingTransactionStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManagePendingTransactionStatusResponse")
    public JAXBElement<ManagePendingTransactionStatusResponseType> createManagePendingTransactionStatusResponse(ManagePendingTransactionStatusResponseType value) {
        return new JAXBElement<ManagePendingTransactionStatusResponseType>(_ManagePendingTransactionStatusResponse_QNAME, ManagePendingTransactionStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMUpdateButtonResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMUpdateButtonResponse")
    public JAXBElement<BMUpdateButtonResponseType> createBMUpdateButtonResponse(BMUpdateButtonResponseType value) {
        return new JAXBElement<BMUpdateButtonResponseType>(_BMUpdateButtonResponse_QNAME, BMUpdateButtonResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPAuthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPAuthorizationRequest")
    public JAXBElement<DoUATPAuthorizationRequestType> createDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType value) {
        return new JAXBElement<DoUATPAuthorizationRequestType>(_DoUATPAuthorizationRequest_QNAME, DoUATPAuthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMManageButtonStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMManageButtonStatusResponse")
    public JAXBElement<BMManageButtonStatusResponseType> createBMManageButtonStatusResponse(BMManageButtonStatusResponseType value) {
        return new JAXBElement<BMManageButtonStatusResponseType>(_BMManageButtonStatusResponse_QNAME, BMManageButtonStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetInventoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetInventoryResponse")
    public JAXBElement<BMGetInventoryResponseType> createBMGetInventoryResponse(BMGetInventoryResponseType value) {
        return new JAXBElement<BMGetInventoryResponseType>(_BMGetInventoryResponse_QNAME, BMGetInventoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetRecurringPaymentsProfileDetailsResponse")
    public JAXBElement<GetRecurringPaymentsProfileDetailsResponseType> createGetRecurringPaymentsProfileDetailsResponse(GetRecurringPaymentsProfileDetailsResponseType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsResponseType>(_GetRecurringPaymentsProfileDetailsResponse_QNAME, GetRecurringPaymentsProfileDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPAuthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPAuthorizationResponse")
    public JAXBElement<DoUATPAuthorizationResponseType> createDoUATPAuthorizationResponse(DoUATPAuthorizationResponseType value) {
        return new JAXBElement<DoUATPAuthorizationResponseType>(_DoUATPAuthorizationResponse_QNAME, DoUATPAuthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetCustomerBillingAgreementRequest")
    public JAXBElement<SetCustomerBillingAgreementRequestType> createSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType value) {
        return new JAXBElement<SetCustomerBillingAgreementRequestType>(_SetCustomerBillingAgreementRequest_QNAME, SetCustomerBillingAgreementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingTransactionStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManagePendingTransactionStatusRequest")
    public JAXBElement<ManagePendingTransactionStatusRequestType> createManagePendingTransactionStatusRequest(ManagePendingTransactionStatusRequestType value) {
        return new JAXBElement<ManagePendingTransactionStatusRequestType>(_ManagePendingTransactionStatusRequest_QNAME, ManagePendingTransactionStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPExpressCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPExpressCheckoutPaymentResponse")
    public JAXBElement<DoUATPExpressCheckoutPaymentResponseType> createDoUATPExpressCheckoutPaymentResponse(DoUATPExpressCheckoutPaymentResponseType value) {
        return new JAXBElement<DoUATPExpressCheckoutPaymentResponseType>(_DoUATPExpressCheckoutPaymentResponse_QNAME, DoUATPExpressCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAuthFlowParamRequest")
    public JAXBElement<SetAuthFlowParamRequestType> createSetAuthFlowParamRequest(SetAuthFlowParamRequestType value) {
        return new JAXBElement<SetAuthFlowParamRequestType>(_SetAuthFlowParamRequest_QNAME, SetAuthFlowParamRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BAUpdateResponse")
    public JAXBElement<BAUpdateResponseType> createBAUpdateResponse(BAUpdateResponseType value) {
        return new JAXBElement<BAUpdateResponseType>(_BAUpdateResponse_QNAME, BAUpdateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetIncentiveEvaluationResponse")
    public JAXBElement<GetIncentiveEvaluationResponseType> createGetIncentiveEvaluationResponse(GetIncentiveEvaluationResponseType value) {
        return new JAXBElement<GetIncentiveEvaluationResponseType>(_GetIncentiveEvaluationResponse_QNAME, GetIncentiveEvaluationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressVerifyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "AddressVerifyResponse")
    public JAXBElement<AddressVerifyResponseType> createAddressVerifyResponse(AddressVerifyResponseType value) {
        return new JAXBElement<AddressVerifyResponseType>(_AddressVerifyResponse_QNAME, AddressVerifyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMSetInventoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMSetInventoryRequest")
    public JAXBElement<BMSetInventoryRequestType> createBMSetInventoryRequest(BMSetInventoryRequestType value) {
        return new JAXBElement<BMSetInventoryRequestType>(_BMSetInventoryRequest_QNAME, BMSetInventoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPalDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetPalDetailsResponse")
    public JAXBElement<GetPalDetailsResponseType> createGetPalDetailsResponse(GetPalDetailsResponseType value) {
        return new JAXBElement<GetPalDetailsResponseType>(_GetPalDetailsResponse_QNAME, GetPalDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateMobilePaymentResponse")
    public JAXBElement<CreateMobilePaymentResponseType> createCreateMobilePaymentResponse(CreateMobilePaymentResponseType value) {
        return new JAXBElement<CreateMobilePaymentResponseType>(_CreateMobilePaymentResponse_QNAME, CreateMobilePaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomSecurityHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RequesterCredentials")
    public JAXBElement<CustomSecurityHeaderType> createRequesterCredentials(CustomSecurityHeaderType value) {
        return new JAXBElement<CustomSecurityHeaderType>(_RequesterCredentials_QNAME, CustomSecurityHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillUserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillUserResponse")
    public JAXBElement<BillUserResponseType> createBillUserResponse(BillUserResponseType value) {
        return new JAXBElement<BillUserResponseType>(_BillUserResponse_QNAME, BillUserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoExpressCheckoutPaymentResponse")
    public JAXBElement<DoExpressCheckoutPaymentResponseType> createDoExpressCheckoutPaymentResponse(DoExpressCheckoutPaymentResponseType value) {
        return new JAXBElement<DoExpressCheckoutPaymentResponseType>(_DoExpressCheckoutPaymentResponse_QNAME, DoExpressCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateRecurringPaymentsProfileRequest")
    public JAXBElement<CreateRecurringPaymentsProfileRequestType> createCreateRecurringPaymentsProfileRequest(CreateRecurringPaymentsProfileRequestType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileRequestType>(_CreateRecurringPaymentsProfileRequest_QNAME, CreateRecurringPaymentsProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateRecurringPaymentsProfileRequest")
    public JAXBElement<UpdateRecurringPaymentsProfileRequestType> createUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileRequestType>(_UpdateRecurringPaymentsProfileRequest_QNAME, UpdateRecurringPaymentsProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoVoidRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoVoidRequest")
    public JAXBElement<DoVoidRequestType> createDoVoidRequest(DoVoidRequestType value) {
        return new JAXBElement<DoVoidRequestType>(_DoVoidRequest_QNAME, DoVoidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetInventoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetInventoryRequest")
    public JAXBElement<BMGetInventoryRequestType> createBMGetInventoryRequest(BMGetInventoryRequestType value) {
        return new JAXBElement<BMGetInventoryRequestType>(_BMGetInventoryRequest_QNAME, BMGetInventoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAccessPermissionsResponse")
    public JAXBElement<SetAccessPermissionsResponseType> createSetAccessPermissionsResponse(SetAccessPermissionsResponseType value) {
        return new JAXBElement<SetAccessPermissionsResponseType>(_SetAccessPermissionsResponse_QNAME, SetAccessPermissionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CancelRecoupResponse")
    public JAXBElement<CancelRecoupResponseType> createCancelRecoupResponse(CancelRecoupResponseType value) {
        return new JAXBElement<CancelRecoupResponseType>(_CancelRecoupResponse_QNAME, CancelRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "InitiateRecoupResponse")
    public JAXBElement<InitiateRecoupResponseType> createInitiateRecoupResponse(InitiateRecoupResponseType value) {
        return new JAXBElement<InitiateRecoupResponseType>(_InitiateRecoupResponse_QNAME, InitiateRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetExpressCheckoutDetailsResponse")
    public JAXBElement<GetExpressCheckoutDetailsResponseType> createGetExpressCheckoutDetailsResponse(GetExpressCheckoutDetailsResponseType value) {
        return new JAXBElement<GetExpressCheckoutDetailsResponseType>(_GetExpressCheckoutDetailsResponse_QNAME, GetExpressCheckoutDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ReverseTransactionRequest")
    public JAXBElement<ReverseTransactionRequestType> createReverseTransactionRequest(ReverseTransactionRequestType value) {
        return new JAXBElement<ReverseTransactionRequestType>(_ReverseTransactionRequest_QNAME, ReverseTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MassPayResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "MassPayResponse")
    public JAXBElement<MassPayResponseType> createMassPayResponse(MassPayResponseType value) {
        return new JAXBElement<MassPayResponseType>(_MassPayResponse_QNAME, MassPayResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionResponse")
    public JAXBElement<RefundTransactionResponseType> createRefundTransactionResponse(RefundTransactionResponseType value) {
        return new JAXBElement<RefundTransactionResponseType>(_RefundTransactionResponse_QNAME, RefundTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CompleteRecoupRequest")
    public JAXBElement<CompleteRecoupRequestType> createCompleteRecoupRequest(CompleteRecoupRequestType value) {
        return new JAXBElement<CompleteRecoupRequestType>(_CompleteRecoupRequest_QNAME, CompleteRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAuthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoAuthorizationRequest")
    public JAXBElement<DoAuthorizationRequestType> createDoAuthorizationRequest(DoAuthorizationRequestType value) {
        return new JAXBElement<DoAuthorizationRequestType>(_DoAuthorizationRequest_QNAME, DoAuthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetIncentiveEvaluationRequest")
    public JAXBElement<GetIncentiveEvaluationRequestType> createGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType value) {
        return new JAXBElement<GetIncentiveEvaluationRequestType>(_GetIncentiveEvaluationRequest_QNAME, GetIncentiveEvaluationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CompleteRecoupResponse")
    public JAXBElement<CompleteRecoupResponseType> createCompleteRecoupResponse(CompleteRecoupResponseType value) {
        return new JAXBElement<CompleteRecoupResponseType>(_CompleteRecoupResponse_QNAME, CompleteRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoDirectPaymentRequest")
    public JAXBElement<DoDirectPaymentRequestType> createDoDirectPaymentRequest(DoDirectPaymentRequestType value) {
        return new JAXBElement<DoDirectPaymentRequestType>(_DoDirectPaymentRequest_QNAME, DoDirectPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetMobileStatusResponse")
    public JAXBElement<GetMobileStatusResponseType> createGetMobileStatusResponse(GetMobileStatusResponseType value) {
        return new JAXBElement<GetMobileStatusResponseType>(_GetMobileStatusResponse_QNAME, GetMobileStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetCustomerBillingAgreementResponse")
    public JAXBElement<SetCustomerBillingAgreementResponseType> createSetCustomerBillingAgreementResponse(SetCustomerBillingAgreementResponseType value) {
        return new JAXBElement<SetCustomerBillingAgreementResponseType>(_SetCustomerBillingAgreementResponse_QNAME, SetCustomerBillingAgreementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBalanceResponse")
    public JAXBElement<GetBalanceResponseType> createGetBalanceResponse(GetBalanceResponseType value) {
        return new JAXBElement<GetBalanceResponseType>(_GetBalanceResponse_QNAME, GetBalanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoNonReferencedCreditRequest")
    public JAXBElement<DoNonReferencedCreditRequestType> createDoNonReferencedCreditRequest(DoNonReferencedCreditRequestType value) {
        return new JAXBElement<DoNonReferencedCreditRequestType>(_DoNonReferencedCreditRequest_QNAME, DoNonReferencedCreditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoMobileCheckoutPaymentResponse")
    public JAXBElement<DoMobileCheckoutPaymentResponseType> createDoMobileCheckoutPaymentResponse(DoMobileCheckoutPaymentResponseType value) {
        return new JAXBElement<DoMobileCheckoutPaymentResponseType>(_DoMobileCheckoutPaymentResponse_QNAME, DoMobileCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAccessPermissionsRequest")
    public JAXBElement<SetAccessPermissionsRequestType> createSetAccessPermissionsRequest(SetAccessPermissionsRequestType value) {
        return new JAXBElement<SetAccessPermissionsRequestType>(_SetAccessPermissionsRequest_QNAME, SetAccessPermissionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetMobileCheckoutRequest")
    public JAXBElement<SetMobileCheckoutRequestType> createSetMobileCheckoutRequest(SetMobileCheckoutRequestType value) {
        return new JAXBElement<SetMobileCheckoutRequestType>(_SetMobileCheckoutRequest_QNAME, SetMobileCheckoutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCaptureRequest")
    public JAXBElement<DoCaptureRequestType> createDoCaptureRequest(DoCaptureRequestType value) {
        return new JAXBElement<DoCaptureRequestType>(_DoCaptureRequest_QNAME, DoCaptureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetExpressCheckoutResponse")
    public JAXBElement<SetExpressCheckoutResponseType> createSetExpressCheckoutResponse(SetExpressCheckoutResponseType value) {
        return new JAXBElement<SetExpressCheckoutResponseType>(_SetExpressCheckoutResponse_QNAME, SetExpressCheckoutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoNonReferencedCreditResponse")
    public JAXBElement<DoNonReferencedCreditResponseType> createDoNonReferencedCreditResponse(DoNonReferencedCreditResponseType value) {
        return new JAXBElement<DoNonReferencedCreditResponseType>(_DoNonReferencedCreditResponse_QNAME, DoNonReferencedCreditResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetTransactionDetailsRequest")
    public JAXBElement<GetTransactionDetailsRequestType> createGetTransactionDetailsRequest(GetTransactionDetailsRequestType value) {
        return new JAXBElement<GetTransactionDetailsRequestType>(_GetTransactionDetailsRequest_QNAME, GetTransactionDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMUpdateButtonRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMUpdateButtonRequest")
    public JAXBElement<BMUpdateButtonRequestType> createBMUpdateButtonRequest(BMUpdateButtonRequestType value) {
        return new JAXBElement<BMUpdateButtonRequestType>(_BMUpdateButtonRequest_QNAME, BMUpdateButtonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReferenceTransactionRequest")
    public JAXBElement<DoReferenceTransactionRequestType> createDoReferenceTransactionRequest(DoReferenceTransactionRequestType value) {
        return new JAXBElement<DoReferenceTransactionRequestType>(_DoReferenceTransactionRequest_QNAME, DoReferenceTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "TransactionSearchRequest")
    public JAXBElement<TransactionSearchRequestType> createTransactionSearchRequest(TransactionSearchRequestType value) {
        return new JAXBElement<TransactionSearchRequestType>(_TransactionSearchRequest_QNAME, TransactionSearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetTransactionDetailsResponse")
    public JAXBElement<GetTransactionDetailsResponseType> createGetTransactionDetailsResponse(GetTransactionDetailsResponseType value) {
        return new JAXBElement<GetTransactionDetailsResponseType>(_GetTransactionDetailsResponse_QNAME, GetTransactionDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBalanceRequest")
    public JAXBElement<GetBalanceRequestType> createGetBalanceRequest(GetBalanceRequestType value) {
        return new JAXBElement<GetBalanceRequestType>(_GetBalanceRequest_QNAME, GetBalanceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCreateButtonResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMCreateButtonResponse")
    public JAXBElement<BMCreateButtonResponseType> createBMCreateButtonResponse(BMCreateButtonResponseType value) {
        return new JAXBElement<BMCreateButtonResponseType>(_BMCreateButtonResponse_QNAME, BMCreateButtonResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionRequest")
    public JAXBElement<RefundTransactionRequestType> createRefundTransactionRequest(RefundTransactionRequestType value) {
        return new JAXBElement<RefundTransactionRequestType>(_RefundTransactionRequest_QNAME, RefundTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateMobilePaymentRequest")
    public JAXBElement<CreateMobilePaymentRequestType> createCreateMobilePaymentRequest(CreateMobilePaymentRequestType value) {
        return new JAXBElement<CreateMobilePaymentRequestType>(_CreateMobilePaymentRequest_QNAME, CreateMobilePaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMManageButtonStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMManageButtonStatusRequest")
    public JAXBElement<BMManageButtonStatusRequestType> createBMManageButtonStatusRequest(BMManageButtonStatusRequestType value) {
        return new JAXBElement<BMManageButtonStatusRequestType>(_BMManageButtonStatusRequest_QNAME, BMManageButtonStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReauthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReauthorizationRequest")
    public JAXBElement<DoReauthorizationRequestType> createDoReauthorizationRequest(DoReauthorizationRequestType value) {
        return new JAXBElement<DoReauthorizationRequestType>(_DoReauthorizationRequest_QNAME, DoReauthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccessPermissionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAccessPermissionsResponse")
    public JAXBElement<UpdateAccessPermissionsResponseType> createUpdateAccessPermissionsResponse(UpdateAccessPermissionsResponseType value) {
        return new JAXBElement<UpdateAccessPermissionsResponseType>(_UpdateAccessPermissionsResponse_QNAME, UpdateAccessPermissionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAccessPermissionDetailsResponse")
    public JAXBElement<GetAccessPermissionDetailsResponseType> createGetAccessPermissionDetailsResponse(GetAccessPermissionDetailsResponseType value) {
        return new JAXBElement<GetAccessPermissionDetailsResponseType>(_GetAccessPermissionDetailsResponse_QNAME, GetAccessPermissionDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoDirectPaymentResponse")
    public JAXBElement<DoDirectPaymentResponseType> createDoDirectPaymentResponse(DoDirectPaymentResponseType value) {
        return new JAXBElement<DoDirectPaymentResponseType>(_DoDirectPaymentResponse_QNAME, DoDirectPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CancelRecoupRequest")
    public JAXBElement<CancelRecoupRequestType> createCancelRecoupRequest(CancelRecoupRequestType value) {
        return new JAXBElement<CancelRecoupRequestType>(_CancelRecoupRequest_QNAME, CancelRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoExpressCheckoutPaymentRequest")
    public JAXBElement<DoExpressCheckoutPaymentRequestType> createDoExpressCheckoutPaymentRequest(DoExpressCheckoutPaymentRequestType value) {
        return new JAXBElement<DoExpressCheckoutPaymentRequestType>(_DoExpressCheckoutPaymentRequest_QNAME, DoExpressCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "InitiateRecoupRequest")
    public JAXBElement<InitiateRecoupRequestType> createInitiateRecoupRequest(InitiateRecoupRequestType value) {
        return new JAXBElement<InitiateRecoupRequestType>(_InitiateRecoupRequest_QNAME, InitiateRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BAUpdateRequest")
    public JAXBElement<BAUpdateRequestType> createBAUpdateRequest(BAUpdateRequestType value) {
        return new JAXBElement<BAUpdateRequestType>(_BAUpdateRequest_QNAME, BAUpdateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MassPayRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "MassPayRequest")
    public JAXBElement<MassPayRequestType> createMassPayRequest(MassPayRequestType value) {
        return new JAXBElement<MassPayRequestType>(_MassPayRequest_QNAME, MassPayRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetExpressCheckoutDetailsRequest")
    public JAXBElement<GetExpressCheckoutDetailsRequestType> createGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType value) {
        return new JAXBElement<GetExpressCheckoutDetailsRequestType>(_GetExpressCheckoutDetailsRequest_QNAME, GetExpressCheckoutDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ReverseTransactionResponse")
    public JAXBElement<ReverseTransactionResponseType> createReverseTransactionResponse(ReverseTransactionResponseType value) {
        return new JAXBElement<ReverseTransactionResponseType>(_ReverseTransactionResponse_QNAME, ReverseTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPalDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetPalDetailsRequest")
    public JAXBElement<GetPalDetailsRequestType> createGetPalDetailsRequest(GetPalDetailsRequestType value) {
        return new JAXBElement<GetPalDetailsRequestType>(_GetPalDetailsRequest_QNAME, GetPalDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionID", scope = RefundTransactionResponseType.class)
    public JAXBElement<String> createRefundTransactionResponseTypeRefundTransactionID(String value) {
        return new JAXBElement<String>(_RefundTransactionResponseTypeRefundTransactionID_QNAME, String.class, RefundTransactionResponseType.class, value);
    }

}
