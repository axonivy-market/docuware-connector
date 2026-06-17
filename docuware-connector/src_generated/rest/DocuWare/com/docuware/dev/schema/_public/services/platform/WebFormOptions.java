
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of options for a check box or radio group
 * 
 * <p>Java class for WebFormOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebFormOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebFormOption" type="{http://dev.docuware.com/schema/public/services/platform}WebFormOption" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormOptions", propOrder = {
    "webFormOption"
})
public class WebFormOptions {

    @XmlElement(name = "WebFormOption", required = true)
    protected List<WebFormOption> webFormOption;

    /**
     * Gets the value of the webFormOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webFormOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebFormOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebFormOption }
     * 
     * 
     */
    public List<WebFormOption> getWebFormOption() {
        if (webFormOption == null) {
            webFormOption = new ArrayList<WebFormOption>();
        }
        return this.webFormOption;
    }

}
