
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base query definition for a result list
 * 
 * <p>Java class for ResultListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlElement(name = "AdditionalResultFields")
    protected List<String> additionalResultFields;
    @XmlElement(name = "FlagConditions", required = true)
    protected FlagConditions flagConditions;
    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Count")
    protected Integer count;
    @XmlAttribute(name = "ExcludeDefaultSystemFields")
    protected Boolean excludeDefaultSystemFields;
    @XmlAttribute(name = "WithoutLinks")
    protected Boolean withoutLinks;
    @XmlAttribute(name = "IncludeSuggestions")
    protected Boolean includeSuggestions;
    @XmlAttribute(name = "CalculateTotalCount")
    protected Boolean calculateTotalCount;

    /**
     * Gets the value of the sortOrder property.
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
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the additionalResultFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalResultFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalResultFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalResultFields() {
        if (additionalResultFields == null) {
            additionalResultFields = new ArrayList<String>();
        }
        return this.additionalResultFields;
    }

    /**
     * Gets the value of the flagConditions property.
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
     */
    public void setFlagConditions(FlagConditions value) {
        this.flagConditions = value;
    }

    /**
     * Gets the value of the start property.
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
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the count property.
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
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the excludeDefaultSystemFields property.
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
     */
    public void setExcludeDefaultSystemFields(Boolean value) {
        this.excludeDefaultSystemFields = value;
    }

    /**
     * Gets the value of the withoutLinks property.
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
     */
    public void setWithoutLinks(Boolean value) {
        this.withoutLinks = value;
    }

    /**
     * Gets the value of the includeSuggestions property.
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
     */
    public void setIncludeSuggestions(Boolean value) {
        this.includeSuggestions = value;
    }

    /**
     * Gets the value of the calculateTotalCount property.
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
     */
    public void setCalculateTotalCount(Boolean value) {
        this.calculateTotalCount = value;
    }

}
