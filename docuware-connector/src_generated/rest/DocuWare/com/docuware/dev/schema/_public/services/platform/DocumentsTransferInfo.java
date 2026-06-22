
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the parameters of a documents transfer.
 * 
 * &lt;p&gt;Java class for DocumentsTransferInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentsTransferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Document" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SourceFileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UseDefaultDialog" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="KeepSource" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FillIntellix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsTransferInfo", propOrder = {
    "documents"
})
public class DocumentsTransferInfo {

    @XmlElement(name = "Documents", required = true)
    protected DocumentsTransferInfo.Documents documents;
    /**
     * Gets the id of the file cabinet which contains the document to be copied/moved.
     * 
     */
    @XmlAttribute(name = "SourceFileCabinetId", required = true)
    protected String sourceFileCabinetId;
    /**
     * Gets a value indicating whether a default store dialog, if such dialog is assing to the user, to be used.
     * 
     */
    @XmlAttribute(name = "UseDefaultDialog")
    protected Boolean useDefaultDialog;
    /**
     * If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.
     * 
     */
    @XmlAttribute(name = "KeepSource")
    protected Boolean keepSource;
    /**
     * If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.
     * 
     */
    @XmlAttribute(name = "FillIntellix")
    protected Boolean fillIntellix;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsTransferInfo.Documents }
     *     
     */
    public DocumentsTransferInfo.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsTransferInfo.Documents }
     *     
     */
    public void setDocuments(DocumentsTransferInfo.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the id of the file cabinet which contains the document to be copied/moved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFileCabinetId() {
        return sourceFileCabinetId;
    }

    /**
     * Sets the value of the sourceFileCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceFileCabinetId()
     */
    public void setSourceFileCabinetId(String value) {
        this.sourceFileCabinetId = value;
    }

    /**
     * Gets a value indicating whether a default store dialog, if such dialog is assing to the user, to be used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseDefaultDialog() {
        if (useDefaultDialog == null) {
            return false;
        } else {
            return useDefaultDialog;
        }
    }

    /**
     * Sets the value of the useDefaultDialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUseDefaultDialog()
     */
    public void setUseDefaultDialog(Boolean value) {
        this.useDefaultDialog = value;
    }

    /**
     * If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepSource() {
        if (keepSource == null) {
            return false;
        } else {
            return keepSource;
        }
    }

    /**
     * Sets the value of the keepSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeepSource()
     */
    public void setKeepSource(Boolean value) {
        this.keepSource = value;
    }

    /**
     * If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFillIntellix() {
        if (fillIntellix == null) {
            return false;
        } else {
            return fillIntellix;
        }
    }

    /**
     * Sets the value of the fillIntellix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFillIntellix()
     */
    public void setFillIntellix(Boolean value) {
        this.fillIntellix = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Document" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class Documents {

        /**
         * Gets information for the transfered documents (document id, new index entries, etc.). If the new index entries are empty then the original entries from the source document are used. If the document contains any system fields they will not be transfered.
         * 
         */
        @XmlElement(name = "Document")
        protected List<Document> document;

        /**
         * Gets information for the transfered documents (document id, new index entries, etc.). If the new index entries are empty then the original entries from the source document are used. If the document contains any system fields they will not be transfered.
         * 
         * Gets the value of the document property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the document property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document }
         * </p>
         * 
         * 
         * @return
         *     The value of the document property.
         */
        public List<Document> getDocument() {
            if (document == null) {
                document = new ArrayList<>();
            }
            return this.document;
        }

    }

}
