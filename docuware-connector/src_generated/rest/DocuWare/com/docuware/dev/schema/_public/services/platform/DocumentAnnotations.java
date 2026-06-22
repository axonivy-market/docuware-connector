
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Descripes how to place a set of annotations and stamps on a document.
 * 
 * &lt;p&gt;Java class for DocumentAnnotations complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentAnnotations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotations" type="{http://dev.docuware.com/schema/public/services/platform}SectionAnnotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAnnotations", propOrder = {
    "annotations"
})
public class DocumentAnnotations {

    /**
     * List of SectionAnnotation items.
     * 
     */
    @XmlElement(name = "Annotations")
    protected List<SectionAnnotation> annotations;

    /**
     * List of SectionAnnotation items.
     * 
     * Gets the value of the annotations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the annotations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionAnnotation }
     * </p>
     * 
     * 
     * @return
     *     The value of the annotations property.
     */
    public List<SectionAnnotation> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<>();
        }
        return this.annotations;
    }

}
