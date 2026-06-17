
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of column values for table field.
 * 
 * <p>Java class for DocumentIndexFieldTableRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentIndexFieldTableRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ColumnValue" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldTableRow", propOrder = {
    "columnValue"
})
public class DocumentIndexFieldTableRow {

    @XmlElement(name = "ColumnValue")
    protected List<DocumentIndexField> columnValue;

    /**
     * Gets the value of the columnValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexField }
     * 
     * 
     */
    public List<DocumentIndexField> getColumnValue() {
        if (columnValue == null) {
            columnValue = new ArrayList<DocumentIndexField>();
        }
        return this.columnValue;
    }

}
