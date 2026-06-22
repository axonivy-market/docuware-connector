
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Event activity.
 * 
 * &lt;p&gt;Java class for EventHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="EventHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FCName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventHistoryStep")
public class EventHistoryStep {

    /**
     * Name of the file cabinet in which the event activity waits in.
     * 
     */
    @XmlAttribute(name = "FCName")
    protected String fcName;
    /**
     * Document Id that caused the event activity to trigger.
     * 
     */
    @XmlAttribute(name = "DocId")
    protected String docId;
    /**
     * Status of the event activity.
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Name of the file cabinet in which the event activity waits in.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCName() {
        return fcName;
    }

    /**
     * Sets the value of the fcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFCName()
     */
    public void setFCName(String value) {
        this.fcName = value;
    }

    /**
     * Document Id that caused the event activity to trigger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocId()
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Status of the event activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
