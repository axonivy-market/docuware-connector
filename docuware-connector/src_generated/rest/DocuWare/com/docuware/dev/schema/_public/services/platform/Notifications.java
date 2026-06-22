
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data stucture for managing notifications.
 * 
 * &lt;p&gt;Java class for Notifications complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Notifications"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notification" type="{http://dev.docuware.com/schema/public/services/platform}Notification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Timeout" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notifications", propOrder = {
    "notification",
    "links"
})
public class Notifications {

    /**
     * Collection of notifications.
     * 
     */
    @XmlElement(name = "Notification")
    protected List<Notification> notification;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Gets or sets the notifications timeout im milliseconds. A positive value lets the server wait for notifications for the specified amount of time. A value of 0 means that the server should respond immediately. A value of -1 indicates that the server should define the timeout.
     * 
     */
    @XmlAttribute(name = "Timeout")
    protected Integer timeout;

    /**
     * Collection of notifications.
     * 
     * Gets the value of the notification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the notification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * </p>
     * 
     * 
     * @return
     *     The value of the notification property.
     */
    public List<Notification> getNotification() {
        if (notification == null) {
            notification = new ArrayList<>();
        }
        return this.notification;
    }

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
     * Gets or sets the notifications timeout im milliseconds. A positive value lets the server wait for notifications for the specified amount of time. A value of 0 means that the server should respond immediately. A value of -1 indicates that the server should define the timeout.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTimeout() {
        if (timeout == null) {
            return -1;
        } else {
            return timeout;
        }
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTimeout()
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

}
