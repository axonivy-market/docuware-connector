
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of rights.
 * 
 * &lt;p&gt;Java class for ConfigurationRights complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ConfigurationRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigurationRight" type="{http://dev.docuware.com/schema/public/services/platform}ConfigurationRight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRights", propOrder = {
    "configurationRight"
})
public class ConfigurationRights {

    /**
     * List of configuration rights.
     * 
     */
    @XmlElement(name = "ConfigurationRight")
    @XmlSchemaType(name = "string")
    protected List<ConfigurationRight> configurationRight;

    /**
     * List of configuration rights.
     * 
     * Gets the value of the configurationRight property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the configurationRight property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigurationRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationRight }
     * </p>
     * 
     * 
     * @return
     *     The value of the configurationRight property.
     */
    public List<ConfigurationRight> getConfigurationRight() {
        if (configurationRight == null) {
            configurationRight = new ArrayList<>();
        }
        return this.configurationRight;
    }

}
