
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableSelectListFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableSelectListFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}SelectListFilter"&gt;
 *       &lt;attribute name="TableFieldColumnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableSelectListFilter")
public class TableSelectListFilter
    extends SelectListFilter
{

    @XmlAttribute(name = "TableFieldColumnName")
    protected String tableFieldColumnName;

    /**
     * Gets the value of the tableFieldColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableFieldColumnName() {
        return tableFieldColumnName;
    }

    /**
     * Sets the value of the tableFieldColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableFieldColumnName(String value) {
        this.tableFieldColumnName = value;
    }

}
