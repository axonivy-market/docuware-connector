
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Parameters for CheckIn action
 * 
 * &lt;p&gt;Java class for CheckInActionParameters complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CheckInActionParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentVersion" type="{http://dev.docuware.com/schema/public/services/platform}DocumentVersion"/&gt;
 *         &lt;element name="CheckInReturnDocument" type="{http://dev.docuware.com/schema/public/services/platform}CheckInReturnDocument"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInActionParameters", propOrder = {
    "documentVersion",
    "checkInReturnDocument"
})
public class CheckInActionParameters
    extends DocumentActionParameters
{

    /**
     * Check in version of the document
     * 
     */
    @XmlElement(name = "DocumentVersion", required = true)
    protected DocumentVersion documentVersion;
    /**
     * Defines which document to be returned.
     * 
     */
    @XmlElement(name = "CheckInReturnDocument", required = true, defaultValue = "Original")
    @XmlSchemaType(name = "string")
    protected CheckInReturnDocument checkInReturnDocument;
    /**
     * Minor version of the document.
     * 
     */
    @XmlAttribute(name = "Comments")
    protected String comments;

    /**
     * Check in version of the document
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersion }
     *     
     */
    public DocumentVersion getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Sets the value of the documentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersion }
     *     
     * @see #getDocumentVersion()
     */
    public void setDocumentVersion(DocumentVersion value) {
        this.documentVersion = value;
    }

    /**
     * Defines which document to be returned.
     * 
     * @return
     *     possible object is
     *     {@link CheckInReturnDocument }
     *     
     */
    public CheckInReturnDocument getCheckInReturnDocument() {
        return checkInReturnDocument;
    }

    /**
     * Sets the value of the checkInReturnDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInReturnDocument }
     *     
     * @see #getCheckInReturnDocument()
     */
    public void setCheckInReturnDocument(CheckInReturnDocument value) {
        this.checkInReturnDocument = value;
    }

    /**
     * Minor version of the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComments()
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
