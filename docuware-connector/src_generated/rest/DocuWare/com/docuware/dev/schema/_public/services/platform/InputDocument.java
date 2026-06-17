
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java class for InputDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "Fields", required = true)
    protected DocumentIndexFields fields;
    @XmlElement(name = "Flags")
    protected InputFlags flags;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlElement(name = "Sections")
    protected InputSections sections;
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;

    /**
     * Gets the value of the fields property.
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
     */
    public void setFields(DocumentIndexFields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the flags property.
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
     * Gets the value of the sections property.
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
     */
    public void setSections(InputSections value) {
        this.sections = value;
    }

    /**
     * Gets the value of the fileChunk property.
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
     */
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
    }

}
