
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DecisionStampPlacement complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DecisionStampPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampPlacement"&gt;
 *       &lt;attribute name="WorkflowId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaskId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecisionId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="IsController" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionStampPlacement")
public class DecisionStampPlacement
    extends StampPlacement
{

    @XmlAttribute(name = "WorkflowId", required = true)
    protected String workflowId;
    @XmlAttribute(name = "InstanceId", required = true)
    protected String instanceId;
    @XmlAttribute(name = "TaskId", required = true)
    protected String taskId;
    @XmlAttribute(name = "DecisionId", required = true)
    protected int decisionId;
    @XmlAttribute(name = "IsController", required = true)
    protected boolean isController;

    /**
     * Gets the value of the workflowId property.
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
     */
    public void setWorkflowId(String value) {
        this.workflowId = value;
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
     * Gets the value of the taskId property.
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
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the decisionId property.
     * 
     */
    public int getDecisionId() {
        return decisionId;
    }

    /**
     * Sets the value of the decisionId property.
     * 
     */
    public void setDecisionId(int value) {
        this.decisionId = value;
    }

    /**
     * Gets the value of the isController property.
     * 
     */
    public boolean isIsController() {
        return isController;
    }

    /**
     * Sets the value of the isController property.
     * 
     */
    public void setIsController(boolean value) {
        this.isController = value;
    }

}
