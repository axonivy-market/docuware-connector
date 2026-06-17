
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific properties for each dialog type
 * 
 * <p>Java class for SelectListValuesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectListValuesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SingleColumn" type="{http://dev.docuware.com/schema/public/services/platform}SingleColumnSelectListValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListValuesResult", propOrder = {
    "singleColumn"
})
public class SelectListValuesResult {

    @XmlElement(name = "SingleColumn")
    protected SingleColumnSelectListValues singleColumn;

    /**
     * Gets the value of the singleColumn property.
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
     */
    public void setSingleColumn(SingleColumnSelectListValues value) {
        this.singleColumn = value;
    }

}
