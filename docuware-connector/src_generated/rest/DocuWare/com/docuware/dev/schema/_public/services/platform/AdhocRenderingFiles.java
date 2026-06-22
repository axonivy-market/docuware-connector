
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A list of uploaded files prepared for adhoc rendering.
 * 
 * &lt;p&gt;Java class for AdhocRenderingFiles complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AdhocRenderingFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}AdhocRenderingFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocRenderingFiles", propOrder = {
    "item"
})
public class AdhocRenderingFiles {

    /**
     * Gets the pages of this file up to a server defined limit.
     * 
     */
    @XmlElement(name = "Item")
    protected List<AdhocRenderingFile> item;

    /**
     * Gets the pages of this file up to a server defined limit.
     * 
     * Gets the value of the item property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the item property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdhocRenderingFile }
     * </p>
     * 
     * 
     * @return
     *     The value of the item property.
     */
    public List<AdhocRenderingFile> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }

}
