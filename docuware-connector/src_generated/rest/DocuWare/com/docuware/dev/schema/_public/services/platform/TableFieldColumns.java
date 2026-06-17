
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of file cabinet fields.
 * 
 * <p>Java class for TableFieldColumns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableFieldColumns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableFieldColumn" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFieldBase" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableFieldColumns", propOrder = {
    "tableFieldColumn"
})
public class TableFieldColumns {

    @XmlElement(name = "TableFieldColumn", required = true)
    protected List<FileCabinetFieldBase> tableFieldColumn;

    /**
     * Gets the value of the tableFieldColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableFieldColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableFieldColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCabinetFieldBase }
     * 
     * 
     */
    public List<FileCabinetFieldBase> getTableFieldColumn() {
        if (tableFieldColumn == null) {
            tableFieldColumn = new ArrayList<FileCabinetFieldBase>();
        }
        return this.tableFieldColumn;
    }

}
