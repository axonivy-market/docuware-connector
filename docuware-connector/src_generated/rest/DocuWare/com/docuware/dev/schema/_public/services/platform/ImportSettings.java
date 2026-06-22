
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ImportSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldMappings" type="{http://dev.docuware.com/schema/public/services/platform}FieldMappings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PreserveSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportSettings", propOrder = {
    "fieldMappings"
})
public class ImportSettings {

    /**
     * Gets or sets field mappings.
     * 
     */
    @XmlElement(name = "FieldMappings")
    protected FieldMappings fieldMappings;
    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
     * 
     */
    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;

    /**
     * Gets or sets field mappings.
     * 
     * @return
     *     possible object is
     *     {@link FieldMappings }
     *     
     */
    public FieldMappings getFieldMappings() {
        return fieldMappings;
    }

    /**
     * Sets the value of the fieldMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMappings }
     *     
     * @see #getFieldMappings()
     */
    public void setFieldMappings(FieldMappings value) {
        this.fieldMappings = value;
    }

    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreserveSystemFields() {
        if (preserveSystemFields == null) {
            return false;
        } else {
            return preserveSystemFields;
        }
    }

    /**
     * Sets the value of the preserveSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreserveSystemFields()
     */
    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

}
