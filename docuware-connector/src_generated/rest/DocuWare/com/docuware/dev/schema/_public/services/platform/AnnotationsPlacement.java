
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes how to place a set of annotations and stamps on a page.
 * 
 * &lt;p&gt;Java class for AnnotationsPlacement complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AnnotationsPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Annotation" type="{http://dev.docuware.com/schema/public/services/platform}Annotation"/&gt;
 *           &lt;element name="StampPlacement" type="{http://dev.docuware.com/schema/public/services/platform}StampPlacement"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationsPlacement", propOrder = {
    "annotationOrStampPlacement"
})
public class AnnotationsPlacement {

    @XmlElements({
        @XmlElement(name = "Annotation", type = Annotation.class),
        @XmlElement(name = "StampPlacement", type = StampPlacement.class)
    })
    protected List<Object> annotationOrStampPlacement;

    /**
     * Gets the value of the annotationOrStampPlacement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the annotationOrStampPlacement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnnotationOrStampPlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * {@link StampPlacement }
     * </p>
     * 
     * 
     * @return
     *     The value of the annotationOrStampPlacement property.
     */
    public List<Object> getAnnotationOrStampPlacement() {
        if (annotationOrStampPlacement == null) {
            annotationOrStampPlacement = new ArrayList<>();
        }
        return this.annotationOrStampPlacement;
    }

}
