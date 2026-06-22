
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for WorkflowAreaPreferences complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WorkflowAreaPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ContentAreaPreferences"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControllerInstances" type="{http://dev.docuware.com/schema/public/services/platform}WorkInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowAreaPreferences", propOrder = {
    "controllerInstances"
})
public class WorkflowAreaPreferences
    extends ContentAreaPreferences
{

    /**
     * Items assigned to the area like dialogs, Baskets.
     * 
     */
    @XmlElement(name = "ControllerInstances")
    protected List<WorkInstance> controllerInstances;

    /**
     * Items assigned to the area like dialogs, Baskets.
     * 
     * Gets the value of the controllerInstances property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the controllerInstances property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControllerInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkInstance }
     * </p>
     * 
     * 
     * @return
     *     The value of the controllerInstances property.
     */
    public List<WorkInstance> getControllerInstances() {
        if (controllerInstances == null) {
            controllerInstances = new ArrayList<>();
        }
        return this.controllerInstances;
    }

}
