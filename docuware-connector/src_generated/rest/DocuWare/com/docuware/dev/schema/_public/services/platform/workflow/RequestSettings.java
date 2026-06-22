
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data to trigger new request.
 * 
 * &lt;p&gt;Java class for RequestSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RequestSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Decisions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RequestDecisionSettings" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AssignedItem" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="IsAny" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DocId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FcGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StampDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSettings", propOrder = {
    "decisions",
    "assignedItem"
})
public class RequestSettings {

    /**
     * List of decision settings.
     * 
     */
    @XmlElement(name = "Decisions", required = true)
    protected List<RequestDecisionSettings> decisions;
    /**
     * List of assigned users, roles or substitution rules.
     * 
     */
    @XmlElement(name = "AssignedItem")
    protected List<AssignedItem> assignedItem;
    /**
     * Name of the request
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Description of the request
     * 
     */
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    /**
     * Determines whether request should be confirmed in sequence.
     * 
     */
    @XmlAttribute(name = "IsSequence")
    protected Boolean isSequence;
    /**
     * Determines whether request should be confirmed by all users.
     * 
     */
    @XmlAttribute(name = "IsAny", required = true)
    protected boolean isAny;
    /**
     * Document id
     * 
     */
    @XmlAttribute(name = "DocId", required = true)
    protected int docId;
    /**
     * Contains file cabinet id of the document.
     * 
     */
    @XmlAttribute(name = "FcGuid", required = true)
    protected String fcGuid;
    /**
     * Name of the document.
     * 
     */
    @XmlAttribute(name = "DocumentName")
    protected String documentName;
    /**
     * Determines whether an automatic stamp should be placed when a user confirms the request.
     * 
     */
    @XmlAttribute(name = "StampDocument", required = true)
    protected boolean stampDocument;

    /**
     * List of decision settings.
     * 
     * Gets the value of the decisions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the decisions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDecisionSettings }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisions property.
     */
    public List<RequestDecisionSettings> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<>();
        }
        return this.decisions;
    }

    /**
     * List of assigned users, roles or substitution rules.
     * 
     * Gets the value of the assignedItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assignedItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssignedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the assignedItem property.
     */
    public List<AssignedItem> getAssignedItem() {
        if (assignedItem == null) {
            assignedItem = new ArrayList<>();
        }
        return this.assignedItem;
    }

    /**
     * Name of the request
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Description of the request
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Determines whether request should be confirmed in sequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSequence() {
        if (isSequence == null) {
            return true;
        } else {
            return isSequence;
        }
    }

    /**
     * Sets the value of the isSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsSequence()
     */
    public void setIsSequence(Boolean value) {
        this.isSequence = value;
    }

    /**
     * Determines whether request should be confirmed by all users.
     * 
     */
    public boolean isIsAny() {
        return isAny;
    }

    /**
     * Sets the value of the isAny property.
     * 
     */
    public void setIsAny(boolean value) {
        this.isAny = value;
    }

    /**
     * Document id
     * 
     */
    public int getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(int value) {
        this.docId = value;
    }

    /**
     * Contains file cabinet id of the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcGuid() {
        return fcGuid;
    }

    /**
     * Sets the value of the fcGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFcGuid()
     */
    public void setFcGuid(String value) {
        this.fcGuid = value;
    }

    /**
     * Name of the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentName()
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Determines whether an automatic stamp should be placed when a user confirms the request.
     * 
     */
    public boolean isStampDocument() {
        return stampDocument;
    }

    /**
     * Sets the value of the stampDocument property.
     * 
     */
    public void setStampDocument(boolean value) {
        this.stampDocument = value;
    }

}
