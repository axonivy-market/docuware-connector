
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Operations on a workflow task.
 * 
 * &lt;p&gt;Java class for TaskOperations complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskOperations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseTaskOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}BaseTaskOperations"/&gt;
 *         &lt;element name="ExtendedControllerOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ExtendedControllerOperations"/&gt;
 *         &lt;element name="ExtendedUserOperations" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ExtendedUserOperations"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskOperations", propOrder = {
    "baseTaskOperations",
    "extendedControllerOperations",
    "extendedUserOperations",
    "links"
})
public class TaskOperations {

    /**
     * Task operations available for all users.
     * 
     */
    @XmlElement(name = "BaseTaskOperations", required = true)
    protected BaseTaskOperations baseTaskOperations;
    /**
     * Operations available for controllers of the task.
     * 
     */
    @XmlElement(name = "ExtendedControllerOperations", required = true)
    protected ExtendedControllerOperations extendedControllerOperations;
    /**
     * Operations available for common users of the task.
     * 
     */
    @XmlElement(name = "ExtendedUserOperations", required = true)
    protected ExtendedUserOperations extendedUserOperations;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Task operations available for all users.
     * 
     * @return
     *     possible object is
     *     {@link BaseTaskOperations }
     *     
     */
    public BaseTaskOperations getBaseTaskOperations() {
        return baseTaskOperations;
    }

    /**
     * Sets the value of the baseTaskOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTaskOperations }
     *     
     * @see #getBaseTaskOperations()
     */
    public void setBaseTaskOperations(BaseTaskOperations value) {
        this.baseTaskOperations = value;
    }

    /**
     * Operations available for controllers of the task.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedControllerOperations }
     *     
     */
    public ExtendedControllerOperations getExtendedControllerOperations() {
        return extendedControllerOperations;
    }

    /**
     * Sets the value of the extendedControllerOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedControllerOperations }
     *     
     * @see #getExtendedControllerOperations()
     */
    public void setExtendedControllerOperations(ExtendedControllerOperations value) {
        this.extendedControllerOperations = value;
    }

    /**
     * Operations available for common users of the task.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedUserOperations }
     *     
     */
    public ExtendedUserOperations getExtendedUserOperations() {
        return extendedUserOperations;
    }

    /**
     * Sets the value of the extendedUserOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedUserOperations }
     *     
     * @see #getExtendedUserOperations()
     */
    public void setExtendedUserOperations(ExtendedUserOperations value) {
        this.extendedUserOperations = value;
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

}
