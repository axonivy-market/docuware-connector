
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a a set of words and locations where they are found in a page
 * 
 * &lt;p&gt;Java class for WordSearchResultPageHit complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultPageHit", propOrder = {
    "hits"
})
public class WordSearchResultPageHit {

    /**
     * Contains the sequence of words matching the search query.
     * 
     */
    @XmlElement(name = "Hits", required = true)
    protected WordSearchResultWordHits hits;
    /**
     * Page number where the hits a found
     * 
     */
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;

    /**
     * Contains the sequence of words matching the search query.
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
     * @see #getHits()
     */
    public void setHits(WordSearchResultWordHits value) {
        this.hits = value;
    }

    /**
     * Page number where the hits a found
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
