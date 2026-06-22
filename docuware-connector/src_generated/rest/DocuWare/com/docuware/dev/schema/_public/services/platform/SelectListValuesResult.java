
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specific properties for each dialog type
 * 
 * &lt;p&gt;Java class for SelectListValuesResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListValuesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SingleColumn" type="{http://dev.docuware.com/schema/public/services/platform}SingleColumnSelectListValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListValuesResult", propOrder = {
    "singleColumn"
})
public class SelectListValuesResult {

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     */
    @XmlElement(name = "SingleColumn")
    protected SingleColumnSelectListValues singleColumn;

    /**
     * Get or sets the form field value casted to the index field type.
     * 
     * @return
     *     possible object is
     *     {@link SingleColumnSelectListValues }
     *     
     */
    public SingleColumnSelectListValues getSingleColumn() {
        return singleColumn;
    }

    /**
     * Sets the value of the singleColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleColumnSelectListValues }
     *     
     * @see #getSingleColumn()
     */
    public void setSingleColumn(SingleColumnSelectListValues value) {
        this.singleColumn = value;
    }

}
