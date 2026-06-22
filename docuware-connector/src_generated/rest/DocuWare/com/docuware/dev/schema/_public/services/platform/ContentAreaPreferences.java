
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ContentAreaPreferences complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ContentAreaPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Instances" type="{http://dev.docuware.com/schema/public/services/platform}WorkInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AreaType" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaType" default="None" /&gt;
 *       &lt;attribute name="SelectedInstanceIndex" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentAreaPreferences", propOrder = {
    "instances"
})
@XmlSeeAlso({
    BasketAreaPreferences.class,
    WorkflowAreaPreferences.class
})
public class ContentAreaPreferences {

    /**
     * Items assigned to the area like dialogs, Baskets.
     * 
     */
    @XmlElement(name = "Instances")
    protected List<WorkInstance> instances;
    @XmlAttribute(name = "AreaType")
    protected WorkAreaType areaType;
    @XmlAttribute(name = "SelectedInstanceIndex")
    protected Integer selectedInstanceIndex;

    /**
     * Items assigned to the area like dialogs, Baskets.
     * 
     * Gets the value of the instances property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instances property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstances().add(newItem);
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
     *     The value of the instances property.
     */
    public List<WorkInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<>();
        }
        return this.instances;
    }

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkAreaType }
     *     
     */
    public WorkAreaType getAreaType() {
        if (areaType == null) {
            return WorkAreaType.NONE;
        } else {
            return areaType;
        }
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaType }
     *     
     */
    public void setAreaType(WorkAreaType value) {
        this.areaType = value;
    }

    /**
     * Gets the value of the selectedInstanceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectedInstanceIndex() {
        return selectedInstanceIndex;
    }

    /**
     * Sets the value of the selectedInstanceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectedInstanceIndex(Integer value) {
        this.selectedInstanceIndex = value;
    }

}
