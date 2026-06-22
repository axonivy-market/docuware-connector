
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Web Service activity.
 * 
 * &lt;p&gt;Java class for WebServiceHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WebServiceHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Method" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceHistoryStep", propOrder = {
    "parameters",
    "results"
})
public class WebServiceHistoryStep {

    /**
     * List of parameters sent to the web service method.
     * 
     */
    @XmlElement(name = "Parameters")
    protected List<HistoryField> parameters;
    /**
     * List of assignments from result of the web service method to Global variables.
     * 
     */
    @XmlElement(name = "Results")
    protected List<HistoryField> results;
    /**
     * Name of the method which is called.
     * 
     */
    @XmlAttribute(name = "Method")
    protected String method;

    /**
     * List of parameters sent to the web service method.
     * 
     * Gets the value of the parameters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the parameters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * </p>
     * 
     * 
     * @return
     *     The value of the parameters property.
     */
    public List<HistoryField> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<>();
        }
        return this.parameters;
    }

    /**
     * List of assignments from result of the web service method to Global variables.
     * 
     * Gets the value of the results property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the results property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * </p>
     * 
     * 
     * @return
     *     The value of the results property.
     */
    public List<HistoryField> getResults() {
        if (results == null) {
            results = new ArrayList<>();
        }
        return this.results;
    }

    /**
     * Name of the method which is called.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMethod()
     */
    public void setMethod(String value) {
        this.method = value;
    }

}
