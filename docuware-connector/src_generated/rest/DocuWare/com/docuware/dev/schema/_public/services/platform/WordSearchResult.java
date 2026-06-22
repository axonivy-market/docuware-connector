
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a a set of words and locations where they are found in a section
 * 
 * &lt;p&gt;Java class for WordSearchResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WordSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Search" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResult", propOrder = {
    "search",
    "pageHits",
    "links"
})
public class WordSearchResult {

    /**
     * Contains the search query leading to this result.
     * 
     */
    @XmlElement(name = "Search", required = true)
    protected String search;
    /**
     * Contains a set pages where of words are found
     * 
     */
    @XmlElement(name = "PageHits", required = true)
    protected PageHits pageHits;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Contains the search query leading to this result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearch()
     */
    public void setSearch(String value) {
        this.search = value;
    }

    /**
     * Contains a set pages where of words are found
     * 
     * @return
     *     possible object is
     *     {@link PageHits }
     *     
     */
    public PageHits getPageHits() {
        return pageHits;
    }

    /**
     * Sets the value of the pageHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageHits }
     *     
     * @see #getPageHits()
     */
    public void setPageHits(PageHits value) {
        this.pageHits = value;
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

}
