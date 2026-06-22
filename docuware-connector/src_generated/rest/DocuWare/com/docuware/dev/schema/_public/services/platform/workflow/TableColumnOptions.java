
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TableColumnOptions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableColumnOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TextTableColumnOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TextTableColumnOptions"/&gt;
 *         &lt;element name="NumberTableColumnOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}NumberTableColumnOptions"/&gt;
 *         &lt;element name="DateTableColumnOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DateTableColumnOptions"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableColumnOptions", propOrder = {
    "textTableColumnOptions",
    "numberTableColumnOptions",
    "dateTableColumnOptions"
})
public class TableColumnOptions {

    @XmlElement(name = "TextTableColumnOptions")
    protected TextTableColumnOptions textTableColumnOptions;
    @XmlElement(name = "NumberTableColumnOptions")
    protected NumberTableColumnOptions numberTableColumnOptions;
    @XmlElement(name = "DateTableColumnOptions")
    protected DateTableColumnOptions dateTableColumnOptions;

    /**
     * Gets the value of the textTableColumnOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TextTableColumnOptions }
     *     
     */
    public TextTableColumnOptions getTextTableColumnOptions() {
        return textTableColumnOptions;
    }

    /**
     * Sets the value of the textTableColumnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextTableColumnOptions }
     *     
     */
    public void setTextTableColumnOptions(TextTableColumnOptions value) {
        this.textTableColumnOptions = value;
    }

    /**
     * Gets the value of the numberTableColumnOptions property.
     * 
     * @return
     *     possible object is
     *     {@link NumberTableColumnOptions }
     *     
     */
    public NumberTableColumnOptions getNumberTableColumnOptions() {
        return numberTableColumnOptions;
    }

    /**
     * Sets the value of the numberTableColumnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberTableColumnOptions }
     *     
     */
    public void setNumberTableColumnOptions(NumberTableColumnOptions value) {
        this.numberTableColumnOptions = value;
    }

    /**
     * Gets the value of the dateTableColumnOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DateTableColumnOptions }
     *     
     */
    public DateTableColumnOptions getDateTableColumnOptions() {
        return dateTableColumnOptions;
    }

    /**
     * Sets the value of the dateTableColumnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTableColumnOptions }
     *     
     */
    public void setDateTableColumnOptions(DateTableColumnOptions value) {
        this.dateTableColumnOptions = value;
    }

}
