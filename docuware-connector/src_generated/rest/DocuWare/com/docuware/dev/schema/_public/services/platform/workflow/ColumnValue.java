
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A value in a column for a task.
 * 
 * &lt;p&gt;Java class for ColumnValue complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ColumnValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskFieldValue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnValue", propOrder = {
    "value"
})
public class ColumnValue {

    /**
     * Value of the column.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected TaskFieldValue value;
    /**
     * Id of the column.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Value of the column.
     * 
     * @return
     *     possible object is
     *     {@link TaskFieldValue }
     *     
     */
    public TaskFieldValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFieldValue }
     *     
     * @see #getValue()
     */
    public void setValue(TaskFieldValue value) {
        this.value = value;
    }

    /**
     * Id of the column.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

}
