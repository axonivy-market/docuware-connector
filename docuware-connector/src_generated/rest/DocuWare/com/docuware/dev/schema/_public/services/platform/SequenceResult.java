
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the result for requested next element of a sequence.
 * 
 * &lt;p&gt;Java class for SequenceResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SequenceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NextElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceResult")
public class SequenceResult {

    /**
     * The next element of the sequence.
     * 
     */
    @XmlAttribute(name = "NextElement", required = true)
    protected String nextElement;

    /**
     * The next element of the sequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextElement() {
        return nextElement;
    }

    /**
     * Sets the value of the nextElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNextElement()
     */
    public void setNextElement(String value) {
        this.nextElement = value;
    }

}
