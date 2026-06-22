
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for XmlDSigContentType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="XmlDSigContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://dev.docuware.com/schema/public/services/platform}XmlDSigContentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://dev.docuware.com/schema/public/services/platform}XmlDSigStatusType" /&gt;
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Warning" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlDSigContentType", propOrder = {
    "nodes"
})
public class XmlDSigContentType {

    @XmlElement(name = "Nodes")
    protected List<XmlDSigContentType> nodes;
    @XmlAttribute(name = "Status", required = true)
    protected XmlDSigStatusType status;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "ErrorInfo")
    protected String errorInfo;
    @XmlAttribute(name = "Warning")
    protected Boolean warning;

    /**
     * Gets the value of the nodes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nodes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDSigContentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nodes property.
     */
    public List<XmlDSigContentType> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDSigStatusType }
     *     
     */
    public XmlDSigStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDSigStatusType }
     *     
     */
    public void setStatus(XmlDSigStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWarning() {
        if (warning == null) {
            return false;
        } else {
            return warning;
        }
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarning(Boolean value) {
        this.warning = value;
    }

}
