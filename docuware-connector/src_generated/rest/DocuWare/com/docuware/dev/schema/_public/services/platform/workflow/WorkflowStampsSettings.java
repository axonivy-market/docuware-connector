
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.platform.Font;


/**
 * Stamp settings for a task.
 * 
 * <p>Java class for WorkflowStampsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowStampsSettings", propOrder = {
    "infoFontFamily",
    "stampFont"
})
public class WorkflowStampsSettings {

    @XmlElement(name = "InfoFontFamily", required = true)
    protected Font infoFontFamily;
    @XmlElement(name = "StampFont", required = true)
    protected Font stampFont;
    @XmlAttribute(name = "UseFrame", required = true)
    protected boolean useFrame;
    @XmlAttribute(name = "UseDate", required = true)
    protected boolean useDate;
    @XmlAttribute(name = "UseTime", required = true)
    protected boolean useTime;
    @XmlAttribute(name = "IsSignature", required = true)
    protected boolean isSignature;
    @XmlAttribute(name = "UseUserName", required = true)
    protected boolean useUserName;
    @XmlAttribute(name = "UseDecisionName", required = true)
    protected boolean useDecisionName;
    @XmlAttribute(name = "UseActivityName", required = true)
    protected boolean useActivityName;

    /**
     * Gets the value of the infoFontFamily property.
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
     */
    public void setInfoFontFamily(Font value) {
        this.infoFontFamily = value;
    }

    /**
     * Gets the value of the stampFont property.
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
     */
    public void setStampFont(Font value) {
        this.stampFont = value;
    }

    /**
     * Gets the value of the useFrame property.
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
     * Gets the value of the useDate property.
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
     * Gets the value of the useTime property.
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
     * Gets the value of the isSignature property.
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
     * Gets the value of the useUserName property.
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
     * Gets the value of the useDecisionName property.
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
     * Gets the value of the useActivityName property.
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
