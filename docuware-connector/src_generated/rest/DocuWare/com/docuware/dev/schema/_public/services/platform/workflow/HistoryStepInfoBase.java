
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HistoryStepInfoBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="HistoryStepInfoBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ErrorHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ErrorHistoryStep"/&gt;
 *         &lt;element name="TimeoutHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TimeoutHistoryStep"/&gt;
 *         &lt;element name="StopHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}StopHistoryStep"/&gt;
 *         &lt;element name="EndHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}EndHistoryStep"/&gt;
 *         &lt;element name="StartHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}StartHistoryStep"/&gt;
 *         &lt;element name="DecisionHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DecisionHistoryStep"/&gt;
 *         &lt;element name="ReassignHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ReassignHistoryStep"/&gt;
 *         &lt;element name="AssignDataHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignDataHistoryStep"/&gt;
 *         &lt;element name="EmailHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}EmailHistoryStep"/&gt;
 *         &lt;element name="AssignToHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}AssignToHistoryStep"/&gt;
 *         &lt;element name="OutOfOfficeHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}OutOfOfficeHistoryStep"/&gt;
 *         &lt;element name="ConditionHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}ConditionHistoryStep"/&gt;
 *         &lt;element name="WebServiceHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WebServiceHistoryStep"/&gt;
 *         &lt;element name="GeneralErrorDecisionHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}GeneralErrorDecisionHistoryStep"/&gt;
 *         &lt;element name="RequestDecisionHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RequestDecisionHistoryStep"/&gt;
 *         &lt;element name="RequestStartHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RequestStartHistoryStep"/&gt;
 *         &lt;element name="RequestEndHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RequestEndHistoryStep"/&gt;
 *         &lt;element name="WaitHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}WaitHistoryStep"/&gt;
 *         &lt;element name="EventHistoryStep" type="{http://dev.docuware.com/schema/public/services/platform/workflow}EventHistoryStep"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryStepInfoBase", propOrder = {
    "errorHistoryStep",
    "timeoutHistoryStep",
    "stopHistoryStep",
    "endHistoryStep",
    "startHistoryStep",
    "decisionHistoryStep",
    "reassignHistoryStep",
    "assignDataHistoryStep",
    "emailHistoryStep",
    "assignToHistoryStep",
    "outOfOfficeHistoryStep",
    "conditionHistoryStep",
    "webServiceHistoryStep",
    "generalErrorDecisionHistoryStep",
    "requestDecisionHistoryStep",
    "requestStartHistoryStep",
    "requestEndHistoryStep",
    "waitHistoryStep",
    "eventHistoryStep"
})
@XmlSeeAlso({
    HistoryStepInfo.class
})
public abstract class HistoryStepInfoBase {

    @XmlElement(name = "ErrorHistoryStep")
    protected ErrorHistoryStep errorHistoryStep;
    @XmlElement(name = "TimeoutHistoryStep")
    protected TimeoutHistoryStep timeoutHistoryStep;
    @XmlElement(name = "StopHistoryStep")
    protected StopHistoryStep stopHistoryStep;
    @XmlElement(name = "EndHistoryStep")
    protected EndHistoryStep endHistoryStep;
    @XmlElement(name = "StartHistoryStep")
    protected StartHistoryStep startHistoryStep;
    @XmlElement(name = "DecisionHistoryStep")
    protected DecisionHistoryStep decisionHistoryStep;
    @XmlElement(name = "ReassignHistoryStep")
    protected ReassignHistoryStep reassignHistoryStep;
    @XmlElement(name = "AssignDataHistoryStep")
    protected AssignDataHistoryStep assignDataHistoryStep;
    @XmlElement(name = "EmailHistoryStep")
    protected EmailHistoryStep emailHistoryStep;
    @XmlElement(name = "AssignToHistoryStep")
    protected AssignToHistoryStep assignToHistoryStep;
    @XmlElement(name = "OutOfOfficeHistoryStep")
    protected OutOfOfficeHistoryStep outOfOfficeHistoryStep;
    @XmlElement(name = "ConditionHistoryStep")
    protected ConditionHistoryStep conditionHistoryStep;
    @XmlElement(name = "WebServiceHistoryStep")
    protected WebServiceHistoryStep webServiceHistoryStep;
    @XmlElement(name = "GeneralErrorDecisionHistoryStep")
    protected GeneralErrorDecisionHistoryStep generalErrorDecisionHistoryStep;
    @XmlElement(name = "RequestDecisionHistoryStep")
    protected RequestDecisionHistoryStep requestDecisionHistoryStep;
    @XmlElement(name = "RequestStartHistoryStep")
    protected RequestStartHistoryStep requestStartHistoryStep;
    @XmlElement(name = "RequestEndHistoryStep")
    protected RequestEndHistoryStep requestEndHistoryStep;
    @XmlElement(name = "WaitHistoryStep")
    protected WaitHistoryStep waitHistoryStep;
    @XmlElement(name = "EventHistoryStep")
    protected EventHistoryStep eventHistoryStep;

