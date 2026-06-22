
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base element for annotation entry.
 * 
 * &lt;p&gt;Java class for EntryBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="EntryBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Created" type="{http://dev.docuware.com/schema/public/services/platform}CreatedInfo"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Rotation" type="{http://dev.docuware.com/schema/public/services/platform}RotationType" default="0" /&gt;
 *       &lt;attribute name="Transparent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="StrokeWidth" type="{http://dev.docuware.com/schema/public/services/platform}DistanceType" default="20" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryBase", propOrder = {
    "created"
})
@XmlSeeAlso({
    DeleteEntry.class,
    TextEntry.class,
    LineEntry.class,
    RectEntry.class,
    PolyLineEntry.class,
    StampBase.class
})
public class EntryBase {

    /**
     * Info about creation of the annotation.
     * 
     */
    @XmlElement(name = "Created", required = true)
    protected CreatedInfo created;
    /**
     * DEPRECATED! No longer used since 7.0. The type can be retrieved by the class name.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Rotaion of the annotation.
     * 
     */
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    /**
     * Define if annotation is transparent.
     * 
     */
    @XmlAttribute(name = "Transparent")
    protected Boolean transparent;
    /**
     * The default thickness is 1 pt = 20 twips
     * 
     */
    @XmlAttribute(name = "StrokeWidth")
    protected Integer strokeWidth;
    /**
     * Specified if updating already exisitng annotation
     * 
     */
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Info about creation of the annotation.
     * 
     * @return
     *     possible object is
     *     {@link CreatedInfo }
     *     
     */
    public CreatedInfo getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedInfo }
     *     
     * @see #getCreated()
     */
    public void setCreated(CreatedInfo value) {
        this.created = value;
    }

    /**
     * DEPRECATED! No longer used since 7.0. The type can be retrieved by the class name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Rotaion of the annotation.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRotation() {
        if (rotation == null) {
            return  0;
        } else {
            return rotation;
        }
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getRotation()
     */
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**
     * Define if annotation is transparent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTransparent() {
        if (transparent == null) {
            return false;
        } else {
            return transparent;
        }
    }

    /**
     * Sets the value of the transparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTransparent()
     */
    public void setTransparent(Boolean value) {
        this.transparent = value;
    }

    /**
     * The default thickness is 1 pt = 20 twips
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStrokeWidth() {
        if (strokeWidth == null) {
            return  20;
        } else {
            return strokeWidth;
        }
    }

    /**
     * Sets the value of the strokeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStrokeWidth()
     */
    public void setStrokeWidth(Integer value) {
        this.strokeWidth = value;
    }

    /**
     * Specified if updating already exisitng annotation
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

}
