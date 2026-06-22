
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base class for web form fields
 * 
 * &lt;p&gt;Java class for WebFormControl complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WebFormControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Position" type="{http://dev.docuware.com/schema/public/services/platform}Position"/&gt;
 *         &lt;element name="BehaviorID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormControl", propOrder = {
    "id",
    "label",
    "position",
    "behaviorID"
})
@XmlSeeAlso({
    WebFormField.class
})
public abstract class WebFormControl {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Position", required = true)
    protected Position position;
    @XmlElement(name = "BehaviorID", required = true)
    protected String behaviorID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the behaviorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehaviorID() {
        return behaviorID;
    }

    /**
     * Sets the value of the behaviorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehaviorID(String value) {
        this.behaviorID = value;
    }

}
