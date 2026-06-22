
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A workflow decision.
 * 
 * &lt;p&gt;Java class for Decision complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Decision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskFormField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskFormField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DecisionOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DecisionOperations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Color" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Decision", propOrder = {
    "taskFormField",
    "decisionOperations",
    "links"
})
public class Decision {

    /**
     * List of workflow fields.
     * 
     */
    @XmlElement(name = "TaskFormField")
    protected List<TaskFormField> taskFormField;
    /**
     * Operations which can be executed on a decision.
     * 
     */
    @XmlElement(name = "DecisionOperations")
    protected DecisionOperations decisionOperations;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Identifier of the decision.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected int id;
    /**
     * Description of the decision.
     * 
     */
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    /**
     * Label of the decision.
     * 
     */
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    /**
     * Color of the decision.
     * 
     */
    @XmlAttribute(name = "Color", required = true)
    protected String color;

    /**
     * List of workflow fields.
     * 
     * Gets the value of the taskFormField property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taskFormField property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaskFormField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskFormField }
     * </p>
     * 
     * 
     * @return
     *     The value of the taskFormField property.
     */
    public List<TaskFormField> getTaskFormField() {
        if (taskFormField == null) {
            taskFormField = new ArrayList<>();
        }
        return this.taskFormField;
    }

    /**
     * Operations which can be executed on a decision.
     * 
     * @return
     *     possible object is
     *     {@link DecisionOperations }
     *     
     */
    public DecisionOperations getDecisionOperations() {
        return decisionOperations;
    }

    /**
     * Sets the value of the decisionOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionOperations }
     *     
     * @see #getDecisionOperations()
     */
    public void setDecisionOperations(DecisionOperations value) {
        this.decisionOperations = value;
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

    /**
     * Identifier of the decision.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Description of the decision.
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
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Label of the decision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLabel()
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Color of the decision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColor()
     */
    public void setColor(String value) {
        this.color = value;
    }

}
