
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a purpose of the token. Can define some restrictions
 * 
 * &lt;p&gt;Java class for TokenDescription complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TokenDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetProducts" type="{http://dev.docuware.com/settings/interop}DWProductTypes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Usage" use="required" type="{http://dev.docuware.com/schema/public/services/platform}TokenUsage" /&gt;
 *       &lt;attribute name="Lifetime" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenDescription", propOrder = {
    "targetProducts"
})
public class TokenDescription {

    /**
     * The token can be used multiple times
     * 
     */
    @XmlElement(name = "TargetProducts")
    @XmlSchemaType(name = "string")
    protected List<DWProductTypes> targetProducts;
    /**
     * Define the usage of the token.
     * 
     */
    @XmlAttribute(name = "Usage", required = true)
    protected TokenUsage usage;
    /**
     * Lifetime of the token. After lifetime expires token cannot be used anymore. This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     */
    @XmlAttribute(name = "Lifetime", required = true)
    protected Duration lifetime;

    /**
     * The token can be used multiple times
     * 
     * Gets the value of the targetProducts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the targetProducts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTargetProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWProductTypes }
     * </p>
     * 
     * 
     * @return
     *     The value of the targetProducts property.
     */
    public List<DWProductTypes> getTargetProducts() {
        if (targetProducts == null) {
            targetProducts = new ArrayList<>();
        }
        return this.targetProducts;
    }

    /**
     * Define the usage of the token.
     * 
     * @return
     *     possible object is
     *     {@link TokenUsage }
     *     
     */
    public TokenUsage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenUsage }
     *     
     * @see #getUsage()
     */
    public void setUsage(TokenUsage value) {
        this.usage = value;
    }

    /**
     * Lifetime of the token. After lifetime expires token cannot be used anymore. This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getLifetime()
     */
    public void setLifetime(Duration value) {
        this.lifetime = value;
    }

}
