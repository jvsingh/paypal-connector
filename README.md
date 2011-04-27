Mule Paypal Cloud Connector
===========================

Mule Cloud connector to Paypal

Installation
------------

The connector can either be installed for all applications running within the Mule instance or can be setup to be used
for a single application.

*All Applications*

Download the connector from the link above and place the resulting jar file in
/lib/user directory of the Mule installation folder.

*Single Application*

To make the connector available only to single application then place it in the
lib directory of the application otherwise if using Maven to compile and deploy
your application the following can be done:

Add the connector's maven repo to your pom.xml:

    <repositories>
        <repository>
            <id>muleforge-releases</id>
            <name>MuleForge Snapshot Repository</name>
            <url>https://repository.muleforge.org/release/</url>
            <layout>default</layout>
        </repsitory>
    </repositories>

Add the connector as a dependency to your project. This can be done by adding
the following under the dependencies element in the pom.xml file of the
application:

    <dependency>
        <groupId>org.mule.modules</groupId>
        <artifactId>mule-module-paypal</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

Configuration
-------------

You can configure the connector as follows:

    <paypal:config username="value" password="value" signature="value" subject="value" defaultCurrency="value" facade="value"/>

Here is detailed list of all the configuration attributes:

| attribute | description | optional | default value |
|:-----------|:-----------|:---------|:--------------|
|name|Give a name to this configuration so it can be later referenced by config-ref.|yes||
|username|Paypal username|no|
|password|Paypal password|no|
|signature|PayPal-generated unique digital signature.|no|
|subject|An indicator in an API call of the account for whom the call is being made|yes|
|defaultCurrency|Default currency used if none is specified in the operation|yes|
|facade||yes|








Get Balance
-----------

Obtain the available balance for a PayPal account.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|returnAllCurrencies|If true, returns the balance for each currency holding, otherwise only the balance for the primary currency holding|yes||

Returns balance for the account GetBalanceResponseType



Address Verify
--------------

Confirms whether a postal address and postal code match those of the specified
PayPal account holder.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|email||no||
|street||no||
|zip||no||

Returns with the confirmation status of for parameter.



Capture
-------

Capture an authorized payment.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|authorizationId|The authorization identification number of the payment you want to capture. This is the transaction id returned from DoExpressCheckoutPayment or DoDirectPayment. Character length and limits: 19 single-byte characters maximum.|no||
|complete|The value Complete indicates that this the last capture you intend to make. The value NotComplete indicates that you intend to make additional captures|no||
|amount|Amount to capture. Limitations: Value is a positive number which cannot exceed $10,000 USD in any currency. No currency symbol. Must have two decimal places, decimal separator must be a period (.), and the optional thousands separator must be a comma (,).|no||
|amountCurrency|The currency in which amount is expressed. If it is null, then the defaultCurrency is used.|yes||
|invoiceId|Your invoice number or other identification number that is displayed to the merchant and customer in his transaction history. NOTE: This value on DoCapture will overwrite a value previously set on DoAuthorization. NOTE: The value is recorded only if the authorization you are capturing is an order authorization, not a basic authorization. Character length and limits: 127 single-byte alphanumeric characters.|yes||
|note|An informational note about this settlement that is displayed to the payer in email and in his transaction history. Character length and limits: 255 single-byte characters.|yes||
|softDescriptor|The soft descriptor is a per transaction description of the payment that is passed to the consumer's credit card statement.|yes||

Returns DoCaptureResponseType. Only the authorization ID, transaction ID, transaction type, payment date, gross amount and payment status are guaranteed to be returned. If you need the values of other fields and they are not returned, you can obtain their values later by calling GetTransactionDetails or by using the reporting mechanism.



Authorize
---------

Authorize a payment

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|transactionId|The value of the order's transaction identification number returned by PayPal. Character length and limits: 19 single-byte characters maximum.|no||
|amount|Amount to authorize. Limitations: Value is a positive number which cannot exceed $10,000 USD in any currency. No currency symbol. Must have two decimal places, decimal separator must be a period (.), and the optional thousands separator must be a comma (,).|no||
|amountCurrency|The currency in which amount is expressed. If it is null, then the defaultCurrency is used.|yes||
|transactionEntity|Type of transaction to authorize. The only allowable value is Order, which means that the transaction represents a customer order that can be fulfilled over 29 days.|yes||

