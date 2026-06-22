
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define fields mapping between source and destination file cabinets.
 * 
 * &lt;p&gt;Java class for FieldMappings complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FieldMappings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mapping" type="{http://dev.docuware.com/schema/public/services/platform}FieldMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldMappings", propOrder = {
    "mapping"
})
public class FieldMappings {

    /**
     * Gets or sets field mappings.
     * 
     */
    @XmlElement(name = "Mapping")
    protected List<FieldMapping> mapping;

    /**
     * Gets or sets field mappings.
     * 
     * Gets the value of the mapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the mapping property.
     */
    public List<FieldMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<>();
        }
        return this.mapping;
    }

}
