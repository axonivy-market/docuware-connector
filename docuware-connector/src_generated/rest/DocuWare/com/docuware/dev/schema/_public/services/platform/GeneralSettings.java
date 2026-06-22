
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GeneralSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="GeneralSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="StartWith" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaType" default="None" /&gt;
 *       &lt;attribute name="CreatedVersion" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSettings")
public class GeneralSettings {

    @XmlAttribute(name = "StartWith")
    protected WorkAreaType startWith;
    @XmlAttribute(name = "CreatedVersion")
    protected String createdVersion;

    /**
     * Gets the value of the startWith property.
     * 
     * @return
     *     possible object is
     *     {@link WorkAreaType }
     *     
     */
    public WorkAreaType getStartWith() {
        if (startWith == null) {
            return WorkAreaType.NONE;
        } else {
            return startWith;
        }
    }

    /**
     * Sets the value of the startWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaType }
     *     
     */
    public void setStartWith(WorkAreaType value) {
        this.startWith = value;
    }

    /**
     * Gets the value of the createdVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedVersion() {
        if (createdVersion == null) {
            return "";
        } else {
            return createdVersion;
        }
    }

    /**
     * Sets the value of the createdVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedVersion(String value) {
        this.createdVersion = value;
    }

}
