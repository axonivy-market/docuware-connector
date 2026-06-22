
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for General error.
 * 
 * &lt;p&gt;Java class for GeneralErrorDecisionHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="GeneralErrorDecisionHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecisionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralErrorDecisionHistoryStep")
public class GeneralErrorDecisionHistoryStep {

    /**
     * Name of the user who confirmed the task.
     * 
     */
    @XmlAttribute(name = "UserName")
    protected String userName;
    /**
     * Name of the decision which has been confirmed.
     * 
     */
    @XmlAttribute(name = "DecisionName")
    protected String decisionName;

    /**
     * Name of the user who confirmed the task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUserName()
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Name of the decision which has been confirmed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionName() {
        return decisionName;
    }

    /**
     * Sets the value of the decisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionName()
     */
    public void setDecisionName(String value) {
        this.decisionName = value;
    }

}
