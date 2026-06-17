
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of a validation condition
 * 
 * <p>Java class for ValidationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FormCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComparisonType" type="{http://dev.docuware.com/schema/public/services/platform}ComparisonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
