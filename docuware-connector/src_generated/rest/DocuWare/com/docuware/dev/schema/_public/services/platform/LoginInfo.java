
package com.docuware.dev.schema._public.services.platform;

import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details abut user login
 * 
 * &lt;p&gt;Java class for LoginInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LoginInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PasswordExpireNotification" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="BookedLicense" use="required" type="{http://dev.docuware.com/settings/interop}DWProductTypes" /&gt;
 *       &lt;attribute name="ProductType" use="required" type="{http://dev.docuware.com/settings/interop}DWProductTypes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo")
public class LoginInfo {

    /**
     * Define the period of time when password will expire.
     *           This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     */
    @XmlAttribute(name = "PasswordExpireNotification")
    protected Duration passwordExpireNotification;
    /**
     * License that is booked for the login
     * 
     */
    @XmlAttribute(name = "BookedLicense", required = true)
    protected DWProductTypes bookedLicense;
    /**
     * Product type used for login
     * 
     */
    @XmlAttribute(name = "ProductType", required = true)
    protected DWProductTypes productType;

    /**
     * Define the period of time when password will expire.
     *           This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPasswordExpireNotification() {
        return passwordExpireNotification;
    }

    /**
     * Sets the value of the passwordExpireNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getPasswordExpireNotification()
     */
    public void setPasswordExpireNotification(Duration value) {
        this.passwordExpireNotification = value;
    }

    /**
     * License that is booked for the login
     * 
     * @return
     *     possible object is
     *     {@link DWProductTypes }
     *     
     */
    public DWProductTypes getBookedLicense() {
        return bookedLicense;
    }

    /**
     * Sets the value of the bookedLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DWProductTypes }
     *     
     * @see #getBookedLicense()
     */
    public void setBookedLicense(DWProductTypes value) {
        this.bookedLicense = value;
    }

    /**
     * Product type used for login
     * 
     * @return
     *     possible object is
     *     {@link DWProductTypes }
     *     
     */
    public DWProductTypes getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DWProductTypes }
     *     
     * @see #getProductType()
     */
    public void setProductType(DWProductTypes value) {
        this.productType = value;
    }

}
