
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * A specific task from the result.
 * 
 * <p>Java class for WorkflowTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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
    @XmlElement(name = "TaskOperations")
    protected TaskOperations taskOperations;
    @XmlElement(name = "ColumnValues")
    protected ColumnValues columnValues;
    @XmlElement(name = "Decisions")
    protected Decisions decisions;
    @XmlElement(name = "DefaultDecisionId", required = true, type = Integer.class, nillable = true)
    protected Integer defaultDecisionId;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "InstanceId", required = true)
    protected String instanceId;
    @XmlAttribute(name = "IsRead", required = true)
    protected boolean isRead;
    @XmlAttribute(name = "AllowDecisionStamp", required = true)
    protected boolean allowDecisionStamp;
    @XmlAttribute(name = "ActivityDescription", required = true)
    protected String activityDescription;
    @XmlAttribute(name = "DocId", required = true)
    protected int docId;
    @XmlAttribute(name = "ActivityType", required = true)
    protected ActivityTypeEnum activityType;
    @XmlAttribute(name = "NodeId", required = true)
    protected int nodeId;
    @XmlAttribute(name = "WorkflowVersionId", required = true)
    protected String workflowVersionId;
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
     * Gets the value of the taskOperations property.
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
     */
    public void setTaskOperations(TaskOperations value) {
        this.taskOperations = value;
    }

    /**
     * Gets the value of the columnValues property.
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
     */
    public void setColumnValues(ColumnValues value) {
        this.columnValues = value;
    }

    /**
     * Gets the value of the decisions property.
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
     */
    public void setDecisions(Decisions value) {
        this.decisions = value;
    }

    /**
     * Gets the value of the defaultDecisionId property.
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
     */
    public void setDefaultDecisionId(Integer value) {
        this.defaultDecisionId = value;
    }

    /**
     * Gets the value of the id property.
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
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the instanceId property.
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
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the isRead property.
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
     * Gets the value of the allowDecisionStamp property.
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
     * Gets the value of the activityDescription property.
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
     */
    public void setActivityDescription(String value) {
        this.activityDescription = value;
    }

    /**
     * Gets the value of the docId property.
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
     * Gets the value of the activityType property.
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
     */
    public void setActivityType(ActivityTypeEnum value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the nodeId property.
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
     * Gets the value of the workflowVersionId property.
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
     */
    public void setWorkflowVersionId(String value) {
        this.workflowVersionId = value;
    }

    /**
     * Gets the value of the lockDocument property.
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
