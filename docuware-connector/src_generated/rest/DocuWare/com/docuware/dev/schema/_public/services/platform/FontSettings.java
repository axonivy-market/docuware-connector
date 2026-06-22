
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FontSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FontSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Bold" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Italic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Underline" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Strikeout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontSettings")
public class FontSettings {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Size", required = true)
    protected String size;
    @XmlAttribute(name = "Bold", required = true)
    protected boolean bold;
    @XmlAttribute(name = "Italic", required = true)
    protected boolean italic;
    @XmlAttribute(name = "Underline", required = true)
    protected boolean underline;
    @XmlAttribute(name = "Strikeout", required = true)
    protected boolean strikeout;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the bold property.
     * 
     */
    public boolean isBold() {
        return bold;
    }

    /**
     * Sets the value of the bold property.
     * 
     */
    public void setBold(boolean value) {
        this.bold = value;
    }

    /**
     * Gets the value of the italic property.
     * 
     */
    public boolean isItalic() {
        return italic;
    }

    /**
     * Sets the value of the italic property.
     * 
     */
    public void setItalic(boolean value) {
        this.italic = value;
    }

    /**
     * Gets the value of the underline property.
     * 
     */
    public boolean isUnderline() {
        return underline;
    }

    /**
     * Sets the value of the underline property.
     * 
     */
    public void setUnderline(boolean value) {
        this.underline = value;
    }

    /**
     * Gets the value of the strikeout property.
     * 
     */
    public boolean isStrikeout() {
        return strikeout;
    }

    /**
     * Sets the value of the strikeout property.
     * 
     */
    public void setStrikeout(boolean value) {
        this.strikeout = value;
    }

}
