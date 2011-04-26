Paypal payment authorization demo
==============================

INTRODUCTION
  This is minimalistic demo that shows how authorization with Fraud Management Control can be donde for know payers.
  To run this demo a MongoDB database is required, with a collection named "authorizedUsers" and entries with a "userId" property that identifies users who have permission to make payments above certain amount.

  

HOW TO DEMO:
  1. Set the following system properties:
    a. paypal_api_username Username for your Paypal Merchant Account
    b. paypal_api_password Password for your Paypal Merchant Account
    c. paypal_api_signature API signature for your Paypal Merchant Account
    d. paypal_payment_limit Amount above which payments have to be manually accepted. It should be the same as the one set in your paypal account's Fraud Management filters.
    e. smtp_username SMTP username used to send email
    f. smtp_password SMTP password used to send email
    g. smtp_fromAddress Sender address displayed in  notification email
    h. smtp_toAddress Destination address where notification email is sent
    j. mongo_database Database name
    k. mongo_hostname Database host

  2. Run the "paymentDemo" flow from PaypalTestDriver, or deploy the example in a mule Container and hit
        http://localhost:9091/paypal-demo-verify-payment?amount=50&userId=123
    This will process a U$D 50 payment from a user with id "123". If the amount exceeds the Fraud Management filter limit, the user is looked in the authorizedUsers collection, and if found, the payment is accepted.
    To simplify usage of the demo, the only parameter expected is the payment amount and user ID. The rest of the payment information has been hard-coded into the payload.

HOW IT WORKS:
   - First the amount is compared with the filter limit.
   - CASE:
     If the amount is greater than the limit, the database is queried to check if an authorized user exists with the same ID as the payer. If the user is authorized, payment is processed ("doDirectPayment" API method) and confirmed with Fraud Management ("managePendingTransactionStatus" API method).
     If the user is not found in the database, an email is sent to a specified address indicating that a payment was made and verification must be done manually.
   - CASE:
     If the amount is below the limit, payment is processed, with no need to confirm with Fraud Management.
