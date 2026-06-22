
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StampField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="HasFixedEntry" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampField", propOrder = {
    "value"
})
public class StampField {

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     */
    @XmlElement(name = "Value")
    protected DocumentIndexFieldValue value;
    /**
     * Name of the index field that will be changed by the stamp.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Length of the index field that will be changed by the stamp.
     * 
     */
    @XmlAttribute(name = "Length", required = true)
    protected int length;
    /**
     * Determines whether the stamp field has defined fixed entry.
     * 
     */
    @XmlAttribute(name = "HasFixedEntry", required = true)
    protected boolean hasFixedEntry;

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFieldValue }
     *     
     */
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFieldValue }
     *     
     * @see #getValue()
     */
    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**
     * Name of the index field that will be changed by the stamp.
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
     * Length of the index field that will be changed by the stamp.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Determines whether the stamp field has defined fixed entry.
     * 
     */
    public boolean isHasFixedEntry() {
        return hasFixedEntry;
    }

    /**
     * Sets the value of the hasFixedEntry property.
     * 
     */
    public void setHasFixedEntry(boolean value) {
        this.hasFixedEntry = value;
    }

}
