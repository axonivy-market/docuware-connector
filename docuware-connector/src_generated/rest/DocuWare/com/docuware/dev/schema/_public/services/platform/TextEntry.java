
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Annotation that contains text
 * 
 * &lt;p&gt;Java class for TextEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TextEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Font" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Location" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationRectangle"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextEntry", propOrder = {
    "font",
    "value",
    "location"
})
public class TextEntry
    extends EntryBase
{

    /**
     * Specify the font of the text.
     * 
     */
    @XmlElement(name = "Font", required = true)
    protected Font font;
    /**
     * Text to be displayed.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected String value;
    /**
     * Location of the annotation.
     * 
     */
    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;

    /**
     * Specify the font of the text.
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
     * Text to be displayed.
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

    /**
     * Location of the annotation.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationRectangle }
     *     
     */
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationRectangle }
     *     
     * @see #getLocation()
     */
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }

}
