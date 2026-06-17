
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data to reassign a task.
 * 
 * <p>Java class for ReassignmentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReassignmentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReassignmentList" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Body" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SendEmail" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReassignmentData", propOrder = {
    "reassignmentList"
})
public class ReassignmentData {

    @XmlElement(name = "ReassignmentList")
    protected List<AssignedItem> reassignmentList;
    @XmlAttribute(name = "Subject")
    protected String subject;
    @XmlAttribute(name = "Body")
    protected String body;
    @XmlAttribute(name = "SendEmail", required = true)
    protected boolean sendEmail;

    /**
     * Gets the value of the reassignmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reassignmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReassignmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedItem }
     * 
     * 
     */
    public List<AssignedItem> getReassignmentList() {
        if (reassignmentList == null) {
            reassignmentList = new ArrayList<AssignedItem>();
        }
        return this.reassignmentList;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     */
    public boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     */
    public void setSendEmail(boolean value) {
        this.sendEmail = value;
    }

}
