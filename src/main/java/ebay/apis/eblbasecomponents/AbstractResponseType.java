
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ebay.api.paypalapi.AddressVerifyResponseType;
import ebay.api.paypalapi.BAUpdateResponseType;
import ebay.api.paypalapi.BMButtonSearchResponseType;
import ebay.api.paypalapi.BMCreateButtonResponseType;
import ebay.api.paypalapi.BMGetButtonDetailsResponseType;
import ebay.api.paypalapi.BMGetInventoryResponseType;
import ebay.api.paypalapi.BMManageButtonStatusResponseType;
import ebay.api.paypalapi.BMSetInventoryResponseType;
import ebay.api.paypalapi.BMUpdateButtonResponseType;
import ebay.api.paypalapi.BillOutstandingAmountResponseType;
import ebay.api.paypalapi.BillUserResponseType;
import ebay.api.paypalapi.CancelRecoupResponseType;
import ebay.api.paypalapi.CompleteRecoupResponseType;
import ebay.api.paypalapi.CreateBillingAgreementResponseType;
import ebay.api.paypalapi.CreateMobilePaymentResponseType;
import ebay.api.paypalapi.CreateRecurringPaymentsProfileResponseType;
import ebay.api.paypalapi.DoAuthorizationResponseType;
import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.DoDirectPaymentResponseType;
import ebay.api.paypalapi.DoExpressCheckoutPaymentResponseType;
import ebay.api.paypalapi.DoMobileCheckoutPaymentResponseType;
import ebay.api.paypalapi.DoNonReferencedCreditResponseType;
import ebay.api.paypalapi.DoReauthorizationResponseType;
import ebay.api.paypalapi.DoReferenceTransactionResponseType;
import ebay.api.paypalapi.DoVoidResponseType;
import ebay.api.paypalapi.EnterBoardingResponseType;
import ebay.api.paypalapi.GetAccessPermissionDetailsResponseType;
import ebay.api.paypalapi.GetAuthDetailsResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.GetBillingAgreementCustomerDetailsResponseType;
import ebay.api.paypalapi.GetBoardingDetailsResponseType;
import ebay.api.paypalapi.GetExpressCheckoutDetailsResponseType;
import ebay.api.paypalapi.GetIncentiveEvaluationResponseType;
import ebay.api.paypalapi.GetMobileStatusResponseType;
import ebay.api.paypalapi.GetPalDetailsResponseType;
import ebay.api.paypalapi.GetRecurringPaymentsProfileDetailsResponseType;
import ebay.api.paypalapi.GetTransactionDetailsResponseType;
import ebay.api.paypalapi.InitiateRecoupResponseType;
import ebay.api.paypalapi.ManagePendingTransactionStatusResponseType;
import ebay.api.paypalapi.ManageRecurringPaymentsProfileStatusResponseType;
import ebay.api.paypalapi.MassPayResponseType;
import ebay.api.paypalapi.RefundTransactionResponseType;
import ebay.api.paypalapi.ReverseTransactionResponseType;
import ebay.api.paypalapi.SetAccessPermissionsResponseType;
import ebay.api.paypalapi.SetAuthFlowParamResponseType;
import ebay.api.paypalapi.SetCustomerBillingAgreementResponseType;
import ebay.api.paypalapi.SetExpressCheckoutResponseType;
import ebay.api.paypalapi.SetMobileCheckoutResponseType;
import ebay.api.paypalapi.TransactionSearchResponseType;
import ebay.api.paypalapi.UpdateAccessPermissionsResponseType;
import ebay.api.paypalapi.UpdateRecurringPaymentsProfileResponseType;
import org.w3c.dom.Element;


/**
 *  
 *                     Base type definition of a response payload that can carry any 
 *                     type of payload content with following optional elements:
 *                     	- timestamp of response message, 
 *                     	- application level acknowledgement, and 
 *                     	- application-level errors and warnings.
 *                     
 * 
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ack" type="{urn:ebay:apis:eBLBaseComponents}AckCodeType"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any processContents='lax' namespace='' minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseType", propOrder = {
    "timestamp",
    "ack",
    "correlationID",
    "errors",
    "version",
    "build",
    "any"
})
@XmlSeeAlso({
    CompleteRecoupResponseType.class,
    BillOutstandingAmountResponseType.class,
    SetCustomerBillingAgreementResponseType.class,
    GetMobileStatusResponseType.class,
    DoReauthorizationResponseType.class,
    GetBalanceResponseType.class,
    EnterBoardingResponseType.class,
    SetMobileCheckoutResponseType.class,
    CreateBillingAgreementResponseType.class,
    SetExpressCheckoutResponseType.class,
    DoMobileCheckoutPaymentResponseType.class,
    UpdateRecurringPaymentsProfileResponseType.class,
    BillUserResponseType.class,
    SetAuthFlowParamResponseType.class,
    CreateMobilePaymentResponseType.class,
    InitiateRecoupResponseType.class,
    GetExpressCheckoutDetailsResponseType.class,
    SetAccessPermissionsResponseType.class,
    CancelRecoupResponseType.class,
    RefundTransactionResponseType.class,
    BMGetButtonDetailsResponseType.class,
    MassPayResponseType.class,
    GetBillingAgreementCustomerDetailsResponseType.class,
    ManageRecurringPaymentsProfileStatusResponseType.class,
    DoCaptureResponseType.class,
    BMManageButtonStatusResponseType.class,
    BMGetInventoryResponseType.class,
    GetRecurringPaymentsProfileDetailsResponseType.class,
    UpdateAccessPermissionsResponseType.class,
    DoAuthorizationResponseType.class,
    GetAccessPermissionDetailsResponseType.class,
    BMUpdateButtonResponseType.class,
    DoDirectPaymentResponseType.class,
    DoExpressCheckoutPaymentResponseType.class,
    GetIncentiveEvaluationResponseType.class,
    BAUpdateResponseType.class,
    GetPalDetailsResponseType.class,
    ReverseTransactionResponseType.class,
    AddressVerifyResponseType.class,
    DoNonReferencedCreditResponseType.class,
    BMSetInventoryResponseType.class,
    CreateRecurringPaymentsProfileResponseType.class,
    GetTransactionDetailsResponseType.class,
    GetBoardingDetailsResponseType.class,
    BMCreateButtonResponseType.class,
    TransactionSearchResponseType.class,
    BMButtonSearchResponseType.class,
    ManagePendingTransactionStatusResponseType.class,
    GetAuthDetailsResponseType.class,
    DoReferenceTransactionResponseType.class,
    DoVoidResponseType.class
})
public abstract class AbstractResponseType {

    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Ack", required = true)
    protected AckCodeType ack;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "Errors")
    protected List<ErrorType> errors;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Build", required = true)
    protected String build;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link AckCodeType }
     *     
     */
    public AckCodeType getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckCodeType }
     *     
     */
    public void setAck(AckCodeType value) {
        this.ack = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
