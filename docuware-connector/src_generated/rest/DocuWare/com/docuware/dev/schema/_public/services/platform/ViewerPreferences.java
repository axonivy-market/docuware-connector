
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ViewerPreferences complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ViewerPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AnnotationTool" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Toolbars"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Toolbar" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LeftToolbarState" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" /&gt;
 *       &lt;attribute name="RightToolbarState" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" /&gt;
 *       &lt;attribute name="ExpandStatusbar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerPreferences", propOrder = {
    "annotations",
    "toolbars"
})
public class ViewerPreferences {

    @XmlElement(name = "Annotations", required = true)
    protected ViewerPreferences.Annotations annotations;
    @XmlElement(name = "Toolbars", required = true)
    protected ViewerPreferences.Toolbars toolbars;
    /**
     * The ID of the Viewer preferences.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "LeftToolbarState", required = true)
    protected ToolbarVisibility leftToolbarState;
    @XmlAttribute(name = "RightToolbarState", required = true)
    protected ToolbarVisibility rightToolbarState;
    @XmlAttribute(name = "ExpandStatusbar", required = true)
    protected boolean expandStatusbar;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences.Annotations }
     *     
     */
    public ViewerPreferences.Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences.Annotations }
     *     
     */
    public void setAnnotations(ViewerPreferences.Annotations value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the toolbars property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences.Toolbars }
     *     
     */
    public ViewerPreferences.Toolbars getToolbars() {
        return toolbars;
    }

    /**
     * Sets the value of the toolbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences.Toolbars }
     *     
     */
    public void setToolbars(ViewerPreferences.Toolbars value) {
        this.toolbars = value;
    }

    /**
     * The ID of the Viewer preferences.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the leftToolbarState property.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getLeftToolbarState() {
        return leftToolbarState;
    }

    /**
     * Sets the value of the leftToolbarState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setLeftToolbarState(ToolbarVisibility value) {
        this.leftToolbarState = value;
    }

    /**
     * Gets the value of the rightToolbarState property.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getRightToolbarState() {
        return rightToolbarState;
    }

    /**
     * Sets the value of the rightToolbarState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setRightToolbarState(ToolbarVisibility value) {
        this.rightToolbarState = value;
    }

    /**
     * Gets the value of the expandStatusbar property.
     * 
     */
    public boolean isExpandStatusbar() {
        return expandStatusbar;
    }

    /**
     * Sets the value of the expandStatusbar property.
     * 
     */
    public void setExpandStatusbar(boolean value) {
        this.expandStatusbar = value;
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
     *         &lt;element name="AnnotationTool" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "annotationTool"
    })
    public static class Annotations {

        @XmlElement(name = "AnnotationTool")
        protected List<AnnotationToolSettings> annotationTool;

        /**
         * Gets the value of the annotationTool property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the annotationTool property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAnnotationTool().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnnotationToolSettings }
         * </p>
         * 
         * 
         * @return
         *     The value of the annotationTool property.
         */
        public List<AnnotationToolSettings> getAnnotationTool() {
            if (annotationTool == null) {
                annotationTool = new ArrayList<>();
            }
            return this.annotationTool;
        }

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
     *         &lt;element name="Toolbar" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbar" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "toolbar"
    })
    public static class Toolbars {

        @XmlElement(name = "Toolbar")
        protected List<ViewerToolbar> toolbar;

        /**
         * Gets the value of the toolbar property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the toolbar property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getToolbar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewerToolbar }
         * </p>
         * 
         * 
         * @return
         *     The value of the toolbar property.
         */
        public List<ViewerToolbar> getToolbar() {
            if (toolbar == null) {
                toolbar = new ArrayList<>();
            }
            return this.toolbar;
        }

    }

}
