
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Define how a document can be downloaded
 * 
 * <p>Java class for FileDownload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDownload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FileDownloadBase"&gt;
 *       &lt;attribute name="TargetFileType" type="{http://dev.docuware.com/schema/public/services/platform}FileDownloadType" default="Auto" /&gt;
 *       &lt;attribute name="DirectDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AutoPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SendByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownload")
public class FileDownload
    extends FileDownloadBase
{

    @XmlAttribute(name = "TargetFileType")
    protected FileDownloadType targetFileType;
    @XmlAttribute(name = "DirectDownload")
    protected Boolean directDownload;
    @XmlAttribute(name = "AutoPrint")
    protected Boolean autoPrint;
    @XmlAttribute(name = "SendByEmail")
    protected Boolean sendByEmail;

    /**
     * Gets the value of the targetFileType property.
     * 
     * @return
     *     possible object is
     *     {@link FileDownloadType }
     *     
     */
    public FileDownloadType getTargetFileType() {
        if (targetFileType == null) {
            return FileDownloadType.AUTO;
        } else {
            return targetFileType;
        }
    }

    /**
     * Sets the value of the targetFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDownloadType }
     *     
     */
    public void setTargetFileType(FileDownloadType value) {
        this.targetFileType = value;
    }

    /**
     * Gets the value of the directDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirectDownload() {
        if (directDownload == null) {
            return false;
        } else {
            return directDownload;
        }
    }

    /**
     * Sets the value of the directDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDownload(Boolean value) {
        this.directDownload = value;
    }

    /**
     * Gets the value of the autoPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoPrint() {
        if (autoPrint == null) {
            return false;
        } else {
            return autoPrint;
        }
    }

    /**
     * Sets the value of the autoPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPrint(Boolean value) {
        this.autoPrint = value;
    }

    /**
     * Gets the value of the sendByEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendByEmail() {
        if (sendByEmail == null) {
            return false;
        } else {
            return sendByEmail;
        }
    }

    /**
     * Sets the value of the sendByEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendByEmail(Boolean value) {
        this.sendByEmail = value;
    }

}
