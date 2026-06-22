
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specific data for append action
 * 
 * &lt;p&gt;Java class for AppendActionParameters complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AppendActionParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemoveSourceDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="DocumentsInFront" type="{http://dev.docuware.com/schema/public/services/platform}AppendActionDocuments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="DocumentsAtBack" type="{http://dev.docuware.com/schema/public/services/platform}AppendActionDocuments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendActionParameters", propOrder = {
    "removeSourceDocuments",
    "documentsInFront",
    "documentsAtBack"
})
public class AppendActionParameters
    extends DocumentActionParameters
{

    /**
     * Indicates whether to delete the documents from source cabinet
     * 
     */
    @XmlElement(name = "RemoveSourceDocuments", defaultValue = "true")
    protected boolean removeSourceDocuments;
    /**
     * Info for the documents to be attached before the target document
     * 
     */
    @XmlElement(name = "DocumentsInFront")
    protected List<AppendActionDocuments> documentsInFront;
    /**
     * Info for the documents to be attached after the target document
     * 
     */
    @XmlElement(name = "DocumentsAtBack")
    protected List<AppendActionDocuments> documentsAtBack;

    /**
     * Indicates whether to delete the documents from source cabinet
     * 
     */
    public boolean isRemoveSourceDocuments() {
        return removeSourceDocuments;
    }

    /**
     * Sets the value of the removeSourceDocuments property.
     * 
     */
    public void setRemoveSourceDocuments(boolean value) {
        this.removeSourceDocuments = value;
    }

    /**
     * Info for the documents to be attached before the target document
     * 
     * Gets the value of the documentsInFront property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentsInFront property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentsInFront().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendActionDocuments }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentsInFront property.
     */
    public List<AppendActionDocuments> getDocumentsInFront() {
        if (documentsInFront == null) {
            documentsInFront = new ArrayList<>();
        }
        return this.documentsInFront;
    }

    /**
     * Info for the documents to be attached after the target document
     * 
     * Gets the value of the documentsAtBack property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentsAtBack property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentsAtBack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendActionDocuments }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentsAtBack property.
     */
    public List<AppendActionDocuments> getDocumentsAtBack() {
        if (documentsAtBack == null) {
            documentsAtBack = new ArrayList<>();
        }
        return this.documentsAtBack;
    }

}
