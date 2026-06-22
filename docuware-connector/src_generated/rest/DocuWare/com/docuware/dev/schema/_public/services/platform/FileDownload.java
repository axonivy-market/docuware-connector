
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define how a document can be downloaded
 * 
 * &lt;p&gt;Java class for FileDownload complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownload")
public class FileDownload
    extends FileDownloadBase
{

    /**
     * Specifies the target format (target file type) of the downloaded file.
     * 
     */
    @XmlAttribute(name = "TargetFileType")
    protected FileDownloadType targetFileType;
    /**
     * If you have a browser plugin installed which shows you the content a PDF file in the browser directly then this
     *           flag can be used to override this behaviour and let the browser open a "Save file" box.
     * 
     */
    @XmlAttribute(name = "DirectDownload")
    protected Boolean directDownload;
    /**
     * This flag applies only to the PDF target format.
     * 
     */
    @XmlAttribute(name = "AutoPrint")
    protected Boolean autoPrint;
    /**
     * This flag applies only to the PDF target format.
     * 
     */
    @XmlAttribute(name = "SendByEmail")
    protected Boolean sendByEmail;

    /**
     * Specifies the target format (target file type) of the downloaded file.
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
     * @see #getTargetFileType()
     */
    public void setTargetFileType(FileDownloadType value) {
        this.targetFileType = value;
    }

    /**
     * If you have a browser plugin installed which shows you the content a PDF file in the browser directly then this
     *           flag can be used to override this behaviour and let the browser open a "Save file" box.
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
     * @see #isDirectDownload()
     */
    public void setDirectDownload(Boolean value) {
        this.directDownload = value;
    }

    /**
     * This flag applies only to the PDF target format.
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
     * @see #isAutoPrint()
     */
    public void setAutoPrint(Boolean value) {
        this.autoPrint = value;
    }

    /**
     * This flag applies only to the PDF target format.
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
     * @see #isSendByEmail()
     */
    public void setSendByEmail(Boolean value) {
        this.sendByEmail = value;
    }

}
