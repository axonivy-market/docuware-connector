
package com.docuware.dev.schema._public.services;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of uri templates.
 * 
 * &lt;p&gt;Java class for UriTemplateDescriptions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UriTemplateDescriptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Template" type="{http://dev.docuware.com/schema/public/services}UriTemplateDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescriptions", propOrder = {
    "template"
})
public class UriTemplateDescriptions {

    @XmlElement(name = "Template")
    protected List<UriTemplateDescription> template;

    /**
     * Gets the value of the template property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the template property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UriTemplateDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the template property.
     */
    public List<UriTemplateDescription> getTemplate() {
        if (template == null) {
            template = new ArrayList<>();
        }
        return this.template;
    }

}
