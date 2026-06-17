
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuggestionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValueBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
