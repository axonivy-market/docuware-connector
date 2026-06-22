
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a query that link one document to another document from same or different file cabinet
 * 
 * &lt;p&gt;Java class for DocumentLink complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsInvalid" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TargetFileCabinet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetResultList" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLink", propOrder = {
    "links"
})
public class DocumentLink {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Identity of the document link
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Name of the document link
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Indicates whether the document relation is invalid
     * 
     */
    @XmlAttribute(name = "IsInvalid")
    protected Boolean isInvalid;
    /**
     * File cabinet that the document is linked to
     * 
     */
    @XmlAttribute(name = "TargetFileCabinet", required = true)
    protected String targetFileCabinet;
    /**
     * Identity of the result list that will be used to show the linked documents
     * 
     */
    @XmlAttribute(name = "TargetResultList", required = true)
    protected String targetResultList;

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
     * Identity of the document link
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
     * Name of the document link
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
     * Indicates whether the document relation is invalid
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInvalid() {
        if (isInvalid == null) {
            return false;
        } else {
            return isInvalid;
        }
    }

    /**
     * Sets the value of the isInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsInvalid()
     */
    public void setIsInvalid(Boolean value) {
        this.isInvalid = value;
    }

    /**
     * File cabinet that the document is linked to
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFileCabinet() {
        return targetFileCabinet;
    }

    /**
     * Sets the value of the targetFileCabinet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTargetFileCabinet()
     */
    public void setTargetFileCabinet(String value) {
        this.targetFileCabinet = value;
    }

    /**
     * Identity of the result list that will be used to show the linked documents
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetResultList() {
        return targetResultList;
    }

    /**
     * Sets the value of the targetResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTargetResultList()
     */
    public void setTargetResultList(String value) {
        this.targetResultList = value;
    }

}
