
package com.docuware.dev.schema._public.services.platform;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines when a user is out of office
 * 
 * &lt;p&gt;Java class for OutOfOffice complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OutOfOffice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IsOutOfOffice" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfOffice")
public class OutOfOffice {

    /**
     * Flag which marks either user is in the office or not.
     * 
     */
    @XmlAttribute(name = "IsOutOfOffice", required = true)
    protected boolean isOutOfOffice;
    /**
     * Start datetime after which user will not be in the office.
     * 
     */
    @XmlAttribute(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    /**
     * Ending datetime after which user will be in the office.If not set user will be out of office for unlimited amount of time.
     * 
     */
    @XmlAttribute(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;

    /**
     * Flag which marks either user is in the office or not.
     * 
     */
    public boolean isIsOutOfOffice() {
        return isOutOfOffice;
    }

    /**
     * Sets the value of the isOutOfOffice property.
     * 
     */
    public void setIsOutOfOffice(boolean value) {
        this.isOutOfOffice = value;
    }

    /**
     * Start datetime after which user will not be in the office.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDateTime()
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Ending datetime after which user will be in the office.If not set user will be out of office for unlimited amount of time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDateTime()
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

}
