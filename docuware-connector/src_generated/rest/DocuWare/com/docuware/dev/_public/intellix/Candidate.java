
package com.docuware.dev._public.intellix;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Candidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Candidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FoundValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="L" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="T" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="W" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FoundWithLanguages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectLanguageTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ImpliesCultures" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidate", propOrder = {
    "type",
    "originalValue",
    "foundValue",
    "l",
    "t",
    "w",
    "h",
    "line",
    "index",
    "length",
    "decimal",
    "date",
    "text",
    "foundWithLanguages",
    "correctLanguageTo",
    "impliesCultures"
})
public class Candidate {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "OriginalValue", required = true)
    protected String originalValue;
    @XmlElement(name = "FoundValue", required = true)
    protected String foundValue;
    @XmlElement(name = "L")
    protected int l;
    @XmlElement(name = "T")
    protected int t;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "Line")
    protected int line;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "Decimal")
    protected BigDecimal decimal;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "FoundWithLanguages")
    protected List<String> foundWithLanguages;
    @XmlElement(name = "CorrectLanguageTo")
    protected List<String> correctLanguageTo;
    @XmlElement(name = "ImpliesCultures")
    protected List<String> impliesCultures;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the originalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * Sets the value of the originalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalValue(String value) {
        this.originalValue = value;
    }

    /**
     * Gets the value of the foundValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundValue() {
        return foundValue;
    }

    /**
     * Sets the value of the foundValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundValue(String value) {
        this.foundValue = value;
    }

    /**
     * Gets the value of the l property.
     * 
     */
    public int getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     */
    public void setL(int value) {
        this.l = value;
    }

    /**
     * Gets the value of the t property.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

    /**
     * Gets the value of the w property.
     * 
     */
    public int getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     */
    public void setW(int value) {
        this.w = value;
    }

    /**
     * Gets the value of the h property.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimal(BigDecimal value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the foundWithLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foundWithLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoundWithLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoundWithLanguages() {
        if (foundWithLanguages == null) {
            foundWithLanguages = new ArrayList<String>();
        }
        return this.foundWithLanguages;
    }

    /**
     * Gets the value of the correctLanguageTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctLanguageTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectLanguageTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorrectLanguageTo() {
        if (correctLanguageTo == null) {
            correctLanguageTo = new ArrayList<String>();
        }
        return this.correctLanguageTo;
    }

    /**
     * Gets the value of the impliesCultures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impliesCultures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpliesCultures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImpliesCultures() {
        if (impliesCultures == null) {
            impliesCultures = new ArrayList<String>();
        }
        return this.impliesCultures;
    }

}
