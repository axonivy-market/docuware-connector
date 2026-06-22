
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of field validations
 * 
 * &lt;p&gt;Java class for FieldValidations complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FieldValidations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldValidation" type="{http://dev.docuware.com/schema/public/services/platform}CustomFieldValidation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValidations", propOrder = {
    "fieldValidation"
})
public class FieldValidations {

    @XmlElement(name = "FieldValidation", required = true)
    protected List<CustomFieldValidation> fieldValidation;

    /**
     * Gets the value of the fieldValidation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fieldValidation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFieldValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldValidation }
     * </p>
     * 
     * 
     * @return
     *     The value of the fieldValidation property.
     */
    public List<CustomFieldValidation> getFieldValidation() {
        if (fieldValidation == null) {
            fieldValidation = new ArrayList<>();
        }
        return this.fieldValidation;
    }

}
