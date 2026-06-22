
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * User details and settings
 * 
 * &lt;p&gt;Java class for User complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultWebBasket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOffice" type="{http://dev.docuware.com/schema/public/services/platform}OutOfOffice"/&gt;
 *         &lt;element name="RegionalSettings" type="{http://dev.docuware.com/schema/public/services/platform}RegionalSettings"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirstName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Salutation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DBName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NetworkId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "eMail",
    "defaultWebBasket",
    "outOfOffice",
    "regionalSettings",
    "links"
})
public class User {

    /**
     * The email address of the user.
     * 
     */
    @XmlElement(name = "EMail")
    protected String eMail;
    /**
     * Default Web Basket
     * 
     */
    @XmlElement(name = "DefaultWebBasket", defaultValue = "00000000-0000-0000-0000-000000000000")
    protected String defaultWebBasket;
    /**
     * Out of office settings
     * 
     */
    @XmlElement(name = "OutOfOffice", required = true)
    protected OutOfOffice outOfOffice;
    /**
     * Regional settings
     * 
     */
    @XmlElement(name = "RegionalSettings", required = true)
    protected RegionalSettings regionalSettings;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * The ID of the user.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * The display name of the user.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * The first name of the user.
     * 
     */
    @XmlAttribute(name = "FirstName", required = true)
    protected String firstName;
    /**
     * The last name of the user.
     * 
     */
    @XmlAttribute(name = "LastName", required = true)
    protected String lastName;
    /**
     * The salutation of the user.
     * 
     */
    @XmlAttribute(name = "Salutation", required = true)
    protected String salutation;
    /**
     * The databasename of the user.
     * 
     */
    @XmlAttribute(name = "DBName", required = true)
    protected String dbName;
    /**
     * The value indicates whether the user is active or not.
     * 
     */
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    /**
     * The networkId of the user.
     * 
     */
    @XmlAttribute(name = "NetworkId")
    protected String networkId;

    /**
     * The email address of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEMail()
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Default Web Basket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultWebBasket() {
        return defaultWebBasket;
    }

    /**
     * Sets the value of the defaultWebBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultWebBasket()
     */
    public void setDefaultWebBasket(String value) {
        this.defaultWebBasket = value;
    }

    /**
     * Out of office settings
     * 
     * @return
     *     possible object is
     *     {@link OutOfOffice }
     *     
     */
    public OutOfOffice getOutOfOffice() {
        return outOfOffice;
    }

    /**
     * Sets the value of the outOfOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfOffice }
     *     
     * @see #getOutOfOffice()
     */
    public void setOutOfOffice(OutOfOffice value) {
        this.outOfOffice = value;
    }

    /**
     * Regional settings
     * 
     * @return
     *     possible object is
     *     {@link RegionalSettings }
     *     
     */
    public RegionalSettings getRegionalSettings() {
        return regionalSettings;
    }

    /**
     * Sets the value of the regionalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalSettings }
     *     
     * @see #getRegionalSettings()
     */
    public void setRegionalSettings(RegionalSettings value) {
        this.regionalSettings = value;
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
     * The ID of the user.
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
     * The display name of the user.
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
     * The first name of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFirstName()
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * The last name of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLastName()
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * The salutation of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSalutation()
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * The databasename of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDBName()
     */
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**
     * The value indicates whether the user is active or not.
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
     * The networkId of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNetworkId()
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

}
