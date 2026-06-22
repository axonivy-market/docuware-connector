
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Input used to submit form and store in DocuWare
 * 
 * &lt;p&gt;Java class for FormsInput complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsInput", propOrder = {
    "formInfo",
    "html"
})
public class FormsInput {

    /**
     * Form information with configuration id and form fields with user input
     * 
     */
    @XmlElement(name = "FormInfo", required = true)
    protected FormInfo formInfo;
    /**
     * String representing the HTML of the form
     * 
     */
    @XmlElement(name = "HTML", required = true)
    protected String html;

    /**
     * Form information with configuration id and form fields with user input
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
     * @see #getFormInfo()
     */
    public void setFormInfo(FormInfo value) {
        this.formInfo = value;
    }

    /**
     * String representing the HTML of the form
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
     * @see #getHTML()
     */
    public void setHTML(String value) {
        this.html = value;
    }

}
