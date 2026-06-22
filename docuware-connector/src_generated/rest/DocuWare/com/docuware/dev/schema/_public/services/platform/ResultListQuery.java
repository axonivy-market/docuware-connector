
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base query definition for a result list
 * 
 * &lt;p&gt;Java class for ResultListQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ResultListQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalResultFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlagConditions" type="{http://dev.docuware.com/schema/public/services/platform}FlagConditions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="ExcludeDefaultSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="WithoutLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IncludeSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="CalculateTotalCount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultListQuery", propOrder = {
    "sortOrder",
    "additionalResultFields",
    "flagConditions"
})
@XmlSeeAlso({
    DialogExpression.class
})
public class ResultListQuery {

    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then all fields are returned.
     * 
     */
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    /**
     * Define addition result fields to retrieve
     * 
     */
    @XmlElement(name = "AdditionalResultFields")
    protected List<String> additionalResultFields;
    /**
     * Condition that filter documents by its flags
     * 
     */
    @XmlElement(name = "FlagConditions", required = true)
    protected FlagConditions flagConditions;
    /**
     * Start index of result document
     * 
     */
    @XmlAttribute(name = "Start")
    protected Integer start;
    /**
     * Number of result documents to be retrieved in one block
     * 
     */
    @XmlAttribute(name = "Count")
    protected Integer count;
    /**
     * Specifies whether the default system/additional fields should be returned.
     * 
     */
    @XmlAttribute(name = "ExcludeDefaultSystemFields")
    protected Boolean excludeDefaultSystemFields;
    /**
     * Specifies whether the links are filled in the result.
     * 
     */
    @XmlAttribute(name = "WithoutLinks")
    protected Boolean withoutLinks;
    /**
     * Gets or sets a value indicating whether Intellix suggestions to be included.
     * 
     */
    @XmlAttribute(name = "IncludeSuggestions")
    protected Boolean includeSuggestions;
    /**
     * Indicates if total count of the documents should be calculated. If it is false the return value will be the number of requested items + 1 if there are more items available.
     * 
     */
    @XmlAttribute(name = "CalculateTotalCount")
    protected Boolean calculateTotalCount;

    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then all fields are returned.
     * 
     * @return
     *     possible object is
     *     {@link SortedFieldsList }
     *     
     */
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedFieldsList }
     *     
     * @see #getSortOrder()
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**
     * Define addition result fields to retrieve
     * 
     * Gets the value of the additionalResultFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the additionalResultFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalResultFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalResultFields property.
     */
    public List<String> getAdditionalResultFields() {
        if (additionalResultFields == null) {
            additionalResultFields = new ArrayList<>();
        }
        return this.additionalResultFields;
    }

    /**
     * Condition that filter documents by its flags
     * 
     * @return
     *     possible object is
     *     {@link FlagConditions }
     *     
     */
    public FlagConditions getFlagConditions() {
        return flagConditions;
    }

    /**
     * Sets the value of the flagConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagConditions }
     *     
     * @see #getFlagConditions()
     */
    public void setFlagConditions(FlagConditions value) {
        this.flagConditions = value;
    }

    /**
     * Start index of result document
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStart() {
        if (start == null) {
            return  0;
        } else {
            return start;
        }
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStart()
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Number of result documents to be retrieved in one block
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getCount()
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Specifies whether the default system/additional fields should be returned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeDefaultSystemFields() {
        if (excludeDefaultSystemFields == null) {
            return false;
        } else {
            return excludeDefaultSystemFields;
        }
    }

    /**
     * Sets the value of the excludeDefaultSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeDefaultSystemFields()
     */
    public void setExcludeDefaultSystemFields(Boolean value) {
        this.excludeDefaultSystemFields = value;
    }

    /**
     * Specifies whether the links are filled in the result.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWithoutLinks() {
        if (withoutLinks == null) {
            return false;
        } else {
            return withoutLinks;
        }
    }

    /**
     * Sets the value of the withoutLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWithoutLinks()
     */
    public void setWithoutLinks(Boolean value) {
        this.withoutLinks = value;
    }

    /**
     * Gets or sets a value indicating whether Intellix suggestions to be included.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSuggestions() {
        if (includeSuggestions == null) {
            return false;
        } else {
            return includeSuggestions;
        }
    }

    /**
     * Sets the value of the includeSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeSuggestions()
     */
    public void setIncludeSuggestions(Boolean value) {
        this.includeSuggestions = value;
    }

    /**
     * Indicates if total count of the documents should be calculated. If it is false the return value will be the number of requested items + 1 if there are more items available.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCalculateTotalCount() {
        if (calculateTotalCount == null) {
            return true;
        } else {
            return calculateTotalCount;
        }
    }

    /**
     * Sets the value of the calculateTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCalculateTotalCount()
     */
    public void setCalculateTotalCount(Boolean value) {
        this.calculateTotalCount = value;
    }

}
