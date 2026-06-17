
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationPreferencesHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationPreferencesHolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppPrefs" type="{http://dev.docuware.com/schema/public/services/platform}ApplicationPreferences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationPreferencesHolder", propOrder = {
    "appPrefs"
})
public class ApplicationPreferencesHolder {

    @XmlElement(name = "AppPrefs")
    protected ApplicationPreferences appPrefs;

    /**
     * Gets the value of the appPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPreferences }
     *     
     */
    public ApplicationPreferences getAppPrefs() {
        return appPrefs;
    }

    /**
     * Sets the value of the appPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPreferences }
     *     
     */
    public void setAppPrefs(ApplicationPreferences value) {
        this.appPrefs = value;
    }

}
