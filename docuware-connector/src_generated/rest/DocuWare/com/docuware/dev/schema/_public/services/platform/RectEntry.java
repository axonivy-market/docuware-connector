
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rectangle or Ellipse annotation
 * 
 * &lt;p&gt;Java class for RectEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RectEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationRectangle"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Filled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Ellipse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectEntry", propOrder = {
    "location"
})
public class RectEntry
    extends EntryBase
{

    /**
     * Location of the annotation.
     * 
     */
    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    /**
     * Define if rectangle is solid.
     * 
     */
    @XmlAttribute(name = "Filled")
    protected Boolean filled;
    /**
     * True if annotation is elipse defined into rectangle.
     * 
     */
    @XmlAttribute(name = "Ellipse")
    protected Boolean ellipse;

    /**
     * Location of the annotation.
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
     * Define if rectangle is solid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilled() {
        if (filled == null) {
            return true;
        } else {
            return filled;
        }
    }

    /**
     * Sets the value of the filled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFilled()
     */
    public void setFilled(Boolean value) {
        this.filled = value;
    }

    /**
     * True if annotation is elipse defined into rectangle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEllipse() {
        if (ellipse == null) {
            return false;
        } else {
            return ellipse;
        }
    }

    /**
     * Sets the value of the ellipse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEllipse()
     */
    public void setEllipse(Boolean value) {
        this.ellipse = value;
    }

}
