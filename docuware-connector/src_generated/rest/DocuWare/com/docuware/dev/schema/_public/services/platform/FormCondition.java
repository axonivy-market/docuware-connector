
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition of a condition
 * 
 * &lt;p&gt;Java class for FormCondition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FormCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Operator" type="{http://dev.docuware.com/schema/public/services/platform}Operator"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Continuation" type="{http://dev.docuware.com/schema/public/services/platform}Continuation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormCondition", propOrder = {
    "fieldID",
    "operator",
    "value",
    "continuation"
})
@XmlSeeAlso({
    BehaviorCondition.class,
    ValidationCondition.class
})
public class FormCondition {

    @XmlElement(name = "FieldID", required = true)
    protected String fieldID;
    @XmlElement(name = "Operator", required = true)
    @XmlSchemaType(name = "string")
    protected Operator operator;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Continuation", required = true)
    @XmlSchemaType(name = "string")
    protected Continuation continuation;

    /**
     * Gets the value of the fieldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldID() {
        return fieldID;
    }

    /**
     * Sets the value of the fieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldID(String value) {
        this.fieldID = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
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
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the continuation property.
     * 
     * @return
     *     possible object is
     *     {@link Continuation }
     *     
     */
    public Continuation getContinuation() {
        return continuation;
    }

    /**
     * Sets the value of the continuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Continuation }
     *     
     */
    public void setContinuation(Continuation value) {
        this.continuation = value;
    }

}
