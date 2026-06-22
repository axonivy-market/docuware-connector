
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Function of result list
 * 
 * &lt;p&gt;Java class for ResultDialogFunction complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ResultDialogFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ResultDialogFunctionType" /&gt;
 *       &lt;attribute name="InToolBar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AsButton" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDialogFunction")
public class ResultDialogFunction {

    /**
     * The type of the result dialog function.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected ResultDialogFunctionType type;
    /**
     * If this option is enabled, the result list contains an icon you can use to access the function
     * 
     */
    @XmlAttribute(name = "InToolBar")
    protected Boolean inToolBar;
    /**
     * If this option is enabled, the result list contains a button with which to call the function
     * 
     */
    @XmlAttribute(name = "AsButton")
    protected Boolean asButton;

    /**
     * The type of the result dialog function.
     * 
     * @return
     *     possible object is
     *     {@link ResultDialogFunctionType }
     *     
     */
    public ResultDialogFunctionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDialogFunctionType }
     *     
     * @see #getType()
     */
    public void setType(ResultDialogFunctionType value) {
        this.type = value;
    }

    /**
     * If this option is enabled, the result list contains an icon you can use to access the function
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInToolBar() {
        if (inToolBar == null) {
            return false;
        } else {
            return inToolBar;
        }
    }

    /**
     * Sets the value of the inToolBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInToolBar()
     */
    public void setInToolBar(Boolean value) {
        this.inToolBar = value;
    }

    /**
     * If this option is enabled, the result list contains a button with which to call the function
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAsButton() {
        if (asButton == null) {
            return false;
        } else {
            return asButton;
        }
    }

    /**
     * Sets the value of the asButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAsButton()
     */
    public void setAsButton(Boolean value) {
        this.asButton = value;
    }

}
