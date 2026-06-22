
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Represents list of values to be used for checking existance in select lists.
 * 
 * &lt;p&gt;Java class for SelectListValuesToCheck complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListValuesToCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Values" type="{http://dev.docuware.com/schema/public/services/platform}SelectListValueToCheck" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListValuesToCheck", propOrder = {
    "values"
})
public class SelectListValuesToCheck {

    /**
     * List of multi column select lists.
     * 
     */
    @XmlElement(name = "Values")
    protected List<SelectListValueToCheck> values;

    /**
     * List of multi column select lists.
     * 
     * Gets the value of the values property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the values property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectListValueToCheck }
     * </p>
     * 
     * 
     * @return
     *     The value of the values property.
     */
    public List<SelectListValueToCheck> getValues() {
        if (values == null) {
            values = new ArrayList<>();
        }
        return this.values;
    }

}
