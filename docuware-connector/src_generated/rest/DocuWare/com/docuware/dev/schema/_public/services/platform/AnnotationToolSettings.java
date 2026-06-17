
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnotationToolSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationToolSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationTools" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationToolSettings")
@XmlSeeAlso({
    TextAnnotationToolSettings.class,
    SizedAnnotationToolSettings.class
})
public class AnnotationToolSettings {

    @XmlAttribute(name = "Type", required = true)
    protected AnnotationTools type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationTools }
     *     
     */
    public AnnotationTools getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationTools }
     *     
     */
    public void setType(AnnotationTools value) {
        this.type = value;
    }

}
