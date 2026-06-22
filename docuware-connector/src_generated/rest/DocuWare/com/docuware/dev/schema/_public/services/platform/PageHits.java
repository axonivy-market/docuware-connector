
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains a set pages where of words are found
 * 
 * &lt;p&gt;Java class for PageHits complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PageHits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageHit" type="{http://dev.docuware.com/schema/public/services/platform}WordSearchResultPageHit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageHits", propOrder = {
    "pageHit"
})
public class PageHits {

    /**
     * Define a set pages where of words are found
     * 
     */
    @XmlElement(name = "PageHit")
    protected List<WordSearchResultPageHit> pageHit;

    /**
     * Define a set pages where of words are found
     * 
     * Gets the value of the pageHit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pageHit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPageHit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WordSearchResultPageHit }
     * </p>
     * 
     * 
     * @return
     *     The value of the pageHit property.
     */
    public List<WordSearchResultPageHit> getPageHit() {
        if (pageHit == null) {
            pageHit = new ArrayList<>();
        }
        return this.pageHit;
    }

}
