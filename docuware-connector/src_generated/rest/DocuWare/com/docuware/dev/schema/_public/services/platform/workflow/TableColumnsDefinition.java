
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A common column options for a table field.
 * 
 * &lt;p&gt;Java class for TableColumnsDefinition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableColumnsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColumnOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TableColumnOptions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ColumnValueType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TableColumnValueTypeEnum" /&gt;
 *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableColumnsDefinition", propOrder = {
    "columnOptions"
})
public class TableColumnsDefinition {

    /**
     * Additional options specific for column type.
     * 
     */
    @XmlElement(name = "ColumnOptions", required = true)
    protected TableColumnOptions columnOptions;
    /**
     * Label of the column.
     * 
     */
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    /**
     * Identifier of the column.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Type of the column.
     * 
     */
    @XmlAttribute(name = "ColumnValueType", required = true)
    protected TableColumnValueTypeEnum columnValueType;
    /**
     * Determines whether the column can be empty.
     * 
     */
    @XmlAttribute(name = "Mandatory", required = true)
    protected boolean mandatory;

    /**
     * Additional options specific for column type.
     * 
     * @return
     *     possible object is
     *     {@link TableColumnOptions }
     *     
     */
    public TableColumnOptions getColumnOptions() {
        return columnOptions;
    }

    /**
     * Sets the value of the columnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableColumnOptions }
     *     
     * @see #getColumnOptions()
     */
    public void setColumnOptions(TableColumnOptions value) {
        this.columnOptions = value;
    }

    /**
     * Label of the column.
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
     * Identifier of the column.
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

    /**
     * Type of the column.
     * 
     * @return
     *     possible object is
     *     {@link TableColumnValueTypeEnum }
     *     
     */
    public TableColumnValueTypeEnum getColumnValueType() {
        return columnValueType;
    }

    /**
     * Sets the value of the columnValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableColumnValueTypeEnum }
     *     
     * @see #getColumnValueType()
     */
    public void setColumnValueType(TableColumnValueTypeEnum value) {
        this.columnValueType = value;
    }

    /**
     * Determines whether the column can be empty.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

}
