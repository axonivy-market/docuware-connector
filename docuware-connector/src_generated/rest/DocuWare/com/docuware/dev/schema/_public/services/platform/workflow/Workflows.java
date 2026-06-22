
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of workflows.
 * 
 * &lt;p&gt;Java class for Workflows complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Workflows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Workflow" type="{http://dev.docuware.com/schema/public/services/platform/workflow}Workflow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workflows", propOrder = {
    "workflow"
})
public class Workflows {

    /**
     * List of workflows.
     * 
     */
    @XmlElement(name = "Workflow")
    protected List<Workflow> workflow;

    /**
     * List of workflows.
     * 
     * Gets the value of the workflow property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the workflow property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Workflow }
     * </p>
     * 
     * 
     * @return
     *     The value of the workflow property.
     */
    public List<Workflow> getWorkflow() {
        if (workflow == null) {
            workflow = new ArrayList<>();
        }
        return this.workflow;
    }

}
