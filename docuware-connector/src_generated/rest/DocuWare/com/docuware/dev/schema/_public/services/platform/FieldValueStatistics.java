
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Value with statistics.
 * 
 * &lt;p&gt;Java class for FieldValueStatistics complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FieldValueStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatistics", propOrder = {
    "value"
})
public class FieldValueStatistics {

    /**
     * The value.
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected DocumentIndexFieldValue value;
    /**
     * The number of times the value occurs in the documents.
     * 
     */
    @XmlAttribute(name = "Count", required = true)
    protected long count;

    /**
     * The value.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFieldValue }
     *     
     */
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFieldValue }
     *     
     * @see #getValue()
     */
    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**
     * The number of times the value occurs in the documents.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

}
