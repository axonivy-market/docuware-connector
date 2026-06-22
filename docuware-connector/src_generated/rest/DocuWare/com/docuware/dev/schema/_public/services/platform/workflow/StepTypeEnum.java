
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for StepTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="StepTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DecisionHistoryStep"/&gt;
 *     &lt;enumeration value="GeneralErrorDecisionHistoryStep"/&gt;
 *     &lt;enumeration value="ReassignHistoryStep"/&gt;
 *     &lt;enumeration value="AssignDataHistoryStep"/&gt;
 *     &lt;enumeration value="AssignToHistoryStep"/&gt;
 *     &lt;enumeration value="ConditionHistoryStep"/&gt;
 *     &lt;enumeration value="EmailHistoryStep"/&gt;
 *     &lt;enumeration value="WebServiceHistoryStep"/&gt;
 *     &lt;enumeration value="StartHistoryStep"/&gt;
 *     &lt;enumeration value="TaskInProgressHistoryStep"/&gt;
 *     &lt;enumeration value="StopHistoryStep"/&gt;
 *     &lt;enumeration value="EndHistoryStep"/&gt;
 *     &lt;enumeration value="ErrorHistoryStep"/&gt;
 *     &lt;enumeration value="TimeoutHistoryStep"/&gt;
 *     &lt;enumeration value="OutOfOfficeHistotyStep"/&gt;
 *     &lt;enumeration value="RequestDecisionHistoryStep"/&gt;
 *     &lt;enumeration value="RequestStartHistoryStep"/&gt;
 *     &lt;enumeration value="RequestEndHistoryStep"/&gt;
 *     &lt;enumeration value="WaitHistoryStep"/&gt;
 *     &lt;enumeration value="EventHistoryStep"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "StepTypeEnum")
@XmlEnum
public enum StepTypeEnum {


    /**
     * Confirmed decision history step
     * 
     */
    @XmlEnumValue("DecisionHistoryStep")
    DECISION_HISTORY_STEP("DecisionHistoryStep"),

    /**
     * Confirmed general error history step
     * 
     */
    @XmlEnumValue("GeneralErrorDecisionHistoryStep")
    GENERAL_ERROR_DECISION_HISTORY_STEP("GeneralErrorDecisionHistoryStep"),

    /**
     * Reassign task history step
     * 
     */
    @XmlEnumValue("ReassignHistoryStep")
    REASSIGN_HISTORY_STEP("ReassignHistoryStep"),

    /**
     * Assign data history step
     * 
     */
    @XmlEnumValue("AssignDataHistoryStep")
    ASSIGN_DATA_HISTORY_STEP("AssignDataHistoryStep"),

    /**
     * Assign to history step
     * 
     */
    @XmlEnumValue("AssignToHistoryStep")
    ASSIGN_TO_HISTORY_STEP("AssignToHistoryStep"),

    /**
     * Condition history step
     * 
     */
    @XmlEnumValue("ConditionHistoryStep")
    CONDITION_HISTORY_STEP("ConditionHistoryStep"),

    /**
     * Email history step
     * 
     */
    @XmlEnumValue("EmailHistoryStep")
    EMAIL_HISTORY_STEP("EmailHistoryStep"),

    /**
     * Web service history step
     * 
     */
    @XmlEnumValue("WebServiceHistoryStep")
    WEB_SERVICE_HISTORY_STEP("WebServiceHistoryStep"),

    /**
     * Start history step
     * 
     */
    @XmlEnumValue("StartHistoryStep")
    START_HISTORY_STEP("StartHistoryStep"),

    /**
     * Task in progress history step
     * 
     */
    @XmlEnumValue("TaskInProgressHistoryStep")
    TASK_IN_PROGRESS_HISTORY_STEP("TaskInProgressHistoryStep"),

    /**
     * Stop workflow history step
     * 
     */
    @XmlEnumValue("StopHistoryStep")
    STOP_HISTORY_STEP("StopHistoryStep"),

    /**
     * End history step
     * 
     */
    @XmlEnumValue("EndHistoryStep")
    END_HISTORY_STEP("EndHistoryStep"),

    /**
     * Error exit history step
     * 
     */
    @XmlEnumValue("ErrorHistoryStep")
    ERROR_HISTORY_STEP("ErrorHistoryStep"),

    /**
     * Time out history step
     * 
     */
    @XmlEnumValue("TimeoutHistoryStep")
    TIMEOUT_HISTORY_STEP("TimeoutHistoryStep"),

    /**
     * Out of office history step
     * 
     */
    @XmlEnumValue("OutOfOfficeHistotyStep")
    OUT_OF_OFFICE_HISTOTY_STEP("OutOfOfficeHistotyStep"),

    /**
     * Confirmed decision history step from request.
     * 
     */
    @XmlEnumValue("RequestDecisionHistoryStep")
    REQUEST_DECISION_HISTORY_STEP("RequestDecisionHistoryStep"),

    /**
     * Start history step from request.
     * 
     */
    @XmlEnumValue("RequestStartHistoryStep")
    REQUEST_START_HISTORY_STEP("RequestStartHistoryStep"),

    /**
     * End history step from request.
     * 
     */
    @XmlEnumValue("RequestEndHistoryStep")
    REQUEST_END_HISTORY_STEP("RequestEndHistoryStep"),

    /**
     * Wait history step for workflow wait activity.
     * 
     */
    @XmlEnumValue("WaitHistoryStep")
    WAIT_HISTORY_STEP("WaitHistoryStep"),

    /**
     * Event history step for workflow wait activity.
     * 
     */
    @XmlEnumValue("EventHistoryStep")
    EVENT_HISTORY_STEP("EventHistoryStep");
    private final String value;

    StepTypeEnum(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static StepTypeEnum fromValue(String v) {
        for (StepTypeEnum c: StepTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
