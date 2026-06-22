
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data to reassign a task.
 * 
 * &lt;p&gt;Java class for ReassignmentData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReassignmentData", propOrder = {
    "reassignmentList"
})
public class ReassignmentData {

    /**
     * List of next assigned users, roles or substitution rules.
     * 
     */
    @XmlElement(name = "ReassignmentList")
    protected List<AssignedItem> reassignmentList;
    /**
     * Subject of the email which will be send to the new assigned users.
     * 
     */
    @XmlAttribute(name = "Subject")
    protected String subject;
    /**
     * Body of the email which will be send to the new assigned users.
     * 
     */
    @XmlAttribute(name = "Body")
    protected String body;
    /**
     * Determines whether an email will be send to the new assigned users.
     * 
     */
    @XmlAttribute(name = "SendEmail", required = true)
    protected boolean sendEmail;

    /**
     * List of next assigned users, roles or substitution rules.
     * 
     * Gets the value of the reassignmentList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reassignmentList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReassignmentList().add(newItem);
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
     *     The value of the reassignmentList property.
     */
    public List<AssignedItem> getReassignmentList() {
        if (reassignmentList == null) {
            reassignmentList = new ArrayList<>();
        }
        return this.reassignmentList;
    }

    /**
     * Subject of the email which will be send to the new assigned users.
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
     * @see #getSubject()
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Body of the email which will be send to the new assigned users.
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
     * @see #getBody()
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Determines whether an email will be send to the new assigned users.
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
