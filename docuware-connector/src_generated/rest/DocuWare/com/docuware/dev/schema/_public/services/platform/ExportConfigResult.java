
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExportConfigResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExportConfigResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FileName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileData" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportConfigResult")
public class ExportConfigResult {

    /**
     * File Name
     * 
     */
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    /**
     * Binary file data
     * 
     */
    @XmlAttribute(name = "FileData", required = true)
    protected String fileData;

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
     * Binary file data
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileData()
     */
    public void setFileData(String value) {
        this.fileData = value;
    }

}
