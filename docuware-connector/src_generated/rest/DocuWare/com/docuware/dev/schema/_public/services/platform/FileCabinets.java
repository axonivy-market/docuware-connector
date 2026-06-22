
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Lsit of file cabinets or document trays(web baskets).
 * 
 * &lt;p&gt;Java class for FileCabinets complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileCabinet" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinets", propOrder = {
    "fileCabinet"
})
public class FileCabinets {

    /**
     * Lsit of file cabinets or document trays(web baskets).
     * 
     */
    @XmlElement(name = "FileCabinet")
    protected List<FileCabinet> fileCabinet;

    /**
     * Lsit of file cabinets or document trays(web baskets).
     * 
     * Gets the value of the fileCabinet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fileCabinet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileCabinet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCabinet }
     * </p>
     * 
     * 
     * @return
     *     The value of the fileCabinet property.
     */
    public List<FileCabinet> getFileCabinet() {
        if (fileCabinet == null) {
            fileCabinet = new ArrayList<>();
        }
        return this.fileCabinet;
    }

}
