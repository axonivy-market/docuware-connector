
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
 * &lt;p&gt;Java class for MultiColumnSelectListValuesQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColumnSelectListValuesQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}SelectListValuesQuery"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://dev.docuware.com/schema/public/services/platform}MultiColumnSelectListExpressionCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" /&gt;
 *       &lt;attribute name="SourceColumn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColumnSelectListValuesQuery", propOrder = {
    "condition"
})
public class MultiColumnSelectListValuesQuery
    extends SelectListValuesQuery
{

    /**
     * Gets or sets the conditions which are checked to obtain the select list result.
     * 
     */
    @XmlElement(name = "Condition")
    protected List<MultiColumnSelectListExpressionCondition> condition;
    /**
     * Specifies the operation between the conditions which are checked.
     * 
     */
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;
    /**
     * The select list column name that should be used as source
     * 
     */
    @XmlAttribute(name = "SourceColumn")
    protected String sourceColumn;

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
     * {@link MultiColumnSelectListExpressionCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the condition property.
     */
    public List<MultiColumnSelectListExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
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

    /**
     * The select list column name that should be used as source
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceColumn() {
        return sourceColumn;
    }

    /**
     * Sets the value of the sourceColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceColumn()
     */
    public void setSourceColumn(String value) {
        this.sourceColumn = value;
    }

}
