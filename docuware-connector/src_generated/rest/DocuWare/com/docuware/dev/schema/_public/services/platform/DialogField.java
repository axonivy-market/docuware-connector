
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DialogField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogFieldBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogTableFieldColumns" type="{http://dev.docuware.com/schema/public/services/platform}DialogTableFieldColumns"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UsedAsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IsHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogField", propOrder = {
    "dialogTableFieldColumns"
})
public class DialogField
    extends DialogFieldBase
{

    /**
     * Only relevant for fields with "Table" DWFieldType. Columns of the table field.
     * 
     */
    @XmlElement(name = "DialogTableFieldColumns", required = true)
    protected DialogTableFieldColumns dialogTableFieldColumns;
    /**
     * Determines whether the field is used as document name.
     * 
     */
    @XmlAttribute(name = "UsedAsDocumentName")
    protected Boolean usedAsDocumentName;
    /**
     * Determines whether the field is part of the hierarchy structure of tree view result dialog (only for tree view result dialogs, for other types it's always false).
     * 
     */
    @XmlAttribute(name = "IsHierarchy")
    protected Boolean isHierarchy;

    /**
     * Only relevant for fields with "Table" DWFieldType. Columns of the table field.
     * 
     * @return
     *     possible object is
     *     {@link DialogTableFieldColumns }
     *     
     */
    public DialogTableFieldColumns getDialogTableFieldColumns() {
        return dialogTableFieldColumns;
    }

    /**
     * Sets the value of the dialogTableFieldColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogTableFieldColumns }
     *     
     * @see #getDialogTableFieldColumns()
     */
    public void setDialogTableFieldColumns(DialogTableFieldColumns value) {
        this.dialogTableFieldColumns = value;
    }

    /**
     * Determines whether the field is used as document name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsedAsDocumentName() {
        if (usedAsDocumentName == null) {
            return false;
        } else {
            return usedAsDocumentName;
        }
    }

    /**
     * Sets the value of the usedAsDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUsedAsDocumentName()
     */
    public void setUsedAsDocumentName(Boolean value) {
        this.usedAsDocumentName = value;
    }

    /**
     * Determines whether the field is part of the hierarchy structure of tree view result dialog (only for tree view result dialogs, for other types it's always false).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsHierarchy() {
        if (isHierarchy == null) {
            return false;
        } else {
            return isHierarchy;
        }
    }

    /**
     * Sets the value of the isHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsHierarchy()
     */
    public void setIsHierarchy(Boolean value) {
        this.isHierarchy = value;
    }

}
