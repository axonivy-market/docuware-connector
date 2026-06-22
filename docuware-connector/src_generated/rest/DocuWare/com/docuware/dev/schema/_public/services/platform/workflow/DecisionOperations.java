
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Operations which can be executed on a decision.
 * 
 * &lt;p&gt;Java class for DecisionOperations complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DecisionOperations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseDecisionOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}BaseDecisionOperations"/&gt;
 *         &lt;element name="ExtendedDecisionOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ExtendedDecisionOperations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionOperations", propOrder = {
    "baseDecisionOperations",
    "extendedDecisionOperations",
    "links"
})
public class DecisionOperations {

    /**
     * Base operations which can be executed on a decision.
     * 
     */
    @XmlElement(name = "BaseDecisionOperations", required = true)
    protected BaseDecisionOperations baseDecisionOperations;
    /**
     * Operations which can be executed on a decision only from form interface.
     * 
     */
    @XmlElement(name = "ExtendedDecisionOperations")
    protected ExtendedDecisionOperations extendedDecisionOperations;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Base operations which can be executed on a decision.
     * 
     * @return
     *     possible object is
     *     {@link BaseDecisionOperations }
     *     
     */
    public BaseDecisionOperations getBaseDecisionOperations() {
        return baseDecisionOperations;
    }

    /**
     * Sets the value of the baseDecisionOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseDecisionOperations }
     *     
     * @see #getBaseDecisionOperations()
     */
    public void setBaseDecisionOperations(BaseDecisionOperations value) {
        this.baseDecisionOperations = value;
    }

    /**
     * Operations which can be executed on a decision only from form interface.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDecisionOperations }
     *     
     */
    public ExtendedDecisionOperations getExtendedDecisionOperations() {
        return extendedDecisionOperations;
    }

    /**
     * Sets the value of the extendedDecisionOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDecisionOperations }
     *     
     * @see #getExtendedDecisionOperations()
     */
    public void setExtendedDecisionOperations(ExtendedDecisionOperations value) {
        this.extendedDecisionOperations = value;
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

}
