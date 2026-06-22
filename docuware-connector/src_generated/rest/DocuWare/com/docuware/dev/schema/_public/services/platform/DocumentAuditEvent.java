
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define auditing information property
 * 
 * &lt;p&gt;Java class for DocumentAuditEvent complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentAuditEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuditEvent" type="{http://dev.docuware.com/schema/public/services/platform}AuditEvent"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAuditEvent", propOrder = {
    "auditEvent",
    "links"
})
public class DocumentAuditEvent {

    /**
     * Define allowed operations when there is signature
     * 
     */
    @XmlElement(name = "AuditEvent", required = true)
    protected AuditEvent auditEvent;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Define allowed operations when there is signature
     * 
     * @return
     *     possible object is
     *     {@link AuditEvent }
     *     
     */
    public AuditEvent getAuditEvent() {
        return auditEvent;
    }

    /**
     * Sets the value of the auditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEvent }
     *     
     * @see #getAuditEvent()
     */
    public void setAuditEvent(AuditEvent value) {
        this.auditEvent = value;
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

}
