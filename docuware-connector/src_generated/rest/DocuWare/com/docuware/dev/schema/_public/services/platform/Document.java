
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev._public.intellix.DocumentContent;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for Document complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFields"/&gt;
 *         &lt;element name="Flags" type="{http://dev.docuware.com/schema/public/services/platform}DocumentFlags" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://dev.docuware.com/schema/public/services/platform}DocumentVersion" minOccurs="0"/&gt;
 *         &lt;element name="TextShot" type="{http://dev.docuware.com/public/intellix}DocumentContent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *         &lt;element name="Sections" type="{http://dev.docuware.com/schema/public/services/platform}Sections" minOccurs="0"/&gt;
 *         &lt;element name="Preview" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileChunk" type="{http://dev.docuware.com/schema/public/services/platform}UploadedFileChunk" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationProperties" type="{http://dev.docuware.com/schema/public/services/platform}DocumentApplicationProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HaveMoreTotalPages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="HasTextAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="HasXmlDigitalSignatures" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AnnotationsPreview" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" default="0" /&gt;
 *       &lt;attribute name="SectionCount" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="IntellixTrust" type="{http://dev.docuware.com/schema/public/services/platform}IntellixTrust" default="None" /&gt;
 *       &lt;attribute name="VersionStatus" type="{http://dev.docuware.com/schema/public/services/platform}VersionManagementStatus" default="Disable" /&gt;
 *       &lt;attribute name="ExternalContentLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fields",
    "flags",
    "version",
    "textShot",
    "links",
    "sections",
    "preview",
    "contentType",
    "fileChunk",
    "applicationProperties"
})
public class Document {

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
    protected DocumentFlags flags;
    /**
     * Version of a document
     * 
     */
    @XmlElement(name = "Version")
    protected DocumentVersion version;
    /**
     * Obsolete. Use TextShots property. Content textshot (OCR) of the document
     * 
     */
    @XmlElement(name = "TextShot")
    protected List<DocumentContent> textShot;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Sections of the document. Contain no sections if document is DBRecord
     * 
     */
    @XmlElement(name = "Sections")
    protected Sections sections;
    /**
     * Contains an XHTML preview of the document. This can be used to display a part of text which contains the hits of a full-text query.
     * 
     */
    @XmlElement(name = "Preview")
    protected Document.Preview preview;
    /**
     * The internet media type of the document. If there is no section this value is missing.
     * 
     */
    @XmlElement(name = "ContentType")
    protected String contentType;
    /**
     * Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.
     * 
     */
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;
    /**
     * Defines application specific properties. Different applications store specific application here
     * 
     */
    @XmlElement(name = "ApplicationProperties")
    protected DocumentApplicationProperties applicationProperties;
    /**
     * Contains true if all pages are known so PageCount contains exact number the pages in section. If the value is set to false there are more pagesm but at least the number set in PageCount
     * 
     */
    @XmlAttribute(name = "HaveMoreTotalPages")
    protected Boolean haveMoreTotalPages;
    /**
     * Contains true if document has a text annotation (the first section of the document has text annotation)
     * 
     */
    @XmlAttribute(name = "HasTextAnnotation")
    protected Boolean hasTextAnnotation;
    /**
     * Contains true if document contains at least one XML Digital signature
     * 
     */
    @XmlAttribute(name = "HasXmlDigitalSignatures")
    protected Boolean hasXmlDigitalSignatures;
    /**
     * Contains true if the document may contain any annotations on the first section and first page.
     *           If this is false there is no need the AnnotationsAsImage link to be called.
     * 
     */
    @XmlAttribute(name = "AnnotationsPreview")
    protected Boolean annotationsPreview;
    /**
     * The number of pages of this section, if known. If it is unknown, this value is -1.
     * 
     */
    @XmlAttribute(name = "TotalPages")
    protected Integer totalPages;
    /**
     * Document identity
     * 
     */
    @XmlAttribute(name = "Id")
    protected Integer id;
    /**
     * The title of the document, if it exists.
     * 
     */
    @XmlAttribute(name = "Title")
    protected String title;
    /**
     * Contains last modification date of the document
     * 
     */
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    /**
     * Contains creation date of the document
     * 
     */
    @XmlAttribute(name = "CreatedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    /**
     * The sum of the size of all section files and document header.
     * 
     */
    @XmlAttribute(name = "FileSize")
    protected Long fileSize;
    /**
     * The number of sections of this document. This number is equal to the sequence length of the Sections element.
     * 
     */
    @XmlAttribute(name = "SectionCount")
    protected Integer sectionCount;
    /**
     * Intellix status
     * 
     */
    @XmlAttribute(name = "IntellixTrust")
    protected IntellixTrust intellixTrust;
    /**
     * Version management status of the document
     * 
     */
    @XmlAttribute(name = "VersionStatus")
    protected VersionManagementStatus versionStatus;
    /**
     * Defines the location of the document if it is stored outside of the system
     * 
     */
    @XmlAttribute(name = "ExternalContentLocation")
    protected String externalContentLocation;

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
     *     {@link DocumentFlags }
     *     
     */
    public DocumentFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFlags }
     *     
     * @see #getFlags()
     */
    public void setFlags(DocumentFlags value) {
        this.flags = value;
    }

