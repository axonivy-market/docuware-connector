
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A base form.
 * 
 * &lt;p&gt;Java class for BaseForm complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BaseForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FormFieldType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}FormTypeEnum" /&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
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

    /**
     * Type of the form field.
     * 
     */
    @XmlAttribute(name = "FormFieldType", required = true)
    protected FormTypeEnum formFieldType;
    /**
     * Label of the form field.
     * 
     */
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    /**
     * Identifier of the form field.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Type of the form field.
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
     * @see #getFormFieldType()
     */
    public void setFormFieldType(FormTypeEnum value) {
        this.formFieldType = value;
    }

    /**
     * Label of the form field.
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
     * Identifier of the form field.
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
