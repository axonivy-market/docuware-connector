
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Additional information for organization
 * 
 * &lt;p&gt;Java class for AdditionalOrganizationInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AdditionalOrganizationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddressLines" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Administrator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EMail" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SystemNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RuntimeVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalOrganizationInfo", propOrder = {
    "companyNames",
    "addressLines"
})
public class AdditionalOrganizationInfo {

    /**
     * Name of companies included in organization
     * 
     */
    @XmlElement(name = "CompanyNames")
    protected List<String> companyNames;
    /**
     * Addresses of organization
     * 
     */
    @XmlElement(name = "AddressLines")
    protected List<String> addressLines;
    /**
     * Name of the administrator
     * 
     */
    @XmlAttribute(name = "Administrator", required = true)
    protected String administrator;
    /**
     * Contact email of organization
     * 
     */
    @XmlAttribute(name = "EMail", required = true)
    protected String eMail;
    /**
     * System number
     * 
     */
    @XmlAttribute(name = "SystemNumber", required = true)
    protected String systemNumber;
    /**
     * Runtime version of the DocuWare system
     * 
     */
    @XmlAttribute(name = "RuntimeVersion", required = true)
    protected String runtimeVersion;
    /**
     * Type of the organization
     * 
     */
    @XmlAttribute(name = "OrganizationType")
    protected String organizationType;

    /**
     * Name of companies included in organization
     * 
     * Gets the value of the companyNames property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the companyNames property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCompanyNames().add(newItem);
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
     *     The value of the companyNames property.
     */
    public List<String> getCompanyNames() {
        if (companyNames == null) {
            companyNames = new ArrayList<>();
        }
        return this.companyNames;
    }

    /**
     * Addresses of organization
     * 
     * Gets the value of the addressLines property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addressLines property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressLines().add(newItem);
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
     *     The value of the addressLines property.
     */
    public List<String> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<>();
        }
        return this.addressLines;
    }

    /**
     * Name of the administrator
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdministrator()
     */
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    /**
     * Contact email of organization
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
     * System number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNumber() {
        return systemNumber;
    }

    /**
     * Sets the value of the systemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSystemNumber()
     */
    public void setSystemNumber(String value) {
        this.systemNumber = value;
    }

    /**
     * Runtime version of the DocuWare system
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    /**
     * Sets the value of the runtimeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRuntimeVersion()
     */
    public void setRuntimeVersion(String value) {
        this.runtimeVersion = value;
    }

    /**
     * Type of the organization
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrganizationType()
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

}
