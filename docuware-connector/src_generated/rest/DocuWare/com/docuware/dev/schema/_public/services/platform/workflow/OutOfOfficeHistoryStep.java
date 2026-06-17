
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A history step for Out of office exit.
 * 
 * <p>Java class for OutOfOfficeHistoryStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutOfOfficeHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NewUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OutOfOfficeUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfOfficeHistoryStep")
public class OutOfOfficeHistoryStep {

    @XmlAttribute(name = "NewUser")
    protected String newUser;
    @XmlAttribute(name = "OutOfOfficeUser")
    protected String outOfOfficeUser;

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUser(String value) {
        this.newUser = value;
    }

    /**
     * Gets the value of the outOfOfficeUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfOfficeUser() {
        return outOfOfficeUser;
    }

    /**
     * Sets the value of the outOfOfficeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfOfficeUser(String value) {
        this.outOfOfficeUser = value;
    }

}
