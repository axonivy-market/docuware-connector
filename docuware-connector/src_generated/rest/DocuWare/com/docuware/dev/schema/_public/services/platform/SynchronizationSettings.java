
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SynchronizationSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSettings", propOrder = {
    "fieldMappings"
})
public class SynchronizationSettings {

    /**
     * Gets or sets field mappings.
     * 
     */
    @XmlElement(name = "FieldMappings")
    protected FieldMappings fieldMappings;
    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
     * 
     */
    @XmlAttribute(name = "SynchronizationOperation")
    protected SynchronizationOperation synchronizationOperation;
    /**
     * Document identity
     * 
     */
    @XmlAttribute(name = "Id")
    protected Integer id;
    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
     * 
     */
    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;
    /**
     * Gets or sets a value indicating whether the fields which do not have mapping to be imported. If they are imported they will be imported with the same name.
     * 
     */
    @XmlAttribute(name = "ImportNotMappedFields")
    protected Boolean importNotMappedFields;
    /**
     * Gets or sets a value indicating whether it is necessary to synchronize the files.
     * 
     */
    @XmlAttribute(name = "SynchronizeFiles")
    protected Boolean synchronizeFiles;

    /**
     * Gets or sets field mappings.
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
     * @see #getFieldMappings()
     */
    public void setFieldMappings(FieldMappings value) {
        this.fieldMappings = value;
    }

    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
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
     * @see #getSynchronizationOperation()
     */
    public void setSynchronizationOperation(SynchronizationOperation value) {
        this.synchronizationOperation = value;
    }

    /**
     * Document identity
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
     * @see #getId()
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets or sets a value indicating whether the document' system fields to be replaced.
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
     * @see #isPreserveSystemFields()
     */
    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

    /**
     * Gets or sets a value indicating whether the fields which do not have mapping to be imported. If they are imported they will be imported with the same name.
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
     * @see #isImportNotMappedFields()
     */
    public void setImportNotMappedFields(Boolean value) {
        this.importNotMappedFields = value;
    }

    /**
     * Gets or sets a value indicating whether it is necessary to synchronize the files.
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
     * @see #isSynchronizeFiles()
     */
    public void setSynchronizeFiles(Boolean value) {
        this.synchronizeFiles = value;
    }

}
