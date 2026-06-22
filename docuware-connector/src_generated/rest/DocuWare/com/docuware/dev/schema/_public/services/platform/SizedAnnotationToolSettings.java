
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SizedAnnotationToolSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SizedAnnotationToolSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings"&gt;
 *       &lt;attribute name="LineSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
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
