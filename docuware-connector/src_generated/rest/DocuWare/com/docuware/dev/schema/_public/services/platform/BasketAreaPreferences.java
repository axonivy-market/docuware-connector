
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketAreaPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketAreaPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ContentAreaPreferences"&gt;
 *       &lt;attribute name="StoreDialogsBarLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketAreaPreferences")
public class BasketAreaPreferences
    extends ContentAreaPreferences
{

    @XmlAttribute(name = "StoreDialogsBarLocked")
    protected Boolean storeDialogsBarLocked;

    /**
     * Gets the value of the storeDialogsBarLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStoreDialogsBarLocked() {
        if (storeDialogsBarLocked == null) {
            return false;
        } else {
            return storeDialogsBarLocked;
        }
    }

    /**
     * Sets the value of the storeDialogsBarLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreDialogsBarLocked(Boolean value) {
        this.storeDialogsBarLocked = value;
    }

}
