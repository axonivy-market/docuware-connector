
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The form field values which are applied when placing or rendering a specific stamp.
 * 
 * &lt;p&gt;Java class for StampFormFieldValues complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampFormFieldValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{http://dev.docuware.com/schema/public/services/platform}FormFieldValue" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StampId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormFieldValues", propOrder = {
    "field"
})
public class StampFormFieldValues {

    /**
     * The form field values which are applied when placing the stamp.
     * 
     */
    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    /**
     * The Id of the stamp to place.
     * 
     */
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;

    /**
     * The form field values which are applied when placing the stamp.
     * 
     * Gets the value of the field property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the field property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFieldValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the field property.
     */
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
    }

    /**
     * The Id of the stamp to place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * Sets the value of the stampId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStampId()
     */
    public void setStampId(String value) {
        this.stampId = value;
    }

}
