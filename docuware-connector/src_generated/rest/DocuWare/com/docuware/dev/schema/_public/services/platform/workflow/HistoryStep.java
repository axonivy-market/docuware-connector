
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A history step.
 * 
 * <p>Java class for HistoryStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryStep", propOrder = {
    "info"
})
public class HistoryStep {

    @XmlElement(name = "Info", required = true)
    protected HistoryStepInfo info;
    @XmlAttribute(name = "StepNumber", required = true)
    protected int stepNumber;
    @XmlAttribute(name = "StepDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stepDate;
    @XmlAttribute(name = "ActivityName")
    protected String activityName;
    @XmlAttribute(name = "ActivityType")
    protected String activityType;
    @XmlAttribute(name = "StepType", required = true)
    protected StepTypeEnum stepType;

    /**
     * Gets the value of the info property.
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
     */
    public void setInfo(HistoryStepInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the stepNumber property.
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
     * Gets the value of the stepDate property.
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
     */
    public void setStepDate(XMLGregorianCalendar value) {
        this.stepDate = value;
    }

    /**
     * Gets the value of the activityName property.
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
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the activityType property.
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
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the stepType property.
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
     */
    public void setStepType(StepTypeEnum value) {
        this.stepType = value;
    }

}
