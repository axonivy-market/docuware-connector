
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * In case you do not specify the size or resolution a default rendering resolution of 72 dpi is assumed.
 * 
 * &lt;p&gt;Java class for AdhocRenderingQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AdhocRenderingQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Page" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Dpi" type="{http://www.w3.org/2001/XMLSchema}float" default="72" /&gt;
 *       &lt;attribute name="ApiKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocRenderingQuery")
public class AdhocRenderingQuery {

    /**
     * Gets or sets page number to be rendered.
     * 
     */
    @XmlAttribute(name = "Page")
    protected Integer page;
    /**
     * Gets or sets the resolution of the rendered bitmap.
     * 
     */
    @XmlAttribute(name = "Dpi")
    protected Float dpi;
    /**
     * Gets or sets the rendering api key.
     * 
     */
    @XmlAttribute(name = "ApiKey", required = true)
    protected String apiKey;

    /**
     * Gets or sets page number to be rendered.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPage() {
        if (page == null) {
            return  0;
        } else {
            return page;
        }
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPage()
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets or sets the resolution of the rendered bitmap.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDpi() {
        if (dpi == null) {
            return  72.0F;
        } else {
            return dpi;
        }
    }

    /**
     * Sets the value of the dpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getDpi()
     */
    public void setDpi(Float value) {
        this.dpi = value;
    }

    /**
     * Gets or sets the rendering api key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApiKey()
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

}
