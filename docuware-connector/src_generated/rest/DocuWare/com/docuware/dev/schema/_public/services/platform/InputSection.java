
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InputSection complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="InputSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationProperties" type="{http://dev.docuware.com/schema/public/services/platform}ApplicationProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputSection", propOrder = {
    "applicationProperties"
})
public class InputSection {

    /**
     * Define application properties of the section. Different applications store specific application here.
     * 
     */
    @XmlElement(name = "ApplicationProperties")
    protected ApplicationProperties applicationProperties;

    /**
     * Define application properties of the section. Different applications store specific application here.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationProperties }
     *     
     */
    public ApplicationProperties getApplicationProperties() {
        return applicationProperties;
    }

    /**
     * Sets the value of the applicationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationProperties }
     *     
     * @see #getApplicationProperties()
     */
    public void setApplicationProperties(ApplicationProperties value) {
        this.applicationProperties = value;
    }

}
