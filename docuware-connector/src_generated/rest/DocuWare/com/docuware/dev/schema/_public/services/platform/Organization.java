
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition for DocuWare organization.
 * 
 * &lt;p&gt;Java class for Organization complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalInfo" type="{http://dev.docuware.com/schema/public/services/platform}AdditionalOrganizationInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="ConfigurationRights" type="{http://dev.docuware.com/schema/public/services/platform}ConfigurationRights" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedConfigurationRights" type="{http://dev.docuware.com/schema/public/services/platform}ExtendedConfigurationRights"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "additionalInfo",
    "links",
    "configurationRights",
    "extendedConfigurationRights"
})
public class Organization {

    @XmlElement(name = "AdditionalInfo")
    protected AdditionalOrganizationInfo additionalInfo;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * List of the rights that the current user has for this cabinet.
     * 
     */
    @XmlElement(name = "ConfigurationRights")
    protected ConfigurationRights configurationRights;
    /**
     * Gets or sets the extended configuration rights
     * 
     */
    @XmlElement(name = "ExtendedConfigurationRights", required = true)
    protected ExtendedConfigurationRights extendedConfigurationRights;
    /**
     * Name of the organization
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Identity of the organization
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Guid of the organization
     * 
     */
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOrganizationInfo }
     *     
     */
    public AdditionalOrganizationInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOrganizationInfo }
     *     
     */
    public void setAdditionalInfo(AdditionalOrganizationInfo value) {
        this.additionalInfo = value;
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
     * List of the rights that the current user has for this cabinet.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationRights }
     *     
     */
    public ConfigurationRights getConfigurationRights() {
        return configurationRights;
    }

    /**
     * Sets the value of the configurationRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationRights }
     *     
     * @see #getConfigurationRights()
     */
    public void setConfigurationRights(ConfigurationRights value) {
        this.configurationRights = value;
    }

    /**
     * Gets or sets the extended configuration rights
     * 
     * @return
     *     possible object is
     *     {@link ExtendedConfigurationRights }
     *     
     */
    public ExtendedConfigurationRights getExtendedConfigurationRights() {
        return extendedConfigurationRights;
    }

    /**
     * Sets the value of the extendedConfigurationRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedConfigurationRights }
     *     
     * @see #getExtendedConfigurationRights()
     */
    public void setExtendedConfigurationRights(ExtendedConfigurationRights value) {
        this.extendedConfigurationRights = value;
    }

    /**
     * Name of the organization
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
     * Identity of the organization
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
     * Guid of the organization
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGuid()
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
