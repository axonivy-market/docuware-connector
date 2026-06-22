
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Parameters for EnhanceImage action
 * 
 * &lt;p&gt;Java class for EnhanceImageParameters complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="EnhanceImageParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"&gt;
 *       &lt;attribute name="SectionNumber" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhanceImageParameters")
public class EnhanceImageParameters
    extends DocumentActionParameters
{

    /**
     * Number of the section to process.
     * 
     */
    @XmlAttribute(name = "SectionNumber")
    protected Integer sectionNumber;

    /**
     * Number of the section to process.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSectionNumber() {
        if (sectionNumber == null) {
            return  0;
        } else {
            return sectionNumber;
        }
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSectionNumber()
     */
    public void setSectionNumber(Integer value) {
        this.sectionNumber = value;
    }

}