    /**
     * Version of a document
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersion }
     *     
     */
    public DocumentVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersion }
     *     
     * @see #getVersion()
     */
    public void setVersion(DocumentVersion value) {
        this.version = value;
    }

    /**
     * Obsolete. Use TextShots property. Content textshot (OCR) of the document
     * 
     * Gets the value of the textShot property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the textShot property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextShot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentContent }
     * </p>
     * 
     * 
     * @return
     *     The value of the textShot property.
     */
    public List<DocumentContent> getTextShot() {
        if (textShot == null) {
            textShot = new ArrayList<>();
        }
        return this.textShot;
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
     * Sections of the document. Contain no sections if document is DBRecord
     * 
     * @return
     *     possible object is
     *     {@link Sections }
     *     
     */
    public Sections getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sections }
     *     
     * @see #getSections()
     */
    public void setSections(Sections value) {
        this.sections = value;
    }

    /**
     * Contains an XHTML preview of the document. This can be used to display a part of text which contains the hits of a full-text query.
     * 
     * @return
     *     possible object is
     *     {@link Document.Preview }
     *     
     */
    public Document.Preview getPreview() {
        return preview;
    }

    /**
     * Sets the value of the preview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Preview }
     *     
     * @see #getPreview()
     */
    public void setPreview(Document.Preview value) {
        this.preview = value;
    }

    /**
     * The internet media type of the document. If there is no section this value is missing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContentType()
     */
    public void setContentType(String value) {
        this.contentType = value;
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

    /**
     * Defines application specific properties. Different applications store specific application here
     * 
     * @return
     *     possible object is
     *     {@link DocumentApplicationProperties }
     *     
     */
    public DocumentApplicationProperties getApplicationProperties() {
        return applicationProperties;
    }

    /**
     * Sets the value of the applicationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentApplicationProperties }
     *     
     * @see #getApplicationProperties()
     */
    public void setApplicationProperties(DocumentApplicationProperties value) {
        this.applicationProperties = value;
    }

    /**
     * Contains true if all pages are known so PageCount contains exact number the pages in section. If the value is set to false there are more pagesm but at least the number set in PageCount
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHaveMoreTotalPages() {
        if (haveMoreTotalPages == null) {
            return false;
        } else {
            return haveMoreTotalPages;
        }
    }

    /**
     * Sets the value of the haveMoreTotalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHaveMoreTotalPages()
     */
    public void setHaveMoreTotalPages(Boolean value) {
        this.haveMoreTotalPages = value;
    }

    /**
     * Contains true if document has a text annotation (the first section of the document has text annotation)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasTextAnnotation() {
        if (hasTextAnnotation == null) {
            return false;
        } else {
            return hasTextAnnotation;
        }
    }

    /**
     * Sets the value of the hasTextAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasTextAnnotation()
     */
    public void setHasTextAnnotation(Boolean value) {
        this.hasTextAnnotation = value;
    }

    /**
     * Contains true if document contains at least one XML Digital signature
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasXmlDigitalSignatures() {
        if (hasXmlDigitalSignatures == null) {
            return false;
        } else {
            return hasXmlDigitalSignatures;
        }
    }

    /**
     * Sets the value of the hasXmlDigitalSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasXmlDigitalSignatures()
     */
    public void setHasXmlDigitalSignatures(Boolean value) {
        this.hasXmlDigitalSignatures = value;
    }

    /**
     * Contains true if the document may contain any annotations on the first section and first page.
     *           If this is false there is no need the AnnotationsAsImage link to be called.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnnotationsPreview() {
        if (annotationsPreview == null) {
            return false;
        } else {
            return annotationsPreview;
        }
    }

    /**
     * Sets the value of the annotationsPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnnotationsPreview()
     */
    public void setAnnotationsPreview(Boolean value) {
        this.annotationsPreview = value;
    }

    /**
     * The number of pages of this section, if known. If it is unknown, this value is -1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTotalPages() {
        if (totalPages == null) {
            return  0;
        } else {
            return totalPages;
        }
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTotalPages()
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * Document identity
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getId()
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * The title of the document, if it exists.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTitle()
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Contains last modification date of the document
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLastModified()
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Contains creation date of the document
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreatedAt()
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * The sum of the size of all section files and document header.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getFileSize() {
        if (fileSize == null) {
            return  0L;
        } else {
            return fileSize;
        }
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getFileSize()
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * The number of sections of this document. This number is equal to the sequence length of the Sections element.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSectionCount() {
        if (sectionCount == null) {
            return  0;
        } else {
            return sectionCount;
        }
    }

    /**
     * Sets the value of the sectionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSectionCount()
     */
    public void setSectionCount(Integer value) {
        this.sectionCount = value;
    }

    /**
     * Intellix status
     * 
     * @return
     *     possible object is
     *     {@link IntellixTrust }
     *     
     */
    public IntellixTrust getIntellixTrust() {
        if (intellixTrust == null) {
            return IntellixTrust.NONE;
        } else {
            return intellixTrust;
        }
    }

    /**
     * Sets the value of the intellixTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntellixTrust }
     *     
     * @see #getIntellixTrust()
     */
    public void setIntellixTrust(IntellixTrust value) {
        this.intellixTrust = value;
    }

    /**
     * Version management status of the document
     * 
     * @return
     *     possible object is
     *     {@link VersionManagementStatus }
     *     
     */
    public VersionManagementStatus getVersionStatus() {
        if (versionStatus == null) {
            return VersionManagementStatus.DISABLE;
        } else {
            return versionStatus;
        }
    }

    /**
     * Sets the value of the versionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionManagementStatus }
     *     
     * @see #getVersionStatus()
     */
    public void setVersionStatus(VersionManagementStatus value) {
        this.versionStatus = value;
    }

    /**
     * Defines the location of the document if it is stored outside of the system
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalContentLocation() {
        return externalContentLocation;
    }

    /**
     * Sets the value of the externalContentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExternalContentLocation()
     */
    public void setExternalContentLocation(String value) {
        this.externalContentLocation = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='skip'/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Preview {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
