
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base file cabinet field definition
 * 
 * &lt;p&gt;Java class for FileCabinetFieldBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinetFieldBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FixedEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldInfoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Scope" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFieldScope" default="User" /&gt;
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="DBFieldName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DropLeadingZero" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DropLeadingBlanks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="NotEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinetFieldBase", propOrder = {
    "fixedEntry",
    "fieldInfoText"
})
@XmlSeeAlso({
    FileCabinetField.class
})
public class FileCabinetFieldBase {

    /**
     * Fixed value of the field.If it's null the field has no fixed value. Not relevant for fields with "Table" DWFieldType.
     * 
     */
    @XmlElement(name = "FixedEntry")
    protected String fixedEntry;
    /**
     * Description of the field.
     * 
     */
    @XmlElement(name = "FieldInfoText")
    protected String fieldInfoText;
    /**
     * Gets whether the field is a user or a system field.
     * 
     */
    @XmlAttribute(name = "Scope")
    protected FileCabinetFieldScope scope;
    /**
     * Length of the field (only for text fields).
     * 
     */
    @XmlAttribute(name = "Length")
    protected Integer length;
    /**
     * The name of the database column for the field.
     * 
     */
    @XmlAttribute(name = "DBFieldName")
    protected String dbFieldName;
    /**
     * Label (display name) of the field.
     * 
     */
    @XmlAttribute(name = "DisplayName")
    protected String displayName;
    /**
     * Determines whether the system will automatically remove any leading zeros. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.
     * 
     */
    @XmlAttribute(name = "DropLeadingZero")
    protected Boolean dropLeadingZero;
    /**
     * Determines whether the system will automatically remove any leading spaces. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.
     * 
     */
    @XmlAttribute(name = "DropLeadingBlanks")
    protected Boolean dropLeadingBlanks;
    /**
     * Obsolete since Lobster. Use the same property on dialog field and stamp form field.
     * 
     */
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;
    /**
     * The number of decimal places that can be entered after the decimal point of a numeric and decimal fields.
     * 
     */
    @XmlAttribute(name = "Precision")
    protected Integer precision;

    /**
     * Fixed value of the field.If it's null the field has no fixed value. Not relevant for fields with "Table" DWFieldType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedEntry() {
        return fixedEntry;
    }

    /**
     * Sets the value of the fixedEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFixedEntry()
     */
    public void setFixedEntry(String value) {
        this.fixedEntry = value;
    }

    /**
     * Description of the field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldInfoText() {
        return fieldInfoText;
    }

    /**
     * Sets the value of the fieldInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldInfoText()
     */
    public void setFieldInfoText(String value) {
        this.fieldInfoText = value;
    }

    /**
     * Gets whether the field is a user or a system field.
     * 
     * @return
     *     possible object is
     *     {@link FileCabinetFieldScope }
     *     
     */
    public FileCabinetFieldScope getScope() {
        if (scope == null) {
            return FileCabinetFieldScope.USER;
        } else {
            return scope;
        }
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCabinetFieldScope }
     *     
     * @see #getScope()
     */
    public void setScope(FileCabinetFieldScope value) {
        this.scope = value;
    }

    /**
     * Length of the field (only for text fields).
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return  0;
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
     * The name of the database column for the field.
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
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisplayName()
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Determines whether the system will automatically remove any leading zeros. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDropLeadingZero() {
        if (dropLeadingZero == null) {
            return false;
        } else {
            return dropLeadingZero;
        }
    }

    /**
     * Sets the value of the dropLeadingZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDropLeadingZero()
     */
    public void setDropLeadingZero(Boolean value) {
        this.dropLeadingZero = value;
    }

    /**
     * Determines whether the system will automatically remove any leading spaces. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDropLeadingBlanks() {
        if (dropLeadingBlanks == null) {
            return false;
        } else {
            return dropLeadingBlanks;
        }
    }

    /**
     * Sets the value of the dropLeadingBlanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDropLeadingBlanks()
     */
    public void setDropLeadingBlanks(Boolean value) {
        this.dropLeadingBlanks = value;
    }

    /**
     * Obsolete since Lobster. Use the same property on dialog field and stamp form field.
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
     * The number of decimal places that can be entered after the decimal point of a numeric and decimal fields.
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

}
