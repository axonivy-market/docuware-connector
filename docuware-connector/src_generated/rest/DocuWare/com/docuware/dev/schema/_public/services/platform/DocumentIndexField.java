
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DocumentIndexField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentIndexField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValueBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointAndShootInfo" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexField", propOrder = {
    "pointAndShootInfo"
})
public class DocumentIndexField
    extends DocumentIndexFieldValueBase
{

    /**
     * Contains one rectangle value for scalar field values and one or more values for keyword fields.
     * 
     */
    @XmlElement(name = "PointAndShootInfo")
    protected PointAndShootInfo pointAndShootInfo;
    /**
     * Contains the internal name of the field.
     * 
     */
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    /**
     * Contains the label of the field.
     * 
     */
    @XmlAttribute(name = "FieldLabel")
    protected String fieldLabel;
    /**
     * Indicates whether the field value is null or non-null.
     * 
     */
    @XmlAttribute(name = "IsNull")
    protected Boolean isNull;
    /**
     * The value of this property can depend on the document. There might be documents which have a certain field set as read only while other
     *               documents have these fields writable.
     * 
     */
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;

    /**
     * Contains one rectangle value for scalar field values and one or more values for keyword fields.
     * 
     * @return
     *     possible object is
     *     {@link PointAndShootInfo }
     *     
     */
    public PointAndShootInfo getPointAndShootInfo() {
        return pointAndShootInfo;
    }

    /**
     * Sets the value of the pointAndShootInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAndShootInfo }
     *     
     * @see #getPointAndShootInfo()
     */
    public void setPointAndShootInfo(PointAndShootInfo value) {
        this.pointAndShootInfo = value;
    }

    /**
     * Contains the internal name of the field.
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
     * Contains the label of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**
     * Sets the value of the fieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldLabel()
     */
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**
     * Indicates whether the field value is null or non-null.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNull() {
        if (isNull == null) {
            return false;
        } else {
            return isNull;
        }
    }

    /**
     * Sets the value of the isNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsNull()
     */
    public void setIsNull(Boolean value) {
        this.isNull = value;
    }

    /**
     * The value of this property can depend on the document. There might be documents which have a certain field set as read only while other
     *               documents have these fields writable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReadOnly()
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

}
