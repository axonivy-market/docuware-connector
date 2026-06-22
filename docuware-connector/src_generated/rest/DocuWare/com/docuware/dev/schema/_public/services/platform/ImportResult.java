
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the result of the imported archive.
 * 
 * &lt;p&gt;Java class for ImportResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ImportResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Results" type="{http://dev.docuware.com/schema/public/services/platform}ImportResultEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ImportResult", propOrder = {
    "results",
    "fileChunk"
})
public class ImportResult {

    /**
     * A list with the sequence value of the documents that are not imported.
     * 
     */
    @XmlElement(name = "Results")
    protected List<ImportResultEntry> results;
    /**
     * Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.
     * 
     */
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;

    /**
     * A list with the sequence value of the documents that are not imported.
     * 
     * Gets the value of the results property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the results property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportResultEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the results property.
     */
    public List<ImportResultEntry> getResults() {
        if (results == null) {
            results = new ArrayList<>();
        }
        return this.results;
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
