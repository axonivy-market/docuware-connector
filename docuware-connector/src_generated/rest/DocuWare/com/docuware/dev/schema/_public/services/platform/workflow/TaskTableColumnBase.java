
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TaskTableColumnBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskTableColumnBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TextField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTextField"/&gt;
 *         &lt;element name="Number" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableNumberField"/&gt;
 *         &lt;element name="DateTimeField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskDateTimeField"/&gt;
 *         &lt;element name="NumberField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskNumberField"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableColumnBase", propOrder = {
    "textField",
    "number",
    "dateTimeField",
    "numberField"
})
public class TaskTableColumnBase {

    @XmlElement(name = "TextField")
    protected TaskTextField textField;
    @XmlElement(name = "Number")
    protected TaskTableNumberField number;
    @XmlElement(name = "DateTimeField")
    protected TaskDateTimeField dateTimeField;
    @XmlElement(name = "NumberField")
    protected TaskNumberField numberField;

    /**
     * Gets the value of the textField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTextField }
     *     
     */
    public TaskTextField getTextField() {
        return textField;
    }

    /**
     * Sets the value of the textField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTextField }
     *     
     */
    public void setTextField(TaskTextField value) {
        this.textField = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTableNumberField }
     *     
     */
    public TaskTableNumberField getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTableNumberField }
     *     
     */
    public void setNumber(TaskTableNumberField value) {
        this.number = value;
    }

    /**
     * Gets the value of the dateTimeField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDateTimeField }
     *     
     */
    public TaskDateTimeField getDateTimeField() {
        return dateTimeField;
    }

    /**
     * Sets the value of the dateTimeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDateTimeField }
     *     
     */
    public void setDateTimeField(TaskDateTimeField value) {
        this.dateTimeField = value;
    }

    /**
     * Gets the value of the numberField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskNumberField }
     *     
     */
    public TaskNumberField getNumberField() {
        return numberField;
    }

    /**
     * Sets the value of the numberField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskNumberField }
     *     
     */
    public void setNumberField(TaskNumberField value) {
        this.numberField = value;
    }

}
