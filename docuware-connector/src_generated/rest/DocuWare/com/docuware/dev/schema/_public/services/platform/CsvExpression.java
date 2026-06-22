
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Query csv file.
 * 
 * &lt;p&gt;Java class for CsvExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CsvExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogExpression" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsUtc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsvExpression", propOrder = {
    "dialogExpression"
})
public class CsvExpression {

    /**
     * Gets or sets the conditions which are checked to obtain the search result.
     * 
     */
    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    /**
     * Specifies the delimiter for cvs' values.
     * 
     */
    @XmlAttribute(name = "Delimiter")
    protected String delimiter;
    /**
     * Specifies whether the time values to be in Utc or Local.
     * 
     */
    @XmlAttribute(name = "IsUtc")
    protected Boolean isUtc;

    /**
     * Gets or sets the conditions which are checked to obtain the search result.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    /**
     * Sets the value of the dialogExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     * @see #getDialogExpression()
     */
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**
     * Specifies the delimiter for cvs' values.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDelimiter()
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Specifies whether the time values to be in Utc or Local.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsUtc() {
        if (isUtc == null) {
            return true;
        } else {
            return isUtc;
        }
    }

    /**
     * Sets the value of the isUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsUtc()
     */
    public void setIsUtc(Boolean value) {
        this.isUtc = value;
    }

}
