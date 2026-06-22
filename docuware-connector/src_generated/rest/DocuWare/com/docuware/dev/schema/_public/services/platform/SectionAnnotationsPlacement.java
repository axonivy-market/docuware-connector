
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes how to place a set of annotations and stamps on a section.
 * 
 * &lt;p&gt;Java class for SectionAnnotationsPlacement complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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
    /**
     * Number of the section to set annotations on.
     * 
     */
    @XmlAttribute(name = "SectionNumber", required = true)
    protected int sectionNumber;
    /**
     * Number of the page to set annotations on.
     * 
     */
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
     * Number of the section to set annotations on.
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
     * Number of the page to set annotations on.
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
