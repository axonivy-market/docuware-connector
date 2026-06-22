
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Query for select list values
 * 
 * &lt;p&gt;Java class for SelectListValuesQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListValuesQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="ValuePrefix" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnType" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListValuesQuery")
@XmlSeeAlso({
    MultiColumnSelectListValuesQuery.class
})
public class SelectListValuesQuery {

    /**
     * First result to return if block size is specified.
     * 
     */
    @XmlAttribute(name = "Start")
    protected Integer start;
    /**
     * Result will be returned on pages with that block size if specified.
     * 
     */
    @XmlAttribute(name = "Count")
    protected Integer count;
    /**
     * A possible prefix of value of the field to be filled.
     * 
     */
    @XmlAttribute(name = "ValuePrefix")
    protected String valuePrefix;
    /**
     * Return type of the result. Possible values are "String", "Decimal", "Date" and "DateTime". If ommited, each value is converted to a string using the agent's locale settings.
     * 
     */
    @XmlAttribute(name = "ReturnType")
    protected String returnType;

    /**
     * First result to return if block size is specified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStart() {
        if (start == null) {
            return  0;
        } else {
            return start;
        }
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStart()
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Result will be returned on pages with that block size if specified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getCount()
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * A possible prefix of value of the field to be filled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**
     * Sets the value of the valuePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValuePrefix()
     */
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
    }

    /**
     * Return type of the result. Possible values are "String", "Decimal", "Date" and "DateTime". If ommited, each value is converted to a string using the agent's locale settings.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        if (returnType == null) {
            return "";
        } else {
            return returnType;
        }
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReturnType()
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

}
