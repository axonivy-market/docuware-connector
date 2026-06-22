
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Error exit.
 * 
 * &lt;p&gt;Java class for ErrorHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ErrorHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FullErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OutputName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorHistoryStep")
public class ErrorHistoryStep {

    /**
     * Error message which cause error exit.
     * 
     */
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    /**
     * Contains full error message.
     * 
     */
    @XmlAttribute(name = "FullErrorMessage")
    protected String fullErrorMessage;
    /**
     * Name of the error exit.
     * 
     */
    @XmlAttribute(name = "OutputName")
    protected String outputName;

    /**
     * Error message which cause error exit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Contains full error message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullErrorMessage() {
        return fullErrorMessage;
    }

    /**
     * Sets the value of the fullErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFullErrorMessage()
     */
    public void setFullErrorMessage(String value) {
        this.fullErrorMessage = value;
    }

    /**
     * Name of the error exit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputName() {
        return outputName;
    }

    /**
     * Sets the value of the outputName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOutputName()
     */
    public void setOutputName(String value) {
        this.outputName = value;
    }

}
