
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SuggestionValue complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SuggestionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValueBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionValue", propOrder = {
    "source"
})
@XmlSeeAlso({
    SuggestionCellValue.class
})
public class SuggestionValue
    extends DocumentIndexFieldValueBase
{

    @XmlElement(name = "Source")
    protected PointAndShootInfo source;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link PointAndShootInfo }
     *     
     */
    public PointAndShootInfo getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAndShootInfo }
     *     
     */
    public void setSource(PointAndShootInfo value) {
        this.source = value;
    }

}
