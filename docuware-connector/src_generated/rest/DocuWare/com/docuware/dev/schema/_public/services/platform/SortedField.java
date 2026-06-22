
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a sort by a field.
 * 
 * &lt;p&gt;Java class for SortedField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SortedField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Field" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Direction" type="{http://dev.docuware.com/schema/public/services/platform}SortDirection" default="Asc" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortedField")
public class SortedField {

    /**
     * Field name
     * 
     */
    @XmlAttribute(name = "Field", required = true)
    protected String field;
    /**
     * A sort direction
     * 
     */
    @XmlAttribute(name = "Direction")
    protected SortDirection direction;

    /**
     * Field name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getField()
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * A sort direction
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getDirection() {
        if (direction == null) {
            return SortDirection.ASC;
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     * @see #getDirection()
     */
    public void setDirection(SortDirection value) {
        this.direction = value;
    }

}
