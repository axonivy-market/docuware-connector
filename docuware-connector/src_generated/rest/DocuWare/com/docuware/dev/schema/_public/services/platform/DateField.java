
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PredefinedEntry" type="{http://dev.docuware.com/schema/public/services/platform}PredefinedEntryType"/&gt;
 *         &lt;element name="PredefinedCustomEntry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateField", propOrder = {
    "localValue",
    "predefinedEntry",
    "predefinedCustomEntry"
})
public class DateField
    extends WebFormField
{

    @XmlElement(name = "LocalValue", required = true)
    protected String localValue;
    @XmlElement(name = "PredefinedEntry", required = true)
    @XmlSchemaType(name = "string")
    protected PredefinedEntryType predefinedEntry;
    @XmlElement(name = "PredefinedCustomEntry", required = true)
    protected String predefinedCustomEntry;

    /**
     * Gets the value of the localValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalValue() {
        return localValue;
    }

    /**
     * Sets the value of the localValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalValue(String value) {
        this.localValue = value;
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
