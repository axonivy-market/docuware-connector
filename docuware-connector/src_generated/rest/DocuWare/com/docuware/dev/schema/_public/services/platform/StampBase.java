
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Stamp base type. Inherited by 3 types: TextStamp, BitmapStamp, PolyLineStamp
 * 
 * &lt;p&gt;Java class for StampBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationRectangle"/&gt;
 *         &lt;element name="HeadFont" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Signature" type="{http://dev.docuware.com/schema/public/services/platform}StampSignatureType" default="No" /&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Frame" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ShowUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ShowDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ShowTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="SigScopeInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampBase", propOrder = {
    "location",
    "headFont"
})
@XmlSeeAlso({
    TextStampEntry.class,
    BitmapStampEntry.class,
    PolyLineStampEntry.class
})
public class StampBase
    extends EntryBase
{

    /**
     * Location of the stamp.
     * 
     */
    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    /**
     * Font of the header of the stamp.
     * 
     */
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    /**
     * Define the sigiture of the stamp.
     * 
     */
    @XmlAttribute(name = "Signature")
    protected StampSignatureType signature;
    /**
     * Full user name of the person that has set the stamp.
     * 
     */
    @XmlAttribute(name = "UserName")
    protected String userName;
    /**
     * Define if stamp is visible.
     * 
     */
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    /**
     * Define if stamp has visible frame.
     * 
     */
    @XmlAttribute(name = "Frame")
    protected Boolean frame;
    /**
     * Define if stamp show the user who placed the stamp.
     * 
     */
    @XmlAttribute(name = "ShowUser")
    protected Boolean showUser;
    /**
     * Define if stamp show date when stamp is placed.
     * 
     */
    @XmlAttribute(name = "ShowDate")
    protected Boolean showDate;
    /**
     * Define if stamp show the time when stamp is placed.
     * 
     */
    @XmlAttribute(name = "ShowTime")
    protected Boolean showTime;
    /**
     * Signature scope. Describes what is signed with this stamp.
     * 
     */
    @XmlAttribute(name = "SigScopeInfo")
    protected String sigScopeInfo;

    /**
     * Location of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationRectangle }
     *     
     */
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationRectangle }
     *     
     * @see #getLocation()
     */
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }

    /**
     * Font of the header of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getHeadFont() {
        return headFont;
    }

    /**
     * Sets the value of the headFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     * @see #getHeadFont()
     */
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    /**
     * Define the sigiture of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link StampSignatureType }
     *     
     */
    public StampSignatureType getSignature() {
        if (signature == null) {
            return StampSignatureType.NO;
        } else {
            return signature;
        }
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampSignatureType }
     *     
     * @see #getSignature()
     */
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**
     * Full user name of the person that has set the stamp.
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

    /**
     * Define if stamp is visible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVisible()
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Define if stamp has visible frame.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFrame() {
        if (frame == null) {
            return true;
        } else {
            return frame;
        }
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFrame()
     */
    public void setFrame(Boolean value) {
        this.frame = value;
    }

    /**
     * Define if stamp show the user who placed the stamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowUser() {
        if (showUser == null) {
            return true;
        } else {
            return showUser;
        }
    }

    /**
     * Sets the value of the showUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowUser()
     */
    public void setShowUser(Boolean value) {
        this.showUser = value;
    }

    /**
     * Define if stamp show date when stamp is placed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowDate() {
        if (showDate == null) {
            return true;
        } else {
            return showDate;
        }
    }

    /**
     * Sets the value of the showDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowDate()
     */
    public void setShowDate(Boolean value) {
        this.showDate = value;
    }

    /**
     * Define if stamp show the time when stamp is placed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowTime() {
        if (showTime == null) {
            return true;
        } else {
            return showTime;
        }
    }

    /**
     * Sets the value of the showTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowTime()
     */
    public void setShowTime(Boolean value) {
        this.showTime = value;
    }

    /**
     * Signature scope. Describes what is signed with this stamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigScopeInfo() {
        return sigScopeInfo;
    }

    /**
     * Sets the value of the sigScopeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSigScopeInfo()
     */
    public void setSigScopeInfo(String value) {
        this.sigScopeInfo = value;
    }

}
