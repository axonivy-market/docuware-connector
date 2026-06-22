
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Font complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Font"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FontName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Underlined" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="StrikeThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FontSize" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DistanceType" /&gt;
 *       &lt;attribute name="Spacing" type="{http://dev.docuware.com/schema/public/services/platform}DistanceType" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font")
public class Font {

    /**
     * Define name of the font.
     * 
     */
    @XmlAttribute(name = "FontName", required = true)
    protected String fontName;
    /**
     * Define bold text.
     * 
     */
    @XmlAttribute(name = "Bold")
    protected Boolean bold;
    /**
     * Define italic text.
     * 
     */
    @XmlAttribute(name = "Italic")
    protected Boolean italic;
    /**
     * Define underlined text.
     * 
     */
    @XmlAttribute(name = "Underlined")
    protected Boolean underlined;
    /**
     * Define striked text.
     * 
     */
    @XmlAttribute(name = "StrikeThrough")
    protected Boolean strikeThrough;
    /**
     * The font size in twpis. E.g. a font of size 10pt has a value of 200.
     * 
     */
    @XmlAttribute(name = "FontSize", required = true)
    protected int fontSize;
    /**
     * Character spacing in twips. Extra distance between characters. It may be negative.
     * 
     */
    @XmlAttribute(name = "Spacing")
    protected Integer spacing;

    /**
     * Define name of the font.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the value of the fontName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFontName()
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Define bold text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * Sets the value of the bold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBold()
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Define italic text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * Sets the value of the italic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isItalic()
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Define underlined text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnderlined() {
        if (underlined == null) {
            return false;
        } else {
            return underlined;
        }
    }

    /**
     * Sets the value of the underlined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUnderlined()
     */
    public void setUnderlined(Boolean value) {
        this.underlined = value;
    }

    /**
     * Define striked text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrikeThrough() {
        if (strikeThrough == null) {
            return false;
        } else {
            return strikeThrough;
        }
    }

    /**
     * Sets the value of the strikeThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isStrikeThrough()
     */
    public void setStrikeThrough(Boolean value) {
        this.strikeThrough = value;
    }

    /**
     * The font size in twpis. E.g. a font of size 10pt has a value of 200.
     * 
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     */
    public void setFontSize(int value) {
        this.fontSize = value;
    }

    /**
     * Character spacing in twips. Extra distance between characters. It may be negative.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpacing() {
        if (spacing == null) {
            return  0;
        } else {
            return spacing;
        }
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpacing()
     */
    public void setSpacing(Integer value) {
        this.spacing = value;
    }

}
