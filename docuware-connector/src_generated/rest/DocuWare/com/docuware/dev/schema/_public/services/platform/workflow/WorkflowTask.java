
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A specific task from the result.
 * 
 * &lt;p&gt;Java class for WorkflowTask complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WorkflowTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="TaskOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskOperations" minOccurs="0"/&gt;
 *         &lt;element name="ColumnValues" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnValues" minOccurs="0"/&gt;
 *         &lt;element name="Decisions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}Decisions" minOccurs="0"/&gt;
 *         &lt;element name="DefaultDecisionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsRead" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowDecisionStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ActivityDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ActivityType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ActivityTypeEnum" /&gt;
 *       &lt;attribute name="NodeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="WorkflowVersionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LockDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTask", propOrder = {
    "links",
    "taskOperations",
    "columnValues",
    "decisions",
    "defaultDecisionId"
})
public class WorkflowTask {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Operations which can be executed on the task.
     * 
     */
    @XmlElement(name = "TaskOperations")
    protected TaskOperations taskOperations;
    /**
     * Values in columns.
     * 
     */
    @XmlElement(name = "ColumnValues")
    protected ColumnValues columnValues;
    /**
     * Decisions which can be taken for this task.
     * 
     */
    @XmlElement(name = "Decisions")
    protected Decisions decisions;
    /**
     * Id indicating which decision id is the default one.
     * 
     */
    @XmlElement(name = "DefaultDecisionId", required = true, type = Integer.class, nillable = true)
    protected Integer defaultDecisionId;
    /**
     * Task identity
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Instance identity
     * 
     */
    @XmlAttribute(name = "InstanceId", required = true)
    protected String instanceId;
    /**
     * Indicates whether the task is read
     * 
     */
    @XmlAttribute(name = "IsRead", required = true)
    protected boolean isRead;
    /**
     * Indicates whether stamps are allowed for taking of the decisions.
     * 
     */
    @XmlAttribute(name = "AllowDecisionStamp", required = true)
    protected boolean allowDecisionStamp;
    /**
     * Description of the current activity.
     * 
     */
    @XmlAttribute(name = "ActivityDescription", required = true)
    protected String activityDescription;
    /**
     * Document id connected with the task.
     * 
     */
    @XmlAttribute(name = "DocId", required = true)
    protected int docId;
    /**
     * Current activity type.
     * 
     */
    @XmlAttribute(name = "ActivityType", required = true)
    protected ActivityTypeEnum activityType;
    /**
     * Node id in the workflow definition.
     * 
     */
    @XmlAttribute(name = "NodeId", required = true)
    protected int nodeId;
    /**
     * Workflow version id which is used to trigger this instance.
     * 
     */
    @XmlAttribute(name = "WorkflowVersionId", required = true)
    protected String workflowVersionId;
    /**
     * Indicates whether the document will be lock while the user is working with the task.
     * 
     */
    @XmlAttribute(name = "LockDocument", required = true)
    protected boolean lockDocument;

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
     * Operations which can be executed on the task.
     * 
     * @return
     *     possible object is
     *     {@link TaskOperations }
     *     
     */
    public TaskOperations getTaskOperations() {
        return taskOperations;
    }

    /**
     * Sets the value of the taskOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOperations }
     *     
     * @see #getTaskOperations()
     */
    public void setTaskOperations(TaskOperations value) {
        this.taskOperations = value;
    }

    /**
     * Values in columns.
     * 
     * @return
     *     possible object is
     *     {@link ColumnValues }
     *     
     */
    public ColumnValues getColumnValues() {
        return columnValues;
    }

    /**
     * Sets the value of the columnValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnValues }
     *     
     * @see #getColumnValues()
     */
    public void setColumnValues(ColumnValues value) {
        this.columnValues = value;
    }

    /**
     * Decisions which can be taken for this task.
     * 
     * @return
     *     possible object is
     *     {@link Decisions }
     *     
     */
    public Decisions getDecisions() {
        return decisions;
    }

    /**
     * Sets the value of the decisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decisions }
     *     
     * @see #getDecisions()
     */
    public void setDecisions(Decisions value) {
        this.decisions = value;
    }

    /**
     * Id indicating which decision id is the default one.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultDecisionId() {
        return defaultDecisionId;
    }

    /**
     * Sets the value of the defaultDecisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDefaultDecisionId()
     */
    public void setDefaultDecisionId(Integer value) {
        this.defaultDecisionId = value;
    }

    /**
     * Task identity
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
     * Instance identity
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
     * Indicates whether the task is read
     * 
     */
    public boolean isIsRead() {
        return isRead;
    }

    /**
     * Sets the value of the isRead property.
     * 
     */
    public void setIsRead(boolean value) {
        this.isRead = value;
    }

    /**
     * Indicates whether stamps are allowed for taking of the decisions.
     * 
     */
    public boolean isAllowDecisionStamp() {
        return allowDecisionStamp;
    }

    /**
     * Sets the value of the allowDecisionStamp property.
     * 
     */
    public void setAllowDecisionStamp(boolean value) {
        this.allowDecisionStamp = value;
    }

    /**
     * Description of the current activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * Sets the value of the activityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActivityDescription()
     */
    public void setActivityDescription(String value) {
        this.activityDescription = value;
    }

    /**
     * Document id connected with the task.
     * 
     */
    public int getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(int value) {
        this.docId = value;
    }

    /**
     * Current activity type.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeEnum }
     *     
     */
    public ActivityTypeEnum getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeEnum }
     *     
     * @see #getActivityType()
     */
    public void setActivityType(ActivityTypeEnum value) {
        this.activityType = value;
    }

    /**
     * Node id in the workflow definition.
     * 
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     */
    public void setNodeId(int value) {
        this.nodeId = value;
    }

    /**
     * Workflow version id which is used to trigger this instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowVersionId() {
        return workflowVersionId;
    }

    /**
     * Sets the value of the workflowVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkflowVersionId()
     */
    public void setWorkflowVersionId(String value) {
        this.workflowVersionId = value;
    }

    /**
     * Indicates whether the document will be lock while the user is working with the task.
     * 
     */
    public boolean isLockDocument() {
        return lockDocument;
    }

    /**
     * Sets the value of the lockDocument property.
     * 
     */
    public void setLockDocument(boolean value) {
        this.lockDocument = value;
    }

}
