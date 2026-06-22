
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A text field mask.
 * 
 * &lt;p&gt;Java class for FieldMask complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FieldMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ErrorText" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegularExpression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SampleEditText" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldMask")
public class FieldMask {

    /**
     * Error message to display if the input does not match the mask definition.
     * 
     */
    @XmlAttribute(name = "ErrorText", required = true)
    protected String errorText;
    /**
     * Regular expression for limiting the input options for the field.
     * 
     */
    @XmlAttribute(name = "RegularExpression", required = true)
    protected String regularExpression;
    /**
     * Sample entry that matches the mask definition.
     * 
     */
    @XmlAttribute(name = "SampleEditText", required = true)
    protected String sampleEditText;

    /**
     * Error message to display if the input does not match the mask definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorText()
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Regular expression for limiting the input options for the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegularExpression()
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
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

}
