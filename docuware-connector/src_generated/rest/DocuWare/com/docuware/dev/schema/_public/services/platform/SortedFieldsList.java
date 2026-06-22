
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a list of sorted fields.
 * 
 * &lt;p&gt;Java class for SortedFieldsList complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SortedFieldsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderBy" type="{http://dev.docuware.com/schema/public/services/platform}SortedField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortedFieldsList", propOrder = {
    "orderBy"
})
public class SortedFieldsList {

    /**
     * A list of sorted fields
     * 
     */
    @XmlElement(name = "OrderBy")
    protected List<SortedField> orderBy;

    /**
     * A list of sorted fields
     * 
     * Gets the value of the orderBy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orderBy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortedField }
     * </p>
     * 
     * 
     * @return
     *     The value of the orderBy property.
     */
    public List<SortedField> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<>();
        }
        return this.orderBy;
    }

}
