
package com.docuware.dev.schema._public.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UriInvocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Verb")
    @XmlSchemaType(name = "anySimpleType")
    protected String verb;

    /**
     * Gets the value of the acceptedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * 
     * 
     */
    public List<TypeReference> getAcceptedType() {
        if (acceptedType == null) {
            acceptedType = new ArrayList<TypeReference>();
        }
        return this.acceptedType;
    }

    /**
     * Gets the value of the producedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * 
     * 
     */
    public List<TypeReference> getProducedType() {
        if (producedType == null) {
            producedType = new ArrayList<TypeReference>();
        }
        return this.producedType;
    }

    /**
     * Gets the value of the tag property.
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
