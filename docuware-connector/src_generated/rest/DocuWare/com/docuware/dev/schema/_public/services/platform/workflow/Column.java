
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A column for a workflow.
 * 
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "columnOptions"
})
public class Column {

    @XmlElement(name = "ColumnOptions", required = true)
    protected ColumnOptions columnOptions;
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "ColumnValueType", required = true)
    protected ColumnValueTypeEnum columnValueType;
    @XmlAttribute(name = "ColumnType", required = true)
    protected ColumnTypeEnum columnType;

    /**
     * Gets the value of the columnOptions property.
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
     */
    public void setColumnOptions(ColumnOptions value) {
        this.columnOptions = value;
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
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the columnValueType property.
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
     */
    public void setColumnValueType(ColumnValueTypeEnum value) {
        this.columnValueType = value;
    }

    /**
     * Gets the value of the columnType property.
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
     */
    public void setColumnType(ColumnTypeEnum value) {
        this.columnType = value;
    }

}
