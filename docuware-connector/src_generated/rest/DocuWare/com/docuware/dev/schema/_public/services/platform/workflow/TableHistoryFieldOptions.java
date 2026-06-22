
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TableHistoryFieldOptions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableHistoryFieldOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableColumnsDefinitions" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TableColumnsDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableHistoryFieldOptions", propOrder = {
    "tableColumnsDefinitions"
})
public class TableHistoryFieldOptions {

    /**
     * List of columns of the table field.
     * 
     */
    @XmlElement(name = "TableColumnsDefinitions")
    protected List<TableColumnsDefinition> tableColumnsDefinitions;

    /**
     * List of columns of the table field.
     * 
     * Gets the value of the tableColumnsDefinitions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tableColumnsDefinitions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTableColumnsDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableColumnsDefinition }
     * </p>
     * 
     * 
     * @return
     *     The value of the tableColumnsDefinitions property.
     */
    public List<TableColumnsDefinition> getTableColumnsDefinitions() {
        if (tableColumnsDefinitions == null) {
            tableColumnsDefinitions = new ArrayList<>();
        }
        return this.tableColumnsDefinitions;
    }

}
