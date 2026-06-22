
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gets information about specific page.
 * 
 * &lt;p&gt;Java class for Page complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Page"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://dev.docuware.com/schema/public/services/platform}PageData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PageNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="HasAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "data",
    "links"
})
public class Page {

    @XmlElement(name = "Data")
    protected PageData data;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Zero based page number.
     * 
     */
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;
    /**
     * True if the page contains at least one annotation.
     * 
     */
    @XmlAttribute(name = "HasAnnotation")
    protected Boolean hasAnnotation;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link PageData }
     *     
     */
    public PageData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageData }
     *     
     */
    public void setData(PageData value) {
        this.data = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Zero based page number.
     * 
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Sets the value of the pageNum property.
     * 
     */
    public void setPageNum(int value) {
        this.pageNum = value;
    }

    /**
     * True if the page contains at least one annotation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasAnnotation() {
        if (hasAnnotation == null) {
            return false;
        } else {
            return hasAnnotation;
        }
    }

    /**
     * Sets the value of the hasAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasAnnotation()
     */
    public void setHasAnnotation(Boolean value) {
        this.hasAnnotation = value;
    }

}
