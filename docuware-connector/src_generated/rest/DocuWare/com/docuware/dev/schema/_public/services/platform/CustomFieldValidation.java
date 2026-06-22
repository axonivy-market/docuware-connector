
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition of a custom field validation for forms
 * 
 * &lt;p&gt;Java class for CustomFieldValidation complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CustomFieldValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Conditions" type="{http://dev.docuware.com/schema/public/services/platform}ValidationCondition" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldValidationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldValidation", propOrder = {
    "fieldType",
    "conditions",
    "name",
    "description",
    "fieldValidationID",
    "errorMessage"
})
public class CustomFieldValidation {

    @XmlElement(name = "FieldType", required = true)
    protected String fieldType;
    @XmlElement(name = "Conditions", required = true)
    protected List<ValidationCondition> conditions;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "FieldValidationID", required = true)
    protected String fieldValidationID;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conditions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the conditions property.
     */
    public List<ValidationCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fieldValidationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValidationID() {
        return fieldValidationID;
    }

    /**
     * Sets the value of the fieldValidationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValidationID(String value) {
        this.fieldValidationID = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
