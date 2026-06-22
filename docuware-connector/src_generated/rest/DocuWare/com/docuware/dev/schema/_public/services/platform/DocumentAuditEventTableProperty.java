
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the description of auditing event table property.
 * 
 * &lt;p&gt;Java class for DocumentAuditEventTableProperty complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentAuditEventTableProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Column" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAuditEventTablePropertyColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OldValues" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAuditEventTablePropertyValues" minOccurs="0"/&gt;
 *         &lt;element name="NewValues" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAuditEventTablePropertyValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PropertyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAuditEventTableProperty", propOrder = {
    "column",
    "oldValues",
    "newValues"
})
public class DocumentAuditEventTableProperty {

    /**
     * Gets or sets the list of audit event table property columns.
     * 
     */
    @XmlElement(name = "Column")
    protected List<DocumentAuditEventTablePropertyColumn> column;
    /**
     * Gets or sets the list of audit event table property rows.
     * 
     */
    @XmlElement(name = "OldValues")
    protected DocumentAuditEventTablePropertyValues oldValues;
    /**
     * Gets or sets the list of audit event table property rows.
     * 
     */
    @XmlElement(name = "NewValues")
    protected DocumentAuditEventTablePropertyValues newValues;
    /**
     * Gets or sets the name of the table property that has been changed.
     * 
     */
    @XmlAttribute(name = "PropertyName", required = true)
    protected String propertyName;

    /**
     * Gets or sets the list of audit event table property columns.
     * 
     * Gets the value of the column property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the column property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAuditEventTablePropertyColumn }
     * </p>
     * 
     * 
     * @return
     *     The value of the column property.
     */
    public List<DocumentAuditEventTablePropertyColumn> getColumn() {
        if (column == null) {
            column = new ArrayList<>();
        }
        return this.column;
    }

    /**
     * Gets or sets the list of audit event table property rows.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAuditEventTablePropertyValues }
     *     
     */
    public DocumentAuditEventTablePropertyValues getOldValues() {
        return oldValues;
    }

    /**
     * Sets the value of the oldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAuditEventTablePropertyValues }
     *     
     * @see #getOldValues()
     */
    public void setOldValues(DocumentAuditEventTablePropertyValues value) {
        this.oldValues = value;
    }

    /**
     * Gets or sets the list of audit event table property rows.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAuditEventTablePropertyValues }
     *     
     */
    public DocumentAuditEventTablePropertyValues getNewValues() {
        return newValues;
    }

    /**
     * Sets the value of the newValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAuditEventTablePropertyValues }
     *     
     * @see #getNewValues()
     */
    public void setNewValues(DocumentAuditEventTablePropertyValues value) {
        this.newValues = value;
    }

    /**
     * Gets or sets the name of the table property that has been changed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPropertyName()
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

}
