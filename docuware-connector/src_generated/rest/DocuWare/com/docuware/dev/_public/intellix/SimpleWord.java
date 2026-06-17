
package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Contains a word with its bounding box.
 * 
 * <p>Java class for SimpleWord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleWord"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}RectangleAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleWord", propOrder = {
    "value"
})
@XmlSeeAlso({
    Word.class
})
public class SimpleWord {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "L", required = true)
    protected int l;
    @XmlAttribute(name = "T", required = true)
    protected int t;
    @XmlAttribute(name = "W", required = true)
    protected int w;
    @XmlAttribute(name = "H", required = true)
    protected int h;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the l property.
     * 
     */
    public int getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     */
    public void setL(int value) {
        this.l = value;
    }

    /**
     * Gets the value of the t property.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

    /**
     * Gets the value of the w property.
     * 
     */
    public int getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     */
    public void setW(int value) {
        this.w = value;
    }

    /**
     * Gets the value of the h property.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }

}
