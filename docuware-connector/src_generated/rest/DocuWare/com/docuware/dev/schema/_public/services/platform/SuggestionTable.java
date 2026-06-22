
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SuggestionTable complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SuggestionTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cell" type="{http://dev.docuware.com/schema/public/services/platform}SuggestionCellValue" maxOccurs="unbounded"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="HighlightRectangle" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Trust" type="{http://www.w3.org/2001/XMLSchema}double" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionTable", propOrder = {
    "cell",
    "highlightRectangle"
})
public class SuggestionTable {

    @XmlElement(name = "Cell", required = true)
    protected List<SuggestionCellValue> cell;
    @XmlElement(name = "HighlightRectangle")
    protected List<PointAndShootInfo> highlightRectangle;
    @XmlAttribute(name = "Trust")
    protected Double trust;

    /**
     * Gets the value of the cell property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cell property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestionCellValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the cell property.
     */
    public List<SuggestionCellValue> getCell() {
        if (cell == null) {
            cell = new ArrayList<>();
        }
        return this.cell;
    }

    /**
     * Gets the value of the highlightRectangle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the highlightRectangle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHighlightRectangle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointAndShootInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the highlightRectangle property.
     */
    public List<PointAndShootInfo> getHighlightRectangle() {
        if (highlightRectangle == null) {
            highlightRectangle = new ArrayList<>();
        }
        return this.highlightRectangle;
    }

    /**
     * Gets the value of the trust property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTrust() {
        if (trust == null) {
            return  1.0D;
        } else {
            return trust;
        }
    }

    /**
     * Sets the value of the trust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrust(Double value) {
        this.trust = value;
    }

}
