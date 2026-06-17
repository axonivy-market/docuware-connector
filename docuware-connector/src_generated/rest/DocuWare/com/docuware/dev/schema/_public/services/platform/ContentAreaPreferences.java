
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentAreaPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "Instances")
    protected List<WorkInstance> instances;
    @XmlAttribute(name = "AreaType")
    protected WorkAreaType areaType;
    @XmlAttribute(name = "SelectedInstanceIndex")
    protected Integer selectedInstanceIndex;

    /**
     * Gets the value of the instances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkInstance }
     * 
     * 
     */
    public List<WorkInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WorkInstance>();
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
