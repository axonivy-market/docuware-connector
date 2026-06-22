
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.settings.common.DWRectangle;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PointAndShootInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PointAndShootInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Box" type="{http://dev.docuware.com/settings/common}DWRectangle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAndShootInfo", propOrder = {
    "box"
})
public class PointAndShootInfo {

    /**
     * The bounding box of the selected content.
     * 
     */
    @XmlElement(name = "Box")
    protected List<DWRectangle> box;
    /**
     * The number of the page on which the selected content is.
     * 
     */
    @XmlAttribute(name = "PageNumber")
    protected Integer pageNumber;

    /**
     * The bounding box of the selected content.
     * 
     * Gets the value of the box property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the box property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWRectangle }
     * </p>
     * 
     * 
     * @return
     *     The value of the box property.
     */
    public List<DWRectangle> getBox() {
        if (box == null) {
            box = new ArrayList<>();
        }
        return this.box;
    }

    /**
     * The number of the page on which the selected content is.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPageNumber() {
        if (pageNumber == null) {
            return  0;
        } else {
            return pageNumber;
        }
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPageNumber()
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

}
