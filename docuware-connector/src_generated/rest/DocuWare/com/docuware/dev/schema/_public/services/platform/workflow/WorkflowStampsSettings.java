
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.platform.Font;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Stamp settings for a task.
 * 
 * &lt;p&gt;Java class for WorkflowStampsSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WorkflowStampsSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfoFontFamily" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *         &lt;element name="StampFont" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UseFrame" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseTime" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsSignature" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseUserName" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseDecisionName" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseActivityName" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowStampsSettings", propOrder = {
    "infoFontFamily",
    "stampFont"
})
public class WorkflowStampsSettings {

    /**
     * Specify the font of the header of the stamp.
     * 
     */
    @XmlElement(name = "InfoFontFamily", required = true)
    protected Font infoFontFamily;
    /**
     * Specify the font of the text.
     * 
     */
    @XmlElement(name = "StampFont", required = true)
    protected Font stampFont;
    /**
     * Indicates whether the stamp has visible frame.
     * 
     */
    @XmlAttribute(name = "UseFrame", required = true)
    protected boolean useFrame;
    /**
     * Indicates whether the stamp shows date when stamp is placed.
     * 
     */
    @XmlAttribute(name = "UseDate", required = true)
    protected boolean useDate;
    /**
     * Indicates whether the stamp shows the time when stamp is placed.
     * 
     */
    @XmlAttribute(name = "UseTime", required = true)
    protected boolean useTime;
    /**
     * Indicates whether the signature will be used for the stamp.
     * 
     */
    @XmlAttribute(name = "IsSignature", required = true)
    protected boolean isSignature;
    /**
     * Indicates whether stamp shows the user who placed the stamp.
     * 
     */
    @XmlAttribute(name = "UseUserName", required = true)
    protected boolean useUserName;
    /**
     * Indicates whether the stamp contains the decision name.
     * 
     */
    @XmlAttribute(name = "UseDecisionName", required = true)
    protected boolean useDecisionName;
    /**
     * Indicates whether the stamp contains the activity name.
     * 
     */
    @XmlAttribute(name = "UseActivityName", required = true)
    protected boolean useActivityName;

    /**
     * Specify the font of the header of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getInfoFontFamily() {
        return infoFontFamily;
    }

    /**
     * Sets the value of the infoFontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     * @see #getInfoFontFamily()
     */
    public void setInfoFontFamily(Font value) {
        this.infoFontFamily = value;
    }

    /**
     * Specify the font of the text.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getStampFont() {
        return stampFont;
    }

    /**
     * Sets the value of the stampFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     * @see #getStampFont()
     */
    public void setStampFont(Font value) {
        this.stampFont = value;
    }

    /**
     * Indicates whether the stamp has visible frame.
     * 
     */
    public boolean isUseFrame() {
        return useFrame;
    }

    /**
     * Sets the value of the useFrame property.
     * 
     */
    public void setUseFrame(boolean value) {
        this.useFrame = value;
    }

    /**
     * Indicates whether the stamp shows date when stamp is placed.
     * 
     */
    public boolean isUseDate() {
        return useDate;
    }

    /**
     * Sets the value of the useDate property.
     * 
     */
    public void setUseDate(boolean value) {
        this.useDate = value;
    }

    /**
     * Indicates whether the stamp shows the time when stamp is placed.
     * 
     */
    public boolean isUseTime() {
        return useTime;
    }

    /**
     * Sets the value of the useTime property.
     * 
     */
    public void setUseTime(boolean value) {
        this.useTime = value;
    }

    /**
     * Indicates whether the signature will be used for the stamp.
     * 
     */
    public boolean isIsSignature() {
        return isSignature;
    }

    /**
     * Sets the value of the isSignature property.
     * 
     */
    public void setIsSignature(boolean value) {
        this.isSignature = value;
    }

    /**
     * Indicates whether stamp shows the user who placed the stamp.
     * 
     */
    public boolean isUseUserName() {
        return useUserName;
    }

    /**
     * Sets the value of the useUserName property.
     * 
     */
    public void setUseUserName(boolean value) {
        this.useUserName = value;
    }

    /**
     * Indicates whether the stamp contains the decision name.
     * 
     */
    public boolean isUseDecisionName() {
        return useDecisionName;
    }

    /**
     * Sets the value of the useDecisionName property.
     * 
     */
    public void setUseDecisionName(boolean value) {
        this.useDecisionName = value;
    }

    /**
     * Indicates whether the stamp contains the activity name.
     * 
     */
    public boolean isUseActivityName() {
        return useActivityName;
    }

    /**
     * Sets the value of the useActivityName property.
     * 
     */
    public void setUseActivityName(boolean value) {
        this.useActivityName = value;
    }

}
