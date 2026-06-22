
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeleteTemplatesInput complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DeleteTemplatesInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemplateGUIDS" type="{http://dev.docuware.com/schema/public/services/platform}TemplateGUIDS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTemplatesInput", propOrder = {
    "templateGUIDS"
})
public class DeleteTemplatesInput {

    @XmlElement(name = "TemplateGUIDS", required = true)
    protected TemplateGUIDS templateGUIDS;

    /**
     * Gets the value of the templateGUIDS property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateGUIDS }
     *     
     */
    public TemplateGUIDS getTemplateGUIDS() {
        return templateGUIDS;
    }

    /**
     * Sets the value of the templateGUIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateGUIDS }
     *     
     */
    public void setTemplateGUIDS(TemplateGUIDS value) {
        this.templateGUIDS = value;
    }

}
