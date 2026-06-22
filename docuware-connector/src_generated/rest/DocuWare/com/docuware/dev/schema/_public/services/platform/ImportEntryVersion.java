
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the result of the imported archive.
 * 
 * &lt;p&gt;Java class for ImportEntryVersion complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImportEntryVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Status" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ImportEntryVersionStatus" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportEntryVersion")
public class ImportEntryVersion {

    /**
     * Gets or sets the error message if the import operation fails.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected int id;
    /**
     * Gets or sets the status of the document.
     * 
     */
    @XmlAttribute(name = "Status", required = true)
    protected ImportEntryVersionStatus status;

    /**
     * Gets or sets the error message if the import operation fails.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets or sets the status of the document.
     * 
     * @return
     *     possible object is
     *     {@link ImportEntryVersionStatus }
     *     
     */
    public ImportEntryVersionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportEntryVersionStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(ImportEntryVersionStatus value) {
        this.status = value;
    }

}
