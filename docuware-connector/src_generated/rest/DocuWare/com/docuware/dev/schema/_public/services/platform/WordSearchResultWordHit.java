
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a word and specific location where it is found
 * 
 * &lt;p&gt;Java class for WordSearchResultWordHit complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WordSearchResultWordHit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}RectangleAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultWordHit", propOrder = {
    "text"
})
public class WordSearchResultWordHit {

    /**
     * Contains the text matching the query.
     * 
     */
    @XmlElement(name = "Text", required = true)
    protected String text;
    /**
     * Left of rectangle.
     * 
     */
    @XmlAttribute(name = "L", required = true)
    protected int l;
    /**
     * Top of rectangle.
     * 
     */
    @XmlAttribute(name = "T", required = true)
    protected int t;
    /**
     * Width of rectangle.
     * 
     */
    @XmlAttribute(name = "W", required = true)
    protected int w;
    /**
     * Height of rectangle.
     * 
     */
    @XmlAttribute(name = "H", required = true)
    protected int h;

    /**
     * Contains the text matching the query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Left of rectangle.
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
     * Top of rectangle.
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
     * Width of rectangle.
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
     * Height of rectangle.
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
