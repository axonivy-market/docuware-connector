
package com.docuware.dev.schema._public.services;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for UriTemplateDescription complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UriTemplateDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameter" type="{http://dev.docuware.com/schema/public/services}UriTemplateParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Invoke" type="{http://dev.docuware.com/schema/public/services}UriInvocation" maxOccurs="unbounded"/&gt;
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
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UriPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FurtherReading" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescription", propOrder = {
    "parameter",
    "invoke",
    "htmlDescription"
})
public class UriTemplateDescription {

    @XmlElement(name = "Parameter")
    protected List<UriTemplateParameter> parameter;
    @XmlElement(name = "Invoke", required = true)
    protected List<UriInvocation> invoke;
    /**
     * Describes the Uri.
     * 
     */
    @XmlElement(name = "HtmlDescription")
    protected UriTemplateDescription.HtmlDescription htmlDescription;
    /**
     * The name of this template.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * The URI template.
     * 
     */
    @XmlAttribute(name = "UriPattern")
    protected String uriPattern;
    /**
     * Gets a link for further readings.
     * 
     */
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the parameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UriTemplateParameter }
     * </p>
     * 
     * 
     * @return
     *     The value of the parameter property.
     */
    public List<UriTemplateParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the invoke property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invoke property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvoke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UriInvocation }
     * </p>
     * 
     * 
     * @return
     *     The value of the invoke property.
     */
    public List<UriInvocation> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<>();
        }
        return this.invoke;
    }

    /**
     * Describes the Uri.
     * 
     * @return
     *     possible object is
     *     {@link UriTemplateDescription.HtmlDescription }
     *     
     */
    public UriTemplateDescription.HtmlDescription getHtmlDescription() {
        return htmlDescription;
    }

    /**
     * Sets the value of the htmlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link UriTemplateDescription.HtmlDescription }
     *     
     * @see #getHtmlDescription()
     */
    public void setHtmlDescription(UriTemplateDescription.HtmlDescription value) {
        this.htmlDescription = value;
    }

    /**
     * The name of this template.
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
     * The URI template.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriPattern() {
        return uriPattern;
    }

    /**
     * Sets the value of the uriPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUriPattern()
     */
    public void setUriPattern(String value) {
        this.uriPattern = value;
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
