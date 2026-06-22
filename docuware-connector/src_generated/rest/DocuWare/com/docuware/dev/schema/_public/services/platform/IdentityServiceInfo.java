
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IdentityServiceInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="IdentityServiceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentityServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityServiceInfo", propOrder = {
    "identityServiceUrl"
})
public class IdentityServiceInfo {

    @XmlElement(name = "IdentityServiceUrl", required = true)
    protected String identityServiceUrl;

    /**
     * Gets the value of the identityServiceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityServiceUrl() {
        return identityServiceUrl;
    }

    /**
     * Sets the value of the identityServiceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityServiceUrl(String value) {
        this.identityServiceUrl = value;
    }

}
