
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of file cabinet fields.
 * 
 * &lt;p&gt;Java class for TableFieldColumns complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableFieldColumns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableFieldColumn" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFieldBase" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableFieldColumns", propOrder = {
    "tableFieldColumn"
})
public class TableFieldColumns {

    /**
     * List of table field columns.
     * 
     */
    @XmlElement(name = "TableFieldColumn", required = true)
    protected List<FileCabinetFieldBase> tableFieldColumn;

    /**
     * List of table field columns.
     * 
     * Gets the value of the tableFieldColumn property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tableFieldColumn property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTableFieldColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCabinetFieldBase }
     * </p>
     * 
     * 
     * @return
     *     The value of the tableFieldColumn property.
     */
    public List<FileCabinetFieldBase> getTableFieldColumn() {
        if (tableFieldColumn == null) {
            tableFieldColumn = new ArrayList<>();
        }
        return this.tableFieldColumn;
    }

}
