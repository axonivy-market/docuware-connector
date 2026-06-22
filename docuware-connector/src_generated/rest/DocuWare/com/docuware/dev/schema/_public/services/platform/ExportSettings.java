
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExportSettings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IncludeDataFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ExportHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ExportTextshots" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportSettings")
public class ExportSettings {

    /**
     * Gets or sets a value indicating whether the document's section data files has to be exported.
     * 
     */
    @XmlAttribute(name = "IncludeDataFiles")
    protected Boolean includeDataFiles;
    /**
     * Gets or sets a value indicating whether the document's versions has to be exported.
     * 
     */
    @XmlAttribute(name = "ExportHistory")
    protected Boolean exportHistory;
    /**
     * Gets or sets a value indicating whether the document's textshot has to be exported.
     * 
     */
    @XmlAttribute(name = "ExportTextshots")
    protected Boolean exportTextshots;

    /**
     * Gets or sets a value indicating whether the document's section data files has to be exported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeDataFiles() {
        if (includeDataFiles == null) {
            return true;
        } else {
            return includeDataFiles;
        }
    }

    /**
     * Sets the value of the includeDataFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeDataFiles()
     */
    public void setIncludeDataFiles(Boolean value) {
        this.includeDataFiles = value;
    }

    /**
     * Gets or sets a value indicating whether the document's versions has to be exported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExportHistory() {
        if (exportHistory == null) {
            return false;
        } else {
            return exportHistory;
        }
    }

    /**
     * Sets the value of the exportHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExportHistory()
     */
    public void setExportHistory(Boolean value) {
        this.exportHistory = value;
    }

    /**
     * Gets or sets a value indicating whether the document's textshot has to be exported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExportTextshots() {
        if (exportTextshots == null) {
            return false;
        } else {
            return exportTextshots;
        }
    }

    /**
     * Sets the value of the exportTextshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExportTextshots()
     */
    public void setExportTextshots(Boolean value) {
        this.exportTextshots = value;
    }

}
