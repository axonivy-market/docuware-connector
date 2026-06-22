
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GetTemplateImageInput complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="GetTemplateImageInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TemplateGUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTemplateImageInput")
public class GetTemplateImageInput {

    /**
     * GUID for the uploaded template
     * 
     */
    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;
    /**
     * File Name
     * 
     */
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    /**
     * Page Number
     * 
     */
    @XmlAttribute(name = "PageNumber", required = true)
    protected int pageNumber;

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
     * File Name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileName()
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Page Number
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
