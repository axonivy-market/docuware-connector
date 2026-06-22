
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Value of form field
 * 
 * &lt;p&gt;Java class for ConfirmedField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ConfirmedField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WFFormFieldValue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmedField", propOrder = {
    "value"
})
public class ConfirmedField {

    /**
     * Form field value casted to the form field value type.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected WFFormFieldValue value;
    /**
     * Identifier of the field.
     * 
     */
    @XmlAttribute(name = "Id")
    protected Integer id;

    /**
     * Form field value casted to the form field value type.
     * 
     * @return
     *     possible object is
     *     {@link WFFormFieldValue }
     *     
     */
    public WFFormFieldValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFFormFieldValue }
     *     
     * @see #getValue()
     */
    public void setValue(WFFormFieldValue value) {
        this.value = value;
    }

    /**
     * Identifier of the field.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getId()
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
