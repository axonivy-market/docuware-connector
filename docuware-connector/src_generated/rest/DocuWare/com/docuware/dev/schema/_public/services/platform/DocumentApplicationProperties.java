
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define application specific properties. Different applications store specific application here
 * 
 * <p>Java class for DocumentApplicationProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentApplicationProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentApplicationProperty" type="{http://dev.docuware.com/schema/public/services/platform}DocumentApplicationProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentApplicationProperties", propOrder = {
    "documentApplicationProperty"
})
public class DocumentApplicationProperties {

    @XmlElement(name = "DocumentApplicationProperty")
    protected List<DocumentApplicationProperty> documentApplicationProperty;

    /**
     * Gets the value of the documentApplicationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentApplicationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentApplicationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentApplicationProperty }
     * 
     * 
     */
    public List<DocumentApplicationProperty> getDocumentApplicationProperty() {
        if (documentApplicationProperty == null) {
            documentApplicationProperty = new ArrayList<DocumentApplicationProperty>();
        }
        return this.documentApplicationProperty;
    }

}
