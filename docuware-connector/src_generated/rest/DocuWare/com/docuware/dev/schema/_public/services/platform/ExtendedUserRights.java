
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the extended rights of the user.
 * 
 * &lt;p&gt;Java class for ExtendedUserRights complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExtendedUserRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AllowViewAuditData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedUserRights")
public class ExtendedUserRights {

    /**
     * Gets or sets a value indicating whether the right for viewing audit data is allowed.
     * 
     */
    @XmlAttribute(name = "AllowViewAuditData")
    protected Boolean allowViewAuditData;

    /**
     * Gets or sets a value indicating whether the right for viewing audit data is allowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowViewAuditData() {
        if (allowViewAuditData == null) {
            return false;
        } else {
            return allowViewAuditData;
        }
    }

    /**
     * Sets the value of the allowViewAuditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllowViewAuditData()
     */
    public void setAllowViewAuditData(Boolean value) {
        this.allowViewAuditData = value;
    }

}
