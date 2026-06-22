
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
 * Define a result from document query
 * 
 * &lt;p&gt;Java class for DocumentsQueryResult complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentsQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://dev.docuware.com/schema/public/services/platform}CountPlusValue" minOccurs="0"/&gt;
 *         &lt;element name="Items"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryResult", propOrder = {
    "count",
    "items",
    "links"
})
public class DocumentsQueryResult {

    /**
     * Gets the number of items of the query leading to this result.
     * 
     */
    @XmlElement(name = "Count")
    protected CountPlusValue count;
    /**
     * Collection of documents from result
     * 
     */
    @XmlElement(name = "Items", required = true)
    protected DocumentsQueryResult.Items items;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * Could be the name of the dialog creating this collection.
     * 
     */
    @XmlAttribute(name = "Title")
    protected String title;
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
     * Collection of documents from result
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryResult.Items }
     *     
     */
    public DocumentsQueryResult.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryResult.Items }
     *     
     * @see #getItems()
     */
    public void setItems(DocumentsQueryResult.Items value) {
        this.items = value;
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
     * Could be the name of the dialog creating this collection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTitle()
     */
    public void setTitle(String value) {
        this.title = value;
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
     *         &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "item"
    })
    public static class Items {

        /**
         * Define a specific document from result
         * 
         */
        @XmlElement(name = "Item")
        protected List<Document> item;

        /**
         * Define a specific document from result
         * 
         * Gets the value of the item property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the item property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document }
         * </p>
         * 
         * 
         * @return
         *     The value of the item property.
         */
        public List<Document> getItem() {
            if (item == null) {
                item = new ArrayList<>();
            }
            return this.item;
        }

    }

}
