
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CopyTemplateResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CopyTemplateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TemplateGUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyTemplateResult")
public class CopyTemplateResult {

    /**
     * GUID for the uploaded template
     * 
     */
    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;

    /**
     * GUID for the uploaded template
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateGUID() {
        return templateGUID;
    }

    /**
     * Sets the value of the templateGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTemplateGUID()
     */
    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }

}
