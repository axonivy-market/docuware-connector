
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CellZone complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CellZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextZone" type="{http://dev.docuware.com/public/intellix}TextZone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellZone", propOrder = {
    "textZone"
})
public class CellZone
    extends RectangleBase
{

    @XmlElement(name = "TextZone")
    protected TextZone textZone;

    /**
     * Gets the value of the textZone property.
     * 
     * @return
     *     possible object is
     *     {@link TextZone }
     *     
     */
    public TextZone getTextZone() {
        return textZone;
    }

    /**
     * Sets the value of the textZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextZone }
     *     
     */
    public void setTextZone(TextZone value) {
        this.textZone = value;
    }

}
