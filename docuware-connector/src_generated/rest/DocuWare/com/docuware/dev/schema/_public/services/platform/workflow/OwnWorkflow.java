
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A workflow\instance for the initiator of the request.
 * 
 * &lt;p&gt;Java class for OwnWorkflow complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OwnWorkflow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="TakenDecision" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RequestDataDecision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FcGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="WorkflowName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocumentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnWorkflow", propOrder = {
    "links",
    "takenDecision"
})
public class OwnWorkflow {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * List of confirmed requests.
     * 
     */
    @XmlElement(name = "TakenDecision")
    protected List<RequestDataDecision> takenDecision;
    /**
     * Identifier of the request (instance id) .
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Document id which is used for start of the request.
     * 
     */
    @XmlAttribute(name = "DocId", required = true)
    protected int docId;
    /**
     * File cabinet id of the document.
     * 
     */
    @XmlAttribute(name = "FcGuid", required = true)
    protected String fcGuid;
    /**
     * Creation date of the request.
     * 
     */
    @XmlAttribute(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    /**
     * Name of the request.
     * 
     */
    @XmlAttribute(name = "WorkflowName", required = true)
    protected String workflowName;
    /**
     * Name of the document.
     * 
     */
    @XmlAttribute(name = "DocumentName", required = true)
    protected String documentName;

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * List of confirmed requests.
     * 
     * Gets the value of the takenDecision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the takenDecision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTakenDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDataDecision }
     * </p>
     * 
     * 
     * @return
     *     The value of the takenDecision property.
     */
    public List<RequestDataDecision> getTakenDecision() {
        if (takenDecision == null) {
            takenDecision = new ArrayList<>();
        }
        return this.takenDecision;
    }

    /**
     * Identifier of the request (instance id) .
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Document id which is used for start of the request.
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
     * File cabinet id of the document.
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
     * Creation date of the request.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateDate()
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Name of the request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Sets the value of the workflowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkflowName()
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
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

}
