
package com.docuware.dev.schema._public.services.platform.workflow;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TaskFieldValueBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskFieldValueBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Int" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFieldValueBase", propOrder = {
    "_int",
    "decimal",
    "string",
    "date",
    "dateTime"
})
@XmlSeeAlso({
    TaskFieldValue.class
})
public abstract class TaskFieldValueBase {

    @XmlElement(name = "Int")
    protected Long _int;
    @XmlElement(name = "Decimal")
    protected BigDecimal decimal;
    @XmlElement(name = "String")
    protected String string;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt(Long value) {
        this._int = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimal(BigDecimal value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
