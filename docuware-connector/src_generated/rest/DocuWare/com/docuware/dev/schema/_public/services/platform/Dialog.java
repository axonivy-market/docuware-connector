
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Dialog complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Dialog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}DialogFields"/&gt;
 *         &lt;element name="Query" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQuery" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://dev.docuware.com/schema/public/services/platform}DialogProperties"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dialog", propOrder = {
    "fields",
    "query",
    "properties"
})
public class Dialog
    extends DialogInfo
{

    /**
     * The fields of this dialog.
     * 
     */
    @XmlElement(name = "Fields", required = true)
    protected DialogFields fields;
    /**
     * The query defined by this dialog.
     * 
     */
    @XmlElement(name = "Query")
    protected DocumentsQuery query;
    /**
     * Dialog properties specific for dialog type.
     * 
     */
    @XmlElement(name = "Properties", required = true)
    protected DialogProperties properties;
    /**
     * A value indicating whether the dialog has configured client side validation.This option is available only for store and info dialogs, for other dialog types it is always false.
     * 
     */
    @XmlAttribute(name = "HasValidation")
    protected Boolean hasValidation;

    /**
     * The fields of this dialog.
     * 
     * @return
     *     possible object is
     *     {@link DialogFields }
     *     
     */
    public DialogFields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogFields }
     *     
     * @see #getFields()
     */
    public void setFields(DialogFields value) {
        this.fields = value;
    }

    /**
     * The query defined by this dialog.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQuery }
     *     
     */
    public DocumentsQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQuery }
     *     
     * @see #getQuery()
     */
    public void setQuery(DocumentsQuery value) {
        this.query = value;
    }

    /**
     * Dialog properties specific for dialog type.
     * 
     * @return
     *     possible object is
     *     {@link DialogProperties }
     *     
     */
    public DialogProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogProperties }
     *     
     * @see #getProperties()
     */
    public void setProperties(DialogProperties value) {
        this.properties = value;
    }

    /**
     * A value indicating whether the dialog has configured client side validation.This option is available only for store and info dialogs, for other dialog types it is always false.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasValidation() {
        if (hasValidation == null) {
            return false;
        } else {
            return hasValidation;
        }
    }

    /**
     * Sets the value of the hasValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasValidation()
     */
    public void setHasValidation(Boolean value) {
        this.hasValidation = value;
    }

}
