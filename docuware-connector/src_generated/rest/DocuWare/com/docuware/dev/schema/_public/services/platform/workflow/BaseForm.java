
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base form.
 * 
 * <p>Java class for BaseForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FormFieldType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}FormTypeEnum" /&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseForm")
@XmlSeeAlso({
    TaskTableField.class,
    CommonFormField.class,
    LinkForm.class,
    DescriptionFormField.class
})
public class BaseForm {

    @XmlAttribute(name = "FormFieldType", required = true)
    protected FormTypeEnum formFieldType;
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the formFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FormTypeEnum }
     *     
     */
    public FormTypeEnum getFormFieldType() {
        return formFieldType;
    }

    /**
     * Sets the value of the formFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormTypeEnum }
     *     
     */
    public void setFormFieldType(FormTypeEnum value) {
        this.formFieldType = value;
    }

    /**
     * Gets the value of the label property.
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
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