    /**
     * Gets the value of the errorHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHistoryStep }
     *     
     */
    public ErrorHistoryStep getErrorHistoryStep() {
        return errorHistoryStep;
    }

    /**
     * Sets the value of the errorHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHistoryStep }
     *     
     */
    public void setErrorHistoryStep(ErrorHistoryStep value) {
        this.errorHistoryStep = value;
    }

    /**
     * Gets the value of the timeoutHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link TimeoutHistoryStep }
     *     
     */
    public TimeoutHistoryStep getTimeoutHistoryStep() {
        return timeoutHistoryStep;
    }

    /**
     * Sets the value of the timeoutHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeoutHistoryStep }
     *     
     */
    public void setTimeoutHistoryStep(TimeoutHistoryStep value) {
        this.timeoutHistoryStep = value;
    }

    /**
     * Gets the value of the stopHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link StopHistoryStep }
     *     
     */
    public StopHistoryStep getStopHistoryStep() {
        return stopHistoryStep;
    }

    /**
     * Sets the value of the stopHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopHistoryStep }
     *     
     */
    public void setStopHistoryStep(StopHistoryStep value) {
        this.stopHistoryStep = value;
    }

    /**
     * Gets the value of the endHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link EndHistoryStep }
     *     
     */
    public EndHistoryStep getEndHistoryStep() {
        return endHistoryStep;
    }

    /**
     * Sets the value of the endHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndHistoryStep }
     *     
     */
    public void setEndHistoryStep(EndHistoryStep value) {
        this.endHistoryStep = value;
    }

    /**
     * Gets the value of the startHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link StartHistoryStep }
     *     
     */
    public StartHistoryStep getStartHistoryStep() {
        return startHistoryStep;
    }

    /**
     * Sets the value of the startHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartHistoryStep }
     *     
     */
    public void setStartHistoryStep(StartHistoryStep value) {
        this.startHistoryStep = value;
    }

    /**
     * Gets the value of the decisionHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionHistoryStep }
     *     
     */
    public DecisionHistoryStep getDecisionHistoryStep() {
        return decisionHistoryStep;
    }

    /**
     * Sets the value of the decisionHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionHistoryStep }
     *     
     */
    public void setDecisionHistoryStep(DecisionHistoryStep value) {
        this.decisionHistoryStep = value;
    }

    /**
     * Gets the value of the reassignHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link ReassignHistoryStep }
     *     
     */
    public ReassignHistoryStep getReassignHistoryStep() {
        return reassignHistoryStep;
    }

    /**
     * Sets the value of the reassignHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReassignHistoryStep }
     *     
     */
    public void setReassignHistoryStep(ReassignHistoryStep value) {
        this.reassignHistoryStep = value;
    }

    /**
     * Gets the value of the assignDataHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link AssignDataHistoryStep }
     *     
     */
    public AssignDataHistoryStep getAssignDataHistoryStep() {
        return assignDataHistoryStep;
    }

    /**
     * Sets the value of the assignDataHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignDataHistoryStep }
     *     
     */
    public void setAssignDataHistoryStep(AssignDataHistoryStep value) {
        this.assignDataHistoryStep = value;
    }

    /**
     * Gets the value of the emailHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link EmailHistoryStep }
     *     
     */
    public EmailHistoryStep getEmailHistoryStep() {
        return emailHistoryStep;
    }

    /**
     * Sets the value of the emailHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailHistoryStep }
     *     
     */
    public void setEmailHistoryStep(EmailHistoryStep value) {
        this.emailHistoryStep = value;
    }

    /**
     * Gets the value of the assignToHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link AssignToHistoryStep }
     *     
     */
    public AssignToHistoryStep getAssignToHistoryStep() {
        return assignToHistoryStep;
    }

