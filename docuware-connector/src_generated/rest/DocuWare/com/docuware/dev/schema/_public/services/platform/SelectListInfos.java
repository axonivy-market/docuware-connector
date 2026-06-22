
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of select list information objects.
 * 
 * &lt;p&gt;Java class for SelectListInfos complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SelectListInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectLists" type="{http://dev.docuware.com/schema/public/services/platform}SelectListInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListInfos", propOrder = {
    "selectLists"
})
public class SelectListInfos {

    /**
     * List of select lists information.
     * 
     */
    @XmlElement(name = "SelectLists")
    protected List<SelectListInfo> selectLists;

    /**
     * List of select lists information.
     * 
     * Gets the value of the selectLists property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the selectLists property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectListInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the selectLists property.
     */
    public List<SelectListInfo> getSelectLists() {
        if (selectLists == null) {
            selectLists = new ArrayList<>();
        }
        return this.selectLists;
    }

}
