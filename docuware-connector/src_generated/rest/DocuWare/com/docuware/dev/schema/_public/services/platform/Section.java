
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a single section of a document
 * 
 * &lt;p&gt;Java class for Section complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Section"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignatureStatus" type="{http://dev.docuware.com/schema/public/services/platform}SignatureStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Pages" type="{http://dev.docuware.com/schema/public/services/platform}Pages" minOccurs="0"/&gt;
 *         &lt;element name="Thumbnails" type="{http://dev.docuware.com/schema/public/services/platform}Pages" minOccurs="0"/&gt;
 *         &lt;element name="FileChunk" type="{http://dev.docuware.com/schema/public/services/platform}UploadedFileChunk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HaveMorePages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" default="0" /&gt;
 *       &lt;attribute name="OriginalFileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentModified" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="HasTextAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AnnotationsPreview" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section", propOrder = {
    "signatureStatus",
    "pages",
    "thumbnails",
    "fileChunk",
    "links"
})
public class Section {

    /**
     * Define allowed operations when there is signature
     * 
     */
    @XmlElement(name = "SignatureStatus")
    @XmlSchemaType(name = "string")
    protected List<SignatureStatus> signatureStatus;
    /**
     * Note that not all pages are necessarily listed here; it depends on the server's choice. However you still can get all
     *             pages of a document when you follow the links specified in the Pages date.
     * 
     */
    @XmlElement(name = "Pages")
    protected Pages pages;
    /**
     * Similar to Pages, but contains only links and page number.
     * 
     */
    @XmlElement(name = "Thumbnails")
    protected Pages thumbnails;
    /**
     * Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.
     * 
     */
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Identity of the section
     * 
     */
    @XmlAttribute(name = "Id")
    protected String id;
    /**
     * The Internet media type of the section. If there is no section this value is missing.
     * 
     */
    @XmlAttribute(name = "ContentType")
    protected String contentType;
    /**
     * Contains true if all pages are known so PageCount contains exact number the pages in section. If the value is set to false there are more pagesm but at least the number set in PageCount
     * 
     */
    @XmlAttribute(name = "HaveMorePages")
    protected Boolean haveMorePages;
    /**
     * The number of pages of this section, if known. If it is unknown, this value is -1.
     * 
     */
    @XmlAttribute(name = "PageCount")
    protected Integer pageCount;
    /**
     * The size of the file in bytes.
     * 
     */
    @XmlAttribute(name = "FileSize")
    protected Long fileSize;
    /**
     * Original file name with extension
     * 
     */
    @XmlAttribute(name = "OriginalFileName")
    protected String originalFileName;
    /**
     * Time when content is last modified
     * 
     */
    @XmlAttribute(name = "ContentModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contentModified;
    /**
     * Contains true if the section has text annotation.
     * 
     */
    @XmlAttribute(name = "HasTextAnnotation")
    protected Boolean hasTextAnnotation;
    /**
     * Contains true if the section may contain any annotations on the first page.
     *           If this is false there is no need the AnnotationsAsImage link to be called.
     * 
     */
    @XmlAttribute(name = "AnnotationsPreview")
    protected Boolean annotationsPreview;

    /**
     * Define allowed operations when there is signature
     * 
     * Gets the value of the signatureStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the signatureStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignatureStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the signatureStatus property.
     */
    public List<SignatureStatus> getSignatureStatus() {
        if (signatureStatus == null) {
            signatureStatus = new ArrayList<>();
        }
        return this.signatureStatus;
    }

    /**
     * Note that not all pages are necessarily listed here; it depends on the server's choice. However you still can get all
     *             pages of a document when you follow the links specified in the Pages date.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     * @see #getPages()
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**
     * Similar to Pages, but contains only links and page number.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getThumbnails() {
        return thumbnails;
    }

    /**
     * Sets the value of the thumbnails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     * @see #getThumbnails()
     */
    public void setThumbnails(Pages value) {
        this.thumbnails = value;
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
     * Identity of the section
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * The Internet media type of the section. If there is no section this value is missing.
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
     * Contains true if all pages are known so PageCount contains exact number the pages in section. If the value is set to false there are more pagesm but at least the number set in PageCount
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHaveMorePages() {
        if (haveMorePages == null) {
            return false;
        } else {
            return haveMorePages;
        }
    }

    /**
     * Sets the value of the haveMorePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHaveMorePages()
     */
    public void setHaveMorePages(Boolean value) {
        this.haveMorePages = value;
    }

    /**
     * The number of pages of this section, if known. If it is unknown, this value is -1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPageCount() {
        if (pageCount == null) {
            return -1;
        } else {
            return pageCount;
        }
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPageCount()
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * The size of the file in bytes.
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
     * Original file name with extension
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Sets the value of the originalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalFileName()
     */
    public void setOriginalFileName(String value) {
        this.originalFileName = value;
    }

    /**
     * Time when content is last modified
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContentModified() {
        return contentModified;
    }

    /**
     * Sets the value of the contentModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContentModified()
     */
    public void setContentModified(XMLGregorianCalendar value) {
        this.contentModified = value;
    }

    /**
     * Contains true if the section has text annotation.
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
     * Contains true if the section may contain any annotations on the first page.
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

}
