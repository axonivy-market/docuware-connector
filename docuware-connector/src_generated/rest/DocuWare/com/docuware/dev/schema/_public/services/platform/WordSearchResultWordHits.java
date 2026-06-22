
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a a set of words and locations where they are found
 * 
 * &lt;p&gt;Java class for WordSearchResultWordHits complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WordSearchResultWordHits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wd" type="{http://dev.docuware.com/schema/public/services/platform}WordSearchResultWordHit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultWordHits", propOrder = {
    "wd"
})
public class WordSearchResultWordHits {

    /**
     * Define a a set of words and locations where they are found
     * 
     */
    @XmlElement(name = "Wd")
    protected List<WordSearchResultWordHit> wd;

    /**
     * Define a a set of words and locations where they are found
     * 
     * Gets the value of the wd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WordSearchResultWordHit }
     * </p>
     * 
     * 
     * @return
     *     The value of the wd property.
     */
    public List<WordSearchResultWordHit> getWd() {
        if (wd == null) {
            wd = new ArrayList<>();
        }
        return this.wd;
    }

}
