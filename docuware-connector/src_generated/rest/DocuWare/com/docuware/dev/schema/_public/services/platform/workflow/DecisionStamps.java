
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Decisions which are present as stamps.
 * 
 * &lt;p&gt;Java class for DecisionStamps complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DecisionStamps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecisionStamp" type="{http://dev.docuware.com/schema/public/services/platform/workflow}Decision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionStamps", propOrder = {
    "decisionStamp"
})
public class DecisionStamps {

    /**
     * List of decisions
     * 
     */
    @XmlElement(name = "DecisionStamp")
    protected List<Decision> decisionStamp;

    /**
     * List of decisions
     * 
     * Gets the value of the decisionStamp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the decisionStamp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisionStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisionStamp property.
     */
    public List<Decision> getDecisionStamp() {
        if (decisionStamp == null) {
            decisionStamp = new ArrayList<>();
        }
        return this.decisionStamp;
    }

}
