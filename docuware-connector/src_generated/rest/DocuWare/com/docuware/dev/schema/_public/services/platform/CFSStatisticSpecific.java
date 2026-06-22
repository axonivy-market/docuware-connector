
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CFSStatisticSpecific complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CFSStatisticSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecificValue" type="{http://dev.docuware.com/schema/public/services/platform}CFSSpecificValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Category" use="required" type="{http://dev.docuware.com/schema/public/services/platform}CFSTableNames" /&gt;
 *       &lt;attribute name="ObjectID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSStatisticSpecific", propOrder = {
    "specificValue"
})
public class CFSStatisticSpecific {

    @XmlElement(name = "SpecificValue", required = true)
    protected List<CFSSpecificValue> specificValue;
    @XmlAttribute(name = "Category", required = true)
    protected CFSTableNames category;
    /**
     * The identifier of the instance to be monitored.
     *           For a file cabinet this is the file cabinet id, for a device this is the device string.
     * 
     */
    @XmlAttribute(name = "ObjectID", required = true)
    protected String objectID;

    /**
     * Gets the value of the specificValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the specificValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecificValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFSSpecificValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the specificValue property.
     */
    public List<CFSSpecificValue> getSpecificValue() {
        if (specificValue == null) {
            specificValue = new ArrayList<>();
        }
        return this.specificValue;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CFSTableNames }
     *     
     */
    public CFSTableNames getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CFSTableNames }
     *     
     */
    public void setCategory(CFSTableNames value) {
        this.category = value;
    }

    /**
     * The identifier of the instance to be monitored.
     *           For a file cabinet this is the file cabinet id, for a device this is the device string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getObjectID()
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

}
