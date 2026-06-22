
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExportConfigInput complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExportConfigInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ConfigGUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OrganizationID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportConfigInput")
public class ExportConfigInput {

    /**
     * GUID for the exported config
     * 
     */
    @XmlAttribute(name = "ConfigGUID", required = true)
    protected String configGUID;
    /**
     * Org ID
     * 
     */
    @XmlAttribute(name = "OrganizationID", required = true)
    protected String organizationID;

    /**
     * GUID for the exported config
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigGUID() {
        return configGUID;
    }

    /**
     * Sets the value of the configGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfigGUID()
     */
    public void setConfigGUID(String value) {
        this.configGUID = value;
    }

    /**
     * Org ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrganizationID()
     */
    public void setOrganizationID(String value) {
        this.organizationID = value;
    }

}
