
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CommonFormField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CommonFormField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}BaseForm"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrefillValue" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WFFormFieldValue"/&gt;
 *         &lt;element name="SelectListFilters" type="{http://dev.docuware.com/schema/public/services/platform/workflow}SelectListFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HasSelectList" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsReadOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsSelectListOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SelectListGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectListColumn" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsHiddenInStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFormField", propOrder = {
    "prefillValue",
    "selectListFilters"
})
@XmlSeeAlso({
    MultiValueField.class,
    TaskDateTimeField.class,
    TaskTextField.class,
    TaskNumberField.class
})
public class CommonFormField
    extends BaseForm
{

    /**
     * Default value of the form field.
     * 
     */
    @XmlElement(name = "PrefillValue", required = true)
    protected WFFormFieldValue prefillValue;
    /**
     * Multi column condition used to filter the select list
     * 
     */
    @XmlElement(name = "SelectListFilters")
    protected List<SelectListFilter> selectListFilters;
    /**
     * Determines whether the field can be empty.
     * 
     */
    @XmlAttribute(name = "Mandatory", required = true)
    protected boolean mandatory;
    /**
     * Description of the field.
     * 
     */
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    /**
     * Determines whether the field value can be selected from a select list.
     * 
     */
    @XmlAttribute(name = "HasSelectList", required = true)
    protected boolean hasSelectList;
    /**
     * Determines whether the field is read only.
     * 
     */
    @XmlAttribute(name = "IsReadOnly", required = true)
    protected boolean isReadOnly;
    /**
     * If this flag is true, no one can allocate a new entry for this field when confirming a task, unless this is contained in a selection list or empty.
     * 
     */
    @XmlAttribute(name = "IsSelectListOnly", required = true)
    protected boolean isSelectListOnly;
    /**
     * Identifier of the select list.
     * 
     */
    @XmlAttribute(name = "SelectListGuid", required = true)
    protected String selectListGuid;
    /**
     * Identifier of the select list column that will be used to populate the form field.
     * 
     */
    @XmlAttribute(name = "SelectListColumn", required = true)
    protected String selectListColumn;
    /**
     * Determines whether the field can be showned in stamps.
     * 
     */
    @XmlAttribute(name = "IsHiddenInStamp", required = true)
    protected boolean isHiddenInStamp;

    /**
     * Default value of the form field.
     * 
     * @return
     *     possible object is
     *     {@link WFFormFieldValue }
     *     
     */
    public WFFormFieldValue getPrefillValue() {
        return prefillValue;
    }

    /**
     * Sets the value of the prefillValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFFormFieldValue }
     *     
     * @see #getPrefillValue()
     */
    public void setPrefillValue(WFFormFieldValue value) {
        this.prefillValue = value;
    }

    /**
     * Multi column condition used to filter the select list
     * 
     * Gets the value of the selectListFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the selectListFilters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectListFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectListFilter }
     * </p>
     * 
     * 
     * @return
     *     The value of the selectListFilters property.
     */
    public List<SelectListFilter> getSelectListFilters() {
        if (selectListFilters == null) {
            selectListFilters = new ArrayList<>();
        }
        return this.selectListFilters;
    }

    /**
     * Determines whether the field can be empty.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Description of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Determines whether the field value can be selected from a select list.
     * 
     */
    public boolean isHasSelectList() {
        return hasSelectList;
    }

    /**
     * Sets the value of the hasSelectList property.
     * 
     */
    public void setHasSelectList(boolean value) {
        this.hasSelectList = value;
    }

    /**
     * Determines whether the field is read only.
     * 
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     */
    public void setIsReadOnly(boolean value) {
        this.isReadOnly = value;
    }

    /**
     * If this flag is true, no one can allocate a new entry for this field when confirming a task, unless this is contained in a selection list or empty.
     * 
     */
    public boolean isIsSelectListOnly() {
        return isSelectListOnly;
    }

    /**
     * Sets the value of the isSelectListOnly property.
     * 
     */
    public void setIsSelectListOnly(boolean value) {
        this.isSelectListOnly = value;
    }

    /**
     * Identifier of the select list.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListGuid() {
        return selectListGuid;
    }

    /**
     * Sets the value of the selectListGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSelectListGuid()
     */
    public void setSelectListGuid(String value) {
        this.selectListGuid = value;
    }

    /**
     * Identifier of the select list column that will be used to populate the form field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListColumn() {
        return selectListColumn;
    }

    /**
     * Sets the value of the selectListColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSelectListColumn()
     */
    public void setSelectListColumn(String value) {
        this.selectListColumn = value;
    }

    /**
     * Determines whether the field can be showned in stamps.
     * 
     */
    public boolean isIsHiddenInStamp() {
        return isHiddenInStamp;
    }

    /**
     * Sets the value of the isHiddenInStamp property.
     * 
     */
    public void setIsHiddenInStamp(boolean value) {
        this.isHiddenInStamp = value;
    }

}
