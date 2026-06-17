
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes how to place a set of annotations and stamps on a section.
 * 
 * <p>Java class for SectionAnnotationsPlacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionAnnotationsPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnnotationsPlacement" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationsPlacement"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SectionNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionAnnotationsPlacement", propOrder = {
    "annotationsPlacement"
})
public class SectionAnnotationsPlacement {

    @XmlElement(name = "AnnotationsPlacement", required = true)
    protected AnnotationsPlacement annotationsPlacement;
    @XmlAttribute(name = "SectionNumber", required = true)
    protected int sectionNumber;
    @XmlAttribute(name = "PageNumber", required = true)
    protected int pageNumber;

    /**
     * Gets the value of the annotationsPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationsPlacement }
     *     
     */
    public AnnotationsPlacement getAnnotationsPlacement() {
        return annotationsPlacement;
    }

    /**
     * Sets the value of the annotationsPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationsPlacement }
     *     
     */
    public void setAnnotationsPlacement(AnnotationsPlacement value) {
        this.annotationsPlacement = value;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     */
    public void setSectionNumber(int value) {
        this.sectionNumber = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
