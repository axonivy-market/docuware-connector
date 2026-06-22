
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Denotes a space.
 * 
 * &lt;p&gt;Java class for Space complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Space"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="W" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Space")
public class Space {

    /**
     * The width of the space.
     * 
     */
    @XmlAttribute(name = "W")
    protected Integer w;

    /**
     * The width of the space.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getW() {
        if (w == null) {
            return  0;
        } else {
            return w;
        }
    }

    /**
     * Sets the value of the w property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getW()
     */
    public void setW(Integer value) {
        this.w = value;
    }

}
