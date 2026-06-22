
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define table result from document query
 * 
 * &lt;p&gt;Java class for DocumentsQueryTableResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentsQueryTableResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://dev.docuware.com/schema/public/services/platform}CountPlusValue" minOccurs="0"/&gt;
 *         &lt;element name="Headers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}TableResultHeader" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="R" type="{http://dev.docuware.com/schema/public/services/platform}TableResultRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryTableResult", propOrder = {
    "count",
    "headers",
    "rows",
    "links"
})
public class DocumentsQueryTableResult {

    /**
     * Gets the number of items of the query leading to this result.
     * 
     */
    @XmlElement(name = "Count")
    protected CountPlusValue count;
    /**
     * Collection of headers for the result
     * 
     */
    @XmlElement(name = "Headers", required = true)
    protected DocumentsQueryTableResult.Headers headers;
    /**
     * Collection of the rows for the result
     * 
     */
    @XmlElement(name = "Rows", required = true)
    protected DocumentsQueryTableResult.Rows rows;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * TimeStamp of the result.
     * 
     */
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the number of items of the query leading to this result.
     * 
     * @return
     *     possible object is
     *     {@link CountPlusValue }
     *     
     */
    public CountPlusValue getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountPlusValue }
     *     
     * @see #getCount()
     */
    public void setCount(CountPlusValue value) {
        this.count = value;
    }

    /**
     * Collection of headers for the result
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     */
    public DocumentsQueryTableResult.Headers getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     * @see #getHeaders()
     */
    public void setHeaders(DocumentsQueryTableResult.Headers value) {
        this.headers = value;
    }

    /**
     * Collection of the rows for the result
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryTableResult.Rows }
     *     
     */
    public DocumentsQueryTableResult.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryTableResult.Rows }
     *     
     * @see #getRows()
     */
    public void setRows(DocumentsQueryTableResult.Rows value) {
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
     * TimeStamp of the result.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTimeStamp()
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
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
     *         &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}TableResultHeader" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "header"
    })
    public static class Headers {

        /**
         * Define a specific result header
         * 
         */
        @XmlElement(name = "Header")
        protected List<TableResultHeader> header;

        /**
         * Define a specific result header
         * 
         * Gets the value of the header property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the header property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TableResultHeader }
         * </p>
         * 
         * 
         * @return
         *     The value of the header property.
         */
        public List<TableResultHeader> getHeader() {
            if (header == null) {
                header = new ArrayList<>();
            }
            return this.header;
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
     *         &lt;element name="R" type="{http://dev.docuware.com/schema/public/services/platform}TableResultRow" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "r"
    })
    public static class Rows {

        /**
         * Define a specific result row
         * 
         */
        @XmlElement(name = "R")
        protected List<TableResultRow> r;

        /**
         * Define a specific result row
         * 
         * Gets the value of the r property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the r property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TableResultRow }
         * </p>
         * 
         * 
         * @return
         *     The value of the r property.
         */
        public List<TableResultRow> getR() {
            if (r == null) {
                r = new ArrayList<>();
            }
            return this.r;
        }

    }

}
