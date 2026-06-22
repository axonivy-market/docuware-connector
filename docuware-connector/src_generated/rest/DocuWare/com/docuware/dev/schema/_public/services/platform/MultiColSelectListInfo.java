
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multi column select list object.
 * 
 * &lt;p&gt;Java class for MultiColSelectListInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColSelectListInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *         &lt;element name="Columns"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Kind" use="required" type="{http://dev.docuware.com/schema/public/services/platform}SelectListKind" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListInfo", propOrder = {
    "links",
    "columns"
})
public class MultiColSelectListInfo {

    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Header for the select list columns
     * 
     */
    @XmlElement(name = "Columns", required = true)
    protected MultiColSelectListInfo.Columns columns;
    /**
     * The guid of the select list.
     * 
     */
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    /**
     * The name of the select list.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * The Kind of the select list.
     * 
     */
    @XmlAttribute(name = "Kind", required = true)
    protected SelectListKind kind;

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
     * Header for the select list columns
     * 
     * @return
     *     possible object is
     *     {@link MultiColSelectListInfo.Columns }
     *     
     */
    public MultiColSelectListInfo.Columns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiColSelectListInfo.Columns }
     *     
     * @see #getColumns()
     */
    public void setColumns(MultiColSelectListInfo.Columns value) {
        this.columns = value;
    }

    /**
     * The guid of the select list.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGuid()
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * The name of the select list.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The Kind of the select list.
     * 
     * @return
     *     possible object is
     *     {@link SelectListKind }
     *     
     */
    public SelectListKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListKind }
     *     
     * @see #getKind()
     */
    public void setKind(SelectListKind value) {
        this.kind = value;
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
     *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
         * Define a single column in the multi column select list
         * 
         */
        @XmlElement(name = "Column")
        protected List<String> column;

        /**
         * Define a single column in the multi column select list
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
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the column property.
         */
        public List<String> getColumn() {
            if (column == null) {
                column = new ArrayList<>();
            }
            return this.column;
        }

    }

}
