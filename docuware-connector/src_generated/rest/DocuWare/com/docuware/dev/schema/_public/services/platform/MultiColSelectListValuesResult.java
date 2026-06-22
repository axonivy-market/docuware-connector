
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specific properties for each dialog type
 * 
 * &lt;p&gt;Java class for MultiColSelectListValuesResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColSelectListValuesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Columns"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Column" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rows"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Row" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListValuesResult", propOrder = {
    "columns",
    "rows",
    "links"
})
public class MultiColSelectListValuesResult {

    /**
     * Header for the select list columns
     * 
     */
    @XmlElement(name = "Columns", required = true)
    protected MultiColSelectListValuesResult.Columns columns;
    /**
     * Rows of the multi column select list result
     * 
     */
    @XmlElement(name = "Rows", required = true)
    protected MultiColSelectListValuesResult.Rows rows;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Header for the select list columns
     * 
     * @return
     *     possible object is
     *     {@link MultiColSelectListValuesResult.Columns }
     *     
     */
    public MultiColSelectListValuesResult.Columns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiColSelectListValuesResult.Columns }
     *     
     * @see #getColumns()
     */
    public void setColumns(MultiColSelectListValuesResult.Columns value) {
        this.columns = value;
    }

    /**
     * Rows of the multi column select list result
     * 
     * @return
     *     possible object is
     *     {@link MultiColSelectListValuesResult.Rows }
     *     
     */
    public MultiColSelectListValuesResult.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiColSelectListValuesResult.Rows }
     *     
     * @see #getRows()
     */
    public void setRows(MultiColSelectListValuesResult.Rows value) {
        this.rows = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Column" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "column"
    })
    public static class Columns {

        /**
         * Define a specific select list column
         * 
         */
        @XmlElement(name = "Column")
        protected List<MultiColSelectListColumn> column;

        /**
         * Define a specific select list column
         * 
         * Gets the value of the column property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the column property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getColumn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiColSelectListColumn }
         * </p>
         * 
         * 
         * @return
         *     The value of the column property.
         */
        public List<MultiColSelectListColumn> getColumn() {
            if (column == null) {
                column = new ArrayList<>();
            }
            return this.column;
        }

    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Row" type="{http://dev.docuware.com/schema/public/services/platform}MultiColSelectListRow" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class Rows {

        /**
         * Define a specific select list row
         * 
         */
        @XmlElement(name = "Row")
        protected List<MultiColSelectListRow> row;

        /**
         * Define a specific select list row
         * 
         * Gets the value of the row property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the row property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiColSelectListRow }
         * </p>
         * 
         * 
         * @return
         *     The value of the row property.
         */
        public List<MultiColSelectListRow> getRow() {
            if (row == null) {
                row = new ArrayList<>();
            }
            return this.row;
        }

    }

}
