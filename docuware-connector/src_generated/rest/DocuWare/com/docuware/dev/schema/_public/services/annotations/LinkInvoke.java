
package com.docuware.dev.schema._public.services.annotations;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LinkInvoke complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LinkInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accepts" type="{http://dev.docuware.com/schema/public/services/annotations}ContentTypeList" minOccurs="0"/&gt;
 *         &lt;element name="Produces" type="{http://dev.docuware.com/schema/public/services/annotations}ContentTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Verb" type="{http://dev.docuware.com/schema/public/services/annotations}HttpMethod" default="Get" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkInvoke", propOrder = {
    "accepts",
    "produces"
})
public class LinkInvoke {

    @XmlElement(name = "Accepts")
    protected ContentTypeList accepts;
    @XmlElement(name = "Produces")
    protected ContentTypeList produces;
    @XmlAttribute(name = "Verb")
    protected HttpMethod verb;

    /**
     * Gets the value of the accepts property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeList }
     *     
     */
    public ContentTypeList getAccepts() {
        return accepts;
    }

    /**
     * Sets the value of the accepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeList }
     *     
     */
    public void setAccepts(ContentTypeList value) {
        this.accepts = value;
    }

    /**
     * Gets the value of the produces property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeList }
     *     
     */
    public ContentTypeList getProduces() {
        return produces;
    }

    /**
     * Sets the value of the produces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeList }
     *     
     */
    public void setProduces(ContentTypeList value) {
        this.produces = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link HttpMethod }
     *     
     */
    public HttpMethod getVerb() {
        if (verb == null) {
            return HttpMethod.GET;
        } else {
            return verb;
        }
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpMethod }
     *     
     */
    public void setVerb(HttpMethod value) {
        this.verb = value;
    }

}
