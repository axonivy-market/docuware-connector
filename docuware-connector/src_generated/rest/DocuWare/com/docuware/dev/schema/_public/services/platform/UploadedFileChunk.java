
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UploadedFileChunk complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UploadedFileChunk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Finished" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="LastChunkId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}long" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadedFileChunk", propOrder = {
    "links"
})
public class UploadedFileChunk {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Indicates that the last chunk has been uploaded.
     * 
     */
    @XmlAttribute(name = "Finished")
    protected Boolean finished;
    /**
     * The id of the last uploaded chunk.
     * 
     */
    @XmlAttribute(name = "LastChunkId")
    protected String lastChunkId;
    /**
     * The number of bytes written up to now.
     * 
     */
    @XmlAttribute(name = "BytesWritten")
    protected Long bytesWritten;

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Indicates that the last chunk has been uploaded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinished() {
        if (finished == null) {
            return false;
        } else {
            return finished;
        }
    }

    /**
     * Sets the value of the finished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFinished()
     */
    public void setFinished(Boolean value) {
        this.finished = value;
    }

    /**
     * The id of the last uploaded chunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChunkId() {
        return lastChunkId;
    }

    /**
     * Sets the value of the lastChunkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLastChunkId()
     */
    public void setLastChunkId(String value) {
        this.lastChunkId = value;
    }

    /**
     * The number of bytes written up to now.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getBytesWritten() {
        if (bytesWritten == null) {
            return  0L;
        } else {
            return bytesWritten;
        }
    }

    /**
     * Sets the value of the bytesWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getBytesWritten()
     */
    public void setBytesWritten(Long value) {
        this.bytesWritten = value;
    }

}
