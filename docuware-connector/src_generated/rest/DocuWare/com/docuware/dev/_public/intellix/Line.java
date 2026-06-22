
package com.docuware.dev._public.intellix;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A line is a sequence of words.
 * 
 * &lt;p&gt;Java class for Line complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Line"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Sp" type="{http://dev.docuware.com/public/intellix}Space"/&gt;
 *           &lt;element name="Wd" type="{http://dev.docuware.com/public/intellix}Word"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}FontDescriptionAttributes"/&gt;
 *       &lt;attribute name="BaseLine" type="{http://dev.docuware.com/public/intellix}DistanceType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "spOrWd"
})
public class Line
    extends RectangleBase
{

    @XmlElements({
        @XmlElement(name = "Sp", type = Space.class),
        @XmlElement(name = "Wd", type = Word.class)
    })
    protected List<Object> spOrWd;
    @XmlAttribute(name = "BaseLine")
    protected Integer baseLine;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    /**
     * The font size in twpis. E.g. a font of size 10pt has a value of 200.
     * 
     */
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    /**
     * Gets the value of the spOrWd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spOrWd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpOrWd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space }
     * {@link Word }
     * </p>
     * 
     * 
     * @return
     *     The value of the spOrWd property.
     */
    public List<Object> getSpOrWd() {
        if (spOrWd == null) {
            spOrWd = new ArrayList<>();
        }
        return this.spOrWd;
    }

    /**
     * Gets the value of the baseLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseLine() {
        return baseLine;
    }

    /**
     * Sets the value of the baseLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseLine(Integer value) {
        this.baseLine = value;
    }

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
