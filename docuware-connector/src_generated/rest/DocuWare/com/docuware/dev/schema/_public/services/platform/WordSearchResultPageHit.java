
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define a a set of words and locations where they are found in a page
 * 
 * <p>Java class for WordSearchResultPageHit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WordSearchResultPageHit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hits" type="{http://dev.docuware.com/schema/public/services/platform}WordSearchResultWordHits"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PageNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultPageHit", propOrder = {
    "hits"
})
public class WordSearchResultPageHit {

    @XmlElement(name = "Hits", required = true)
    protected WordSearchResultWordHits hits;
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;

    /**
     * Gets the value of the hits property.
     * 
     * @return
     *     possible object is
     *     {@link WordSearchResultWordHits }
     *     
     */
    public WordSearchResultWordHits getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordSearchResultWordHits }
     *     
     */
    public void setHits(WordSearchResultWordHits value) {
        this.hits = value;
    }

    /**
     * Gets the value of the pageNum property.
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

}
