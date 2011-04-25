/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */

package org.mule.module.paypal;

import java.util.List;

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.paypal.soap.SoapPaypalFacade;
import org.mule.tools.cloudconnect.annotations.Connector;
import org.mule.tools.cloudconnect.annotations.Operation;
import org.mule.tools.cloudconnect.annotations.Parameter;
import org.mule.tools.cloudconnect.annotations.Property;

import ebay.api.paypalapi.AddressVerifyResponseType;
import ebay.api.paypalapi.DoAuthorizationResponseType;
import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.DoDirectPaymentResponseType;
import ebay.api.paypalapi.DoReauthorizationResponseType;
import ebay.api.paypalapi.DoVoidResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.GetPalDetailsResponseType;
import ebay.api.paypalapi.GetTransactionDetailsResponseType;
import ebay.api.paypalapi.ManagePendingTransactionStatusResponseType;
import ebay.api.paypalapi.MassPayRequestItemType;
import ebay.api.paypalapi.MassPayResponseType;
import ebay.api.paypalapi.RefundTransactionResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CompleteCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.FMFPendingTransactionActionType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.ReceiverInfoCodeType;
import ebay.apis.eblbasecomponents.RefundType;
import ebay.apis.eblbasecomponents.TransactionEntityType;

/**
 * Cloud connector for Paypal
 */
@Connector(namespacePrefix = "paypal", namespaceUri = "http://www.mulesoft.org/schema/mule/paypal")
public class PaypalCloudConnector implements Initialisable
{
    @Property(name = "service-ref", optional = true)
    private PaypalFacade facade;

    /** Paypal username */
    @Property
    private String username;

    /** Paypal password */
    @Property
    private String password;

    /*** Default currency used if none is specified in the operation */
    @Property(optional = true)
    private CurrencyCodeType defaultCurrency;
    
    /**
     * PayPal-generated unique digital signature (a line of text, or hash) that you
     * copy from PayPal's website and include in your API calls. An alternative to
     * API Certificate security.
     */
    @Property
    private String signature;

    /**
     * An indicator in an API call of the account for whom the call is being made
     */
    @Property(optional = true)
    private String subject;

    public PaypalCloudConnector()
    {
        // default constructor
    }

    /**
     * Advanced constructor
     *
     * @param paypalFacade facade that performs the operations
     */
    public PaypalCloudConnector(final PaypalFacade paypalFacade)
    {
        facade = paypalFacade;
    }

    public void initialise() throws InitialisationException
    {
        if (facade == null)
        {
            facade = PaypalFacadeAdaptor.adapt(new SoapPaypalFacade(username, password, signature, subject));
        }
    }

    /**
     * Obtain the available balance for a PayPal account.
     * 
     * @param returnAllCurrencies If true, returns the balance for each currency 
     *          holding, otherwise only the balance for the primary currency holding
     * @return the balance for the account ({@link GetBalanceResponseType})
     */
    @Operation
    public GetBalanceResponseType getBalance(@Parameter(optional = true) final Boolean returnAllCurrencies)
    {
        return facade.getBalance(returnAllCurrencies == null ? true : returnAllCurrencies);
    }

    /**
     * Confirms whether a postal address and postal code match those of the specified
     * PayPal account holder.
     * 
     * @return {@link AddressVerifyResponseType} with the confirmation 
     *          status of for parameter.
     */
    @Operation
    public AddressVerifyResponseType addressVerify(@Parameter final String email,
                                                   @Parameter final String street,
                                                   @Parameter final String zip)
    {
        return facade.addressVerify(email, street, zip);
    }

