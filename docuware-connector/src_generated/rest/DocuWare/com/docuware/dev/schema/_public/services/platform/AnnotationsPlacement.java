
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes how to place a set of annotations and stamps on a page.
 * 
 * <p>Java class for AnnotationsPlacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationOrStampPlacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrStampPlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * {@link StampPlacement }
     * 
     * 
     */
    public List<Object> getAnnotationOrStampPlacement() {
        if (annotationOrStampPlacement == null) {
            annotationOrStampPlacement = new ArrayList<Object>();
        }
        return this.annotationOrStampPlacement;
    }

}
