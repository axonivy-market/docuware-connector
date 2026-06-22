
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A query for requesting page blocks.
 * 
 * &lt;p&gt;Java class for PagesBlockQuery complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PagesBlockQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FirstPage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PageCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagesBlockQuery")
public class PagesBlockQuery {

    /**
     * The first page of the page block
     * 
     */
    @XmlAttribute(name = "FirstPage", required = true)
    protected int firstPage;
    /**
     * Total count of the pages in the page block
     * 
     */
    @XmlAttribute(name = "PageCount", required = true)
    protected int pageCount;

    /**
     * The first page of the page block
     * 
     */
    public int getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     */
    public void setFirstPage(int value) {
        this.firstPage = value;
    }

    /**
     * Total count of the pages in the page block
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }

}
