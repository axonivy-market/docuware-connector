
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A columns definition.
 * 
 * &lt;p&gt;Java class for ColumnsDefinition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ColumnsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Column" type="{http://dev.docuware.com/schema/public/services/platform/workflow}Column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sort" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ColumnSortOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnsDefinition", propOrder = {
    "column",
    "sort"
})
public class ColumnsDefinition {

    /**
     * Columns for a workflow.
     * 
     */
    @XmlElement(name = "Column")
    protected List<Column> column;
    /**
     * Sort order of columns for a workflow.
     * 
     */
    @XmlElement(name = "Sort")
    protected List<ColumnSortOrder> sort;

    /**
     * Columns for a workflow.
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
     * {@link Column }
     * </p>
     * 
     * 
     * @return
     *     The value of the column property.
     */
    public List<Column> getColumn() {
        if (column == null) {
            column = new ArrayList<>();
        }
        return this.column;
    }

    /**
     * Sort order of columns for a workflow.
     * 
     * Gets the value of the sort property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sort property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnSortOrder }
     * </p>
     * 
     * 
     * @return
     *     The value of the sort property.
     */
    public List<ColumnSortOrder> getSort() {
        if (sort == null) {
            sort = new ArrayList<>();
        }
        return this.sort;
    }

}
