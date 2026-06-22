
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Stamp that applies a defined text.
 * 
 * &lt;p&gt;Java class for TextStamp complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TextStamp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Font" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextStamp", propOrder = {
    "font",
    "content"
})
public class TextStamp {

    /**
     * The font of the text of the stamp.
     * 
     */
    @XmlElement(name = "Font", required = true)
    protected Font font;
    /**
     * The text to be displayed in the stamp.
     * 
     */
    @XmlElement(name = "Content", required = true)
    protected String content;

    /**
     * The font of the text of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     * @see #getFont()
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * The text to be displayed in the stamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContent()
     */
    public void setContent(String value) {
        this.content = value;
    }

}
