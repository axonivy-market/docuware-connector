
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base dialog field definition
 * 
 * &lt;p&gt;Java class for DialogFieldBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogFieldBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SampleEditText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrefillValue" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="DynamicPrefillValue" type="{http://dev.docuware.com/schema/public/services/platform}DynamicValueType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="SelectListInfos" type="{http://dev.docuware.com/schema/public/services/platform}SelectListInfos" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DBFieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DlgLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="NotEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="AllowExtendedSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AllowFiltering" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SelectListOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SelectListType" type="{http://dev.docuware.com/schema/public/services/platform}SelectListType" default="Standard" /&gt;
 *       &lt;attribute name="AssignedInternalSelectList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SequenceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectListsAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogFieldBase", propOrder = {
    "mask",
    "maskErrorText",
    "sampleEditText",
    "prefillValue",
    "dynamicPrefillValue",
    "selectListInfos",
    "links"
})
@XmlSeeAlso({
    DialogField.class
})
public class DialogFieldBase {

    /**
     * Mask(regular expression) for limiting the input options for the field.
     * 
     */
    @XmlElement(name = "Mask")
    protected String mask;
    /**
     * Error message to display if the input does not match the mask definition.
     * 
     */
    @XmlElement(name = "MaskErrorText", required = true)
    protected String maskErrorText;
    /**
     * Sample entry that matches the mask definition.
     * 
     */
    @XmlElement(name = "SampleEditText", required = true)
    protected String sampleEditText;
    /**
     * The default value of the field(s). If DynamicPrefillValue is not empty this property should be ignored.
     * 
     */
    @XmlElement(name = "PrefillValue")
    protected List<DocumentIndexFieldValue> prefillValue;
    /**
     * Dynamic (CurrentDate, CurrentDatetime, etc.) default value of the field(s).If this element is not empty PrefilValue shoud be ignored.
     * 
     */
    @XmlElement(name = "DynamicPrefillValue")
    @XmlSchemaType(name = "string")
    protected List<DynamicValueType> dynamicPrefillValue;
    /**
     * Gets a list with information for all assigned select lists.
     * 
     */
    @XmlElement(name = "SelectListInfos")
    protected SelectListInfos selectListInfos;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    /**
     * Name of field in the file cabinet.
     * 
     */
    @XmlAttribute(name = "DBFieldName", required = true)
    protected String dbFieldName;
    /**
     * Label (display name) of the field.
     * 
     */
    @XmlAttribute(name = "DlgLabel")
    protected String dlgLabel;
    /**
     * Determines whether the value of the field cannot be changed by the user.
     * 
     */
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    /**
     * Determines whether the field is read only, considering Locked property and user rights(Modify Right for info dialog, Write Right for store dialog)
     * 
     */
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;
    /**
     * Determines whether the field can be empty, considering NotEmpty in Field settings and Field may be empty Right
     * 
     */
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;
    /**
     * Determines whether the field is visible.
     * 
     */
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    /**
     * Length of the field (for text fields).
     * 
     */
    @XmlAttribute(name = "Length")
    protected Integer length;
    /**
     * The precision of this dialog field. This is derived from the file cabinet fields precision.
     * 
     */
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    /**
     * Use extended search
     * 
     */
    @XmlAttribute(name = "AllowExtendedSearch")
    protected Boolean allowExtendedSearch;
    /**
     * Allow extended filtering.
     * 
     */
    @XmlAttribute(name = "AllowFiltering")
    protected Boolean allowFiltering;
    /**
     * (Only relevant for store and info dialogs)If this flag is true, no one can allocate a new entry for this field when storing a document, unless this is contained in a selection list.
     * 
     */
    @XmlAttribute(name = "SelectListOnly")
    protected Boolean selectListOnly;
    /**
     * Type of the select list.
     * 
     */
    @XmlAttribute(name = "SelectListType")
    protected SelectListType selectListType;
    /**
     * A value indicating whether the internal select list is assigned.
     * 
     */
    @XmlAttribute(name = "AssignedInternalSelectList")
    protected Boolean assignedInternalSelectList;
    /**
     * The unique identifier of the sequence.
     * 
     */
    @XmlAttribute(name = "SequenceId")
    protected String sequenceId;
    /**
     * A value indicating whether the any select list is assigned.
     * 
     */
    @XmlAttribute(name = "SelectListsAssigned")
    protected Boolean selectListsAssigned;

    /**
     * Mask(regular expression) for limiting the input options for the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMask()
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Error message to display if the input does not match the mask definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskErrorText() {
        return maskErrorText;
    }

    /**
     * Sets the value of the maskErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaskErrorText()
     */
    public void setMaskErrorText(String value) {
        this.maskErrorText = value;
    }

    /**
     * Sample entry that matches the mask definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleEditText() {
        return sampleEditText;
    }

    /**
     * Sets the value of the sampleEditText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSampleEditText()
     */
    public void setSampleEditText(String value) {
        this.sampleEditText = value;
    }

