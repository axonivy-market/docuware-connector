
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Structure for the result of batch update operations.
 * 
 * &lt;p&gt;Java class for BatchUpdateIndexFieldsResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BatchUpdateIndexFieldsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateResultItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SuccessCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateIndexFieldsResult", propOrder = {
    "item",
    "links"
})
public class BatchUpdateIndexFieldsResult {

    /**
     * List of the resulting documents and errors.
     * 
     */
    @XmlElement(name = "Item")
    protected List<BatchUpdateResultItem> item;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * The number of successful updated documents.
     * 
     */
    @XmlAttribute(name = "SuccessCount", required = true)
    protected int successCount;

    /**
     * List of the resulting documents and errors.
     * 
     * Gets the value of the item property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the item property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchUpdateResultItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the item property.
     */
    public List<BatchUpdateResultItem> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
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

    /**
     * The number of successful updated documents.
     * 
     */
    public int getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     */
    public void setSuccessCount(int value) {
        this.successCount = value;
    }

}
