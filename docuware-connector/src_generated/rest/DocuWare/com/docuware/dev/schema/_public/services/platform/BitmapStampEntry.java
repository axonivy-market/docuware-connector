
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bitmap stamp. Png encoded image.
 * 
 * &lt;p&gt;Java class for BitmapStampEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BitmapStampEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PngData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DpiX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DpiY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitmapStampEntry", propOrder = {
    "pngData"
})
public class BitmapStampEntry
    extends StampBase
{

    /**
     * Base 64 encoded data of the bitmap.
     * 
     */
    @XmlElement(name = "PngData", required = true)
    protected byte[] pngData;
    /**
     * Horizontal device point per inch of the image.
     * 
     */
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    /**
     * Vertical device point per inch of the image.
     * 
     */
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;

    /**
     * Base 64 encoded data of the bitmap.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPngData() {
        return pngData;
    }

    /**
     * Sets the value of the pngData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getPngData()
     */
    public void setPngData(byte[] value) {
        this.pngData = value;
    }

    /**
     * Horizontal device point per inch of the image.
     * 
     */
    public int getDpiX() {
        return dpiX;
    }

    /**
     * Sets the value of the dpiX property.
     * 
     */
    public void setDpiX(int value) {
        this.dpiX = value;
    }

    /**
     * Vertical device point per inch of the image.
     * 
     */
    public int getDpiY() {
        return dpiY;
    }

    /**
     * Sets the value of the dpiY property.
     * 
     */
    public void setDpiY(int value) {
        this.dpiY = value;
    }

}
