
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The expression for field statistics.
 * 
 * &lt;p&gt;Java class for FieldValueStatisticsExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FieldValueStatisticsExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatisticsExpression")
public class FieldValueStatisticsExpression {

    /**
     * The database name of the field.
     * 
     */
    @XmlAttribute(name = "FieldName")
    protected String fieldName;
    /**
     * Limit the number of hits that are returned.
     * 
     */
    @XmlAttribute(name = "Limit")
    protected Integer limit;

    /**
     * The database name of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Limit the number of hits that are returned.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLimit()
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

}
