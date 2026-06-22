
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Models a DocuWare content merge operation.
 * 
 * &lt;p&gt;Java class for ContentMergeOperationInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ContentMergeOperationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ContentMergeOperation" /&gt;
 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMergeOperationInfo", propOrder = {
    "documents"
})
public class ContentMergeOperationInfo {

    /**
     * Collection of documents to be used in the operation
     * 
     */
    @XmlElement(name = "Documents", type = Integer.class)
    protected List<Integer> documents;
    /**
     * Operation that have to be executed.
     * 
     */
    @XmlAttribute(name = "Operation", required = true)
    protected ContentMergeOperation operation;
    /**
     * Force merge operation even if possible loss of data
     * 
     */
    @XmlAttribute(name = "Force")
    protected Boolean force;

    /**
     * Collection of documents to be used in the operation
     * 
     * Gets the value of the documents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocuments().add(newItem);
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
     *     The value of the documents property.
     */
    public List<Integer> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<>();
        }
        return this.documents;
    }

    /**
     * Operation that have to be executed.
     * 
     * @return
     *     possible object is
     *     {@link ContentMergeOperation }
     *     
     */
    public ContentMergeOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMergeOperation }
     *     
     * @see #getOperation()
     */
    public void setOperation(ContentMergeOperation value) {
        this.operation = value;
    }

    /**
     * Force merge operation even if possible loss of data
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForce() {
        if (force == null) {
            return false;
        } else {
            return force;
        }
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isForce()
     */
    public void setForce(Boolean value) {
        this.force = value;
    }

}
