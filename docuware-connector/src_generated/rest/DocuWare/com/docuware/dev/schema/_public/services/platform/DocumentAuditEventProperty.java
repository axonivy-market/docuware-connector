
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the description of auditing event property.
 * 
 * &lt;p&gt;Java class for DocumentAuditEventProperty complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentAuditEventProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PropertyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAuditEventProperty")
public class DocumentAuditEventProperty {

    /**
     * Gets or sets the name of the property that has been changed.
     * 
     */
    @XmlAttribute(name = "PropertyName", required = true)
    protected String propertyName;
    /**
     * Gets or sets the old value of the property.
     * 
     */
    @XmlAttribute(name = "OldValue")
    protected String oldValue;
    /**
     * Gets or sets the new value of the property.
     * 
     */
    @XmlAttribute(name = "NewValue")
    protected String newValue;

    /**
     * Gets or sets the name of the property that has been changed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPropertyName()
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets or sets the old value of the property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOldValue()
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets or sets the new value of the property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNewValue()
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

}
