
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Annotation element. Contains all annotations for a specific page in up to 5 layers
 * 
 * &lt;p&gt;Java class for Annotation complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Annotation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Layer" type="{http://dev.docuware.com/schema/public/services/platform}Layer" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {
    "layer"
})
public class Annotation {

    /**
     * List of layers that contains annotations in a specific layer. Annotation can have up to 5 layers.
     * 
     */
    @XmlElement(name = "Layer")
    protected List<Layer> layer;

    /**
     * List of layers that contains annotations in a specific layer. Annotation can have up to 5 layers.
     * 
     * Gets the value of the layer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the layer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Layer }
     * </p>
     * 
     * 
     * @return
     *     The value of the layer property.
     */
    public List<Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<>();
        }
        return this.layer;
    }

}
