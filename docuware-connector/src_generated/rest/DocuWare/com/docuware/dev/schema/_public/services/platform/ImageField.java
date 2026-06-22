
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ImageField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImageField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalImageWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OriginalImageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Alignment" type="{http://dev.docuware.com/schema/public/services/platform}AlignmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageField", propOrder = {
    "originalImageWidth",
    "originalImageSize",
    "alignment"
})
public class ImageField
    extends WebFormField
{

    @XmlElement(name = "OriginalImageWidth")
    protected int originalImageWidth;
    @XmlElement(name = "OriginalImageSize")
    protected int originalImageSize;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;

    /**
     * Gets the value of the originalImageWidth property.
     * 
     */
    public int getOriginalImageWidth() {
        return originalImageWidth;
    }

    /**
     * Sets the value of the originalImageWidth property.
     * 
     */
    public void setOriginalImageWidth(int value) {
        this.originalImageWidth = value;
    }

    /**
     * Gets the value of the originalImageSize property.
     * 
     */
    public int getOriginalImageSize() {
        return originalImageSize;
    }

    /**
     * Sets the value of the originalImageSize property.
     * 
     */
    public void setOriginalImageSize(int value) {
        this.originalImageSize = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }

}
