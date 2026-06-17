
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldMappings" type="{http://dev.docuware.com/schema/public/services/platform}FieldMappings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SynchronizationOperation" type="{http://dev.docuware.com/schema/public/services/platform}SynchronizationOperation" default="Add" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="PreserveSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ImportNotMappedFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SynchronizeFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSettings", propOrder = {
    "fieldMappings"
})
public class SynchronizationSettings {

    @XmlElement(name = "FieldMappings")
    protected FieldMappings fieldMappings;
    @XmlAttribute(name = "SynchronizationOperation")
    protected SynchronizationOperation synchronizationOperation;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;
    @XmlAttribute(name = "ImportNotMappedFields")
    protected Boolean importNotMappedFields;
    @XmlAttribute(name = "SynchronizeFiles")
    protected Boolean synchronizeFiles;

    /**
     * Gets the value of the fieldMappings property.
     * 
     * @return
     *     possible object is
     *     {@link FieldMappings }
     *     
     */
    public FieldMappings getFieldMappings() {
        return fieldMappings;
    }

    /**
     * Sets the value of the fieldMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMappings }
     *     
     */
    public void setFieldMappings(FieldMappings value) {
        this.fieldMappings = value;
    }

    /**
     * Gets the value of the synchronizationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationOperation }
     *     
     */
    public SynchronizationOperation getSynchronizationOperation() {
        if (synchronizationOperation == null) {
            return SynchronizationOperation.ADD;
        } else {
            return synchronizationOperation;
        }
    }

    /**
     * Sets the value of the synchronizationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationOperation }
     *     
     */
    public void setSynchronizationOperation(SynchronizationOperation value) {
        this.synchronizationOperation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the preserveSystemFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreserveSystemFields() {
        if (preserveSystemFields == null) {
            return false;
        } else {
            return preserveSystemFields;
        }
    }

    /**
     * Sets the value of the preserveSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

    /**
     * Gets the value of the importNotMappedFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isImportNotMappedFields() {
        if (importNotMappedFields == null) {
            return false;
        } else {
            return importNotMappedFields;
        }
    }

    /**
     * Sets the value of the importNotMappedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportNotMappedFields(Boolean value) {
        this.importNotMappedFields = value;
    }

    /**
     * Gets the value of the synchronizeFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSynchronizeFiles() {
        if (synchronizeFiles == null) {
            return true;
        } else {
            return synchronizeFiles;
        }
    }

    /**
     * Sets the value of the synchronizeFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronizeFiles(Boolean value) {
        this.synchronizeFiles = value;
    }

}
