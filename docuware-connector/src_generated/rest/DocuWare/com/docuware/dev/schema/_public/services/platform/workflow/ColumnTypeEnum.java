
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for ColumnTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ColumnTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GlobalVariable"/&gt;
 *     &lt;enumeration value="IndexField"/&gt;
 *     &lt;enumeration value="TaskState"/&gt;
 *     &lt;enumeration value="ReceivedOn"/&gt;
 *     &lt;enumeration value="ReminderDate"/&gt;
 *     &lt;enumeration value="ExpireDate"/&gt;
 *     &lt;enumeration value="Instance"/&gt;
 *     &lt;enumeration value="Version"/&gt;
 *     &lt;enumeration value="Activity"/&gt;
 *     &lt;enumeration value="TaskUser"/&gt;
 *     &lt;enumeration value="StartDate"/&gt;
 *     &lt;enumeration value="LastErrorActivity"/&gt;
 *     &lt;enumeration value="LastErrorMessage"/&gt;
 *     &lt;enumeration value="LastDecisionUser"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ColumnTypeEnum")
@XmlEnum
public enum ColumnTypeEnum {


    /**
     * Global variable
     * 
     */
    @XmlEnumValue("GlobalVariable")
    GLOBAL_VARIABLE("GlobalVariable"),

    /**
     * File cabinet field
     * 
     */
    @XmlEnumValue("IndexField")
    INDEX_FIELD("IndexField"),

    /**
     * System column - taskState
     * 
     */
    @XmlEnumValue("TaskState")
    TASK_STATE("TaskState"),

    /**
     * System column - tasks received on
     * 
     */
    @XmlEnumValue("ReceivedOn")
    RECEIVED_ON("ReceivedOn"),

    /**
     * System column - reminder date
     * 
     */
    @XmlEnumValue("ReminderDate")
    REMINDER_DATE("ReminderDate"),

    /**
     * System column - expire date
     * 
     */
    @XmlEnumValue("ExpireDate")
    EXPIRE_DATE("ExpireDate"),

    /**
     * System column - instance id
     * 
     */
    @XmlEnumValue("Instance")
    INSTANCE("Instance"),

    /**
     * System column - workflow version
     * 
     */
    @XmlEnumValue("Version")
    VERSION("Version"),

    /**
     * System column - activity name
     * 
     */
    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),

    /**
     * System column - task user
     * 
     */
    @XmlEnumValue("TaskUser")
    TASK_USER("TaskUser"),

    /**
     * System column - workflow start date
     * 
     */
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),

    /**
     * System column - last error activity
     * 
     */
    @XmlEnumValue("LastErrorActivity")
    LAST_ERROR_ACTIVITY("LastErrorActivity"),

    /**
     * System column - last error message
     * 
     */
    @XmlEnumValue("LastErrorMessage")
    LAST_ERROR_MESSAGE("LastErrorMessage"),

    /**
     * System column - last decision user
     * 
     */
    @XmlEnumValue("LastDecisionUser")
    LAST_DECISION_USER("LastDecisionUser");
    private final String value;

    ColumnTypeEnum(String v) {
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
    public static ColumnTypeEnum fromValue(String v) {
        for (ColumnTypeEnum c: ColumnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
