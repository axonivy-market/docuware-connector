
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The expression for counting a documents.
 * 
 * &lt;p&gt;Java class for CountExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CountExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogExpression" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountExpression", propOrder = {
    "dialogExpression"
})
public class CountExpression {

    /**
     * The expression with already filled values.
     * 
     */
    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    /**
     * The database name of the dialog field whose groups are to be counted. In case
     * 					you want only the number of hits matching the dialog expression just leave this field empty.
     * 
     */
    @XmlAttribute(name = "FieldName")
    protected String fieldName;
    /**
     * Limit the count up to specified value. Used for optimization and currently affecting only general count (when FieldName is not specified)
     * 
     */
    @XmlAttribute(name = "Limit")
    protected Integer limit;

    /**
     * The expression with already filled values.
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
     * The database name of the dialog field whose groups are to be counted. In case
     * 					you want only the number of hits matching the dialog expression just leave this field empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Limit the count up to specified value. Used for optimization and currently affecting only general count (when FieldName is not specified)
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLimit()
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

}
