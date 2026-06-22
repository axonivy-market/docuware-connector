
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition of a validation condition
 * 
 * &lt;p&gt;Java class for ValidationCondition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ValidationCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FormCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComparisonType" type="{http://dev.docuware.com/schema/public/services/platform}ComparisonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationCondition", propOrder = {
    "comparisonType"
})
public class ValidationCondition
    extends FormCondition
{

    @XmlElement(name = "ComparisonType", required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonType comparisonType;

    /**
     * Gets the value of the comparisonType property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonType }
     *     
     */
    public ComparisonType getComparisonType() {
        return comparisonType;
    }

    /**
     * Sets the value of the comparisonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonType }
     *     
     */
    public void setComparisonType(ComparisonType value) {
        this.comparisonType = value;
    }

}
