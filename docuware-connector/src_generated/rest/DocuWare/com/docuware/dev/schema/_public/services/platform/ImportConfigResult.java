
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ImportConfigResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImportConfigResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ConfigJSON" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportConfigResult")
public class ImportConfigResult {

    /**
     * FormConfig as JSON
     * 
     */
    @XmlAttribute(name = "ConfigJSON", required = true)
    protected String configJSON;

    /**
     * FormConfig as JSON
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigJSON() {
        return configJSON;
    }

    /**
     * Sets the value of the configJSON property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfigJSON()
     */
    public void setConfigJSON(String value) {
        this.configJSON = value;
    }

}
