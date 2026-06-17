
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Define possible flags for a document
 * 
 * <p>Java class for DocumentFlags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IsCold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsDBRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsCheckedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsCopyRightProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsVoiceAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="HasAppendedDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFlags")
public class DocumentFlags {

    @XmlAttribute(name = "IsCold")
    protected Boolean isCold;
    @XmlAttribute(name = "IsDBRecord")
    protected Boolean isDBRecord;
    @XmlAttribute(name = "IsCheckedOut")
    protected Boolean isCheckedOut;
    @XmlAttribute(name = "IsCopyRightProtected")
    protected Boolean isCopyRightProtected;
    @XmlAttribute(name = "IsVoiceAvailable")
    protected Boolean isVoiceAvailable;
    @XmlAttribute(name = "HasAppendedDocuments")
    protected Boolean hasAppendedDocuments;
    @XmlAttribute(name = "IsProtected")
    protected Boolean isProtected;
    @XmlAttribute(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlAttribute(name = "IsEmail")
    protected Boolean isEmail;

    /**
     * Gets the value of the isCold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCold() {
        if (isCold == null) {
            return false;
        } else {
            return isCold;
        }
    }

    /**
     * Sets the value of the isCold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCold(Boolean value) {
        this.isCold = value;
    }

    /**
     * Gets the value of the isDBRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDBRecord() {
        if (isDBRecord == null) {
            return false;
        } else {
            return isDBRecord;
        }
    }

    /**
     * Sets the value of the isDBRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDBRecord(Boolean value) {
        this.isDBRecord = value;
    }

    /**
     * Gets the value of the isCheckedOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCheckedOut() {
        if (isCheckedOut == null) {
            return false;
        } else {
            return isCheckedOut;
        }
    }

    /**
     * Sets the value of the isCheckedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckedOut(Boolean value) {
        this.isCheckedOut = value;
    }

    /**
     * Gets the value of the isCopyRightProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCopyRightProtected() {
        if (isCopyRightProtected == null) {
            return false;
        } else {
            return isCopyRightProtected;
        }
    }

    /**
     * Sets the value of the isCopyRightProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCopyRightProtected(Boolean value) {
        this.isCopyRightProtected = value;
    }

    /**
     * Gets the value of the isVoiceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsVoiceAvailable() {
        if (isVoiceAvailable == null) {
            return false;
        } else {
            return isVoiceAvailable;
        }
    }

    /**
     * Sets the value of the isVoiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVoiceAvailable(Boolean value) {
        this.isVoiceAvailable = value;
    }

    /**
     * Gets the value of the hasAppendedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasAppendedDocuments() {
        if (hasAppendedDocuments == null) {
            return false;
        } else {
            return hasAppendedDocuments;
        }
    }

    /**
     * Sets the value of the hasAppendedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAppendedDocuments(Boolean value) {
        this.hasAppendedDocuments = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsProtected() {
        if (isProtected == null) {
            return false;
        } else {
            return isProtected;
        }
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDeleted() {
        if (isDeleted == null) {
            return false;
        } else {
            return isDeleted;
        }
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEmail() {
        if (isEmail == null) {
            return false;
        } else {
            return isEmail;
        }
    }

    /**
     * Sets the value of the isEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmail(Boolean value) {
        this.isEmail = value;
    }

}
