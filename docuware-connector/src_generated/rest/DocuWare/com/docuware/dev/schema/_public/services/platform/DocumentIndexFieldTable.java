
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of column values for table field.
 * 
 * &lt;p&gt;Java class for DocumentIndexFieldTable complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentIndexFieldTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Row" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldTableRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldTable", propOrder = {
    "row"
})
public class DocumentIndexFieldTable {

    /**
     * List of values for table field.
     * 
     */
    @XmlElement(name = "Row")
    protected List<DocumentIndexFieldTableRow> row;

    /**
     * List of values for table field.
     * 
     * Gets the value of the row property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the row property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexFieldTableRow }
     * </p>
     * 
     * 
     * @return
     *     The value of the row property.
     */
    public List<DocumentIndexFieldTableRow> getRow() {
        if (row == null) {
            row = new ArrayList<>();
        }
        return this.row;
    }

}
