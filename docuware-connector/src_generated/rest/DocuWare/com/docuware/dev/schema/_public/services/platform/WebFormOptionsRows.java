
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of options for a check box or radio group
 * 
 * &lt;p&gt;Java class for WebFormOptionsRows complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WebFormOptionsRows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebFormOptions" type="{http://dev.docuware.com/schema/public/services/platform}WebFormOptions" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormOptionsRows", propOrder = {
    "webFormOptions"
})
public class WebFormOptionsRows {

    @XmlElement(name = "WebFormOptions", required = true)
    protected List<WebFormOptions> webFormOptions;

    /**
     * Gets the value of the webFormOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the webFormOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWebFormOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebFormOptions }
     * </p>
     * 
     * 
     * @return
     *     The value of the webFormOptions property.
     */
    public List<WebFormOptions> getWebFormOptions() {
        if (webFormOptions == null) {
            webFormOptions = new ArrayList<>();
        }
        return this.webFormOptions;
    }

}
