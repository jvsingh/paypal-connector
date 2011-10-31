
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.AuthorizationInfoType;


/**
 * <p>Java class for DoAuthorizationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoAuthorizationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AuthorizationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoAuthorizationResponseType", propOrder = {
    "transactionID",
    "amount",
    "authorizationInfo"
})
@XmlSeeAlso({
    DoUATPAuthorizationResponseType.class
})
public class DoAuthorizationResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "Amount", required = true)
    protected BasicAmountType amount;
    @XmlElement(name = "AuthorizationInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AuthorizationInfoType authorizationInfo;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationInfoType }
     *     
     */
    public AuthorizationInfoType getAuthorizationInfo() {
        return authorizationInfo;
    }

    /**
     * Sets the value of the authorizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationInfoType }
     *     
     */
    public void setAuthorizationInfo(AuthorizationInfoType value) {
        this.authorizationInfo = value;
    }

}
