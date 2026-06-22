
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dialog properties specific for Tree list
 * 
 * &lt;p&gt;Java class for DialogPropertiesTreeView complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogPropertiesTreeView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StoreDialogId" type="{http://www.w3.org/2001/XMLSchema}string" default="false" /&gt;
 *       &lt;attribute name="Icon" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTreeView", propOrder = {
    "links"
})
public class DialogPropertiesTreeView
    extends DialogProperties
{

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Id of the store dialog to be used for storing documents in the tree view.
     * 
     */
    @XmlAttribute(name = "StoreDialogId")
    protected String storeDialogId;
    /**
     * Gets a string which represents an icon name identifier.
     * 
     */
    @XmlAttribute(name = "Icon")
    protected String icon;

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
     * Id of the store dialog to be used for storing documents in the tree view.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDialogId() {
        if (storeDialogId == null) {
            return "false";
        } else {
            return storeDialogId;
        }
    }

    /**
     * Sets the value of the storeDialogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStoreDialogId()
     */
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
    }

    /**
     * Gets a string which represents an icon name identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIcon()
     */
    public void setIcon(String value) {
        this.icon = value;
    }

}
