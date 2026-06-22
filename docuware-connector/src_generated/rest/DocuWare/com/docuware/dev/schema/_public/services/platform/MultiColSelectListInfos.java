
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of multi column select list objects.
 * 
 * &lt;p&gt;Java class for MultiColSelectListInfos complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColSelectListInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiColSelectLists" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListInfos", propOrder = {
    "multiColSelectLists"
})
public class MultiColSelectListInfos {

    /**
     * List of multi column select lists.
     * 
     */
    @XmlElement(name = "MultiColSelectLists")
    protected List<MultiColSelectListInfo> multiColSelectLists;

    /**
     * List of multi column select lists.
     * 
     * Gets the value of the multiColSelectLists property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the multiColSelectLists property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMultiColSelectLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiColSelectListInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the multiColSelectLists property.
     */
    public List<MultiColSelectListInfo> getMultiColSelectLists() {
        if (multiColSelectLists == null) {
            multiColSelectLists = new ArrayList<>();
        }
        return this.multiColSelectLists;
    }

}
