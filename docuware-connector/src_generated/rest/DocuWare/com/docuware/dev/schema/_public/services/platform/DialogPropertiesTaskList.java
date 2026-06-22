
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dialog properties specific for Task lists
 * 
 * &lt;p&gt;Java class for DialogPropertiesTaskList complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogPropertiesTaskList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogPropertiesResultList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConditionString" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AutoRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="AutoRefreshPeriod" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTaskList", propOrder = {
    "conditions"
})
public class DialogPropertiesTaskList
    extends DialogPropertiesResultList
{

    /**
     * The search conditions of the dialog.
     * 
     */
    @XmlElement(name = "Conditions", required = true)
    protected DialogExpression conditions;
    /**
     * The search conditions of the dialog as string.
     * 
     */
    @XmlAttribute(name = "ConditionString")
    protected String conditionString;
    /**
     * Determines whether the task list is private for the user that created it (by user defined search)
     * 
     */
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    /**
     * Determines whether the task list is automatically refreshed.
     * 
     */
    @XmlAttribute(name = "AutoRefresh")
    protected Boolean autoRefresh;
    /**
     * Determines the refresh period if the task list is automatically refreshed.
     * 
     */
    @XmlAttribute(name = "AutoRefreshPeriod")
    protected Integer autoRefreshPeriod;

    /**
     * The search conditions of the dialog.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     * @see #getConditions()
     */
    public void setConditions(DialogExpression value) {
        this.conditions = value;
    }

    /**
     * The search conditions of the dialog as string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionString() {
        return conditionString;
    }

    /**
     * Sets the value of the conditionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConditionString()
     */
    public void setConditionString(String value) {
        this.conditionString = value;
    }

    /**
     * Determines whether the task list is private for the user that created it (by user defined search)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrivate() {
        if (_private == null) {
            return false;
        } else {
            return _private;
        }
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrivate()
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Determines whether the task list is automatically refreshed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoRefresh() {
        if (autoRefresh == null) {
            return true;
        } else {
            return autoRefresh;
        }
    }

    /**
     * Sets the value of the autoRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutoRefresh()
     */
    public void setAutoRefresh(Boolean value) {
        this.autoRefresh = value;
    }

    /**
     * Determines the refresh period if the task list is automatically refreshed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoRefreshPeriod() {
        return autoRefreshPeriod;
    }

    /**
     * Sets the value of the autoRefreshPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getAutoRefreshPeriod()
     */
    public void setAutoRefreshPeriod(Integer value) {
        this.autoRefreshPeriod = value;
    }

}
