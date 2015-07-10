PayPal Connector Release Notes
=================================

Date: 30-July-2015

Version: 3.0.0

PayPal Version : Classic API based on SOAP


Supported Mule Runtime Versions
--------------------------------
3.7.0

New Features and Functionality
------------------------------
* Support for authentication using API Signature in SOAP header
* Support for any SOAP operation exposed by the PayPal SOAP services

A Special Note
-----------------

The connector uses a new feature in Devkit 3.7.0, SOAP Connect. This helps in creating a generic connector that can dynamically read all PayPal operations and send/receive SOAP messages.

Closed Issues in this release
------------------------------
N/A

Known Issues in this release
------------------------------
- The connector does not support client Certificate based authentication.