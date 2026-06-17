
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IncludeDataFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ExportHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ExportTextshots" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportSettings")
public class ExportSettings {

    @XmlAttribute(name = "IncludeDataFiles")
    protected Boolean includeDataFiles;
    @XmlAttribute(name = "ExportHistory")
    protected Boolean exportHistory;
    @XmlAttribute(name = "ExportTextshots")
    protected Boolean exportTextshots;

    /**
     * Gets the value of the includeDataFiles property.
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
     */
    public void setIncludeDataFiles(Boolean value) {
        this.includeDataFiles = value;
    }

    /**
     * Gets the value of the exportHistory property.
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
     */
    public void setExportHistory(Boolean value) {
        this.exportHistory = value;
    }

    /**
     * Gets the value of the exportTextshots property.
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
     */
    public void setExportTextshots(Boolean value) {
        this.exportTextshots = value;
    }

}
