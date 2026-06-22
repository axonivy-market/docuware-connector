
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SelectListFilter complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkflowFieldId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListFilter", propOrder = {
    "columnName",
    "workflowFieldId"
})
@XmlSeeAlso({
    TableSelectListFilter.class
})
public class SelectListFilter {

    /**
     * Data source column name that will be used for filtering
     * 
     */
    @XmlElement(name = "ColumnName")
    protected String columnName;
    /**
     * The form field Id that will be used for filtering
     * 
     */
    @XmlElement(name = "WorkflowFieldId")
    protected int workflowFieldId;

    /**
     * Data source column name that will be used for filtering
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColumnName()
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * The form field Id that will be used for filtering
     * 
     */
    public int getWorkflowFieldId() {
        return workflowFieldId;
    }

    /**
     * Sets the value of the workflowFieldId property.
     * 
     */
    public void setWorkflowFieldId(int value) {
        this.workflowFieldId = value;
    }

}
