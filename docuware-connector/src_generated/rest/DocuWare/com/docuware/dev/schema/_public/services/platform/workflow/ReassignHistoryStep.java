
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Reassign operation.
 * 
 * &lt;p&gt;Java class for ReassignHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ReassignHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientsName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SendMail" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReassignHistoryStep", propOrder = {
    "recipientsName"
})
public class ReassignHistoryStep {

    /**
     * List of names of the new assigned users.
     * 
     */
    @XmlElement(name = "RecipientsName")
    protected List<String> recipientsName;
    /**
     * Subject of the email
     * 
     */
    @XmlAttribute(name = "Subject")
    protected String subject;
    /**
     * Determines whether emails are sent to the new assigned users.
     * 
     */
    @XmlAttribute(name = "SendMail", required = true)
    protected boolean sendMail;
    /**
     * Name of the user who reassigned the task.
     * 
     */
    @XmlAttribute(name = "UserName")
    protected String userName;

    /**
     * List of names of the new assigned users.
     * 
     * Gets the value of the recipientsName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recipientsName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecipientsName().add(newItem);
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
     *     The value of the recipientsName property.
     */
    public List<String> getRecipientsName() {
        if (recipientsName == null) {
            recipientsName = new ArrayList<>();
        }
        return this.recipientsName;
    }

    /**
     * Subject of the email
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
     * Determines whether emails are sent to the new assigned users.
     * 
     */
    public boolean isSendMail() {
        return sendMail;
    }

    /**
     * Sets the value of the sendMail property.
     * 
     */
    public void setSendMail(boolean value) {
        this.sendMail = value;
    }

    /**
     * Name of the user who reassigned the task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUserName()
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
