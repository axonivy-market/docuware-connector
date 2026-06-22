
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TableSelectListFilter complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableSelectListFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}SelectListFilter"&gt;
 *       &lt;attribute name="TableFieldColumnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableSelectListFilter")
public class TableSelectListFilter
    extends SelectListFilter
{

    /**
     * Column name of the table field that will be used for filtering
     * 
     */
    @XmlAttribute(name = "TableFieldColumnName")
    protected String tableFieldColumnName;

    /**
     * Column name of the table field that will be used for filtering
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
     * @see #getTableFieldColumnName()
     */
    public void setTableFieldColumnName(String value) {
        this.tableFieldColumnName = value;
    }

}
