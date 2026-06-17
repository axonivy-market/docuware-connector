
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SizedAnnotationToolSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SizedAnnotationToolSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings"&gt;
 *       &lt;attribute name="LineSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizedAnnotationToolSettings")
public class SizedAnnotationToolSettings
    extends AnnotationToolSettings
{

    @XmlAttribute(name = "LineSize", required = true)
    protected int lineSize;

    /**
     * Gets the value of the lineSize property.
     * 
     */
    public int getLineSize() {
        return lineSize;
    }

    /**
     * Sets the value of the lineSize property.
     * 
     */
    public void setLineSize(int value) {
        this.lineSize = value;
    }

}
