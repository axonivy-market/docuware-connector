
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Workflow decision stamps
 * 
 * &lt;p&gt;Java class for DecisionsStampSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DecisionsStampSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StampsSettings" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WorkflowStampsSettings" minOccurs="0"/&gt;
 *         &lt;element name="DecisionStamps" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DecisionStamps" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WorkflowId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaskId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ActivityName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionsStampSettings", propOrder = {
    "stampsSettings",
    "decisionStamps"
})
public class DecisionsStampSettings {

    /**
     * Workflow stamps settings
     * 
     */
    @XmlElement(name = "StampsSettings")
    protected WorkflowStampsSettings stampsSettings;
    /**
     * Decisions which are present as stamps.
     * 
     */
    @XmlElement(name = "DecisionStamps")
    protected DecisionStamps decisionStamps;
    /**
     * Workflow identifier
     * 
     */
    @XmlAttribute(name = "WorkflowId", required = true)
    protected String workflowId;
    /**
     * Instance identifier
     * 
     */
    @XmlAttribute(name = "InstanceId", required = true)
    protected String instanceId;
    /**
     * Task identifier
     * 
     */
    @XmlAttribute(name = "TaskId", required = true)
    protected String taskId;
    /**
     * Current activity name
     * 
     */
    @XmlAttribute(name = "ActivityName", required = true)
    protected String activityName;

    /**
     * Workflow stamps settings
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStampsSettings }
     *     
     */
    public WorkflowStampsSettings getStampsSettings() {
        return stampsSettings;
    }

    /**
     * Sets the value of the stampsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStampsSettings }
     *     
     * @see #getStampsSettings()
     */
    public void setStampsSettings(WorkflowStampsSettings value) {
        this.stampsSettings = value;
    }

    /**
     * Decisions which are present as stamps.
     * 
     * @return
     *     possible object is
     *     {@link DecisionStamps }
     *     
     */
    public DecisionStamps getDecisionStamps() {
        return decisionStamps;
    }

    /**
     * Sets the value of the decisionStamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionStamps }
     *     
     * @see #getDecisionStamps()
     */
    public void setDecisionStamps(DecisionStamps value) {
        this.decisionStamps = value;
    }

    /**
     * Workflow identifier
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
     * Instance identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInstanceId()
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Task identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaskId()
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Current activity name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActivityName()
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

}
