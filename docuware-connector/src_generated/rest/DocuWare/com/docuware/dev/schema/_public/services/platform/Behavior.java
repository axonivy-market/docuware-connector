
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition of a behavior for forms
 * 
 * &lt;p&gt;Java class for Behavior complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Behavior"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://dev.docuware.com/schema/public/services/platform}BehaviorCondition" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BehaviorID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassActions" type="{http://dev.docuware.com/schema/public/services/platform}BehaviorAction" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FailActions" type="{http://dev.docuware.com/schema/public/services/platform}BehaviorAction" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Behavior", propOrder = {
    "conditions",
    "name",
    "description",
    "behaviorID",
    "passActions",
    "failActions"
})
public class Behavior {

    @XmlElement(name = "Conditions", required = true)
    protected List<BehaviorCondition> conditions;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "BehaviorID", required = true)
    protected String behaviorID;
    @XmlElement(name = "PassActions", required = true)
    protected List<BehaviorAction> passActions;
    @XmlElement(name = "FailActions", required = true)
    protected List<BehaviorAction> failActions;

    /**
     * Gets the value of the conditions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conditions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the conditions property.
     */
    public List<BehaviorCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the behaviorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehaviorID() {
        return behaviorID;
    }

    /**
     * Sets the value of the behaviorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehaviorID(String value) {
        this.behaviorID = value;
    }

    /**
     * Gets the value of the passActions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the passActions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the passActions property.
     */
    public List<BehaviorAction> getPassActions() {
        if (passActions == null) {
            passActions = new ArrayList<>();
        }
        return this.passActions;
    }

    /**
     * Gets the value of the failActions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the failActions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the failActions property.
     */
    public List<BehaviorAction> getFailActions() {
        if (failActions == null) {
            failActions = new ArrayList<>();
        }
        return this.failActions;
    }

}