    /**
     * Sets the value of the assignToHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignToHistoryStep }
     *     
     */
    public void setAssignToHistoryStep(AssignToHistoryStep value) {
        this.assignToHistoryStep = value;
    }

    /**
     * Gets the value of the outOfOfficeHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link OutOfOfficeHistoryStep }
     *     
     */
    public OutOfOfficeHistoryStep getOutOfOfficeHistoryStep() {
        return outOfOfficeHistoryStep;
    }

    /**
     * Sets the value of the outOfOfficeHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfOfficeHistoryStep }
     *     
     */
    public void setOutOfOfficeHistoryStep(OutOfOfficeHistoryStep value) {
        this.outOfOfficeHistoryStep = value;
    }

    /**
     * Gets the value of the conditionHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionHistoryStep }
     *     
     */
    public ConditionHistoryStep getConditionHistoryStep() {
        return conditionHistoryStep;
    }

    /**
     * Sets the value of the conditionHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionHistoryStep }
     *     
     */
    public void setConditionHistoryStep(ConditionHistoryStep value) {
        this.conditionHistoryStep = value;
    }

    /**
     * Gets the value of the webServiceHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceHistoryStep }
     *     
     */
    public WebServiceHistoryStep getWebServiceHistoryStep() {
        return webServiceHistoryStep;
    }

    /**
     * Sets the value of the webServiceHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceHistoryStep }
     *     
     */
    public void setWebServiceHistoryStep(WebServiceHistoryStep value) {
        this.webServiceHistoryStep = value;
    }

    /**
     * Gets the value of the generalErrorDecisionHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralErrorDecisionHistoryStep }
     *     
     */
    public GeneralErrorDecisionHistoryStep getGeneralErrorDecisionHistoryStep() {
        return generalErrorDecisionHistoryStep;
    }

    /**
     * Sets the value of the generalErrorDecisionHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralErrorDecisionHistoryStep }
     *     
     */
    public void setGeneralErrorDecisionHistoryStep(GeneralErrorDecisionHistoryStep value) {
        this.generalErrorDecisionHistoryStep = value;
    }

    /**
     * Gets the value of the requestDecisionHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDecisionHistoryStep }
     *     
     */
    public RequestDecisionHistoryStep getRequestDecisionHistoryStep() {
        return requestDecisionHistoryStep;
    }

    /**
     * Sets the value of the requestDecisionHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDecisionHistoryStep }
     *     
     */
    public void setRequestDecisionHistoryStep(RequestDecisionHistoryStep value) {
        this.requestDecisionHistoryStep = value;
    }

    /**
     * Gets the value of the requestStartHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStartHistoryStep }
     *     
     */
    public RequestStartHistoryStep getRequestStartHistoryStep() {
        return requestStartHistoryStep;
    }

    /**
     * Sets the value of the requestStartHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStartHistoryStep }
     *     
     */
    public void setRequestStartHistoryStep(RequestStartHistoryStep value) {
        this.requestStartHistoryStep = value;
    }

    /**
     * Gets the value of the requestEndHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link RequestEndHistoryStep }
     *     
     */
    public RequestEndHistoryStep getRequestEndHistoryStep() {
        return requestEndHistoryStep;
    }

    /**
     * Sets the value of the requestEndHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestEndHistoryStep }
     *     
     */
    public void setRequestEndHistoryStep(RequestEndHistoryStep value) {
        this.requestEndHistoryStep = value;
    }

    /**
     * Gets the value of the waitHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link WaitHistoryStep }
     *     
     */
    public WaitHistoryStep getWaitHistoryStep() {
        return waitHistoryStep;
    }

    /**
     * Sets the value of the waitHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitHistoryStep }
     *     
     */
    public void setWaitHistoryStep(WaitHistoryStep value) {
        this.waitHistoryStep = value;
    }

    /**
     * Gets the value of the eventHistoryStep property.
     * 
     * @return
     *     possible object is
     *     {@link EventHistoryStep }
     *     
     */
    public EventHistoryStep getEventHistoryStep() {
        return eventHistoryStep;
    }

    /**
     * Sets the value of the eventHistoryStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventHistoryStep }
     *     
     */
    public void setEventHistoryStep(EventHistoryStep value) {
        this.eventHistoryStep = value;
    }

}
