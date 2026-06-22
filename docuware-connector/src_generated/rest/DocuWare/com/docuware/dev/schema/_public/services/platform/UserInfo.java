
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to a user
 * 
 * &lt;p&gt;Java class for UserInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UserInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="User" type="{http://dev.docuware.com/schema/public/services/platform}User"/&gt;
 *         &lt;element name="LoginInfo" type="{http://dev.docuware.com/schema/public/services/platform}LoginInfo"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "user",
    "loginInfo",
    "links"
})
public class UserInfo {

    /**
     * User details and settings
     * 
     */
    @XmlElement(name = "User", required = true)
    protected User user;
    /**
     * Details about user login
     * 
     */
    @XmlElement(name = "LoginInfo", required = true)
    protected LoginInfo loginInfo;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * User details and settings
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     * @see #getUser()
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Details about user login
     * 
     * @return
     *     possible object is
     *     {@link LoginInfo }
     *     
     */
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the value of the loginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginInfo }
     *     
     * @see #getLoginInfo()
     */
    public void setLoginInfo(LoginInfo value) {
        this.loginInfo = value;
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

}
