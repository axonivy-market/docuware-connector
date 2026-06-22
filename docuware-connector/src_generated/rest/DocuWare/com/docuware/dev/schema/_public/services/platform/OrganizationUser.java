
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a user in specific organization
 * 
 * &lt;p&gt;Java class for OrganizationUser complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OrganizationUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://dev.docuware.com/schema/public/services/platform}UserInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationUser", propOrder = {
    "organizationId",
    "info"
})
public class OrganizationUser {

    /**
     * Organization identity
     * 
     */
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    /**
     * Information related to a user
     * 
     */
    @XmlElement(name = "Info")
    protected UserInfo info;

    /**
     * Organization identity
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrganizationId()
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Information related to a user
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     * @see #getInfo()
     */
    public void setInfo(UserInfo value) {
        this.info = value;
    }

}
