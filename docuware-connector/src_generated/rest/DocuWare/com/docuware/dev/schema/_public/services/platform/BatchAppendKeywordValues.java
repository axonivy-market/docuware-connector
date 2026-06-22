
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contract for batch append of keywords to multiple documents.
 * 
 * &lt;p&gt;Java class for BatchAppendKeywordValues complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BatchAppendKeywordValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BreakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="StoreDialogId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchAppendKeywordValues", propOrder = {
    "docId",
    "keyword"
})
public class BatchAppendKeywordValues {

    /**
     * The ids of the documents to be updated.
     * 
     */
    @XmlElement(name = "DocId", type = Integer.class)
    protected List<Integer> docId;
    /**
     * The keywords to be appended.
     * 
     */
    @XmlElement(name = "Keyword")
    protected List<String> keyword;
    /**
     * Contains the internal name of the field.
     * 
     */
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    /**
     * If this attribute is set to 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:common="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;true&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then the update is stopped on the first document which fails to be updated.
     * 
     */
    @XmlAttribute(name = "BreakOnError")
    protected Boolean breakOnError;
    /**
     * Ignore this field if the update is not triggered by a dialog.
     * 
     */
    @XmlAttribute(name = "StoreDialogId")
    protected String storeDialogId;

    /**
     * The ids of the documents to be updated.
     * 
     * Gets the value of the docId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the docId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the docId property.
     */
    public List<Integer> getDocId() {
        if (docId == null) {
            docId = new ArrayList<>();
        }
        return this.docId;
    }

    /**
     * The keywords to be appended.
     * 
     * Gets the value of the keyword property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyword property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the keyword property.
     */
    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<>();
        }
        return this.keyword;
    }

    /**
     * Contains the internal name of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * If this attribute is set to 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:common="http://dev.docuware.com/settings/common" xmlns:int="http://dev.docuware.com/settings/interop" xmlns:intellix="http://dev.docuware.com/public/intellix" xmlns:svc="http://dev.docuware.com/schema/public/services" xmlns:t="http://dev.docuware.com/schema/public/services/platform" xmlns:types="http://dev.docuware.com/types" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;true&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  then the update is stopped on the first document which fails to be updated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBreakOnError() {
        if (breakOnError == null) {
            return true;
        } else {
            return breakOnError;
        }
    }

    /**
     * Sets the value of the breakOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBreakOnError()
     */
    public void setBreakOnError(Boolean value) {
        this.breakOnError = value;
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

}
