
package com.docuware.dev._public.intellix;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TableZone complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TableZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gridT" type="{http://dev.docuware.com/public/intellix}gridTable"/&gt;
 *         &lt;element name="Cz" type="{http://dev.docuware.com/public/intellix}CellZone" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableZone", propOrder = {
    "gridT",
    "cz"
})
public class TableZone
    extends RectangleBase
{

    @XmlElement(required = true)
    protected GridTable gridT;
    @XmlElement(name = "Cz", required = true)
    protected List<CellZone> cz;

    /**
     * Gets the value of the gridT property.
     * 
     * @return
     *     possible object is
     *     {@link GridTable }
     *     
     */
    public GridTable getGridT() {
        return gridT;
    }

    /**
     * Sets the value of the gridT property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridTable }
     *     
     */
    public void setGridT(GridTable value) {
        this.gridT = value;
    }

    /**
     * Gets the value of the cz property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cz property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellZone }
     * </p>
     * 
     * 
     * @return
     *     The value of the cz property.
     */
    public List<CellZone> getCz() {
        if (cz == null) {
            cz = new ArrayList<>();
        }
        return this.cz;
    }

}
