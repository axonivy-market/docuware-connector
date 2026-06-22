
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * User details.
 * 
 * &lt;p&gt;Java class for NewUser complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="NewUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DbName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Email" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NetworkId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewUser")
public class NewUser {

    /**
     * The Name of the user.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * The Database Name of the user.
     * 
     */
    @XmlAttribute(name = "DbName", required = true)
    protected String dbName;
    /**
     * The Email of the user.
     * 
     */
    @XmlAttribute(name = "Email")
    protected String email;
    /**
     * The NetworkId of the user.
     * 
     */
    @XmlAttribute(name = "NetworkId")
    protected String networkId;
    /**
     * The Password of the user.
     * 
     */
    @XmlAttribute(name = "Password", required = true)
    protected String password;

    /**
     * The Name of the user.
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
     * The Database Name of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDbName()
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**
     * The Email of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmail()
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * The NetworkId of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNetworkId()
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * The Password of the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
