
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the request next element of a sequence.
 * 
 * &lt;p&gt;Java class for SequenceRequest complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SequenceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SequenceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRequest")
public class SequenceRequest {

    /**
     * The global unique identifier of the sequence.
     * 
     */
    @XmlAttribute(name = "SequenceId", required = true)
    protected String sequenceId;

    /**
     * The global unique identifier of the sequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSequenceId()
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

}
