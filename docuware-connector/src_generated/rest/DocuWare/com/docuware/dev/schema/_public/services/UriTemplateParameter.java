
package com.docuware.dev.schema._public.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Describes a parameter of an URI template.
 * 
 * &lt;p&gt;Java class for UriTemplateParameter complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UriTemplateParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HtmlDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsOptional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FurtherReading" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TypeDescriptionUri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateParameter", propOrder = {
    "htmlDescription"
})
public class UriTemplateParameter {

    /**
     * Describes the parameter.
     * 
     */
    @XmlElement(name = "HtmlDescription")
    protected UriTemplateParameter.HtmlDescription htmlDescription;
    /**
     * The name of this URI parameter.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Gets if the parameter can be ommitted.
     * 
     */
    @XmlAttribute(name = "IsOptional")
    protected Boolean isOptional;
    /**
     * Gets the default parameter in case the parameter is optional and the parameter has a default value.
     * 
     */
    @XmlAttribute(name = "DefaultValue")
    protected String defaultValue;
    /**
     * Gets a link for further readings.
     * 
     */
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;
    /**
     * Gets the type of this parameter.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Gets the a link for further readings about this parameter's type.
     * 
     */
    @XmlAttribute(name = "TypeDescriptionUri")
    protected String typeDescriptionUri;

    /**
     * Describes the parameter.
     * 
     * @return
     *     possible object is
     *     {@link UriTemplateParameter.HtmlDescription }
     *     
     */
    public UriTemplateParameter.HtmlDescription getHtmlDescription() {
        return htmlDescription;
    }

    /**
     * Sets the value of the htmlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link UriTemplateParameter.HtmlDescription }
     *     
     * @see #getHtmlDescription()
     */
    public void setHtmlDescription(UriTemplateParameter.HtmlDescription value) {
        this.htmlDescription = value;
    }

    /**
     * The name of this URI parameter.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets if the parameter can be ommitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsOptional() {
        if (isOptional == null) {
            return false;
        } else {
            return isOptional;
        }
    }

    /**
     * Sets the value of the isOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsOptional()
     */
    public void setIsOptional(Boolean value) {
        this.isOptional = value;
    }

    /**
     * Gets the default parameter in case the parameter is optional and the parameter has a default value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultValue()
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets a link for further readings.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherReading() {
        return furtherReading;
    }

    /**
     * Sets the value of the furtherReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFurtherReading()
     */
    public void setFurtherReading(String value) {
        this.furtherReading = value;
    }

    /**
     * Gets the type of this parameter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the a link for further readings about this parameter's type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescriptionUri() {
        return typeDescriptionUri;
    }

    /**
     * Sets the value of the typeDescriptionUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeDescriptionUri()
     */
    public void setTypeDescriptionUri(String value) {
        this.typeDescriptionUri = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='skip'/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class HtmlDescription {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
