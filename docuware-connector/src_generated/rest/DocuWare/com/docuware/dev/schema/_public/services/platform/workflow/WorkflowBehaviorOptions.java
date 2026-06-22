
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for WorkflowBehaviorOptions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WorkflowBehaviorOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AllowReassign" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowWorkflowHistory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowMarkAsReadUnread" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowBehaviorOptions")
public class WorkflowBehaviorOptions {

    /**
     * Indicates whether the reassign options is allowed in this workflow.
     * 
     */
    @XmlAttribute(name = "AllowReassign", required = true)
    protected boolean allowReassign;
    /**
     * Indicates whether the workflow history options is allowed in this workflow.
     * 
     */
    @XmlAttribute(name = "AllowWorkflowHistory", required = true)
    protected boolean allowWorkflowHistory;
    /**
     * Indicates whether the mark as read / unread options is allowed in this workflow.
     * 
     */
    @XmlAttribute(name = "AllowMarkAsReadUnread", required = true)
    protected boolean allowMarkAsReadUnread;

    /**
     * Indicates whether the reassign options is allowed in this workflow.
     * 
     */
    public boolean isAllowReassign() {
        return allowReassign;
    }

    /**
     * Sets the value of the allowReassign property.
     * 
     */
    public void setAllowReassign(boolean value) {
        this.allowReassign = value;
    }

    /**
     * Indicates whether the workflow history options is allowed in this workflow.
     * 
     */
    public boolean isAllowWorkflowHistory() {
        return allowWorkflowHistory;
    }

    /**
     * Sets the value of the allowWorkflowHistory property.
     * 
     */
    public void setAllowWorkflowHistory(boolean value) {
        this.allowWorkflowHistory = value;
    }

    /**
     * Indicates whether the mark as read / unread options is allowed in this workflow.
     * 
     */
    public boolean isAllowMarkAsReadUnread() {
        return allowMarkAsReadUnread;
    }

    /**
     * Sets the value of the allowMarkAsReadUnread property.
     * 
     */
    public void setAllowMarkAsReadUnread(boolean value) {
        this.allowMarkAsReadUnread = value;
    }

}
