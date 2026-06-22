
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define possible flags for a document
 * 
 * &lt;p&gt;Java class for DocumentFlags complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFlags")
public class DocumentFlags {

    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsCold")
    protected Boolean isCold;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsDBRecord")
    protected Boolean isDBRecord;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsCheckedOut")
    protected Boolean isCheckedOut;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsCopyRightProtected")
    protected Boolean isCopyRightProtected;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsVoiceAvailable")
    protected Boolean isVoiceAvailable;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "HasAppendedDocuments")
    protected Boolean hasAppendedDocuments;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsProtected")
    protected Boolean isProtected;
    /**
     * Readonly flag. It will be overriden if set.
     * 
     */
    @XmlAttribute(name = "IsDeleted")
    protected Boolean isDeleted;
    /**
     * Read-write flag.
     * 
     */
    @XmlAttribute(name = "IsEmail")
    protected Boolean isEmail;

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsCold()
     */
    public void setIsCold(Boolean value) {
        this.isCold = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsDBRecord()
     */
    public void setIsDBRecord(Boolean value) {
        this.isDBRecord = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsCheckedOut()
     */
    public void setIsCheckedOut(Boolean value) {
        this.isCheckedOut = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsCopyRightProtected()
     */
    public void setIsCopyRightProtected(Boolean value) {
        this.isCopyRightProtected = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsVoiceAvailable()
     */
    public void setIsVoiceAvailable(Boolean value) {
        this.isVoiceAvailable = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isHasAppendedDocuments()
     */
    public void setHasAppendedDocuments(Boolean value) {
        this.hasAppendedDocuments = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsProtected()
     */
    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**
     * Readonly flag. It will be overriden if set.
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
     * @see #isIsDeleted()
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Read-write flag.
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
     * @see #isIsEmail()
     */
    public void setIsEmail(Boolean value) {
        this.isEmail = value;
    }

}
