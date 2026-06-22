
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NumberField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="NumberField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForceDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PredefinedEntry" type="{http://dev.docuware.com/schema/public/services/platform}PredefinedEntryType"/&gt;
 *         &lt;element name="PredefinedCustomEntry" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberField", propOrder = {
    "forceDecimalPlaces",
    "decimalPlaces",
    "minValue",
    "maxValue",
    "predefinedEntry",
    "predefinedCustomEntry"
})
public class NumberField
    extends WebFormField
{

    @XmlElement(name = "ForceDecimalPlaces")
    protected boolean forceDecimalPlaces;
    @XmlElement(name = "DecimalPlaces")
    protected int decimalPlaces;
    @XmlElementRef(name = "MinValue", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> minValue;
    @XmlElementRef(name = "MaxValue", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> maxValue;
    @XmlElement(name = "PredefinedEntry", required = true)
    @XmlSchemaType(name = "string")
    protected PredefinedEntryType predefinedEntry;
    @XmlElementRef(name = "PredefinedCustomEntry", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> predefinedCustomEntry;

    /**
     * Gets the value of the forceDecimalPlaces property.
     * 
     */
    public boolean isForceDecimalPlaces() {
        return forceDecimalPlaces;
    }

    /**
     * Sets the value of the forceDecimalPlaces property.
     * 
     */
    public void setForceDecimalPlaces(boolean value) {
        this.forceDecimalPlaces = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     */
    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     */
    public void setDecimalPlaces(int value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinValue(JAXBElement<Double> value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaxValue(JAXBElement<Double> value) {
        this.maxValue = value;
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
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPredefinedCustomEntry() {
        return predefinedCustomEntry;
    }

    /**
     * Sets the value of the predefinedCustomEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPredefinedCustomEntry(JAXBElement<Double> value) {
        this.predefinedCustomEntry = value;
    }

}
