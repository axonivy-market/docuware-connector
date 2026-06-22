
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Model a workflow.
 * 
 * &lt;p&gt;Java class for Workflow complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Workflow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="ColumnDefinition" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnsDefinition"/&gt;
 *         &lt;element name="WorkflowBehaviorOptions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WorkflowBehaviorOptions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaskCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ResultListId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workflow", propOrder = {
    "links",
    "columnDefinition",
    "workflowBehaviorOptions"
})
public class Workflow {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * List of the visible columns of the workflow.
     * 
     */
    @XmlElement(name = "ColumnDefinition", required = true)
    protected ColumnsDefinition columnDefinition;
    @XmlElement(name = "WorkflowBehaviorOptions", required = true)
    protected WorkflowBehaviorOptions workflowBehaviorOptions;
    /**
     * Id of the workflow.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Name of the workflow.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Number of items of the query leading to this result.
     * 
     */
    @XmlAttribute(name = "TaskCount", required = true)
    protected int taskCount;
    /**
     * Id of the file cabinet which has been connected with this workflow.
     * 
     */
    @XmlAttribute(name = "FileCabinetId", required = true)
    protected String fileCabinetId;
    /**
     * TimeStamp of the result.
     * 
     */
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    /**
     * Id of the resultList needed to get context menu functions
     * 
     */
    @XmlAttribute(name = "ResultListId", required = true)
    protected String resultListId;

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
     * List of the visible columns of the workflow.
     * 
     * @return
     *     possible object is
     *     {@link ColumnsDefinition }
     *     
     */
    public ColumnsDefinition getColumnDefinition() {
        return columnDefinition;
    }

    /**
     * Sets the value of the columnDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnsDefinition }
     *     
     * @see #getColumnDefinition()
     */
    public void setColumnDefinition(ColumnsDefinition value) {
        this.columnDefinition = value;
    }

    /**
     * Gets the value of the workflowBehaviorOptions property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowBehaviorOptions }
     *     
     */
    public WorkflowBehaviorOptions getWorkflowBehaviorOptions() {
        return workflowBehaviorOptions;
    }

    /**
     * Sets the value of the workflowBehaviorOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowBehaviorOptions }
     *     
     */
    public void setWorkflowBehaviorOptions(WorkflowBehaviorOptions value) {
        this.workflowBehaviorOptions = value;
    }

    /**
     * Id of the workflow.
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
     * Name of the workflow.
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
     * Number of items of the query leading to this result.
     * 
     */
    public int getTaskCount() {
        return taskCount;
    }

    /**
     * Sets the value of the taskCount property.
     * 
     */
    public void setTaskCount(int value) {
        this.taskCount = value;
    }

    /**
     * Id of the file cabinet which has been connected with this workflow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    /**
     * Sets the value of the fileCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileCabinetId()
     */
    public void setFileCabinetId(String value) {
        this.fileCabinetId = value;
    }

    /**
     * TimeStamp of the result.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTimeStamp()
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Id of the resultList needed to get context menu functions
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultListId() {
        return resultListId;
    }

    /**
     * Sets the value of the resultListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResultListId()
     */
    public void setResultListId(String value) {
        this.resultListId = value;
    }

}
