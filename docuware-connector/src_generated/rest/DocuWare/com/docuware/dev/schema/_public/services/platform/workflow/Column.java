
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A column for a workflow.
 * 
 * &lt;p&gt;Java class for Column complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColumnOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnOptions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ColumnValueType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnValueTypeEnum" /&gt;
 *       &lt;attribute name="ColumnType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "columnOptions"
})
public class Column {

    /**
     * Additional options specific for column type.
     * 
     */
    @XmlElement(name = "ColumnOptions", required = true)
    protected ColumnOptions columnOptions;
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
    protected ColumnValueTypeEnum columnValueType;
    /**
     * Type of the column as source.
     * 
     */
    @XmlAttribute(name = "ColumnType", required = true)
    protected ColumnTypeEnum columnType;

    /**
     * Additional options specific for column type.
     * 
     * @return
     *     possible object is
     *     {@link ColumnOptions }
     *     
     */
    public ColumnOptions getColumnOptions() {
        return columnOptions;
    }

    /**
     * Sets the value of the columnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnOptions }
     *     
     * @see #getColumnOptions()
     */
    public void setColumnOptions(ColumnOptions value) {
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
     *     {@link ColumnValueTypeEnum }
     *     
     */
    public ColumnValueTypeEnum getColumnValueType() {
        return columnValueType;
    }

    /**
     * Sets the value of the columnValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnValueTypeEnum }
     *     
     * @see #getColumnValueType()
     */
    public void setColumnValueType(ColumnValueTypeEnum value) {
        this.columnValueType = value;
    }

    /**
     * Type of the column as source.
     * 
     * @return
     *     possible object is
     *     {@link ColumnTypeEnum }
     *     
     */
    public ColumnTypeEnum getColumnType() {
        return columnType;
    }

    /**
     * Sets the value of the columnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnTypeEnum }
     *     
     * @see #getColumnType()
     */
    public void setColumnType(ColumnTypeEnum value) {
        this.columnType = value;
    }

}
