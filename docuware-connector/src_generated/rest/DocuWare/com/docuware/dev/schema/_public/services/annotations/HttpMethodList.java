
package com.docuware.dev.schema._public.services.annotations;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HttpMethodList complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HttpMethodList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Method" type="{http://dev.docuware.com/schema/public/services/annotations}HttpMethod" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpMethodList", propOrder = {
    "method"
})
public class HttpMethodList {

    @XmlElement(name = "Method", required = true)
    @XmlSchemaType(name = "string")
    protected List<HttpMethod> method;
    /**
     * If this is true than there are no other methods are expected than the specified.
     * 
     */
    @XmlAttribute(name = "IsComplete")
    protected Boolean isComplete;

    /**
     * Gets the value of the method property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the method property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpMethod }
     * </p>
     * 
     * 
     * @return
     *     The value of the method property.
     */
    public List<HttpMethod> getMethod() {
        if (method == null) {
            method = new ArrayList<>();
        }
        return this.method;
    }

    /**
     * If this is true than there are no other methods are expected than the specified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsComplete() {
        if (isComplete == null) {
            return false;
        } else {
            return isComplete;
        }
    }

    /**
     * Sets the value of the isComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsComplete()
     */
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }

}
