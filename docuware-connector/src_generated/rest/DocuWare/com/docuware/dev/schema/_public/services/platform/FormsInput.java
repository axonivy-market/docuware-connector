
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Input used to submit form and store in DocuWare
 * 
 * <p>Java class for FormsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormsInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormInfo" type="{http://dev.docuware.com/schema/public/services/platform}FormInfo"/&gt;
 *         &lt;element name="HTML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsInput", propOrder = {
    "formInfo",
    "html"
})
public class FormsInput {

    @XmlElement(name = "FormInfo", required = true)
    protected FormInfo formInfo;
    @XmlElement(name = "HTML", required = true)
    protected String html;

    /**
     * Gets the value of the formInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormInfo }
     *     
     */
    public FormInfo getFormInfo() {
        return formInfo;
    }

    /**
     * Sets the value of the formInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormInfo }
     *     
     */
    public void setFormInfo(FormInfo value) {
        this.formInfo = value;
    }

    /**
     * Gets the value of the html property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTML() {
        return html;
    }

    /**
     * Sets the value of the html property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTML(String value) {
        this.html = value;
    }

}
