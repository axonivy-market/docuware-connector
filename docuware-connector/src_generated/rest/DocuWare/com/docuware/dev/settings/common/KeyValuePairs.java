
package com.docuware.dev.settings.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains a sequence of key-value pairs.
 * 
 * &lt;p&gt;Java class for KeyValuePairs complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="KeyValuePairs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" type="{http://dev.docuware.com/settings/common}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairs", propOrder = {
    "entry"
})
public class KeyValuePairs {

    /**
     * A key-value pair entry.
     * 
     */
    @XmlElement(name = "Entry")
    protected List<KeyValuePair> entry;

    /**
     * A key-value pair entry.
     * 
     * Gets the value of the entry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * </p>
     * 
     * 
     * @return
     *     The value of the entry property.
     */
    public List<KeyValuePair> getEntry() {
        if (entry == null) {
            entry = new ArrayList<>();
        }
        return this.entry;
    }

}
