
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes how to place a stamp on a page.
 * 
 * <p>Java class for StampPlacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "Strokes")
    protected PolyLineEntry strokes;
    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    @XmlAttribute(name = "Layer")
    protected Integer layer;
    @XmlAttribute(name = "Password")
    protected String password;

    /**
     * Gets the value of the strokes property.
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
     */
    public void setStrokes(PolyLineEntry value) {
        this.strokes = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFieldValue }
     * 
     * 
     */
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }

    /**
     * Gets the value of the stampId property.
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
     */
    public void setStampId(String value) {
        this.stampId = value;
    }

    /**
     * Gets the value of the rotation property.
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
     */
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the layer property.
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
     */
    public void setLayer(Integer value) {
        this.layer = value;
    }

    /**
     * Gets the value of the password property.
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
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
