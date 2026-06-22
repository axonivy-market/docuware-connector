
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Layer element. Contains annotations in a specific layer. Annotation can have up to 5 layers.
 * 
 * &lt;p&gt;Java class for Layer complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Layer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Delete" type="{http://dev.docuware.com/schema/public/services/platform}DeleteEntry"/&gt;
 *           &lt;element name="Text" type="{http://dev.docuware.com/schema/public/services/platform}TextEntry"/&gt;
 *           &lt;element name="Rect" type="{http://dev.docuware.com/schema/public/services/platform}RectEntry"/&gt;
 *           &lt;element name="Line" type="{http://dev.docuware.com/schema/public/services/platform}LineEntry"/&gt;
 *           &lt;element name="PolyLine" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineEntry"/&gt;
 *           &lt;element name="TextStamp" type="{http://dev.docuware.com/schema/public/services/platform}TextStampEntry"/&gt;
 *           &lt;element name="BitmapStamp" type="{http://dev.docuware.com/schema/public/services/platform}BitmapStampEntry"/&gt;
 *           &lt;element name="PolyLineStamp" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineStampEntry"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer", propOrder = {
    "deleteOrTextOrRect"
})
public class Layer {

    @XmlElements({
        @XmlElement(name = "Delete", type = DeleteEntry.class),
        @XmlElement(name = "Text", type = TextEntry.class),
        @XmlElement(name = "Rect", type = RectEntry.class),
        @XmlElement(name = "Line", type = LineEntry.class),
        @XmlElement(name = "PolyLine", type = PolyLineEntry.class),
        @XmlElement(name = "TextStamp", type = TextStampEntry.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStampEntry.class),
        @XmlElement(name = "PolyLineStamp", type = PolyLineStampEntry.class)
    })
    protected List<EntryBase> deleteOrTextOrRect;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the deleteOrTextOrRect property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deleteOrTextOrRect property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteOrTextOrRect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BitmapStampEntry }
     * {@link DeleteEntry }
     * {@link LineEntry }
     * {@link PolyLineEntry }
     * {@link PolyLineStampEntry }
     * {@link RectEntry }
     * {@link TextEntry }
     * {@link TextStampEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteOrTextOrRect property.
     */
    public List<EntryBase> getDeleteOrTextOrRect() {
        if (deleteOrTextOrRect == null) {
            deleteOrTextOrRect = new ArrayList<>();
        }
        return this.deleteOrTextOrRect;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
