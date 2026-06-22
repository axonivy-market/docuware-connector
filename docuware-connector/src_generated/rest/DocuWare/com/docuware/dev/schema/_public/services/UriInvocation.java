
package com.docuware.dev.schema._public.services;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UriInvocation complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UriInvocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedType" type="{http://dev.docuware.com/schema/public/services}TypeReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProducedType" type="{http://dev.docuware.com/schema/public/services}TypeReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Verb" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="GET" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriInvocation", propOrder = {
    "acceptedType",
    "producedType",
    "tag"
})
public class UriInvocation {

    @XmlElement(name = "AcceptedType")
    protected List<TypeReference> acceptedType;
    @XmlElement(name = "ProducedType")
    protected List<TypeReference> producedType;
    /**
     * Application specific tag for the method.
     * 
     */
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Verb")
    @XmlSchemaType(name = "anySimpleType")
    protected String verb;

    /**
     * Gets the value of the acceptedType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acceptedType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAcceptedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the acceptedType property.
     */
    public List<TypeReference> getAcceptedType() {
        if (acceptedType == null) {
            acceptedType = new ArrayList<>();
        }
        return this.acceptedType;
    }

    /**
     * Gets the value of the producedType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the producedType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProducedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the producedType property.
     */
    public List<TypeReference> getProducedType() {
        if (producedType == null) {
            producedType = new ArrayList<>();
        }
        return this.producedType;
    }

    /**
     * Application specific tag for the method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTag()
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerb() {
        if (verb == null) {
            return "GET";
        } else {
            return verb;
        }
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerb(String value) {
        this.verb = value;
    }

}
