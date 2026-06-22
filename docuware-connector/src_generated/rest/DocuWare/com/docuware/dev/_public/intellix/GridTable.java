
package com.docuware.dev._public.intellix;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for gridTable complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="gridTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gridCol" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *         &lt;element name="gridRow" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridTable", propOrder = {
    "gridCol",
    "gridRow"
})
public class GridTable {

    /**
     * The widths of columns in twips. Each value is a distance between two grid.
     * 
     */
    @XmlElement(type = Integer.class)
    protected List<Integer> gridCol;
    /**
     * The widths of rows in twips. Each value is a distance between two grid.
     * 
     */
    @XmlElement(type = Integer.class)
    protected List<Integer> gridRow;

    /**
     * The widths of columns in twips. Each value is a distance between two grid.
     * 
     * Gets the value of the gridCol property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gridCol property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGridCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the gridCol property.
     */
    public List<Integer> getGridCol() {
        if (gridCol == null) {
            gridCol = new ArrayList<>();
        }
        return this.gridCol;
    }

    /**
     * The widths of rows in twips. Each value is a distance between two grid.
     * 
     * Gets the value of the gridRow property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gridRow property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGridRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the gridRow property.
     */
    public List<Integer> getGridRow() {
        if (gridRow == null) {
            gridRow = new ArrayList<>();
        }
        return this.gridRow;
    }

}
