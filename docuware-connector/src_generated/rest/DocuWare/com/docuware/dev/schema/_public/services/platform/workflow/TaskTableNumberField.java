
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A table number field.
 * 
 * &lt;p&gt;Java class for TaskTableNumberField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskTableNumberField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskNumberField"&gt;
 *       &lt;attribute name="PrefillWithBalance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BalanceField" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableNumberField")
public class TaskTableNumberField
    extends TaskNumberField
{

    /**
     * Determines whether the column will be prefilled with splitbooking balance.
     * 
     */
    @XmlAttribute(name = "PrefillWithBalance", required = true)
    protected boolean prefillWithBalance;
    /**
     * The document index field that will be used for splitbooking balance.
     * 
     */
    @XmlAttribute(name = "BalanceField")
    protected String balanceField;

    /**
     * Determines whether the column will be prefilled with splitbooking balance.
     * 
     */
    public boolean isPrefillWithBalance() {
        return prefillWithBalance;
    }

    /**
     * Sets the value of the prefillWithBalance property.
     * 
     */
    public void setPrefillWithBalance(boolean value) {
        this.prefillWithBalance = value;
    }

    /**
     * The document index field that will be used for splitbooking balance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceField() {
        return balanceField;
    }

    /**
     * Sets the value of the balanceField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBalanceField()
     */
    public void setBalanceField(String value) {
        this.balanceField = value;
    }

}
