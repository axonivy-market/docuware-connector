
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Query for multi column select list values
 * 
 * &lt;p&gt;Java class for MultiColSelectListValuesQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColSelectListValuesQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListExpressionCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StartsWithColumn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StartsWithValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListValuesQuery", propOrder = {
    "condition"
})
public class MultiColSelectListValuesQuery {

    /**
     * Gets or sets the conditions which are checked to obtain the select list result.
     * 
     */
    @XmlElement(name = "Condition")
    protected List<MultiColSelectListExpressionCondition> condition;
    /**
     * Column name for prefix search.
     * 
     */
    @XmlAttribute(name = "StartsWithColumn")
    protected String startsWithColumn;
    /**
     * Value for prefix search.
     * 
     */
    @XmlAttribute(name = "StartsWithValue")
    protected String startsWithValue;
    /**
     * First result to return if block size is specified.
     * 
     */
    @XmlAttribute(name = "Start")
    protected Integer start;
    /**
     * Result will be returned on pages with that block size if specified.
     * 
     */
    @XmlAttribute(name = "Count")
    protected Integer count;
    /**
     * Specifies the operation between the conditions which are checked.
     * 
     */
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;

    /**
     * Gets or sets the conditions which are checked to obtain the select list result.
     * 
     * Gets the value of the condition property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the condition property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiColSelectListExpressionCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the condition property.
     */
    public List<MultiColSelectListExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
    }

    /**
     * Column name for prefix search.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartsWithColumn() {
        return startsWithColumn;
    }

    /**
     * Sets the value of the startsWithColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartsWithColumn()
     */
    public void setStartsWithColumn(String value) {
        this.startsWithColumn = value;
    }

    /**
     * Value for prefix search.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartsWithValue() {
        return startsWithValue;
    }

    /**
     * Sets the value of the startsWithValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartsWithValue()
     */
    public void setStartsWithValue(String value) {
        this.startsWithValue = value;
    }

    /**
     * First result to return if block size is specified.
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
     * Result will be returned on pages with that block size if specified.
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
     * Specifies the operation between the conditions which are checked.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public DialogExpressionOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpressionOperation }
     *     
     * @see #getOperation()
     */
    public void setOperation(DialogExpressionOperation value) {
        this.operation = value;
    }

}
