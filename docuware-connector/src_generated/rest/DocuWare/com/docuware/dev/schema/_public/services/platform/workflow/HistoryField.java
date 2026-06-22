
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HistoryField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HistoryField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WFFormFieldValue"/&gt;
 *         &lt;element name="Options" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryFieldOptions" minOccurs="0"/&gt;
 *         &lt;element name="AssignmentType" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignmentType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryFormTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryField", propOrder = {
    "value",
    "options",
    "assignmentType"
})
@XmlSeeAlso({
    FileCabinetHistoryField.class
})
public class HistoryField {

    /**
     * Value of the field.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected WFFormFieldValue value;
    /**
     * Additional options specific for field type.
     * 
     */
    @XmlElement(name = "Options")
    protected HistoryFieldOptions options;
    /**
     * Assignment destination type specific for field.
     * 
     */
    @XmlElement(name = "AssignmentType", required = true)
    @XmlSchemaType(name = "string")
    protected AssignmentType assignmentType;
    /**
     * Тhe label of the field.
     * 
     */
    @XmlAttribute(name = "Label")
    protected String label;
    /**
     * Type of the history form field.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected HistoryFormTypeEnum type;

    /**
     * Value of the field.
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
     * Additional options specific for field type.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFieldOptions }
     *     
     */
    public HistoryFieldOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFieldOptions }
     *     
     * @see #getOptions()
     */
    public void setOptions(HistoryFieldOptions value) {
        this.options = value;
    }

    /**
     * Assignment destination type specific for field.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentType }
     *     
     */
    public AssignmentType getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentType }
     *     
     * @see #getAssignmentType()
     */
    public void setAssignmentType(AssignmentType value) {
        this.assignmentType = value;
    }

    /**
     * Тhe label of the field.
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
     * Type of the history form field.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFormTypeEnum }
     *     
     */
    public HistoryFormTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFormTypeEnum }
     *     
     * @see #getType()
     */
    public void setType(HistoryFormTypeEnum value) {
        this.type = value;
    }

}
