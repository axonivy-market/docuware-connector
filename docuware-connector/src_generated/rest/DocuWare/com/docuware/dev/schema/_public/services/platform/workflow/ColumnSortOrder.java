
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.platform.SortDirection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A sort by a specific column.
 * 
 * &lt;p&gt;Java class for ColumnSortOrder complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ColumnSortOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ColumnId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Direction" use="required" type="{http://dev.docuware.com/schema/public/services/platform}SortDirection" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnSortOrder")
public class ColumnSortOrder {

    /**
     * Column identifier.
     * 
     */
    @XmlAttribute(name = "ColumnId", required = true)
    protected String columnId;
    /**
     * A sort direction.
     * 
     */
    @XmlAttribute(name = "Direction", required = true)
    protected SortDirection direction;

    /**
     * Column identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * Sets the value of the columnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColumnId()
     */
    public void setColumnId(String value) {
        this.columnId = value;
    }

    /**
     * A sort direction.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     * @see #getDirection()
     */
    public void setDirection(SortDirection value) {
        this.direction = value;
    }

}
