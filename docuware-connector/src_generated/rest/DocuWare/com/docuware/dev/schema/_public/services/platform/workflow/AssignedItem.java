
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An assigned item.
 * 
 * &lt;p&gt;Java class for AssignedItem complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AssignedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ItemType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignedItemTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedItem")
public class AssignedItem {

    /**
     * User/role/substitution rule identifier.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Type of id.
     * 
     */
    @XmlAttribute(name = "ItemType", required = true)
    protected AssignedItemTypeEnum itemType;

    /**
     * User/role/substitution rule identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Type of id.
     * 
     * @return
     *     possible object is
     *     {@link AssignedItemTypeEnum }
     *     
     */
    public AssignedItemTypeEnum getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedItemTypeEnum }
     *     
     * @see #getItemType()
     */
    public void setItemType(AssignedItemTypeEnum value) {
        this.itemType = value;
    }

}
