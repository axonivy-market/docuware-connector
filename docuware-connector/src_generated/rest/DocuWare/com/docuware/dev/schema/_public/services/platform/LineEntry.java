
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Line/Arrow annotation
 * 
 * &lt;p&gt;Java class for LineEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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

    /**
     * Start point of the line.
     * 
     */
    @XmlElement(name = "From", required = true)
    protected AnnotationPoint from;
    /**
     * End  point of the line.
     * 
     */
    @XmlElement(name = "To", required = true)
    protected AnnotationPoint to;
    /**
     * Define a line with arror.
     * 
     */
    @XmlAttribute(name = "Arrow")
    protected Boolean arrow;

    /**
     * Start point of the line.
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
     * @see #getFrom()
     */
    public void setFrom(AnnotationPoint value) {
        this.from = value;
    }

    /**
     * End  point of the line.
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
     * @see #getTo()
     */
    public void setTo(AnnotationPoint value) {
        this.to = value;
    }

    /**
     * Define a line with arror.
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
     * @see #isArrow()
     */
    public void setArrow(Boolean value) {
        this.arrow = value;
    }

}
