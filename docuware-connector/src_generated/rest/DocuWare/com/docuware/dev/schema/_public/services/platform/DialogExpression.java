
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Query definition for a dialog result list
 * 
 * &lt;p&gt;Java class for DialogExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ResultListQuery"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCabinets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CompleteCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" /&gt;
 *       &lt;attribute name="CompleteConditionInInvariantCulture" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogExpression", propOrder = {
    "condition",
    "additionalCabinets",
    "completeCondition"
})
public class DialogExpression
    extends ResultListQuery
{

    /**
     * Gets or sets the conditions which are checked to obtain the search result.
     * 
     */
    @XmlElement(name = "Condition")
    protected List<DialogExpressionCondition> condition;
    /**
     * Gets or sets the additional cabinets to search in.
     * 
     */
    @XmlElement(name = "AdditionalCabinets")
    protected List<String> additionalCabinets;
    /**
     * The query syntax is described at &lt;a href="http://help.docuware.com/en/#b62903t52746n68491"&gt;the documentation of the URL Creation Tool&lt;/a&gt;
     * 
     */
    @XmlElement(name = "CompleteCondition")
    protected String completeCondition;
    /**
     * Specifies the operation between the conditions of the dialog expression.
     * 
     */
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;
    /**
     * FOR INTERNAL USE ONLY: Gets or sets whether the additional query string defined in CompleteCondition should be parsed in invariant culture.
     * 
     */
    @XmlAttribute(name = "CompleteConditionInInvariantCulture", required = true)
    protected boolean completeConditionInInvariantCulture;

    /**
     * Gets or sets the conditions which are checked to obtain the search result.
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
     * {@link DialogExpressionCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the condition property.
     */
    public List<DialogExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
    }

    /**
     * Gets or sets the additional cabinets to search in.
     * 
     * Gets the value of the additionalCabinets property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the additionalCabinets property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalCabinets().add(newItem);
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
     *     The value of the additionalCabinets property.
     */
    public List<String> getAdditionalCabinets() {
        if (additionalCabinets == null) {
            additionalCabinets = new ArrayList<>();
        }
        return this.additionalCabinets;
    }

    /**
     * The query syntax is described at &lt;a href="http://help.docuware.com/en/#b62903t52746n68491"&gt;the documentation of the URL Creation Tool&lt;/a&gt;
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteCondition() {
        return completeCondition;
    }

    /**
     * Sets the value of the completeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompleteCondition()
     */
    public void setCompleteCondition(String value) {
        this.completeCondition = value;
    }

    /**
     * Specifies the operation between the conditions of the dialog expression.
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

    /**
     * FOR INTERNAL USE ONLY: Gets or sets whether the additional query string defined in CompleteCondition should be parsed in invariant culture.
     * 
     */
    public boolean isCompleteConditionInInvariantCulture() {
        return completeConditionInInvariantCulture;
    }

    /**
     * Sets the value of the completeConditionInInvariantCulture property.
     * 
     */
    public void setCompleteConditionInInvariantCulture(boolean value) {
        this.completeConditionInInvariantCulture = value;
    }

}
