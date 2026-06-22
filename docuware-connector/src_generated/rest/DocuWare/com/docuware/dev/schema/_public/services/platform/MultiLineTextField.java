
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MultiLineTextField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiLineTextField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PredefinedEntry" type="{http://dev.docuware.com/schema/public/services/platform}PredefinedEntryType"/&gt;
 *         &lt;element name="PredefinedCustomEntry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLineTextField", propOrder = {
    "minLength",
    "maxLength",
    "predefinedEntry",
    "predefinedCustomEntry"
})
public class MultiLineTextField
    extends WebFormField
{

    @XmlElementRef(name = "MinLength", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minLength;
    @XmlElementRef(name = "MaxLength", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxLength;
    @XmlElement(name = "PredefinedEntry", required = true)
    @XmlSchemaType(name = "string")
    protected PredefinedEntryType predefinedEntry;
    @XmlElement(name = "PredefinedCustomEntry", required = true)
    protected String predefinedCustomEntry;

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinLength(JAXBElement<Integer> value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxLength(JAXBElement<Integer> value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the predefinedEntry property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedEntryType }
     *     
     */
    public PredefinedEntryType getPredefinedEntry() {
        return predefinedEntry;
    }

    /**
     * Sets the value of the predefinedEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedEntryType }
     *     
     */
    public void setPredefinedEntry(PredefinedEntryType value) {
        this.predefinedEntry = value;
    }

    /**
     * Gets the value of the predefinedCustomEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedCustomEntry() {
        return predefinedCustomEntry;
    }

    /**
     * Sets the value of the predefinedCustomEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedCustomEntry(String value) {
        this.predefinedCustomEntry = value;
    }

}
