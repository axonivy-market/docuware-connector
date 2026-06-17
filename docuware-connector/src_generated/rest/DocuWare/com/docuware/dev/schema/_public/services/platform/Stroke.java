
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sequence of points that define a PloyLine.
 * 
 * <p>Java class for Stroke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stroke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Point" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="_do_not_use" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stroke", propOrder = {
    "point"
})
public class Stroke {

    @XmlElement(name = "Point", required = true)
    protected List<AnnotationPoint> point;
    @XmlAttribute(name = "_do_not_use", required = true)
    protected boolean doNotUse;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationPoint }
     * 
     * 
     */
    public List<AnnotationPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<AnnotationPoint>();
        }
        return this.point;
    }

    /**
     * Gets the value of the doNotUse property.
     * 
     */
    public boolean isDoNotUse() {
        return doNotUse;
    }

    /**
     * Sets the value of the doNotUse property.
     * 
     */
    public void setDoNotUse(boolean value) {
        this.doNotUse = value;
    }

}
