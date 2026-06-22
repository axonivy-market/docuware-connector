
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step.
 * 
 * &lt;p&gt;Java class for HistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Info" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryStepInfo"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StepNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="StepDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ActivityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StepType" use="required" type="{http://dev.docuware.com/schema/public/services/platform/workflow}StepTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryStep", propOrder = {
    "info"
})
public class HistoryStep {

    /**
     * Additional information for the history step according to the type of the step.
     * 
     */
    @XmlElement(name = "Info", required = true)
    protected HistoryStepInfo info;
    /**
     * Sequential received number of the step.
     * 
     */
    @XmlAttribute(name = "StepNumber", required = true)
    protected int stepNumber;
    /**
     * Creation date and time of the history step.
     * 
     */
    @XmlAttribute(name = "StepDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stepDate;
    /**
     * Name of the activity.
     * 
     */
    @XmlAttribute(name = "ActivityName")
    protected String activityName;
    /**
     * Type of the activity.
     * 
     */
    @XmlAttribute(name = "ActivityType")
    protected String activityType;
    /**
     * Type of the history step.
     * 
     */
    @XmlAttribute(name = "StepType", required = true)
    protected StepTypeEnum stepType;

    /**
     * Additional information for the history step according to the type of the step.
     * 
     * @return
     *     possible object is
     *     {@link HistoryStepInfo }
     *     
     */
    public HistoryStepInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryStepInfo }
     *     
     * @see #getInfo()
     */
    public void setInfo(HistoryStepInfo value) {
        this.info = value;
    }

    /**
     * Sequential received number of the step.
     * 
     */
    public int getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     */
    public void setStepNumber(int value) {
        this.stepNumber = value;
    }

    /**
     * Creation date and time of the history step.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStepDate() {
        return stepDate;
    }

    /**
     * Sets the value of the stepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStepDate()
     */
    public void setStepDate(XMLGregorianCalendar value) {
        this.stepDate = value;
    }

    /**
     * Name of the activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActivityName()
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Type of the activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActivityType()
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Type of the history step.
     * 
     * @return
     *     possible object is
     *     {@link StepTypeEnum }
     *     
     */
    public StepTypeEnum getStepType() {
        return stepType;
    }

    /**
     * Sets the value of the stepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StepTypeEnum }
     *     
     * @see #getStepType()
     */
    public void setStepType(StepTypeEnum value) {
        this.stepType = value;
    }

}
