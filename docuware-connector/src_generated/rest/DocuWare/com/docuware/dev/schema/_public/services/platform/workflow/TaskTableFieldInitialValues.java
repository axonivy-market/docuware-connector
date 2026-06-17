
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFieldTable;


/**
 * <p>Java class for TaskTableFieldInitialValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskTableFieldInitialValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentIndexFieldTable" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldTable"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TaskTableFieldJoinType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableFieldJoinTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableFieldInitialValues", propOrder = {
    "documentIndexFieldTable"
})
public class TaskTableFieldInitialValues {

    @XmlElement(name = "DocumentIndexFieldTable", required = true)
    protected DocumentIndexFieldTable documentIndexFieldTable;
    @XmlAttribute(name = "TaskTableFieldJoinType", required = true)
    protected TaskTableFieldJoinTypeEnum taskTableFieldJoinType;

    /**
     * Gets the value of the documentIndexFieldTable property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFieldTable }
     *     
     */
    public DocumentIndexFieldTable getDocumentIndexFieldTable() {
        return documentIndexFieldTable;
    }

    /**
     * Sets the value of the documentIndexFieldTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFieldTable }
     *     
     */
    public void setDocumentIndexFieldTable(DocumentIndexFieldTable value) {
        this.documentIndexFieldTable = value;
    }

    /**
     * Gets the value of the taskTableFieldJoinType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTableFieldJoinTypeEnum }
     *     
     */
    public TaskTableFieldJoinTypeEnum getTaskTableFieldJoinType() {
        return taskTableFieldJoinType;
    }

    /**
     * Sets the value of the taskTableFieldJoinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTableFieldJoinTypeEnum }
     *     
     */
    public void setTaskTableFieldJoinType(TaskTableFieldJoinTypeEnum value) {
        this.taskTableFieldJoinType = value;
    }

}
