
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A text field.
 * 
 * &lt;p&gt;Java class for TaskTextField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskTextField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}CommonFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldMask" type="{http://dev.docuware.com/schema/public/services/platform/workflow}FieldMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTextField", propOrder = {
    "fieldMask"
})
@XmlSeeAlso({
    KeywordsField.class
})
public class TaskTextField
    extends CommonFormField
{

    /**
     * Field mask a text field.
     * 
     */
    @XmlElement(name = "FieldMask")
    protected FieldMask fieldMask;
    /**
     * Length of the field value.
     * 
     */
    @XmlAttribute(name = "Length", required = true)
    protected int length;

    /**
     * Field mask a text field.
     * 
     * @return
     *     possible object is
     *     {@link FieldMask }
     *     
     */
    public FieldMask getFieldMask() {
        return fieldMask;
    }

    /**
     * Sets the value of the fieldMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMask }
     *     
     * @see #getFieldMask()
     */
    public void setFieldMask(FieldMask value) {
        this.fieldMask = value;
    }

    /**
     * Length of the field value.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

}