    /**
     * Capture an authorized payment.
     *
     * @param authorizationId The authorization identification number of the payment
     *            you want to capture. This is the transaction id returned from
     *            DoExpressCheckoutPayment or DoDirectPayment. Character length and
     *            limits: 19 single-byte characters maximum.
     * @param amount Amount to capture. Limitations: Value is a positive number which
     *            cannot exceed $10,000 USD in any currency. No currency symbol. Must
     *            have two decimal places, decimal separator must be a period (.),
     *            and the optional thousands separator must be a comma (,).
     * @param amountCurrency The currency in which {@link #amount} is expressed. If it is null, then the
     *    {@link #defaultCurrency} is used.             
     * @param complete The value Complete indicates that this the last capture you
     *            intend to make. The value NotComplete indicates that you intend to
     *            make additional captures
     * @param invoiceId (Optional) Your invoice number or other identification number
     *            that is displayed to the merchant and customer in his transaction
     *            history.
     *            NOTE: This value on DoCapture will overwrite a value previously set on
     *            DoAuthorization.
     *            NOTE: The value is recorded only if the authorization you are capturing is 
     *            an order authorization, not a basic authorization.
     *            Character length and limits: 127 single-byte alphanumeric characters.
     * @param note (Optional) An informational note about this settlement that is
     *            displayed to the payer in email and in his transaction history.
     *            Character length and limits: 255 single-byte characters.
     * @param softDescriptor
     *              (Optional) The soft descriptor is a per transaction description 
     *              of the payment that is passed to the consumer's credit card statement.
     *              If a value for the soft descriptor field is provided, the full 
     *              descriptor displayed on the customer's statement has the following 
     *              format:
     *              <PP * | PAYPAL *><Merchant descriptor as set in the Payment
                    Receiving Preferences><1 space><soft descriptor>
     *
     *              The soft descriptor can contain only the following characters:
                        () Alphanumeric characters
                        () - (dash)
                        () * (asterisk)
                        () . (period)
                        () {space}
     *              If you use any other characters (such as ","), an error code 
     *              is returned.
     *              The soft descriptor does not include the phone number, which 
     *              can be toggled between the merchant's customer service number 
     *              and PayPal's customer service number.
     *              The maximum length of the total soft descriptor is 22 characters. 
     *              Of this, either 4 or 8 characters are used by the PayPal prefix 
     *              shown in the data format. Thus, the maximum length of the soft 
     *              descriptor passed in the API request is:
                    22 - len(<PP * | PAYPAL *>) - len(<Descriptor set in Payment
                    Receiving Preferences> + 1)
     *              For example, assume the following conditions:
                        () The PayPal prefix toggle is set to PAYPAL * in PayPal's admin tools.
                        () The merchant descriptor set in the Payment Receiving Preferences is set to EBAY.
                        () The soft descriptor is passed in as JanesFlowerGifts LLC.
     *              The resulting descriptor string on the credit card would be:
                    PAYPAL *EBAY JanesFlow
     *
     * @return A {@link DoCaptureResponseType}. Only the authorization ID, 
     *          transaction ID, transaction type, payment date, gross amount 
     *          and payment status are guaranteed to be returned. If you need 
     *          the values of other fields and they are not returned, you can 
     *          obtain their values later by calling GetTransactionDetails or
     *          by using the reporting mechanism.
     */
    @Operation
    public DoCaptureResponseType capture(@Parameter final String authorizationId,
                                           @Parameter final boolean complete,
                                           @Parameter final String amount,
                                           @Parameter(optional = true) final CurrencyCodeType amountCurrency,
                                           @Parameter(optional = true) final String invoiceId,
                                           @Parameter(optional = true) final String note,
                                           @Parameter(optional = true) final String softDescriptor)
    {
        return facade.capture(authorizationId, getCompleteCode(complete), getAmount(amount, amountCurrency),
                              invoiceId, note, softDescriptor);
    }

    /**
     * Authorize a payment
     * @param transactionId
     *          The value of the order's transaction identification number 
     *          returned by PayPal.
     *          Character length and limits: 19 single-byte characters maximum.
     * @param amount
     *          Amount to authorize.
     *          Limitations: Value is a positive number which cannot exceed 
     *          $10,000 USD in any currency. No currency symbol. Must have two 
     *          decimal places, decimal separator must be a period (.), and the 
     *          optional thousands separator must be a comma (,).
     * @param amountCurrency The currency in which {@link #amount} is expressed. 
     *          If it is null, then the {@link #defaultCurrency} is used.             
     * @param transactionEntity
     *          Type of transaction to authorize. The only allowable value is Order,
     *          which means that the transaction represents a customer order that
     *          can be fulfilled over 29 days.
     * @return {@link DoAuthorizationResponseType} with transaction and 
     *          authorization information.
     */
    @Operation
    public DoAuthorizationResponseType authorize(@Parameter final String transactionId,
                             @Parameter final String amount, 
                             @Parameter(optional = true) final CurrencyCodeType amountCurrency,
                             @Parameter(optional = true) final TransactionEntityType transactionEntity) 
    {
        return facade.authorize(transactionId, getAmount(amount, amountCurrency), transactionEntity);
    }

    /**
     * Obtain your Pal ID, which is the PayPal-assigned merchant account number, 
     * and other information about your account. You need the account number when 
     * working with dynamic versions of PayPal buttons and logos.
     * 
     * @return {@link GetPalDetailsResponseType} with the account details.
     */
    @Operation
    public GetPalDetailsResponseType GetPalDetails()
    {
        return facade.getPalDetails();
    }
    
