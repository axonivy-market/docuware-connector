
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TasksQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TasksQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Instances" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnSortOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="RemoveLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TasksQuery", propOrder = {
    "instances",
    "sortOrder"
})
public class TasksQuery {

    /**
     * List of instances ids.
     * 
     */
    @XmlElement(name = "Instances")
    protected List<String> instances;
    /**
     * Sort order for the task list.
     * 
     */
    @XmlElement(name = "SortOrder")
    protected List<ColumnSortOrder> sortOrder;
    /**
     * Start position of the search.
     * 
     */
    @XmlAttribute(name = "Start", required = true)
    protected int start;
    /**
     * Count of the returned items.
     * 
     */
    @XmlAttribute(name = "Count", required = true)
    protected int count;
    /**
     * Indicates whether the task links should be loaded.
     * 
     */
    @XmlAttribute(name = "RemoveLinks")
    protected Boolean removeLinks;

    /**
     * List of instances ids.
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
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the instances property.
     */
    public List<String> getInstances() {
        if (instances == null) {
            instances = new ArrayList<>();
        }
        return this.instances;
    }

    /**
     * Sort order for the task list.
     * 
     * Gets the value of the sortOrder property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sortOrder property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSortOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnSortOrder }
     * </p>
     * 
     * 
     * @return
     *     The value of the sortOrder property.
     */
    public List<ColumnSortOrder> getSortOrder() {
        if (sortOrder == null) {
            sortOrder = new ArrayList<>();
        }
        return this.sortOrder;
    }

    /**
     * Start position of the search.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Count of the returned items.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Indicates whether the task links should be loaded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemoveLinks() {
        if (removeLinks == null) {
            return false;
        } else {
            return removeLinks;
        }
    }

    /**
     * Sets the value of the removeLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRemoveLinks()
     */
    public void setRemoveLinks(Boolean value) {
        this.removeLinks = value;
    }

}