Returns with transaction and authorization information.



Get Pal Details
---------------

Obtain your Pal ID, which is the PayPal-assigned merchant account number, 
and other information about your account. You need the account number when 
working with dynamic versions of PayPal buttons and logos.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||

Returns with the account details.



Re Authorize
------------

Reauthorize an amount for a previously authorized transaction.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|authorizationId|The value of a previously authorized transaction identification number returned by PayPal. Character length and limits: 19 single-byte characters maximum.|no||
|amount|Amount to reauthorize. Limitations: Value is a positive number which cannot exceed $10,000 USD in any currency. No currency symbol. Must have two decimal places, decimal separator must be a period (.), and the optional thousands separator must be a comma (,).|no||
|amountCurrency|The currency in which amount is expressed. If it is null, then the defaultCurrency is used.|yes||

Returns containing payment status and the new  authorization identification number.



Do Void
-------

Void an order or an authorization.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|authorizationId|The original authorization ID specifying the authorization to void or, to void an order, the order ID. IMPORTANT: If you are voiding a transaction that has been reauthorized, use the ID from the original authorization, and not the reauthorization. Character length and limits: 19 single-byte characters.|no||
|note|An informational note about this void that is displayed to the payer in email and in his transaction history. Character length and limits: 255 single-byte characters|yes||



Get Transaction Details
-----------------------

Obtain information about a specific transaction.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|transactionId|Unique identifier of a transaction. NOTE: The details for some kinds of transactions cannot be retrieved with GetTransactionDetails. You cannot obtain details of bank transfer withdrawals, for example. Character length and limitations: 17 single-byte alphanumeric characters.|no||

Returns with the transaction details.



Manage Pending Transaction Status
---------------------------------

Accept or deny a pending transaction held by Fraud Management Filters.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|transactionId|The transaction ID of the payment transaction.|no||
|action|The operation you want to perform on the transaction, which is one of the following actions: () Accept - accepts the payment () Deny - rejects the payment|no||

Returns with the ID and current status of the transactin.



Refund Transaction
------------------

Issue a refund to the PayPal account holder associated with a transaction.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|transactionId|Unique identifier of a transaction. Character length and limitations: 17 single-byte alphanumeric characters.|no||
|invoiceId|Your own invoice or tracking number. Character length and limitations: 127 single-byte alphanumeric characters|yes||
|refundType|Type of refund you are making: () Full - default () Partial|no||
|amount|Refund amount. Amount is required if RefundType is Partial. NOTE: If RefundType is not specified, do not set the Amount.|no||
|amountCurrency|The currency in which amount is expressed. If it is null, then the defaultCurrency is used.|yes||
|memo|Custom memo about the refund. Character length and limitations: 255 single-byte alphanumeric characters.|yes||

Returns with information about the refunded amount (transaction fee redunded, gross, net and total refunded amount)



Mass Pay
--------

Make a payment to one or more PayPal account holders.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|emailSubject|The subject line of the email that PayPal sends when the transaction is completed. The subject line is the same for all recipients. Character length and limitations: 255 single-byte alphanumeric characters.|no||
|massPayItems|Details of each payment. NOTE: A single request can include up to 250 MassPayItems.|no||
|receiverType|Indicates how you identify the recipients of payments in this call to MassPay. Must be EmailAddress or UserID.|no||

Returns with no specific information about the payments.



Do Direct Payment
-----------------

Process a credit card payment.

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|ipAddress|IP address of the payer's browser. NOTE: PayPal records this IP addresses as a means to detect possible fraud. Character length and limitations: 15 single-byte characters, including periods, for example: 255.255.255.255.|no||
|cardDetails|Credit card details|no||
|paymentDetails|Payment details|no||
|paymentAction|How you want to obtain payment: () "Authorization" indicates that this payment is a basic authorization subject to settlement with PayPal Authorization & Capture. () "Sale" indicates that this is a final sale for which you are requesting payment.|yes||
|setReturnFMFDetails|Flag to indicate whether you want the results returned by Fraud Management Filters. By default, you do not receive this information.|yes||

Returns with information about the payment.

























































