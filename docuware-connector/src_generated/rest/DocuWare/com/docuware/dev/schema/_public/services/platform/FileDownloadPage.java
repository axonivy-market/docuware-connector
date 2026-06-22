
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FileDownloadPage complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileDownloadPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FileDownloadBase"&gt;
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
@XmlType(name = "FileDownloadPage")
public class FileDownloadPage
    extends FileDownloadBase
{

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
