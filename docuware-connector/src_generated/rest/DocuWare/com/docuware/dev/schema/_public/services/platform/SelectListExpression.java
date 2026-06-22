
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Query definition for a select list
 * 
 * &lt;p&gt;Java class for SelectListExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogExpression" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression" minOccurs="0"/&gt;
 *         &lt;element name="ValuePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="SortDirection" type="{http://dev.docuware.com/schema/public/services/platform}SortDirection" default="Default" /&gt;
 *       &lt;attribute name="ExcludeExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Typed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListExpression", propOrder = {
    "dialogExpression",
    "valuePrefix"
})
public class SelectListExpression {

    /**
     * The expression with already filled values.
     * 
     */
    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    /**
     * A possible prefix of value of the field to be filled.
     * 
     */
    @XmlElement(name = "ValuePrefix")
    protected String valuePrefix;
    /**
     * The database name of the dialog field to be filled.
     * 
     */
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    /**
     * Result will be returned on pages with that block size if specified. If set to default (0) select lists will be returned in one block using Limit parameter.
     * 
     */
    @XmlAttribute(name = "Count")
    protected Integer count;
    /**
     * First result to return if block size is specified
     * 
     */
    @XmlAttribute(name = "Start")
    protected Integer start;
    /**
     * Limit the number of hits that are returned if no block size is specified
     * 
     */
    @XmlAttribute(name = "Limit")
    protected Integer limit;
    /**
     * Define sort order of the select list
     * 
     */
    @XmlAttribute(name = "SortDirection")
    protected SortDirection sortDirection;
    /**
     * Determines whether to return values from external select lists
     * 
     */
    @XmlAttribute(name = "ExcludeExternal")
    protected Boolean excludeExternal;
    /**
     * If this value is &lt;c&gt;true&lt;/c&gt;, then the response contains typed values. Otherwise each value is converted to a string using the agent's locale settings.
     * 
     */
    @XmlAttribute(name = "Typed")
    protected Boolean typed;

    /**
     * The expression with already filled values.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    /**
     * Sets the value of the dialogExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     * @see #getDialogExpression()
     */
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**
     * A possible prefix of value of the field to be filled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**
     * Sets the value of the valuePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValuePrefix()
     */
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
    }

    /**
     * The database name of the dialog field to be filled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Result will be returned on pages with that block size if specified. If set to default (0) select lists will be returned in one block using Limit parameter.
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
     * First result to return if block size is specified
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
     * Limit the number of hits that are returned if no block size is specified
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLimit()
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Define sort order of the select list
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortDirection() {
        if (sortDirection == null) {
            return SortDirection.DEFAULT;
        } else {
            return sortDirection;
        }
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     * @see #getSortDirection()
     */
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

    /**
     * Determines whether to return values from external select lists
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeExternal() {
        if (excludeExternal == null) {
            return false;
        } else {
            return excludeExternal;
        }
    }

    /**
     * Sets the value of the excludeExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeExternal()
     */
    public void setExcludeExternal(Boolean value) {
        this.excludeExternal = value;
    }

    /**
     * If this value is &lt;c&gt;true&lt;/c&gt;, then the response contains typed values. Otherwise each value is converted to a string using the agent's locale settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTyped() {
        if (typed == null) {
            return false;
        } else {
            return typed;
        }
    }

    /**
     * Sets the value of the typed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTyped()
     */
    public void setTyped(Boolean value) {
        this.typed = value;
    }

}
