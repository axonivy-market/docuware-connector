
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BatchUpdateProcessData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BatchUpdateProcessData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StoreDialogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BreakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateProcessData", propOrder = {
    "field",
    "storeDialogId",
    "batchSize",
    "breakOnError"
})
public class BatchUpdateProcessData {

    /**
     * The fields which are updated.
     * 
     */
    @XmlElement(name = "Field")
    protected List<DocumentIndexField> field;
    /**
     * Ignore this field if the update is not triggered by a dialog.
     * 
     */
    @XmlElement(name = "StoreDialogId")
    protected String storeDialogId;
    /**
     * If the value is missing then the server decides the size of chunks. The server might choose a different chunk size than requested by this property.
     * 
     */
    @XmlElement(name = "BatchSize", required = true, type = Integer.class, nillable = true)
    protected Integer batchSize;
    /**
     * If this attribute is set to 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:common="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;true&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then the update is stopped on the first document which fails to be updated.
     * 
     */
    @XmlElement(name = "BreakOnError", defaultValue = "true")
    protected boolean breakOnError;

    /**
     * The fields which are updated.
     * 
     * Gets the value of the field property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the field property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexField }
     * </p>
     * 
     * 
     * @return
     *     The value of the field property.
     */
    public List<DocumentIndexField> getField() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
    }

    /**
     * Ignore this field if the update is not triggered by a dialog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDialogId() {
        return storeDialogId;
    }

    /**
     * Sets the value of the storeDialogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStoreDialogId()
     */
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
    }

    /**
     * If the value is missing then the server decides the size of chunks. The server might choose a different chunk size than requested by this property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getBatchSize()
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * If this attribute is set to 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:common="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;true&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then the update is stopped on the first document which fails to be updated.
     * 
     */
    public boolean isBreakOnError() {
        return breakOnError;
    }

    /**
     * Sets the value of the breakOnError property.
     * 
     */
    public void setBreakOnError(boolean value) {
        this.breakOnError = value;
    }

}
