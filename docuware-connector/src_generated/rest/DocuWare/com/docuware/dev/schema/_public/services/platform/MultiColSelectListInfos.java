
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of multi column select list objects.
 * 
 * <p>Java class for MultiColSelectListInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiColSelectListInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiColSelectLists" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListInfos", propOrder = {
    "multiColSelectLists"
})
public class MultiColSelectListInfos {

    @XmlElement(name = "MultiColSelectLists")
    protected List<MultiColSelectListInfo> multiColSelectLists;

    /**
     * Gets the value of the multiColSelectLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiColSelectLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiColSelectLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiColSelectListInfo }
     * 
     * 
     */
    public List<MultiColSelectListInfo> getMultiColSelectLists() {
        if (multiColSelectLists == null) {
            multiColSelectLists = new ArrayList<MultiColSelectListInfo>();
        }
        return this.multiColSelectLists;
    }

}
