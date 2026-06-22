
package com.docuware.dev.schema._public.services.platform;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SuggestionCellValue complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SuggestionCellValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}SuggestionValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighlightRectangle" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TextFallback" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalFallback" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DateFallback" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ColumnName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RowNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Mapped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionCellValue", propOrder = {
    "highlightRectangle"
})
public class SuggestionCellValue
    extends SuggestionValue
{

    @XmlElement(name = "HighlightRectangle")
    protected PointAndShootInfo highlightRectangle;
    @XmlAttribute(name = "TextFallback")
    protected String textFallback;
    @XmlAttribute(name = "DecimalFallback")
    protected BigDecimal decimalFallback;
    @XmlAttribute(name = "DateFallback")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFallback;
    @XmlAttribute(name = "ColumnName", required = true)
    protected String columnName;
    @XmlAttribute(name = "RowNumber", required = true)
    protected int rowNumber;
    @XmlAttribute(name = "Mapped", required = true)
    protected boolean mapped;

    /**
     * Gets the value of the highlightRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link PointAndShootInfo }
     *     
     */
    public PointAndShootInfo getHighlightRectangle() {
        return highlightRectangle;
    }

    /**
     * Sets the value of the highlightRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAndShootInfo }
     *     
     */
    public void setHighlightRectangle(PointAndShootInfo value) {
        this.highlightRectangle = value;
    }

    /**
     * Gets the value of the textFallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFallback() {
        return textFallback;
    }

    /**
     * Sets the value of the textFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFallback(String value) {
        this.textFallback = value;
    }

    /**
     * Gets the value of the decimalFallback property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalFallback() {
        return decimalFallback;
    }

    /**
     * Sets the value of the decimalFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalFallback(BigDecimal value) {
        this.decimalFallback = value;
    }

    /**
     * Gets the value of the dateFallback property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFallback() {
        return dateFallback;
    }

    /**
     * Sets the value of the dateFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFallback(XMLGregorianCalendar value) {
        this.dateFallback = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     */
    public void setRowNumber(int value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the mapped property.
     * 
     */
    public boolean isMapped() {
        return mapped;
    }

    /**
     * Sets the value of the mapped property.
     * 
     */
    public void setMapped(boolean value) {
        this.mapped = value;
    }

}
