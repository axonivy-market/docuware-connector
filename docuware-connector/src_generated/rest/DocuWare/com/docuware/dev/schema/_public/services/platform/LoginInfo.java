
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;


/**
 * Details abut user login
 * 
 * <p>Java class for LoginInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PasswordExpireNotification" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="BookedLicense" use="required" type="{http://dev.docuware.com/settings/interop}DWProductTypes" /&gt;
 *       &lt;attribute name="ProductType" use="required" type="{http://dev.docuware.com/settings/interop}DWProductTypes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo")
public class LoginInfo {

    @XmlAttribute(name = "PasswordExpireNotification")
    protected Duration passwordExpireNotification;
    @XmlAttribute(name = "BookedLicense", required = true)
    protected DWProductTypes bookedLicense;
    @XmlAttribute(name = "ProductType", required = true)
    protected DWProductTypes productType;

    /**
     * Gets the value of the passwordExpireNotification property.
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
     */
    public void setPasswordExpireNotification(Duration value) {
        this.passwordExpireNotification = value;
    }

    /**
     * Gets the value of the bookedLicense property.
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
     */
    public void setBookedLicense(DWProductTypes value) {
        this.bookedLicense = value;
    }

    /**
     * Gets the value of the productType property.
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
     */
    public void setProductType(DWProductTypes value) {
        this.productType = value;
    }

}
