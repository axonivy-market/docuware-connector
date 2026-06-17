
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Line/Arrow annotation
 * 
 * <p>Java class for LineEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="From" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint"/&gt;
 *         &lt;element name="To" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Arrow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineEntry", propOrder = {
    "from",
    "to"
})
public class LineEntry
    extends EntryBase
{

    @XmlElement(name = "From", required = true)
    protected AnnotationPoint from;
    @XmlElement(name = "To", required = true)
    protected AnnotationPoint to;
    @XmlAttribute(name = "Arrow")
    protected Boolean arrow;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationPoint }
     *     
     */
    public AnnotationPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationPoint }
     *     
     */
    public void setFrom(AnnotationPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationPoint }
     *     
     */
    public AnnotationPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationPoint }
     *     
     */
    public void setTo(AnnotationPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the arrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArrow() {
        if (arrow == null) {
            return false;
        } else {
            return arrow;
        }
    }

    /**
     * Sets the value of the arrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrow(Boolean value) {
        this.arrow = value;
    }

}
