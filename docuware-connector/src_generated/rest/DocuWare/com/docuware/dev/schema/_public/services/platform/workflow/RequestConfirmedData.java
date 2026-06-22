
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A confirmation data for a request.
 * 
 * &lt;p&gt;Java class for RequestConfirmedData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RequestConfirmedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DecisionId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestConfirmedData")
public class RequestConfirmedData {

    /**
     * Decision id.
     * 
     */
    @XmlAttribute(name = "DecisionId", required = true)
    protected int decisionId;
    /**
     * Value of a field comment in the decision.
     * 
     */
    @XmlAttribute(name = "Comment", required = true)
    protected String comment;

    /**
     * Decision id.
     * 
     */
    public int getDecisionId() {
        return decisionId;
    }

    /**
     * Sets the value of the decisionId property.
     * 
     */
    public void setDecisionId(int value) {
        this.decisionId = value;
    }

    /**
     * Value of a field comment in the decision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComment()
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
