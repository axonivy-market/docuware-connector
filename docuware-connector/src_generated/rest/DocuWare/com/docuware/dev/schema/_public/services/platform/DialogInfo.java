
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * General properties of any dialog.
 * 
 * &lt;p&gt;Java class for DialogInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileCabinetName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsForMobile" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AssignedDialogId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogTypes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogInfo", propOrder = {
    "links"
})
@XmlSeeAlso({
    Dialog.class
})
public class DialogInfo {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * The id of the dialog
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * The id of the file cabinet
     * 
     */
    @XmlAttribute(name = "FileCabinetId", required = true)
    protected String fileCabinetId;
    /**
     * The name of the file cabinet
     * 
     */
    @XmlAttribute(name = "FileCabinetName", required = true)
    protected String fileCabinetName;
    /**
     * The display name of the dialog
     * 
     */
    @XmlAttribute(name = "DisplayName")
    protected String displayName;
    /**
     * Gets or sets if this dialog is a available for mobile client
     * 
     */
    @XmlAttribute(name = "IsForMobile", required = true)
    protected boolean isForMobile;
    /**
     * The id of the assigned dialog (result list for search dialogs, info dialog for result dialogs, etc.)
     * 
     */
    @XmlAttribute(name = "AssignedDialogId", required = true)
    protected String assignedDialogId;
    /**
     * This flag can be used by the client to display a dialog in favour of the other dialogs. It can be used to display the initial dialog in case there is more than one dialog which can be displayed.
     * 
     */
    @XmlAttribute(name = "IsDefault")
    protected Boolean isDefault;
    /**
     * The type of the dialog.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected DialogTypes type;

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
     * The id of the dialog
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
     * The id of the file cabinet
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    /**
     * Sets the value of the fileCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileCabinetId()
     */
    public void setFileCabinetId(String value) {
        this.fileCabinetId = value;
    }

    /**
     * The name of the file cabinet
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetName() {
        return fileCabinetName;
    }

    /**
     * Sets the value of the fileCabinetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileCabinetName()
     */
    public void setFileCabinetName(String value) {
        this.fileCabinetName = value;
    }

    /**
     * The display name of the dialog
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisplayName()
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets or sets if this dialog is a available for mobile client
     * 
     */
    public boolean isIsForMobile() {
        return isForMobile;
    }

    /**
     * Sets the value of the isForMobile property.
     * 
     */
    public void setIsForMobile(boolean value) {
        this.isForMobile = value;
    }

    /**
     * The id of the assigned dialog (result list for search dialogs, info dialog for result dialogs, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedDialogId() {
        return assignedDialogId;
    }

    /**
     * Sets the value of the assignedDialogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssignedDialogId()
     */
    public void setAssignedDialogId(String value) {
        this.assignedDialogId = value;
    }

    /**
     * This flag can be used by the client to display a dialog in favour of the other dialogs. It can be used to display the initial dialog in case there is more than one dialog which can be displayed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDefault() {
        if (isDefault == null) {
            return false;
        } else {
            return isDefault;
        }
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsDefault()
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * The type of the dialog.
     * 
     * @return
     *     possible object is
     *     {@link DialogTypes }
     *     
     */
    public DialogTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogTypes }
     *     
     * @see #getType()
     */
    public void setType(DialogTypes value) {
        this.type = value;
    }

}
