
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains a word with its bounding box.
 * 
 * &lt;p&gt;Java class for Word complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Word"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://dev.docuware.com/public/intellix&gt;SimpleWord"&gt;
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}FontDescriptionAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Word")
public class Word
    extends SimpleWord
{

    @XmlAttribute(name = "bold")
    protected Boolean bold;
    /**
     * The font size in twpis. E.g. a font of size 10pt has a value of 200.
     * 
     */
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    /**
     * Gets the value of the bold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBold() {
        return bold;
    }

    /**
     * Sets the value of the bold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * The font size in twpis. E.g. a font of size 10pt has a value of 200.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFontSize()
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

}
