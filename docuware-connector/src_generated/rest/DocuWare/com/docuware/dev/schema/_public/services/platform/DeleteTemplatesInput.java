
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteTemplatesInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteTemplatesInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemplateGUIDS" type="{http://dev.docuware.com/schema/public/services/platform}TemplateGUIDS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
