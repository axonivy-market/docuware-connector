
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define application specific properties. Different applications store specific application here
 * 
 * &lt;p&gt;Java class for DocumentApplicationProperties complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentApplicationProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentApplicationProperty" type="{http://dev.docuware.com/schema/public/services/platform}DocumentApplicationProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentApplicationProperties", propOrder = {
    "documentApplicationProperty"
})
public class DocumentApplicationProperties {

    /**
     * Define application specific properties. Different applications store specific application here
     * 
     */
    @XmlElement(name = "DocumentApplicationProperty")
    protected List<DocumentApplicationProperty> documentApplicationProperty;

    /**
     * Define application specific properties. Different applications store specific application here
     * 
     * Gets the value of the documentApplicationProperty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentApplicationProperty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentApplicationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentApplicationProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentApplicationProperty property.
     */
    public List<DocumentApplicationProperty> getDocumentApplicationProperty() {
        if (documentApplicationProperty == null) {
            documentApplicationProperty = new ArrayList<>();
        }
        return this.documentApplicationProperty;
    }

}
