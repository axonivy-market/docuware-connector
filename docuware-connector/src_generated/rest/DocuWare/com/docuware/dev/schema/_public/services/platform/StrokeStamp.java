
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Stamp that allows you to add a signature using an electronic pen.
 * 
 * &lt;p&gt;Java class for StrokeStamp complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StrokeStamp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="StrokeWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="StrokeColor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrokeStamp")
public class StrokeStamp {

    /**
     * The line weight of the handwritten signature.
     * 
     */
    @XmlAttribute(name = "StrokeWidth", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long strokeWidth;
    /**
     * Color of the line of the handwritten signature.
     * 
     */
    @XmlAttribute(name = "StrokeColor", required = true)
    protected String strokeColor;

    /**
     * The line weight of the handwritten signature.
     * 
     */
    public long getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     * 
     */
    public void setStrokeWidth(long value) {
        this.strokeWidth = value;
    }

    /**
     * Color of the line of the handwritten signature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the value of the strokeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStrokeColor()
     */
    public void setStrokeColor(String value) {
        this.strokeColor = value;
    }

}
