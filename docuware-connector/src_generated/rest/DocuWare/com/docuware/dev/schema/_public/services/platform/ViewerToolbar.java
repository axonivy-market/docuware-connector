
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ViewerToolbar complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ViewerToolbar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Controls" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ToolbarControl" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarControl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarType" /&gt;
 *       &lt;attribute name="Position" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarPosition" /&gt;
 *       &lt;attribute name="Visibility" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbar", propOrder = {
    "controls"
})
public class ViewerToolbar {

    @XmlElement(name = "Controls")
    protected ViewerToolbar.Controls controls;
    @XmlAttribute(name = "Type", required = true)
    protected ViewerToolbarType type;
    @XmlAttribute(name = "Position", required = true)
    protected ToolbarPosition position;
    @XmlAttribute(name = "Visibility", required = true)
    protected ToolbarVisibility visibility;

    /**
     * Gets the value of the controls property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerToolbar.Controls }
     *     
     */
    public ViewerToolbar.Controls getControls() {
        return controls;
    }

    /**
     * Sets the value of the controls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerToolbar.Controls }
     *     
     */
    public void setControls(ViewerToolbar.Controls value) {
        this.controls = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerToolbarType }
     *     
     */
    public ViewerToolbarType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerToolbarType }
     *     
     */
    public void setType(ViewerToolbarType value) {
        this.type = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarPosition }
     *     
     */
    public ToolbarPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarPosition }
     *     
     */
    public void setPosition(ToolbarPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setVisibility(ToolbarVisibility value) {
        this.visibility = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ToolbarControl" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarControl" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toolbarControl"
    })
    public static class Controls {

        @XmlElement(name = "ToolbarControl")
        protected List<ViewerToolbarControl> toolbarControl;

        /**
         * Gets the value of the toolbarControl property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the toolbarControl property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getToolbarControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewerToolbarControl }
         * </p>
         * 
         * 
         * @return
         *     The value of the toolbarControl property.
         */
        public List<ViewerToolbarControl> getToolbarControl() {
            if (toolbarControl == null) {
                toolbarControl = new ArrayList<>();
            }
            return this.toolbarControl;
        }

    }

}
