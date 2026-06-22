
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HistoryFieldOptions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HistoryFieldOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TextHistoryFieldOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TextHistoryFieldOptions"/&gt;
 *         &lt;element name="NumericHistoryFieldOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}NumericHistoryFieldOptions"/&gt;
 *         &lt;element name="TableHistoryFieldOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TableHistoryFieldOptions"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryFieldOptions", propOrder = {
    "textHistoryFieldOptions",
    "numericHistoryFieldOptions",
    "tableHistoryFieldOptions"
})
public class HistoryFieldOptions {

    @XmlElement(name = "TextHistoryFieldOptions")
    protected TextHistoryFieldOptions textHistoryFieldOptions;
    @XmlElement(name = "NumericHistoryFieldOptions")
    protected NumericHistoryFieldOptions numericHistoryFieldOptions;
    @XmlElement(name = "TableHistoryFieldOptions")
    protected TableHistoryFieldOptions tableHistoryFieldOptions;

    /**
     * Gets the value of the textHistoryFieldOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TextHistoryFieldOptions }
     *     
     */
    public TextHistoryFieldOptions getTextHistoryFieldOptions() {
        return textHistoryFieldOptions;
    }

    /**
     * Sets the value of the textHistoryFieldOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextHistoryFieldOptions }
     *     
     */
    public void setTextHistoryFieldOptions(TextHistoryFieldOptions value) {
        this.textHistoryFieldOptions = value;
    }

    /**
     * Gets the value of the numericHistoryFieldOptions property.
     * 
     * @return
     *     possible object is
     *     {@link NumericHistoryFieldOptions }
     *     
     */
    public NumericHistoryFieldOptions getNumericHistoryFieldOptions() {
        return numericHistoryFieldOptions;
    }

    /**
     * Sets the value of the numericHistoryFieldOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericHistoryFieldOptions }
     *     
     */
    public void setNumericHistoryFieldOptions(NumericHistoryFieldOptions value) {
        this.numericHistoryFieldOptions = value;
    }

    /**
     * Gets the value of the tableHistoryFieldOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TableHistoryFieldOptions }
     *     
     */
    public TableHistoryFieldOptions getTableHistoryFieldOptions() {
        return tableHistoryFieldOptions;
    }

    /**
     * Sets the value of the tableHistoryFieldOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableHistoryFieldOptions }
     *     
     */
    public void setTableHistoryFieldOptions(TableHistoryFieldOptions value) {
        this.tableHistoryFieldOptions = value;
    }

}