    /**
     * Reauthorize an amount for a previously authorized transaction.
     * @param authorizationId
     *          The value of a previously authorized transaction identification 
     *          number returned by PayPal.
     *          Character length and limits: 19 single-byte characters maximum.
     * @param amount
     *          Amount to reauthorize.
     *          Limitations: Value is a positive number which cannot exceed 
     *          $10,000 USD in any currency. No currency symbol. Must have two 
     *          decimal places, decimal separator must be a period (.), and the 
     *          optional thousands separator must be a comma (,).
     * @param amountCurrency The currency in which {@link #amount} is expressed. 
     *          If it is null, then the {@link #defaultCurrency} is used.
     *          
     * @return {@link DoReauthorizationResponseType} containing payment status
     *          and the new  authorization identification number.
     */
    @Operation
    public DoReauthorizationResponseType reAuthorize(@Parameter final String authorizationId,
                             @Parameter final String amount, 
                             @Parameter(optional = true) final CurrencyCodeType amountCurrency) 
    {
        return facade.reAuthorize(authorizationId, getAmount(amount, amountCurrency));
    }
    
    /**
     * Void an order or an authorization.
     * 
     * @param authorizationId
     *          The original authorization ID specifying the authorization to 
     *          void or, to void an order, the order ID.
     *          IMPORTANT: If you are voiding a transaction that has been 
     *          reauthorized, use the ID from the original authorization, and 
     *          not the reauthorization.
     *          Character length and limits: 19 single-byte characters.
     * @param note
     *          An informational note about this void that is displayed to the 
     *          payer in email and in his transaction history.
     *          Character length and limits: 255 single-byte characters
     *          
     * @return
     */
    @Operation
    public DoVoidResponseType doVoid(@Parameter final String authorizationId,
                                     @Parameter(optional = true) final String note)
    {
        return facade.doVoid(authorizationId, note);
    }
    
    /**
     * Obtain information about a specific transaction.
     * @param transactionId
     *          Unique identifier of a transaction.
     *          NOTE: The details for some kinds of transactions cannot be 
     *          retrieved with GetTransactionDetails. You cannot obtain details 
     *          of bank transfer withdrawals, for example.
     *          Character length and limitations: 17 single-byte alphanumeric 
     *          characters.
     * @return {@link GetTransactionDetailsResponseType} with the transaction details.
     */
    @Operation
    public GetTransactionDetailsResponseType getTransactionDetails(@Parameter final String transactionId)
    { 
        return facade.getTransactionDetails(transactionId);
    }
    
    /**
     * Accept or deny a pending transaction held by Fraud Management Filters.
     * @param transactionId
     *          The transaction ID of the payment transaction.
     * @param action
     *          The operation you want to perform on the transaction, which is 
     *          one of the following actions:
     *          () Accept - accepts the payment
     *          () Deny - rejects the payment
     * @return {@link ManagePendingTransactionStatusResponseType} with the
     *          ID and current status of the transactin.
     */
    @Operation
    public ManagePendingTransactionStatusResponseType managePendingTransactionStatus(
                                         @Parameter final String transactionId,
                                         @Parameter final FMFPendingTransactionActionType action)
    {
        return facade.managePendingTransactionStatus(transactionId, action);
    }
    
    /**
     * Issue a refund to the PayPal account holder associated with a transaction.
     * @param transactionId
     *          Unique identifier of a transaction.
     *          Character length and limitations: 17 single-byte alphanumeric characters.
     * @param invoiceId
     *          (Optional) Your own invoice or tracking number.
     *          Character length and limitations: 127 single-byte alphanumeric characters
     * @param refundType
     *          Type of refund you are making:
     *          () Full - default
     *          () Partial
     * @param amount
     *          Refund amount. Amount is required if RefundType is Partial.
     *          NOTE: If RefundType is not specified, do not set the Amount.
     * @param amountCurrency The currency in which {@link #amount} is expressed. 
     *          If it is null, then the {@link #defaultCurrency} is used.
     * @param memo
     *          (Optional) Custom memo about the refund.
     *          Character length and limitations: 255 single-byte alphanumeric characters.
     * @return {@link RefundTransactionResponseType} with information about 
     *          the refunded amount (transaction fee redunded, gross, net and 
     *          total refunded amount)
     */
    @Operation
    public RefundTransactionResponseType refundTransaction(@Parameter final String transactionId,
                               @Parameter(optional = true) final String invoiceId,
                               @Parameter final RefundType refundType,
                               @Parameter final String amount, 
                               @Parameter(optional = true) final CurrencyCodeType amountCurrency,
                               @Parameter(optional = true) final String memo)
    {
        BasicAmountType amountAndCurrency = null;
        if (refundType.equals(RefundType.PARTIAL)) 
        {
            amountAndCurrency = getAmount(amount, amountCurrency);
        }
        return facade.refundTransaction(transactionId, invoiceId, refundType, amountAndCurrency, memo);
    }
    
