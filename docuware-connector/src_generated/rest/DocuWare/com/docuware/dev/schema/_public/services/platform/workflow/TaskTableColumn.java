
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TaskTableColumn complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskTableColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseData" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableColumnBase" minOccurs="0"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsHidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableColumn", propOrder = {
    "baseData",
    "fieldName"
})
public class TaskTableColumn {

    /**
     * Field mask a text field.
     * 
     */
    @XmlElement(name = "BaseData")
    protected TaskTableColumnBase baseData;
    /**
     * Field mask a text field.
     * 
     */
    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    /**
     * Determines whether the column can be showned in table field
     * 
     */
    @XmlAttribute(name = "IsHidden", required = true)
    protected boolean isHidden;

    /**
     * Field mask a text field.
     * 
     * @return
     *     possible object is
     *     {@link TaskTableColumnBase }
     *     
     */
    public TaskTableColumnBase getBaseData() {
        return baseData;
    }

    /**
     * Sets the value of the baseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTableColumnBase }
     *     
     * @see #getBaseData()
     */
    public void setBaseData(TaskTableColumnBase value) {
        this.baseData = value;
    }

    /**
     * Field mask a text field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Determines whether the column can be showned in table field
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

}
