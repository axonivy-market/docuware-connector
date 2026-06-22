
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dialog properties specific for Result List
 * 
 * &lt;p&gt;Java class for DialogPropertiesResultList complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogPropertiesResultList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Functions" type="{http://dev.docuware.com/schema/public/services/platform}ResultDialogFunction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ViewerDialog" type="{http://dev.docuware.com/schema/public/services/platform}ViewerDialog"/&gt;
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DefaultListTextLetterCase" use="required" type="{http://dev.docuware.com/schema/public/services/platform}LetterCase" /&gt;
 *       &lt;attribute name="DisplayFirstDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowCheckedOutDocumens" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesResultList", propOrder = {
    "functions",
    "viewerDialog",
    "sortOrder"
})
@XmlSeeAlso({
    DialogPropertiesTaskList.class
})
public class DialogPropertiesResultList
    extends DialogProperties
{

    /**
     * Functions available for the result list (Print document, Display document, etc.)
     * 
     */
    @XmlElement(name = "Functions")
    protected List<ResultDialogFunction> functions;
    /**
     * Viewer properties
     * 
     */
    @XmlElement(name = "ViewerDialog", required = true)
    protected ViewerDialog viewerDialog;
    /**
     * Sort order for the result list.
     * 
     */
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    /**
     * Letter case to be used to display the hits in the result list
     * 
     */
    @XmlAttribute(name = "DefaultListTextLetterCase", required = true)
    protected LetterCase defaultListTextLetterCase;
    /**
     * Determines whether the web client automatically displays the first document in the result list in the viewer.
     * 
     */
    @XmlAttribute(name = "DisplayFirstDocument", required = true)
    protected boolean displayFirstDocument;
    /**
     * Determines whether the result list can show documents that are currently checked out.
     * 
     */
    @XmlAttribute(name = "ShowCheckedOutDocumens")
    protected Boolean showCheckedOutDocumens;

    /**
     * Functions available for the result list (Print document, Display document, etc.)
     * 
     * Gets the value of the functions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the functions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultDialogFunction }
     * </p>
     * 
     * 
     * @return
     *     The value of the functions property.
     */
    public List<ResultDialogFunction> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<>();
        }
        return this.functions;
    }

    /**
     * Viewer properties
     * 
     * @return
     *     possible object is
     *     {@link ViewerDialog }
     *     
     */
    public ViewerDialog getViewerDialog() {
        return viewerDialog;
    }

    /**
     * Sets the value of the viewerDialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerDialog }
     *     
     * @see #getViewerDialog()
     */
    public void setViewerDialog(ViewerDialog value) {
        this.viewerDialog = value;
    }

    /**
     * Sort order for the result list.
     * 
     * @return
     *     possible object is
     *     {@link SortedFieldsList }
     *     
     */
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedFieldsList }
     *     
     * @see #getSortOrder()
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**
     * Letter case to be used to display the hits in the result list
     * 
     * @return
     *     possible object is
     *     {@link LetterCase }
     *     
     */
    public LetterCase getDefaultListTextLetterCase() {
        return defaultListTextLetterCase;
    }

    /**
     * Sets the value of the defaultListTextLetterCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterCase }
     *     
     * @see #getDefaultListTextLetterCase()
     */
    public void setDefaultListTextLetterCase(LetterCase value) {
        this.defaultListTextLetterCase = value;
    }

    /**
     * Determines whether the web client automatically displays the first document in the result list in the viewer.
     * 
     */
    public boolean isDisplayFirstDocument() {
        return displayFirstDocument;
    }

    /**
     * Sets the value of the displayFirstDocument property.
     * 
     */
    public void setDisplayFirstDocument(boolean value) {
        this.displayFirstDocument = value;
    }

    /**
     * Determines whether the result list can show documents that are currently checked out.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowCheckedOutDocumens() {
        if (showCheckedOutDocumens == null) {
            return false;
        } else {
            return showCheckedOutDocumens;
        }
    }

    /**
     * Sets the value of the showCheckedOutDocumens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowCheckedOutDocumens()
     */
    public void setShowCheckedOutDocumens(Boolean value) {
        this.showCheckedOutDocumens = value;
    }

}
