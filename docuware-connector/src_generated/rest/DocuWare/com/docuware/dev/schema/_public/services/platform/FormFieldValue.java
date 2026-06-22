
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains the value of form field
 * 
 * &lt;p&gt;Java class for FormFieldValue complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FormFieldValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypedValue" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFieldValue", propOrder = {
    "typedValue"
})
@XmlSeeAlso({
    DecisionFormFieldValue.class
})
public class FormFieldValue {

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     */
    @XmlElement(name = "TypedValue")
    protected DocumentIndexFieldValue typedValue;
    /**
     * Get or sets the name of the form field.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Get or sets the display value of the form field.
     * 
     */
    @XmlAttribute(name = "Value")
    protected String value;

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFieldValue }
     *     
     */
    public DocumentIndexFieldValue getTypedValue() {
        return typedValue;
    }

    /**
     * Sets the value of the typedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFieldValue }
     *     
     * @see #getTypedValue()
     */
    public void setTypedValue(DocumentIndexFieldValue value) {
        this.typedValue = value;
    }

    /**
     * Get or sets the name of the form field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Get or sets the display value of the form field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
