
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Text stamp. Value contains the text.
 * 
 * &lt;p&gt;Java class for TextStampEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TextStampEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Font" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextStampEntry", propOrder = {
    "font",
    "value"
})
public class TextStampEntry
    extends StampBase
{

    /**
     * Font that is used for the text of the stamp.
     * 
     */
    @XmlElement(name = "Font", required = true)
    protected Font font;
    /**
     * Text that stamp will show.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected String value;

    /**
     * Font that is used for the text of the stamp.
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
     * Text that stamp will show.
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
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
