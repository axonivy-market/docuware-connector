
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a list of audit event properties.
 * 
 * &lt;p&gt;Java class for DocumentAuditEventInformation complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentAuditEventInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentAuditEventProperties" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAuditEventProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocumentAuditEventTableProperties" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAuditEventTableProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAuditEventInformation", propOrder = {
    "documentAuditEventProperties",
    "documentAuditEventTableProperties"
})
public class DocumentAuditEventInformation {

    /**
     * Gets or sets the list of audit event properties.
     * 
     */
    @XmlElement(name = "DocumentAuditEventProperties")
    protected List<DocumentAuditEventProperty> documentAuditEventProperties;
    /**
     * Gets or sets the list of audit event table properties.
     * 
     */
    @XmlElement(name = "DocumentAuditEventTableProperties")
    protected List<DocumentAuditEventTableProperty> documentAuditEventTableProperties;

    /**
     * Gets or sets the list of audit event properties.
     * 
     * Gets the value of the documentAuditEventProperties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentAuditEventProperties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentAuditEventProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAuditEventProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentAuditEventProperties property.
     */
    public List<DocumentAuditEventProperty> getDocumentAuditEventProperties() {
        if (documentAuditEventProperties == null) {
            documentAuditEventProperties = new ArrayList<>();
        }
        return this.documentAuditEventProperties;
    }

    /**
     * Gets or sets the list of audit event table properties.
     * 
     * Gets the value of the documentAuditEventTableProperties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentAuditEventTableProperties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentAuditEventTableProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAuditEventTableProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentAuditEventTableProperties property.
     */
    public List<DocumentAuditEventTableProperty> getDocumentAuditEventTableProperties() {
        if (documentAuditEventTableProperties == null) {
            documentAuditEventTableProperties = new ArrayList<>();
        }
        return this.documentAuditEventTableProperties;
    }

}
