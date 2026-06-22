
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TextAnnotationToolSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TextAnnotationToolSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FontSettings" type="{http://dev.docuware.com/schema/public/services/platform}FontSettings"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotationToolSettings", propOrder = {
    "fontSettings"
})
public class TextAnnotationToolSettings
    extends AnnotationToolSettings
{

    @XmlElement(name = "FontSettings", required = true)
    protected FontSettings fontSettings;

    /**
     * Gets the value of the fontSettings property.
     * 
     * @return
     *     possible object is
     *     {@link FontSettings }
     *     
     */
    public FontSettings getFontSettings() {
        return fontSettings;
    }

    /**
     * Sets the value of the fontSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontSettings }
     *     
     */
    public void setFontSettings(FontSettings value) {
        this.fontSettings = value;
    }

}
