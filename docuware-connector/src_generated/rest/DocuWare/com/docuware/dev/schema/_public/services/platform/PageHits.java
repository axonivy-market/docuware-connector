
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a set pages where of words are found
 * 
 * <p>Java class for PageHits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageHits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageHit" type="{http://dev.docuware.com/schema/public/services/platform}WordSearchResultPageHit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageHits", propOrder = {
    "pageHit"
})
public class PageHits {

    @XmlElement(name = "PageHit")
    protected List<WordSearchResultPageHit> pageHit;

    /**
     * Gets the value of the pageHit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageHit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageHit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WordSearchResultPageHit }
     * 
     * 
     */
    public List<WordSearchResultPageHit> getPageHit() {
        if (pageHit == null) {
            pageHit = new ArrayList<WordSearchResultPageHit>();
        }
        return this.pageHit;
    }

}
