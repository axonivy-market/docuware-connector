
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a query for searching words in phrase
 * 
 * &lt;p&gt;Java class for SearchPositionQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SearchPositionQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Phrase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IgnoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="WholeWord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="StartSectionNumber" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *       &lt;attribute name="Backward" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="RangeSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Normalize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPositionQuery", propOrder = {
    "phrase"
})
public class SearchPositionQuery {

    /**
     * Define the search phrase (words)
     * 
     */
    @XmlElement(name = "Phrase", required = true)
    protected String phrase;
    /**
     * Define if case is ignored
     * 
     */
    @XmlAttribute(name = "IgnoreCase")
    protected Boolean ignoreCase;
    /**
     * Define if search for whole words only
     * 
     */
    @XmlAttribute(name = "WholeWord")
    protected Boolean wholeWord;
    /**
     * Define a starting page for the search
     * 
     */
    @XmlAttribute(name = "StartPage")
    protected Integer startPage;
    /**
     * Define a starting section for the search
     * 
     */
    @XmlAttribute(name = "StartSectionNumber")
    protected Integer startSectionNumber;
    /**
     * Search this number of pages after the first page where a hit occur. If value is less than zero then all pages will be returned
     * 
     */
    @XmlAttribute(name = "PageCount")
    protected Integer pageCount;
    /**
     * If this flag is true then the search will be executed in the previous pages.
     * 
     */
    @XmlAttribute(name = "Backward")
    protected Boolean backward;
    /**
     * If this flag is true then only the specified page range is searched. Otherwise the whole document starting at the specified page is serched until the specified number of pages are found.
     * 
     */
    @XmlAttribute(name = "RangeSearch")
    protected Boolean rangeSearch;
    /**
     * If this flag is true then the result coordinates orientation will be alligned with the page
     * 
     */
    @XmlAttribute(name = "Normalize")
    protected Boolean normalize;

    /**
     * Define the search phrase (words)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPhrase()
     */
    public void setPhrase(String value) {
        this.phrase = value;
    }

    /**
     * Define if case is ignored
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreCase() {
        if (ignoreCase == null) {
            return true;
        } else {
            return ignoreCase;
        }
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIgnoreCase()
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Define if search for whole words only
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWholeWord() {
        if (wholeWord == null) {
            return false;
        } else {
            return wholeWord;
        }
    }

    /**
     * Sets the value of the wholeWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWholeWord()
     */
    public void setWholeWord(Boolean value) {
        this.wholeWord = value;
    }

    /**
     * Define a starting page for the search
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStartPage() {
        if (startPage == null) {
            return  0;
        } else {
            return startPage;
        }
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStartPage()
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Define a starting section for the search
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStartSectionNumber() {
        if (startSectionNumber == null) {
            return  0;
        } else {
            return startSectionNumber;
        }
    }

    /**
     * Sets the value of the startSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStartSectionNumber()
     */
    public void setStartSectionNumber(Integer value) {
        this.startSectionNumber = value;
    }

    /**
     * Search this number of pages after the first page where a hit occur. If value is less than zero then all pages will be returned
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPageCount() {
        if (pageCount == null) {
            return  1;
        } else {
            return pageCount;
        }
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPageCount()
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * If this flag is true then the search will be executed in the previous pages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBackward() {
        if (backward == null) {
            return false;
        } else {
            return backward;
        }
    }

    /**
     * Sets the value of the backward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBackward()
     */
    public void setBackward(Boolean value) {
        this.backward = value;
    }

    /**
     * If this flag is true then only the specified page range is searched. Otherwise the whole document starting at the specified page is serched until the specified number of pages are found.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRangeSearch() {
        if (rangeSearch == null) {
            return false;
        } else {
            return rangeSearch;
        }
    }

    /**
     * Sets the value of the rangeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRangeSearch()
     */
    public void setRangeSearch(Boolean value) {
        this.rangeSearch = value;
    }

    /**
     * If this flag is true then the result coordinates orientation will be alligned with the page
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalize() {
        if (normalize == null) {
            return false;
        } else {
            return normalize;
        }
    }

    /**
     * Sets the value of the normalize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNormalize()
     */
    public void setNormalize(Boolean value) {
        this.normalize = value;
    }

}
