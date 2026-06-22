
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A description form.
 * 
 * &lt;p&gt;Java class for DescriptionFormField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DescriptionFormField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}BaseForm"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkParameters" type="{http://dev.docuware.com/schema/public/services/platform/workflow}LinkParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DescriptionText" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionFormField", propOrder = {
    "linkParameters"
})
public class DescriptionFormField
    extends BaseForm
{

    /**
     * List of link parameters.
     * 
     */
    @XmlElement(name = "LinkParameters")
    protected List<LinkParameter> linkParameters;
    /**
     * Text of the description.
     *               Consumer should replaces the format item or items in the specified string with the string representation of the corresponding LinkParameters as html links.
     * 
     */
    @XmlAttribute(name = "DescriptionText", required = true)
    protected String descriptionText;

    /**
     * List of link parameters.
     * 
     * Gets the value of the linkParameters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the linkParameters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinkParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkParameter }
     * </p>
     * 
     * 
     * @return
     *     The value of the linkParameters property.
     */
    public List<LinkParameter> getLinkParameters() {
        if (linkParameters == null) {
            linkParameters = new ArrayList<>();
        }
        return this.linkParameters;
    }

    /**
     * Text of the description.
     *               Consumer should replaces the format item or items in the specified string with the string representation of the corresponding LinkParameters as html links.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescriptionText()
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
