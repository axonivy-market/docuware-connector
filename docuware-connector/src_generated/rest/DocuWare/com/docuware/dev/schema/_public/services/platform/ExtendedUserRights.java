
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the extended rights of the user.
 * 
 * <p>Java class for ExtendedUserRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedUserRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AllowViewAuditData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedUserRights")
public class ExtendedUserRights {

    @XmlAttribute(name = "AllowViewAuditData")
    protected Boolean allowViewAuditData;

    /**
     * Gets the value of the allowViewAuditData property.
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
     */
    public void setAllowViewAuditData(Boolean value) {
        this.allowViewAuditData = value;
    }

}
