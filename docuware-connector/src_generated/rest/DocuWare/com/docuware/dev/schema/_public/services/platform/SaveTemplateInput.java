
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Save Template
 * 
 * &lt;p&gt;Java class for SaveTemplateInput complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SaveTemplateInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Templates" type="{http://dev.docuware.com/schema/public/services/platform}FormTemplates"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveTemplateInput", propOrder = {
    "templates"
})
public class SaveTemplateInput {

    @XmlElement(name = "Templates", required = true)
    protected FormTemplates templates;

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link FormTemplates }
     *     
     */
    public FormTemplates getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormTemplates }
     *     
     */
    public void setTemplates(FormTemplates value) {
        this.templates = value;
    }

}
