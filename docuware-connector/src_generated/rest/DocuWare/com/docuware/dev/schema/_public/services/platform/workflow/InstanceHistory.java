
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of history steps for an instance.
 * 
 * &lt;p&gt;Java class for InstanceHistory complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="InstanceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="HistorySteps" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistorySteps"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WorkflowId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="WorkflowRequest" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceHistory", propOrder = {
    "links",
    "historySteps"
})
public class InstanceHistory {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * List of history steps.
     * 
     */
    @XmlElement(name = "HistorySteps", required = true)
    protected HistorySteps historySteps;
    /**
     * Instance id.
     * 
     */
    @XmlAttribute(name = "Id")
    protected String id;
    /**
     * Workflow id.
     * 
     */
    @XmlAttribute(name = "WorkflowId")
    protected String workflowId;
    /**
     * Workflow name.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Workflow version number.
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected int version;
    /**
     * True if it is history for workflow request.
     * 
     */
    @XmlAttribute(name = "WorkflowRequest", required = true)
    protected boolean workflowRequest;

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
     * List of history steps.
     * 
     * @return
     *     possible object is
     *     {@link HistorySteps }
     *     
     */
    public HistorySteps getHistorySteps() {
        return historySteps;
    }

    /**
     * Sets the value of the historySteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistorySteps }
     *     
     * @see #getHistorySteps()
     */
    public void setHistorySteps(HistorySteps value) {
        this.historySteps = value;
    }

    /**
     * Instance id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Workflow id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkflowId()
     */
    public void setWorkflowId(String value) {
        this.workflowId = value;
    }

    /**
     * Workflow name.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Workflow version number.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * True if it is history for workflow request.
     * 
     */
    public boolean isWorkflowRequest() {
        return workflowRequest;
    }

    /**
     * Sets the value of the workflowRequest property.
     * 
     */
    public void setWorkflowRequest(boolean value) {
        this.workflowRequest = value;
    }

}
