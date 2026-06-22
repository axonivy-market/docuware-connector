
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Sequence of points that define a PloyLine.
 * 
 * &lt;p&gt;Java class for Stroke complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stroke", propOrder = {
    "point"
})
public class Stroke {

    /**
     * Sequence of points that define a PloyLine.
     * 
     */
    @XmlElement(name = "Point", required = true)
    protected List<AnnotationPoint> point;
    @XmlAttribute(name = "_do_not_use", required = true)
    protected boolean doNotUse;

    /**
     * Sequence of points that define a PloyLine.
     * 
     * Gets the value of the point property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the point property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationPoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the point property.
     */
    public List<AnnotationPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<>();
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
