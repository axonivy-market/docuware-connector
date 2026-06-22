
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A form field for variable text to a text stamp.
 * 
 * &lt;p&gt;Java class for StampFormField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampFormField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaskErrorText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SampleEditText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectListsAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="NotEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormField", propOrder = {
    "links"
})
public class StampFormField {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Name of the form field
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * The label used to represent the form field when the stamp is set on the client.
     * 
     */
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    /**
     * Lenght of the form field
     * 
     */
    @XmlAttribute(name = "Length")
    protected Integer length;
    /**
     * Gets the number of digits after the decimal point in case of a numeric field.
     * 
     */
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    /**
     * Mask(regular expression) for limiting the input options for the form field.
     * 
     */
    @XmlAttribute(name = "Mask")
    protected String mask;
    /**
     * Error message to display if the input does not match the mask definition.
     * 
     */
    @XmlAttribute(name = "MaskErrorText")
    protected String maskErrorText;
    /**
     * Sample entry that matches the mask definition.
     * 
     */
    @XmlAttribute(name = "SampleEditText")
    protected String sampleEditText;
    /**
     * A value indicating whether the any select list is assigned.
     * 
     */
    @XmlAttribute(name = "SelectListsAssigned")
    protected Boolean selectListsAssigned;
    /**
     * A value indicating whether the form field value must be filled.
     * 
     */
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Name of the form field
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
     * The label used to represent the form field when the stamp is set on the client.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLabel()
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Lenght of the form field
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return  0;
        } else {
            return length;
        }
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLength()
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the number of digits after the decimal point in case of a numeric field.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPrecision()
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Mask(regular expression) for limiting the input options for the form field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMask()
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Error message to display if the input does not match the mask definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskErrorText() {
        return maskErrorText;
    }

    /**
     * Sets the value of the maskErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaskErrorText()
     */
    public void setMaskErrorText(String value) {
        this.maskErrorText = value;
    }

    /**
     * Sample entry that matches the mask definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleEditText() {
        return sampleEditText;
    }

    /**
     * Sets the value of the sampleEditText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSampleEditText()
     */
    public void setSampleEditText(String value) {
        this.sampleEditText = value;
    }

    /**
     * A value indicating whether the any select list is assigned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectListsAssigned() {
        if (selectListsAssigned == null) {
            return true;
        } else {
            return selectListsAssigned;
        }
    }

    /**
     * Sets the value of the selectListsAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSelectListsAssigned()
     */
    public void setSelectListsAssigned(Boolean value) {
        this.selectListsAssigned = value;
    }

    /**
     * A value indicating whether the form field value must be filled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    /**
     * Sets the value of the notEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotEmpty()
     */
    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
    }

}
