
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://dev.docuware.com/schema/public/services/platform}WebFormOptions"/&gt;
 *         &lt;element name="Orientation" type="{http://dev.docuware.com/schema/public/services/platform}OrientationType"/&gt;
 *         &lt;element name="NumberOfColumns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ColumnWidth" type="{http://dev.docuware.com/schema/public/services/platform}ColumnWidthType"/&gt;
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OptionsRows" type="{http://dev.docuware.com/schema/public/services/platform}WebFormOptionsRows"/&gt;
 *         &lt;element name="PredefinedValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGroup", propOrder = {
    "options",
    "orientation",
    "numberOfColumns",
    "columnWidth",
    "sortOrder",
    "optionsRows",
    "predefinedValues"
})
public class CheckGroup
    extends WebFormField
{

    @XmlElement(name = "Options", required = true)
    protected WebFormOptions options;
    @XmlElement(name = "Orientation", required = true)
    @XmlSchemaType(name = "string")
    protected OrientationType orientation;
    @XmlElement(name = "NumberOfColumns")
    protected int numberOfColumns;
    @XmlElement(name = "ColumnWidth", required = true)
    @XmlSchemaType(name = "string")
    protected ColumnWidthType columnWidth;
    @XmlElement(name = "SortOrder", required = true)
    protected String sortOrder;
    @XmlElement(name = "OptionsRows", required = true)
    protected WebFormOptionsRows optionsRows;
    @XmlElement(name = "PredefinedValues", required = true)
    protected List<String> predefinedValues;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link WebFormOptions }
     *     
     */
    public WebFormOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormOptions }
     *     
     */
    public void setOptions(WebFormOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the numberOfColumns property.
     * 
     */
    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    /**
     * Sets the value of the numberOfColumns property.
     * 
     */
    public void setNumberOfColumns(int value) {
        this.numberOfColumns = value;
    }

    /**
     * Gets the value of the columnWidth property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnWidthType }
     *     
     */
    public ColumnWidthType getColumnWidth() {
        return columnWidth;
    }

    /**
     * Sets the value of the columnWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnWidthType }
     *     
     */
    public void setColumnWidth(ColumnWidthType value) {
        this.columnWidth = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the optionsRows property.
     * 
     * @return
     *     possible object is
     *     {@link WebFormOptionsRows }
     *     
     */
    public WebFormOptionsRows getOptionsRows() {
        return optionsRows;
    }

    /**
     * Sets the value of the optionsRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormOptionsRows }
     *     
     */
    public void setOptionsRows(WebFormOptionsRows value) {
        this.optionsRows = value;
    }

    /**
     * Gets the value of the predefinedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPredefinedValues() {
        if (predefinedValues == null) {
            predefinedValues = new ArrayList<String>();
        }
        return this.predefinedValues;
    }

}
