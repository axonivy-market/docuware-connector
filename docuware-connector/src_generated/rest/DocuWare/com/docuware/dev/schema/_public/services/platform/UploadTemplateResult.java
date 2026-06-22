
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UploadTemplateResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UploadTemplateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TemplateGUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalNumberOfPages" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadTemplateResult")
public class UploadTemplateResult {

    /**
     * GUID for the uploaded template
     * 
     */
    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;
    /**
     * Total Page Count
     * 
     */
    @XmlAttribute(name = "TotalNumberOfPages", required = true)
    protected int totalNumberOfPages;

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

    /**
     * Total Page Count
     * 
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**
     * Sets the value of the totalNumberOfPages property.
     * 
     */
    public void setTotalNumberOfPages(int value) {
        this.totalNumberOfPages = value;
    }

}
