
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PloyLine annotation. Conatins a single stroke of points.
 * 
 * &lt;p&gt;Java class for PolyLineEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PolyLineEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stroke" type="{http://dev.docuware.com/schema/public/services/platform}Stroke"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyLineEntry", propOrder = {
    "stroke"
})
public class PolyLineEntry
    extends EntryBase
{

    /**
     * Sequence of points that define a PloyLine.
     * 
     */
    @XmlElement(name = "Stroke", required = true)
    protected Stroke stroke;

    /**
     * Sequence of points that define a PloyLine.
     * 
     * @return
     *     possible object is
     *     {@link Stroke }
     *     
     */
    public Stroke getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stroke }
     *     
     * @see #getStroke()
     */
    public void setStroke(Stroke value) {
        this.stroke = value;
    }

}
