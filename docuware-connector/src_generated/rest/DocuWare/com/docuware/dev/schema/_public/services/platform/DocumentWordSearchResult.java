
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DocumentWordSearchResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentWordSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Search" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SectionHits" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SectionId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "DocumentWordSearchResult", propOrder = {
    "search",
    "sectionHits",
    "links"
})
public class DocumentWordSearchResult {

    /**
     * Contains the search query leading to this result.
     * 
     */
    @XmlElement(name = "Search", required = true)
    protected String search;
    /**
     * Define a a set of words and locations where they are found in a section
     * 
     */
    @XmlElement(name = "SectionHits")
    protected List<DocumentWordSearchResult.SectionHits> sectionHits;
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
     * Define a a set of words and locations where they are found in a section
     * 
     * Gets the value of the sectionHits property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sectionHits property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSectionHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentWordSearchResult.SectionHits }
     * </p>
     * 
     * 
     * @return
     *     The value of the sectionHits property.
     */
    public List<DocumentWordSearchResult.SectionHits> getSectionHits() {
        if (sectionHits == null) {
            sectionHits = new ArrayList<>();
        }
        return this.sectionHits;
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
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SectionId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pageHits"
    })
    public static class SectionHits {

        /**
         * Contains a set pages where of words are found
         * 
         */
        @XmlElement(name = "PageHits", required = true)
        protected PageHits pageHits;
        /**
         * The id of the section containing a hit.
         * 
         */
        @XmlAttribute(name = "SectionId")
        protected String sectionId;

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
         * The id of the section containing a hit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectionId() {
            return sectionId;
        }

        /**
         * Sets the value of the sectionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSectionId()
         */
        public void setSectionId(String value) {
            this.sectionId = value;
        }

    }

}
