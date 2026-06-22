
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExportQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExportQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Settings" type="{http://dev.docuware.com/schema/public/services/platform}ExportSettings"/&gt;
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportQuery", propOrder = {
    "settings",
    "source"
})
public class ExportQuery {

    /**
     * The id of the dialog to be used to update fields which are hidden inside the store dialog.
     * 
     */
    @XmlElement(name = "Settings", required = true)
    protected ExportSettings settings;
    /**
     * The documents query that is executed.
     * 
     */
    @XmlElement(name = "Source", required = true)
    protected DocumentsQuery source;

    /**
     * The id of the dialog to be used to update fields which are hidden inside the store dialog.
     * 
     * @return
     *     possible object is
     *     {@link ExportSettings }
     *     
     */
    public ExportSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSettings }
     *     
     * @see #getSettings()
     */
    public void setSettings(ExportSettings value) {
        this.settings = value;
    }

    /**
     * The documents query that is executed.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQuery }
     *     
     */
    public DocumentsQuery getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQuery }
     *     
     * @see #getSource()
     */
    public void setSource(DocumentsQuery value) {
        this.source = value;
    }

}
