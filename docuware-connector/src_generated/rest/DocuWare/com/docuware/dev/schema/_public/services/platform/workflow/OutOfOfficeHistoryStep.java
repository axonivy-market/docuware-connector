
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Out of office exit.
 * 
 * &lt;p&gt;Java class for OutOfOfficeHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OutOfOfficeHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NewUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OutOfOfficeUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfOfficeHistoryStep")
public class OutOfOfficeHistoryStep {

    /**
     * User name of the new assigned user.
     * 
     */
    @XmlAttribute(name = "NewUser")
    protected String newUser;
    /**
     * User name of the user who went out of office.
     * 
     */
    @XmlAttribute(name = "OutOfOfficeUser")
    protected String outOfOfficeUser;

    /**
     * User name of the new assigned user.
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
     * @see #getNewUser()
     */
    public void setNewUser(String value) {
        this.newUser = value;
    }

    /**
     * User name of the user who went out of office.
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
     * @see #getOutOfOfficeUser()
     */
    public void setOutOfOfficeUser(String value) {
        this.outOfOfficeUser = value;
    }

}