    /**
     * The default value of the field(s). If DynamicPrefillValue is not empty this property should be ignored.
     * 
     * Gets the value of the prefillValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prefillValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrefillValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexFieldValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the prefillValue property.
     */
    public List<DocumentIndexFieldValue> getPrefillValue() {
        if (prefillValue == null) {
            prefillValue = new ArrayList<>();
        }
        return this.prefillValue;
    }

    /**
     * Dynamic (CurrentDate, CurrentDatetime, etc.) default value of the field(s).If this element is not empty PrefilValue shoud be ignored.
     * 
     * Gets the value of the dynamicPrefillValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dynamicPrefillValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDynamicPrefillValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicValueType }
     * </p>
     * 
     * 
     * @return
     *     The value of the dynamicPrefillValue property.
     */
    public List<DynamicValueType> getDynamicPrefillValue() {
        if (dynamicPrefillValue == null) {
            dynamicPrefillValue = new ArrayList<>();
        }
        return this.dynamicPrefillValue;
    }

    /**
     * Gets a list with information for all assigned select lists.
     * 
     * @return
     *     possible object is
     *     {@link SelectListInfos }
     *     
     */
    public SelectListInfos getSelectListInfos() {
        return selectListInfos;
    }

    /**
     * Sets the value of the selectListInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListInfos }
     *     
     * @see #getSelectListInfos()
     */
    public void setSelectListInfos(SelectListInfos value) {
        this.selectListInfos = value;
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
     * Name of field in the file cabinet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFieldName() {
        return dbFieldName;
    }

    /**
     * Sets the value of the dbFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDBFieldName()
     */
    public void setDBFieldName(String value) {
        this.dbFieldName = value;
    }

    /**
     * Label (display name) of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlgLabel() {
        return dlgLabel;
    }

    /**
     * Sets the value of the dlgLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDlgLabel()
     */
    public void setDlgLabel(String value) {
        this.dlgLabel = value;
    }

    /**
     * Determines whether the value of the field cannot be changed by the user.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocked() {
        if (locked == null) {
            return false;
        } else {
            return locked;
        }
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLocked()
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Determines whether the field is read only, considering Locked property and user rights(Modify Right for info dialog, Write Right for store dialog)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReadOnly()
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Determines whether the field can be empty, considering NotEmpty in Field settings and Field may be empty Right
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    /**
     * Sets the value of the notEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotEmpty()
     */
    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
    }

    /**
     * Determines whether the field is visible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVisible() {
        if (visible == null) {
            return false;
        } else {
            return visible;
        }
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVisible()
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Length of the field (for text fields).
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return -1;
        } else {
            return length;
        }
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLength()
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * The precision of this dialog field. This is derived from the file cabinet fields precision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPrecision()
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Use extended search
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowExtendedSearch() {
        if (allowExtendedSearch == null) {
            return false;
        } else {
            return allowExtendedSearch;
        }
    }

    /**
     * Sets the value of the allowExtendedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllowExtendedSearch()
     */
    public void setAllowExtendedSearch(Boolean value) {
        this.allowExtendedSearch = value;
    }

    /**
     * Allow extended filtering.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowFiltering() {
        if (allowFiltering == null) {
            return false;
        } else {
            return allowFiltering;
        }
    }

    /**
     * Sets the value of the allowFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllowFiltering()
     */
    public void setAllowFiltering(Boolean value) {
        this.allowFiltering = value;
    }

    /**
     * (Only relevant for store and info dialogs)If this flag is true, no one can allocate a new entry for this field when storing a document, unless this is contained in a selection list.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectListOnly() {
        if (selectListOnly == null) {
            return false;
        } else {
            return selectListOnly;
        }
    }

    /**
     * Sets the value of the selectListOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSelectListOnly()
     */
    public void setSelectListOnly(Boolean value) {
        this.selectListOnly = value;
    }

    /**
     * Type of the select list.
     * 
     * @return
     *     possible object is
     *     {@link SelectListType }
     *     
     */
    public SelectListType getSelectListType() {
        if (selectListType == null) {
            return SelectListType.STANDARD;
        } else {
            return selectListType;
        }
    }

    /**
     * Sets the value of the selectListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListType }
     *     
     * @see #getSelectListType()
     */
    public void setSelectListType(SelectListType value) {
        this.selectListType = value;
    }

    /**
     * A value indicating whether the internal select list is assigned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedInternalSelectList() {
        if (assignedInternalSelectList == null) {
            return false;
        } else {
            return assignedInternalSelectList;
        }
    }

    /**
     * Sets the value of the assignedInternalSelectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAssignedInternalSelectList()
     */
    public void setAssignedInternalSelectList(Boolean value) {
        this.assignedInternalSelectList = value;
    }

    /**
     * The unique identifier of the sequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSequenceId()
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * A value indicating whether the any select list is assigned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectListsAssigned() {
        if (selectListsAssigned == null) {
            return true;
        } else {
            return selectListsAssigned;
        }
    }

    /**
     * Sets the value of the selectListsAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSelectListsAssigned()
     */
    public void setSelectListsAssigned(Boolean value) {
        this.selectListsAssigned = value;
    }

}
