
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tablet polyline stamp. Contains one or more strokes. Used as handwriting stamp
 * 
 * &lt;p&gt;Java class for PolyLineStampEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PolyLineStampEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stroke" type="{http://dev.docuware.com/schema/public/services/platform}Stroke" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyLineStampEntry", propOrder = {
    "stroke"
})
public class PolyLineStampEntry
    extends StampBase
{

    /**
     * Sequence of strokes of sequence of points that define a set of polylines.
     * 
     */
    @XmlElement(name = "Stroke", required = true)
    protected List<Stroke> stroke;

    /**
     * Sequence of strokes of sequence of points that define a set of polylines.
     * 
     * Gets the value of the stroke property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stroke property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStroke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stroke }
     * </p>
     * 
     * 
     * @return
     *     The value of the stroke property.
     */
    public List<Stroke> getStroke() {
        if (stroke == null) {
            stroke = new ArrayList<>();
        }
        return this.stroke;
    }

}
