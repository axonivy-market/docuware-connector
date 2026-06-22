
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FileCabinetField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinetField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFieldBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableFieldColumns" type="{http://dev.docuware.com/schema/public/services/platform}TableFieldColumns"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UsedAsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinetField", propOrder = {
    "tableFieldColumns"
})
public class FileCabinetField
    extends FileCabinetFieldBase
{

    /**
     * Only relevant for fields with "Table" DWFieldType. Columns of the table field.
     * 
     */
    @XmlElement(name = "TableFieldColumns", required = true)
    protected TableFieldColumns tableFieldColumns;
    /**
     * Determines whether the field is used as document name.
     * 
     */
    @XmlAttribute(name = "UsedAsDocumentName")
    protected Boolean usedAsDocumentName;

    /**
     * Only relevant for fields with "Table" DWFieldType. Columns of the table field.
     * 
     * @return
     *     possible object is
     *     {@link TableFieldColumns }
     *     
     */
    public TableFieldColumns getTableFieldColumns() {
        return tableFieldColumns;
    }

    /**
     * Sets the value of the tableFieldColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableFieldColumns }
     *     
     * @see #getTableFieldColumns()
     */
    public void setTableFieldColumns(TableFieldColumns value) {
        this.tableFieldColumns = value;
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

}
