
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FileCabinetTransferInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinetTransferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceDocId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SourceFileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "FileCabinetTransferInfo", propOrder = {
    "sourceDocId"
})
public class FileCabinetTransferInfo {

    /**
     * Contains the identifiers of the documents to be copied/moved.
     * 
     */
    @XmlElement(name = "SourceDocId", type = Integer.class)
    protected List<Integer> sourceDocId;
    /**
     * Gets the id of the file cabinet which contains the document to be copied/moved.
     * 
     */
    @XmlAttribute(name = "SourceFileCabinetId", required = true)
    protected String sourceFileCabinetId;
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
     * Contains the identifiers of the documents to be copied/moved.
     * 
     * Gets the value of the sourceDocId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sourceDocId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSourceDocId().add(newItem);
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
     *     The value of the sourceDocId property.
     */
    public List<Integer> getSourceDocId() {
        if (sourceDocId == null) {
            sourceDocId = new ArrayList<>();
        }
        return this.sourceDocId;
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

}
