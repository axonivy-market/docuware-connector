
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes how to place a stamp on a page.
 * 
 * &lt;p&gt;Java class for StampPlacement complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Strokes" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineEntry" minOccurs="0"/&gt;
 *         &lt;element name="Field" type="{http://dev.docuware.com/schema/public/services/platform}FormFieldValue" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StampId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Layer" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampPlacement", propOrder = {
    "strokes",
    "field"
})
@XmlSeeAlso({
    DecisionStampPlacement.class
})
public class StampPlacement {

    /**
     * A polyline entry in case of stroke stamps.
     * 
     */
    @XmlElement(name = "Strokes")
    protected PolyLineEntry strokes;
    /**
     * The form field values which are applied when placing the stamp.
     * 
     */
    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    /**
     * The Id of the stamp to place.
     * 
     */
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;
    /**
     * Rotation of the stamp. Only rotation even of 90 degree are supported.
     * 
     */
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    /**
     * Layer where the stamp have to be placed.
     * 
     */
    @XmlAttribute(name = "Layer")
    protected Integer layer;
    /**
     * Password for password protected stamps
     * 
     */
    @XmlAttribute(name = "Password")
    protected String password;

    /**
     * A polyline entry in case of stroke stamps.
     * 
     * @return
     *     possible object is
     *     {@link PolyLineEntry }
     *     
     */
    public PolyLineEntry getStrokes() {
        return strokes;
    }

    /**
     * Sets the value of the strokes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolyLineEntry }
     *     
     * @see #getStrokes()
     */
    public void setStrokes(PolyLineEntry value) {
        this.strokes = value;
    }

    /**
     * The form field values which are applied when placing the stamp.
     * 
     * Gets the value of the field property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the field property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFieldValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the field property.
     */
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
    }

    /**
     * The Id of the stamp to place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * Sets the value of the stampId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStampId()
     */
    public void setStampId(String value) {
        this.stampId = value;
    }

    /**
     * Rotation of the stamp. Only rotation even of 90 degree are supported.
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
     * Layer where the stamp have to be placed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLayer() {
        if (layer == null) {
            return  0;
        } else {
            return layer;
        }
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLayer()
     */
    public void setLayer(Integer value) {
        this.layer = value;
    }

    /**
     * Password for password protected stamps
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        if (password == null) {
            return "";
        } else {
            return password;
        }
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
