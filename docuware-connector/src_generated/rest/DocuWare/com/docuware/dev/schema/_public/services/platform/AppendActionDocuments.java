
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cabinet specific document info needed for document append action
 * 
 * &lt;p&gt;Java class for AppendActionDocuments complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AppendActionDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceCabinetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Documents" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendActionDocuments", propOrder = {
    "sourceCabinetId",
    "documents"
})
public class AppendActionDocuments {

    /**
     * Id of the source cabinet/basket
     * 
     */
    @XmlElement(name = "SourceCabinetId", required = true)
    protected String sourceCabinetId;
    /**
     * Ids of the documents to be attached
     * 
     */
    @XmlElement(name = "Documents", type = Integer.class)
    protected List<Integer> documents;

    /**
     * Id of the source cabinet/basket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCabinetId() {
        return sourceCabinetId;
    }

    /**
     * Sets the value of the sourceCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceCabinetId()
     */
    public void setSourceCabinetId(String value) {
        this.sourceCabinetId = value;
    }

    /**
     * Ids of the documents to be attached
     * 
     * Gets the value of the documents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocuments().add(newItem);
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
     *     The value of the documents property.
     */
    public List<Integer> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<>();
        }
        return this.documents;
    }

}
