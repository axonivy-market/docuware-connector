
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Models a DocuWare content divide operation.
 * 
 * &lt;p&gt;Java class for ContentDivideOperationInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ContentDivideOperationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResultNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ContentDivideOperation" /&gt;
 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDivideOperationInfo", propOrder = {
    "pages",
    "resultNames"
})
public class ContentDivideOperationInfo {

    /**
     * Collection of pages to be used in the operation
     * 
     */
    @XmlElement(name = "Pages", type = Integer.class)
    protected List<Integer> pages;
    /**
     * Define document names to be used for the result documents. Original document name is not changed
     * 
     */
    @XmlElement(name = "ResultNames")
    protected List<String> resultNames;
    /**
     * Operation that have to be executed.
     * 
     */
    @XmlAttribute(name = "Operation", required = true)
    protected ContentDivideOperation operation;
    /**
     * Force divide operation even if possible loss of data
     * 
     */
    @XmlAttribute(name = "Force")
    protected Boolean force;

    /**
     * Collection of pages to be used in the operation
     * 
     * Gets the value of the pages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pages property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPages().add(newItem);
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
     *     The value of the pages property.
     */
    public List<Integer> getPages() {
        if (pages == null) {
            pages = new ArrayList<>();
        }
        return this.pages;
    }

    /**
     * Define document names to be used for the result documents. Original document name is not changed
     * 
     * Gets the value of the resultNames property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the resultNames property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResultNames().add(newItem);
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
     *     The value of the resultNames property.
     */
    public List<String> getResultNames() {
        if (resultNames == null) {
            resultNames = new ArrayList<>();
        }
        return this.resultNames;
    }

    /**
     * Operation that have to be executed.
     * 
     * @return
     *     possible object is
     *     {@link ContentDivideOperation }
     *     
     */
    public ContentDivideOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDivideOperation }
     *     
     * @see #getOperation()
     */
    public void setOperation(ContentDivideOperation value) {
        this.operation = value;
    }

    /**
     * Force divide operation even if possible loss of data
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForce() {
        if (force == null) {
            return false;
        } else {
            return force;
        }
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isForce()
     */
    public void setForce(Boolean value) {
        this.force = value;
    }

}
