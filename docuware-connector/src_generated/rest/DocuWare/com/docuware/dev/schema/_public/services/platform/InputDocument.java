
package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InputDocument complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="InputDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFields"/&gt;
 *         &lt;element name="Flags" type="{http://dev.docuware.com/schema/public/services/platform}InputFlags" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *         &lt;element name="Sections" type="{http://dev.docuware.com/schema/public/services/platform}InputSections" minOccurs="0"/&gt;
 *         &lt;element name="FileChunk" type="{http://dev.docuware.com/schema/public/services/platform}UploadedFileChunk" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDocument", propOrder = {
    "fields",
    "flags",
    "links",
    "sections",
    "fileChunk"
})
public class InputDocument {

    /**
     * Fields of a document
     * 
     */
    @XmlElement(name = "Fields", required = true)
    protected DocumentIndexFields fields;
    /**
     * Flags of a document
     * 
     */
    @XmlElement(name = "Flags")
    protected InputFlags flags;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Sections of the document. Contains no sections if the document is DBRecord
     * 
     */
    @XmlElement(name = "Sections")
    protected InputSections sections;
    /**
     * Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.
     * 
     */
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;

    /**
     * Fields of a document
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFields }
     *     
     */
    public DocumentIndexFields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFields }
     *     
     * @see #getFields()
     */
    public void setFields(DocumentIndexFields value) {
        this.fields = value;
    }

    /**
     * Flags of a document
     * 
     * @return
     *     possible object is
     *     {@link InputFlags }
     *     
     */
    public InputFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFlags }
     *     
     * @see #getFlags()
     */
    public void setFlags(InputFlags value) {
        this.flags = value;
    }

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
     * Sections of the document. Contains no sections if the document is DBRecord
     * 
     * @return
     *     possible object is
     *     {@link InputSections }
     *     
     */
    public InputSections getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSections }
     *     
     * @see #getSections()
     */
    public void setSections(InputSections value) {
        this.sections = value;
    }

    /**
     * Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.
     * 
     * @return
     *     possible object is
     *     {@link UploadedFileChunk }
     *     
     */
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**
     * Sets the value of the fileChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadedFileChunk }
     *     
     * @see #getFileChunk()
     */
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
    }

}
