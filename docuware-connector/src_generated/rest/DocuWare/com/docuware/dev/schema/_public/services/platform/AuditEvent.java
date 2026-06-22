
package com.docuware.dev.schema._public.services.platform;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define auditing information property
 * 
 * &lt;p&gt;Java class for AuditEvent complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AuditEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Event" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="User" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent")
public class AuditEvent {

    /**
     * Gets or sets the identity of the auditing event.
     * 
     */
    @XmlAttribute(name = "Id")
    protected String id;
    /**
     * Gets or sets the name of the event.
     * 
     */
    @XmlAttribute(name = "Event")
    protected String event;
    /**
     * Gets or sets the type of the event.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Gets or sets the name of the object that has been changed.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Gets or sets the name of the user who updated the object.
     * 
     */
    @XmlAttribute(name = "User")
    protected String user;
    /**
     * Gets or sets the date and time when the event is happened.
     * 
     */
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets or sets the identity of the auditing event.
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
     * Gets or sets the name of the event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEvent()
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets or sets the type of the event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets or sets the name of the object that has been changed.
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
     * Gets or sets the name of the user who updated the object.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUser()
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets or sets the date and time when the event is happened.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
