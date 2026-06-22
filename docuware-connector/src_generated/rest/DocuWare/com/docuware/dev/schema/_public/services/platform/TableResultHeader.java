
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Header for a column table result from document query
 * 
 * &lt;p&gt;Java class for TableResultHeader complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableResultHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Kind" use="required" type="{http://dev.docuware.com/schema/public/services/platform}TableResultFieldKind" /&gt;
 *       &lt;attribute name="IsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableResultHeader")
public class TableResultHeader {

    /**
     * Contains the internal name of the field.
     * 
     */
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Contains the label of the field.
     * 
     */
    @XmlAttribute(name = "FieldLabel")
    protected String fieldLabel;
    /**
     * Kind of the field.
     *           System, index or additional (calculated fields like total page count, special values like text preview etc.).
     * 
     */
    @XmlAttribute(name = "Kind", required = true)
    protected TableResultFieldKind kind;
    /**
     * Indicates whether the field is document name
     * 
     */
    @XmlAttribute(name = "IsDocumentName")
    protected Boolean isDocumentName;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Kind of the field.
     *           System, index or additional (calculated fields like total page count, special values like text preview etc.).
     * 
     * @return
     *     possible object is
     *     {@link TableResultFieldKind }
     *     
     */
    public TableResultFieldKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableResultFieldKind }
     *     
     * @see #getKind()
     */
    public void setKind(TableResultFieldKind value) {
        this.kind = value;
    }

    /**
     * Indicates whether the field is document name
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDocumentName() {
        if (isDocumentName == null) {
            return false;
        } else {
            return isDocumentName;
        }
    }

    /**
     * Sets the value of the isDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsDocumentName()
     */
    public void setIsDocumentName(Boolean value) {
        this.isDocumentName = value;
    }

}
