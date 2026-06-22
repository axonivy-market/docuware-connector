
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.settings.common.DWRectangle;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a metadata for a page
 * 
 * &lt;p&gt;Java class for PageData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PageData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LowQualitySize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TileSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RenderedImageFormat" type="{http://dev.docuware.com/schema/public/services/platform}PlatformImageFormat"/&gt;
 *         &lt;element name="ContentArea" type="{http://dev.docuware.com/settings/common}DWRectangle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DpiX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DpiY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageData", propOrder = {
    "lowQualitySize",
    "tileSize",
    "renderedImageFormat",
    "contentArea"
})
public class PageData {

    /**
     * The low quality size is the size in pixels which a client can use for displaying a document before starting using the deep zoom control.
     *             A client should not request any levels with less resolution than defined by this value because
     *             the quality of the level defined by this value is the best also for lower levels.
     * 
     */
    @XmlElement(name = "LowQualitySize")
    protected int lowQualitySize;
    /**
     * If a client decides to display the rendered page as multi scale image (using the Deep Zoom technology)
     *             this value gives a hint for the recommented size of the tiles.
     * 
     */
    @XmlElement(name = "TileSize")
    protected int tileSize;
    /**
     * Gets or sets the preferred format this page is rendered.
     * 
     */
    @XmlElement(name = "RenderedImageFormat", required = true)
    @XmlSchemaType(name = "string")
    protected PlatformImageFormat renderedImageFormat;
    /**
     * If this field is &lt;v&gt;null&lt;/v&gt; the server has not yet calculated the size of this page.
     * 
     */
    @XmlElementRef(name = "ContentArea", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<DWRectangle> contentArea;
    /**
     * Gets the horizontal resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.
     * 
     */
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    /**
     * Gets the vertical resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.
     * 
     */
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;
    /**
     * Gets the horizontal size of a page image in pixels. In case of vector images this is the maximal pixel width which can be rendered.
     * 
     */
    @XmlAttribute(name = "Width", required = true)
    protected int width;
    /**
     * Gets the vertical size of a page image in pixels. In case of vector images this is the maximal pixel height which can be rendered.
     * 
     */
    @XmlAttribute(name = "Height", required = true)
    protected int height;

    /**
     * The low quality size is the size in pixels which a client can use for displaying a document before starting using the deep zoom control.
     *             A client should not request any levels with less resolution than defined by this value because
     *             the quality of the level defined by this value is the best also for lower levels.
     * 
     */
    public int getLowQualitySize() {
        return lowQualitySize;
    }

    /**
     * Sets the value of the lowQualitySize property.
     * 
     */
    public void setLowQualitySize(int value) {
        this.lowQualitySize = value;
    }

    /**
     * If a client decides to display the rendered page as multi scale image (using the Deep Zoom technology)
     *             this value gives a hint for the recommented size of the tiles.
     * 
     */
    public int getTileSize() {
        return tileSize;
    }

    /**
     * Sets the value of the tileSize property.
     * 
     */
    public void setTileSize(int value) {
        this.tileSize = value;
    }

    /**
     * Gets or sets the preferred format this page is rendered.
     * 
     * @return
     *     possible object is
     *     {@link PlatformImageFormat }
     *     
     */
    public PlatformImageFormat getRenderedImageFormat() {
        return renderedImageFormat;
    }

    /**
     * Sets the value of the renderedImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformImageFormat }
     *     
     * @see #getRenderedImageFormat()
     */
    public void setRenderedImageFormat(PlatformImageFormat value) {
        this.renderedImageFormat = value;
    }

    /**
     * If this field is &lt;v&gt;null&lt;/v&gt; the server has not yet calculated the size of this page.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     *     
     */
    public JAXBElement<DWRectangle> getContentArea() {
        return contentArea;
    }

    /**
     * Sets the value of the contentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     *     
     * @see #getContentArea()
     */
    public void setContentArea(JAXBElement<DWRectangle> value) {
        this.contentArea = value;
    }

    /**
     * Gets the horizontal resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.
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
     * Gets the vertical resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.
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

    /**
     * Gets the horizontal size of a page image in pixels. In case of vector images this is the maximal pixel width which can be rendered.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the vertical size of a page image in pixels. In case of vector images this is the maximal pixel height which can be rendered.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

}
