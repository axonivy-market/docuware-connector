
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Form object used for displaying form
 * 
 * &lt;p&gt;Java class for FormInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FormInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}WebFormControls"/&gt;
 *         &lt;element name="Behaviors" type="{http://dev.docuware.com/schema/public/services/platform}Behaviors"/&gt;
 *         &lt;element name="FieldValidations" type="{http://dev.docuware.com/schema/public/services/platform}FieldValidations"/&gt;
 *         &lt;element name="FormProperties" type="{http://dev.docuware.com/schema/public/services/platform}FormProperties"/&gt;
 *         &lt;element name="SubmissionOptions" type="{http://dev.docuware.com/schema/public/services/platform}SubmissionOptions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormInfo", propOrder = {
    "configId",
    "name",
    "fields",
    "behaviors",
    "fieldValidations",
    "formProperties",
    "submissionOptions"
})
public class FormInfo {

    /**
     * Id of the form configuration used to retrieve full configuration
     * 
     */
    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * List of web form fields
     * 
     */
    @XmlElement(name = "Fields", required = true)
    protected WebFormControls fields;
    /**
     * List of web form behaviors
     * 
     */
    @XmlElement(name = "Behaviors", required = true)
    protected Behaviors behaviors;
    /**
     * List of web form field validations
     * 
     */
    @XmlElement(name = "FieldValidations", required = true)
    protected FieldValidations fieldValidations;
    /**
     * Form Properties
     * 
     */
    @XmlElement(name = "FormProperties", required = true)
    protected FormProperties formProperties;
    /**
     * Submission Options
     * 
     */
    @XmlElement(name = "SubmissionOptions", required = true)
    protected SubmissionOptions submissionOptions;
    @XmlAttribute(name = "Public")
    protected Boolean _public;

    /**
     * Id of the form configuration used to retrieve full configuration
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfigId()
     */
    public void setConfigId(String value) {
        this.configId = value;
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
     * List of web form fields
     * 
     * @return
     *     possible object is
     *     {@link WebFormControls }
     *     
     */
    public WebFormControls getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormControls }
     *     
     * @see #getFields()
     */
    public void setFields(WebFormControls value) {
        this.fields = value;
    }

    /**
     * List of web form behaviors
     * 
     * @return
     *     possible object is
     *     {@link Behaviors }
     *     
     */
    public Behaviors getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behaviors }
     *     
     * @see #getBehaviors()
     */
    public void setBehaviors(Behaviors value) {
        this.behaviors = value;
    }

    /**
     * List of web form field validations
     * 
     * @return
     *     possible object is
     *     {@link FieldValidations }
     *     
     */
    public FieldValidations getFieldValidations() {
        return fieldValidations;
    }

    /**
     * Sets the value of the fieldValidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValidations }
     *     
     * @see #getFieldValidations()
     */
    public void setFieldValidations(FieldValidations value) {
        this.fieldValidations = value;
    }

    /**
     * Form Properties
     * 
     * @return
     *     possible object is
     *     {@link FormProperties }
     *     
     */
    public FormProperties getFormProperties() {
        return formProperties;
    }

    /**
     * Sets the value of the formProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormProperties }
     *     
     * @see #getFormProperties()
     */
    public void setFormProperties(FormProperties value) {
        this.formProperties = value;
    }

    /**
     * Submission Options
     * 
     * @return
     *     possible object is
     *     {@link SubmissionOptions }
     *     
     */
    public SubmissionOptions getSubmissionOptions() {
        return submissionOptions;
    }

    /**
     * Sets the value of the submissionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionOptions }
     *     
     * @see #getSubmissionOptions()
     */
    public void setSubmissionOptions(SubmissionOptions value) {
        this.submissionOptions = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublic(Boolean value) {
        this._public = value;
    }

}
