
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the extended rights of the user.
 * 
 * &lt;p&gt;Java class for ExtendedConfigurationRights complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExtendedConfigurationRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Forms" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedConfigurationRights")
public class ExtendedConfigurationRights {

    /**
     * Gets or sets a value indicating whether the right for configuring forms is allowed.
     * 
     */
    @XmlAttribute(name = "Forms")
    protected Boolean forms;

    /**
     * Gets or sets a value indicating whether the right for configuring forms is allowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForms() {
        if (forms == null) {
            return false;
        } else {
            return forms;
        }
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isForms()
     */
    public void setForms(Boolean value) {
        this.forms = value;
    }

}
