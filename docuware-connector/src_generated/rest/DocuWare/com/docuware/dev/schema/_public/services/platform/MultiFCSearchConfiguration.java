
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MultiFCSearchConfiguration complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiFCSearchConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FcIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SearchDialogID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SearchDialogFCID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" type="{http://dev.docuware.com/types}GUIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiFCSearchConfiguration", propOrder = {
    "fcIds"
})
public class MultiFCSearchConfiguration {

    @XmlElement(name = "FcIds")
    protected List<String> fcIds;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "SearchDialogID")
    protected String searchDialogID;
    @XmlAttribute(name = "SearchDialogFCID")
    protected String searchDialogFCID;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the fcIds property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcIds property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFcIds().add(newItem);
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
     *     The value of the fcIds property.
     */
    public List<String> getFcIds() {
        if (fcIds == null) {
            fcIds = new ArrayList<>();
        }
        return this.fcIds;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the searchDialogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDialogID() {
        return searchDialogID;
    }

    /**
     * Sets the value of the searchDialogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDialogID(String value) {
        this.searchDialogID = value;
    }

    /**
     * Gets the value of the searchDialogFCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDialogFCID() {
        return searchDialogFCID;
    }

    /**
     * Sets the value of the searchDialogFCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDialogFCID(String value) {
        this.searchDialogFCID = value;
    }

    /**
     * Gets the value of the id property.
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
     */
    public void setId(String value) {
        this.id = value;
    }

}
