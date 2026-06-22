
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about the action pereformed on document
 * 
 * &lt;p&gt;Java class for DocumentActionInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DocumentActionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentActionParameters" type="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DocumentAction" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAction" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentActionInfo", propOrder = {
    "documentActionParameters"
})
public class DocumentActionInfo {

    /**
     * Specific data for the action
     * 
     */
    @XmlElement(name = "DocumentActionParameters", required = true)
    protected DocumentActionParameters documentActionParameters;
    /**
     * Actions pereformed on document
     * 
     */
    @XmlAttribute(name = "DocumentAction", required = true)
    protected DocumentAction documentAction;

    /**
     * Specific data for the action
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionParameters }
     *     
     */
    public DocumentActionParameters getDocumentActionParameters() {
        return documentActionParameters;
    }

    /**
     * Sets the value of the documentActionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionParameters }
     *     
     * @see #getDocumentActionParameters()
     */
    public void setDocumentActionParameters(DocumentActionParameters value) {
        this.documentActionParameters = value;
    }

    /**
     * Actions pereformed on document
     * 
     * @return
     *     possible object is
     *     {@link DocumentAction }
     *     
     */
    public DocumentAction getDocumentAction() {
        return documentAction;
    }

    /**
     * Sets the value of the documentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAction }
     *     
     * @see #getDocumentAction()
     */
    public void setDocumentAction(DocumentAction value) {
        this.documentAction = value;
    }

}
