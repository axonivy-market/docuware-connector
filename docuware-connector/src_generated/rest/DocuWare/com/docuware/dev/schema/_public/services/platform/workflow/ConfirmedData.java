
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data which is sent when a user confirm a task.
 * 
 * &lt;p&gt;Java class for ConfirmedData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ConfirmedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmedFields" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ConfirmedField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmedData", propOrder = {
    "confirmedFields"
})
@XmlSeeAlso({
    StampPositionData.class,
    StampConfirmedData.class
})
public class ConfirmedData {

    /**
     * List of confirmed fields.
     * 
     */
    @XmlElement(name = "ConfirmedFields")
    protected List<ConfirmedField> confirmedFields;

    /**
     * List of confirmed fields.
     * 
     * Gets the value of the confirmedFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confirmedFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfirmedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmedField }
     * </p>
     * 
     * 
     * @return
     *     The value of the confirmedFields property.
     */
    public List<ConfirmedField> getConfirmedFields() {
        if (confirmedFields == null) {
            confirmedFields = new ArrayList<>();
        }
        return this.confirmedFields;
    }

}
