
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a query for documents.
 * 
 * &lt;p&gt;Java class for DocumentsQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentsQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForceRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}FieldsList" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExcludeSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
@XmlType(name = "DocumentsQuery", propOrder = {
    "forceRefresh",
    "expression",
    "fields",
    "sortOrder",
    "links"
})
public class DocumentsQuery {

    /**
     * Determine if result list is retrieved from the cache when ForceRefresh is set to false (default) or always a new one is executed when ForceRefresh is set to true.
     * 
     */
    @XmlElement(name = "ForceRefresh", defaultValue = "false")
    protected Boolean forceRefresh;
    /**
     * The query string contains the query in a proper expression. If the expression is missing then all documents match the query.
     * 
     */
    @XmlElement(name = "Expression")
    protected String expression;
    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;t:c xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:c="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/t:c&amp;gt;
     * &lt;/pre&gt;
     *  then all fields are returned.
     * 
     */
    @XmlElement(name = "Fields")
    protected FieldsList fields;
    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;t:c xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:c="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/t:c&amp;gt;
     * &lt;/pre&gt;
     *  then all fields are returned.
     * 
     */
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Specifies whether the default system/additional fields should be returned.
     * 
     */
    @XmlAttribute(name = "ExcludeSystemFields")
    protected Boolean excludeSystemFields;
    /**
     * Gets or sets a value indicating whether Intellix suggetstions to be included.
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
     * Determine if result list is retrieved from the cache when ForceRefresh is set to false (default) or always a new one is executed when ForceRefresh is set to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceRefresh() {
        return forceRefresh;
    }

    /**
     * Sets the value of the forceRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isForceRefresh()
     */
    public void setForceRefresh(Boolean value) {
        this.forceRefresh = value;
    }

    /**
     * The query string contains the query in a proper expression. If the expression is missing then all documents match the query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExpression()
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;t:c xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:c="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/t:c&amp;gt;
     * &lt;/pre&gt;
     *  then all fields are returned.
     * 
     * @return
     *     possible object is
     *     {@link FieldsList }
     *     
     */
    public FieldsList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsList }
     *     
     * @see #getFields()
     */
    public void setFields(FieldsList value) {
        this.fields = value;
    }

    /**
     * Depending on the server's choice, there might be more fields included, like some system fields. If this field is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;t:c xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:c="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/t:c&amp;gt;
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
     * Specifies whether the default system/additional fields should be returned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeSystemFields() {
        if (excludeSystemFields == null) {
            return false;
        } else {
            return excludeSystemFields;
        }
    }

    /**
     * Sets the value of the excludeSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeSystemFields()
     */
    public void setExcludeSystemFields(Boolean value) {
        this.excludeSystemFields = value;
    }

    /**
     * Gets or sets a value indicating whether Intellix suggetstions to be included.
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
