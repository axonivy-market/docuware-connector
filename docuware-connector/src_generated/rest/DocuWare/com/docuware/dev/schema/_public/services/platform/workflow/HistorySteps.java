
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of history steps for an instance.
 * 
 * &lt;p&gt;Java class for HistorySteps complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HistorySteps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistorySteps", propOrder = {
    "historyStep"
})
public class HistorySteps {

    @XmlElement(name = "HistoryStep")
    protected List<HistoryStep> historyStep;

    /**
     * Gets the value of the historyStep property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the historyStep property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHistoryStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryStep }
     * </p>
     * 
     * 
     * @return
     *     The value of the historyStep property.
     */
    public List<HistoryStep> getHistoryStep() {
        if (historyStep == null) {
            historyStep = new ArrayList<>();
        }
        return this.historyStep;
    }

}
