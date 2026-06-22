
package com.docuware.dev.schema._public.services.annotations;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QueryParamater complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="QueryParamater"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="false" /&gt;
 *       &lt;attribute name="Type" type="{http://dev.docuware.com/schema/public/services/annotations}QueryParamaterType" default="String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParamater")
public class QueryParamater {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "IsRequired")
    @XmlSchemaType(name = "anySimpleType")
    protected String isRequired;
    @XmlAttribute(name = "Type")
    protected QueryParamaterType type;

    /**
     * Gets the value of the name property.
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
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequired() {
        if (isRequired == null) {
            return "false";
        } else {
            return isRequired;
        }
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequired(String value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParamaterType }
     *     
     */
    public QueryParamaterType getType() {
        if (type == null) {
            return QueryParamaterType.STRING;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParamaterType }
     *     
     */
    public void setType(QueryParamaterType value) {
        this.type = value;
    }

}
