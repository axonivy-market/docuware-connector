
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Models a DocuWare file cabinet or a web basket(document tray).
 * 
 * &lt;p&gt;Java class for FileCabinet complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFields" minOccurs="0"/&gt;
 *         &lt;element name="Rights" type="{http://dev.docuware.com/schema/public/services/platform}Rights" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedUserRights" type="{http://dev.docuware.com/schema/public/services/platform}ExtendedUserRights" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsBasket" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Usable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Default" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AssignedCabinetId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IntellixDialogId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VersionManagement" type="{http://dev.docuware.com/schema/public/services/platform}VersionManagementMode" default="Disable" /&gt;
 *       &lt;attribute name="VersionHistoryResultListId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WindowsExplorerClientAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AddIndexEntriesInUpperCase" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DocumentAuditingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="HasFullTextSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinet", propOrder = {
    "links",
    "fields",
    "rights",
    "extendedUserRights"
})
public class FileCabinet {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * List of the fields of the cabinet.
     * 
     */
    @XmlElement(name = "Fields")
    protected FileCabinetFields fields;
    /**
     * List of the rights that the current user has for this cabinet.
     * 
     */
    @XmlElement(name = "Rights")
    protected Rights rights;
    /**
     * Gets a sets the extended user rights.
     * 
     */
    @XmlElement(name = "ExtendedUserRights")
    protected ExtendedUserRights extendedUserRights;
    /**
     * Gets or sets the name of the file cabinet.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Gets or sets the id of the file.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Gets or sets a flag indicating whether this file cabinet is a basket or not.
     * 
     */
    @XmlAttribute(name = "IsBasket", required = true)
    protected boolean isBasket;
    /**
     * Gets or sets if user has usage right for web basket. For file cabinets it's always true
     * 
     */
    @XmlAttribute(name = "Usable")
    protected Boolean usable;
    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     */
    @XmlAttribute(name = "Default", required = true)
    protected boolean _default;
    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     */
    @XmlAttribute(name = "AssignedCabinetId")
    protected String assignedCabinetId;
    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     */
    @XmlAttribute(name = "IntellixDialogId")
    protected String intellixDialogId;
    /**
     * Version management mode.
     * 
     */
    @XmlAttribute(name = "VersionManagement")
    protected VersionManagementMode versionManagement;
    /**
     * Gets the id of version history result list.
     * 
     */
    @XmlAttribute(name = "VersionHistoryResultListId")
    protected String versionHistoryResultListId;
    /**
     * Gets whether the file cabinet can be accessed by windows explorer client.
     * 
     */
    @XmlAttribute(name = "WindowsExplorerClientAccess")
    protected Boolean windowsExplorerClientAccess;
    /**
     * Gets whether all letters are input in upper case, regardless of how they were entered on the keyboard
     * 
     */
    @XmlAttribute(name = "AddIndexEntriesInUpperCase")
    protected Boolean addIndexEntriesInUpperCase;
    /**
     * Gets or sets a value indicating whether the document auditing is enabled for that file cabinet.
     * 
     */
    @XmlAttribute(name = "DocumentAuditingEnabled")
    protected Boolean documentAuditingEnabled;
    /**
     * Gets or sets a value indicating whether the cabinet has fulltext search support.
     * 
     */
    @XmlAttribute(name = "HasFullTextSupport")
    protected Boolean hasFullTextSupport;

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
     * List of the fields of the cabinet.
     * 
     * @return
     *     possible object is
     *     {@link FileCabinetFields }
     *     
     */
    public FileCabinetFields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCabinetFields }
     *     
     * @see #getFields()
     */
    public void setFields(FileCabinetFields value) {
        this.fields = value;
    }

    /**
     * List of the rights that the current user has for this cabinet.
     * 
     * @return
     *     possible object is
     *     {@link Rights }
     *     
     */
    public Rights getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rights }
     *     
     * @see #getRights()
     */
    public void setRights(Rights value) {
        this.rights = value;
    }

    /**
     * Gets a sets the extended user rights.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedUserRights }
     *     
     */
    public ExtendedUserRights getExtendedUserRights() {
        return extendedUserRights;
    }

    /**
     * Sets the value of the extendedUserRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedUserRights }
     *     
     * @see #getExtendedUserRights()
     */
    public void setExtendedUserRights(ExtendedUserRights value) {
        this.extendedUserRights = value;
    }

    /**
     * Gets or sets the name of the file cabinet.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets or sets the id of the file.
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
     * Gets or sets a flag indicating whether this file cabinet is a basket or not.
     * 
     */
    public boolean isIsBasket() {
        return isBasket;
    }

    /**
     * Sets the value of the isBasket property.
     * 
     */
    public void setIsBasket(boolean value) {
        this.isBasket = value;
    }

    /**
     * Gets or sets if user has usage right for web basket. For file cabinets it's always true
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsable() {
        if (usable == null) {
            return true;
        } else {
            return usable;
        }
    }

    /**
     * Sets the value of the usable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUsable()
     */
    public void setUsable(Boolean value) {
        this.usable = value;
    }

    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedCabinetId() {
        return assignedCabinetId;
    }

    /**
     * Sets the value of the assignedCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssignedCabinetId()
     */
    public void setAssignedCabinetId(String value) {
        this.assignedCabinetId = value;
    }

    /**
     * Gets or sets a flag indicating whether this cabinet is default or not.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntellixDialogId() {
        return intellixDialogId;
    }

    /**
     * Sets the value of the intellixDialogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIntellixDialogId()
     */
    public void setIntellixDialogId(String value) {
        this.intellixDialogId = value;
    }

    /**
     * Version management mode.
     * 
     * @return
     *     possible object is
     *     {@link VersionManagementMode }
     *     
     */
    public VersionManagementMode getVersionManagement() {
        if (versionManagement == null) {
            return VersionManagementMode.DISABLE;
        } else {
            return versionManagement;
        }
    }

    /**
     * Sets the value of the versionManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionManagementMode }
     *     
     * @see #getVersionManagement()
     */
    public void setVersionManagement(VersionManagementMode value) {
        this.versionManagement = value;
    }

    /**
     * Gets the id of version history result list.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionHistoryResultListId() {
        return versionHistoryResultListId;
    }

    /**
     * Sets the value of the versionHistoryResultListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersionHistoryResultListId()
     */
    public void setVersionHistoryResultListId(String value) {
        this.versionHistoryResultListId = value;
    }

    /**
     * Gets whether the file cabinet can be accessed by windows explorer client.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWindowsExplorerClientAccess() {
        if (windowsExplorerClientAccess == null) {
            return false;
        } else {
            return windowsExplorerClientAccess;
        }
    }

    /**
     * Sets the value of the windowsExplorerClientAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWindowsExplorerClientAccess()
     */
    public void setWindowsExplorerClientAccess(Boolean value) {
        this.windowsExplorerClientAccess = value;
    }

    /**
     * Gets whether all letters are input in upper case, regardless of how they were entered on the keyboard
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAddIndexEntriesInUpperCase() {
        if (addIndexEntriesInUpperCase == null) {
            return false;
        } else {
            return addIndexEntriesInUpperCase;
        }
    }

    /**
     * Sets the value of the addIndexEntriesInUpperCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAddIndexEntriesInUpperCase()
     */
    public void setAddIndexEntriesInUpperCase(Boolean value) {
        this.addIndexEntriesInUpperCase = value;
    }

    /**
     * Gets or sets a value indicating whether the document auditing is enabled for that file cabinet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDocumentAuditingEnabled() {
        if (documentAuditingEnabled == null) {
            return false;
        } else {
            return documentAuditingEnabled;
        }
    }

    /**
     * Sets the value of the documentAuditingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDocumentAuditingEnabled()
     */
    public void setDocumentAuditingEnabled(Boolean value) {
        this.documentAuditingEnabled = value;
    }

    /**
     * Gets or sets a value indicating whether the cabinet has fulltext search support.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasFullTextSupport() {
        if (hasFullTextSupport == null) {
            return false;
        } else {
            return hasFullTextSupport;
        }
    }

    /**
     * Sets the value of the hasFullTextSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasFullTextSupport()
     */
    public void setHasFullTextSupport(Boolean value) {
        this.hasFullTextSupport = value;
    }

}
