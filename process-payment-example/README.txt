Paypal payment processing demo
==============================

INTRODUCTION
  This is minimalistic demo that shows how a payment can be processed and then captured using the Paypal API.
  After the payment capture, a notification email is sent to a specified account.

HOW TO DEMO:
  1. Set the following system properties:
    a. paypal_api_username This is the username for your Paypal Merchant Account
    b. paypal_api_password This is the password for your Paypal Merchant Account
    c. paypal_api_signature This is the API signature for your Paypal Merchant Account
    e. smtp_username SMTP username used to send email
    f. smtp_password SMTP password used to send email
    g. smtp_fromAddress Sender address displayed in  notification email
    h. smtp_toAddress Destination address where notification email is sent

  2. Run the "paymentDemo" flow from PaypalTestDriver, or deploy the example in a mule Container and hit
        http://localhost:9090/paypal-demo-process-payment?amount=50
    This will process a USD 50 payment, capture the transaction and send a confirmation email.
    To simplify usage of the demo, the only parameter expected is the payment ammount. The rest of the payment information has been hard-coded into the payload.

HOW IT WORKS:
   - "doDirectPayment" API method is called with specified amount and fake payer and credit card information
   - "capturePayment" API method is called, with the transaction ID and amount received from the payment operation
   - Summary email is sent to the specified address.
