
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.platform.DocumentIndexFieldTable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TaskTableFieldInitialValues complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableFieldInitialValues", propOrder = {
    "documentIndexFieldTable"
})
public class TaskTableFieldInitialValues {

    /**
     * Values to be prefilled in a table field
     * 
     */
    @XmlElement(name = "DocumentIndexFieldTable", required = true)
    protected DocumentIndexFieldTable documentIndexFieldTable;
    /**
     * Defines if the values should be prepended, appended or replaced
     * 
     */
    @XmlAttribute(name = "TaskTableFieldJoinType", required = true)
    protected TaskTableFieldJoinTypeEnum taskTableFieldJoinType;

    /**
     * Values to be prefilled in a table field
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
     * @see #getDocumentIndexFieldTable()
     */
    public void setDocumentIndexFieldTable(DocumentIndexFieldTable value) {
        this.documentIndexFieldTable = value;
    }

    /**
     * Defines if the values should be prepended, appended or replaced
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
     * @see #getTaskTableFieldJoinType()
     */
    public void setTaskTableFieldJoinType(TaskTableFieldJoinTypeEnum value) {
        this.taskTableFieldJoinType = value;
    }

}