    /**
     * Make a payment to one or more PayPal account holders.
     * @param emailSubject
     *          (Optional) The subject line of the email that PayPal sends when 
     *          the transaction is completed. The subject line is the same for 
     *          all recipients.
     *          Character length and limitations: 255 single-byte alphanumeric characters.
     * @param massPayItems
     *          Details of each payment.
     *          NOTE: A single request can include up to 250 MassPayItems.
     * @param receiverType
     *          (Optional) Indicates how you identify the recipients of payments 
     *          in this call to MassPay. Must be EmailAddress or UserID.
     * @return {@link MassPayResponseType} with no specific information about 
     *          the payments.
     */
    @Operation
    public MassPayResponseType massPay(final String emailSubject,
                                final List<MassPayRequestItemType> massPayItems,
                                final ReceiverInfoCodeType receiverType)
    {
        return facade.massPay(emailSubject, massPayItems, receiverType);
    }
    
    /**
     * Process a credit card payment.
     * @param ipAddress
     *          IP address of the payer's browser.
     *          NOTE: PayPal records this IP addresses as a means to detect possible fraud.
     *          Character length and limitations: 15 single-byte characters, including periods, 
     *          for example: 255.255.255.255. 
     * @param cardDetails
     *          Credit card details
     * @param paymentDetails
     *          Payment details
     * @param paymentAction
     *          (Optional) How you want to obtain payment:
     *          () "Authorization" indicates that this payment is a basic 
     *          authorization subject to settlement with PayPal Authorization & Capture.
     *          () "Sale" indicates that this is a final sale for which you are requesting payment.
     * @param setReturnFMFDetails
     *          (Optional) Flag to indicate whether you want the results returned by 
     *          Fraud Management Filters. By default, you do not receive this information.
     * @return {@link DoDirectPaymentResponseType} with information about the payment.
     */
    @Operation
    public DoDirectPaymentResponseType doDirectPayment(@Parameter final String ipAddress, 
                               @Parameter final CreditCardDetailsType cardDetails,
                               @Parameter final PaymentDetailsType paymentDetails, 
                               @Parameter(optional = true) final PaymentActionCodeType paymentAction,
                               @Parameter(optional = true) final Boolean setReturnFMFDetails) 
    {
        Integer returnFMFDetails = null;
        if (setReturnFMFDetails != null) 
        {
            returnFMFDetails = setReturnFMFDetails ? 1 : 0;
        }
        return facade.doDirectPayment(ipAddress, cardDetails, paymentDetails, paymentAction, returnFMFDetails);
    }
    
    protected CompleteCodeType getCompleteCode(final Boolean complete) 
    {
        if (complete) 
        {
            return CompleteCodeType.COMPLETE;
        }
        else 
        {
            return CompleteCodeType.NOT_COMPLETE;
        }
    }
    
    /**
     * Builds a {@link BasicAmountType} to use in operations.
     * @param value     the amount
     * @param currency  the currency received as a paremeter. 
     *                  could be null if the default currency is specified.
     * @return {@link BasicAmountType} with the given value and currency.
     */
    protected BasicAmountType getAmount(final String value, final CurrencyCodeType currency) 
    {
        final BasicAmountType ret = new BasicAmountType();
        ret.setValue(value);
        ret.setCurrencyID(getCurrency(currency));
        return ret;
    }
    
    /**
     * Returns the currency to use in operations
     * @param actualParameter   the currency parameter passed to the operation.
     * @return if a currency is specified, returns the parameter. otherwise returns
     *          the default currency.
     */
    protected CurrencyCodeType getCurrency(final CurrencyCodeType actualParameter)
    {
        final CurrencyCodeType ret;

        if (actualParameter == null)
        {
            if (defaultCurrency == null)
            {
                throw new IllegalArgumentException(
                    "No amountCourrency given (and a defaultCurrency wasn't configured)");
            }
            else
            {
                ret = defaultCurrency;
            }
        }
        else
        {
            ret = actualParameter;
        }

        return ret;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getSignature()
    {
        return signature;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setUsername(final String username)
    {
        this.username = username;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    public void setSignature(final String signature)
    {
        this.signature = signature;
    }

    public void setSubject(final String subject)
    {
        this.subject = subject;
    }

    public CurrencyCodeType getDefaultCurrency()
    {
        return defaultCurrency;
    }

    public void setDefaultCurrency(CurrencyCodeType defaultCurrency)
    {
        this.defaultCurrency = defaultCurrency;
    }

    public PaypalFacade getFacade()
    {
        return facade;
    }

    public void setFacade(PaypalFacade facade)
    {
        this.facade = facade;
    }

    
}
