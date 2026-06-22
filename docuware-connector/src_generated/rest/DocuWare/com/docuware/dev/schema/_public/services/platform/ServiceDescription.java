
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Root object that define platform structure.
 * 
 * &lt;p&gt;Java class for ServiceDescription complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ServiceDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="Tests" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionTests"/&gt;
 *         &lt;element name="Documentation" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionDocumentation"/&gt;
 *         &lt;element name="Statistics" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionStatistics"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescription", propOrder = {
    "links",
    "tests",
    "documentation",
    "statistics"
})
public class ServiceDescription {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Test applications for platform.
     * 
     */
    @XmlElement(name = "Tests", required = true)
    protected ServiceDescriptionTests tests;
    /**
     * Documentation links for platform.
     * 
     */
    @XmlElement(name = "Documentation", required = true)
    protected ServiceDescriptionDocumentation documentation;
    /**
     * Test applications for platform.
     * 
     */
    @XmlElement(name = "Statistics", required = true)
    protected ServiceDescriptionStatistics statistics;
    /**
     * Contains the product version of DocuWare.
     * 
     */
    @XmlAttribute(name = "Version")
    protected String version;

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
     * Test applications for platform.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionTests }
     *     
     */
    public ServiceDescriptionTests getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionTests }
     *     
     * @see #getTests()
     */
    public void setTests(ServiceDescriptionTests value) {
        this.tests = value;
    }

    /**
     * Documentation links for platform.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionDocumentation }
     *     
     */
    public ServiceDescriptionDocumentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionDocumentation }
     *     
     * @see #getDocumentation()
     */
    public void setDocumentation(ServiceDescriptionDocumentation value) {
        this.documentation = value;
    }

    /**
     * Test applications for platform.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionStatistics }
     *     
     */
    public ServiceDescriptionStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionStatistics }
     *     
     * @see #getStatistics()
     */
    public void setStatistics(ServiceDescriptionStatistics value) {
        this.statistics = value;
    }

    /**
     * Contains the product version of DocuWare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
