
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the result of the imported archive.
 * 
 * &lt;p&gt;Java class for ImportResultEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImportResultEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryVersions" type="{http://dev.docuware.com/schema/public/services/platform}ImportEntryVersion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Status" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ImportEntryStatus" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResultEntry", propOrder = {
    "entryVersions"
})
public class ImportResultEntry {

    /**
     * A list with the sequence value of the documents that are not imported.
     * 
     */
    @XmlElement(name = "EntryVersions")
    protected List<ImportEntryVersion> entryVersions;
    /**
     * Gets or sets the error message if the import operation fails.
     * 
     */
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    /**
     * Gets or sets the status of the document.
     * 
     */
    @XmlAttribute(name = "Status", required = true)
    protected ImportEntryStatus status;

    /**
     * A list with the sequence value of the documents that are not imported.
     * 
     * Gets the value of the entryVersions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entryVersions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntryVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportEntryVersion }
     * </p>
     * 
     * 
     * @return
     *     The value of the entryVersions property.
     */
    public List<ImportEntryVersion> getEntryVersions() {
        if (entryVersions == null) {
            entryVersions = new ArrayList<>();
        }
        return this.entryVersions;
    }

    /**
     * Gets or sets the error message if the import operation fails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets or sets the status of the document.
     * 
     * @return
     *     possible object is
     *     {@link ImportEntryStatus }
     *     
     */
    public ImportEntryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportEntryStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(ImportEntryStatus value) {
        this.status = value;
    }

}
