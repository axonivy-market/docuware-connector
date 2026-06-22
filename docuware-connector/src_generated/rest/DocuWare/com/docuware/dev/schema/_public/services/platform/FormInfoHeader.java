
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Simple Form object used for displaying form in web client's forms area
 * 
 * &lt;p&gt;Java class for FormInfoHeader complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FormInfoHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SanitizedName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormInfoHeader", propOrder = {
    "id",
    "name",
    "sanitizedName",
    "description",
    "usage",
    "admin",
    "active",
    "_public"
})
public class FormInfoHeader {

    /**
     * Id of the form configuration used to retrieve full configuration
     * 
     */
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SanitizedName", required = true)
    protected String sanitizedName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Usage")
    protected boolean usage;
    @XmlElement(name = "Admin")
    protected boolean admin;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "Public")
    protected boolean _public;

    /**
     * Id of the form configuration used to retrieve full configuration
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
     * Gets the value of the sanitizedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanitizedName() {
        return sanitizedName;
    }

    /**
     * Sets the value of the sanitizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanitizedName(String value) {
        this.sanitizedName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     */
    public boolean isUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     */
    public void setUsage(boolean value) {
        this.usage = value;
    }

    /**
     * Gets the value of the admin property.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the public property.
     * 
     */
    public boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     */
    public void setPublic(boolean value) {
        this._public = value;
    }

}
