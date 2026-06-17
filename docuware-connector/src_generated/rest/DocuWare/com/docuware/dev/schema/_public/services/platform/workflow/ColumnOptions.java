
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TextColumn" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TextColumn"/&gt;
 *         &lt;element name="NumberColumn" type="{http://dev.docuware.com/schema/public/services/platform/workflow}NumberColumn"/&gt;
 *         &lt;element name="DateColumn" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DateColumn"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnOptions", propOrder = {
    "textColumn",
    "numberColumn",
    "dateColumn"
})
public class ColumnOptions {

    @XmlElement(name = "TextColumn")
    protected TextColumn textColumn;
    @XmlElement(name = "NumberColumn")
    protected NumberColumn numberColumn;
    @XmlElement(name = "DateColumn")
    protected DateColumn dateColumn;

    /**
     * Gets the value of the textColumn property.
     * 
     * @return
     *     possible object is
     *     {@link TextColumn }
     *     
     */
    public TextColumn getTextColumn() {
        return textColumn;
    }

    /**
     * Sets the value of the textColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextColumn }
     *     
     */
    public void setTextColumn(TextColumn value) {
        this.textColumn = value;
    }

    /**
     * Gets the value of the numberColumn property.
     * 
     * @return
     *     possible object is
     *     {@link NumberColumn }
     *     
     */
    public NumberColumn getNumberColumn() {
        return numberColumn;
    }

    /**
     * Sets the value of the numberColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberColumn }
     *     
     */
    public void setNumberColumn(NumberColumn value) {
        this.numberColumn = value;
    }

    /**
     * Gets the value of the dateColumn property.
     * 
     * @return
     *     possible object is
     *     {@link DateColumn }
     *     
     */
    public DateColumn getDateColumn() {
        return dateColumn;
    }

    /**
     * Sets the value of the dateColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateColumn }
     *     
     */
    public void setDateColumn(DateColumn value) {
        this.dateColumn = value;
    }

}
