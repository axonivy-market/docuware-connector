
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MultiFCSearches complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiFCSearches"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Configurations" type="{http://dev.docuware.com/schema/public/services/platform}MultiFCSearchConfiguration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="_ignore_me" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiFCSearches", propOrder = {
    "configurations"
})
public class MultiFCSearches {

    @XmlElement(name = "Configurations")
    protected List<MultiFCSearchConfiguration> configurations;
    @XmlAttribute(name = "_ignore_me")
    protected Boolean ignoreMe;

    /**
     * Gets the value of the configurations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the configurations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiFCSearchConfiguration }
     * </p>
     * 
     * 
     * @return
     *     The value of the configurations property.
     */
    public List<MultiFCSearchConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<>();
        }
        return this.configurations;
    }

    /**
     * Gets the value of the ignoreMe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreMe() {
        if (ignoreMe == null) {
            return false;
        } else {
            return ignoreMe;
        }
    }

    /**
     * Sets the value of the ignoreMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreMe(Boolean value) {
        this.ignoreMe = value;
    }

}
