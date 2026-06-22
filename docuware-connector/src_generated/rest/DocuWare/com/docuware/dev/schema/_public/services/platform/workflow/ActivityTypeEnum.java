
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for ActivityTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ActivityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GeneralTask"/&gt;
 *     &lt;enumeration value="ParallelTask"/&gt;
 *     &lt;enumeration value="UserCredentials"/&gt;
 *     &lt;enumeration value="GeneralError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ActivityTypeEnum")
@XmlEnum
public enum ActivityTypeEnum {


    /**
     * General task activity
     * 
     */
    @XmlEnumValue("GeneralTask")
    GENERAL_TASK("GeneralTask"),

    /**
     * Parallel task activity
     * 
     */
    @XmlEnumValue("ParallelTask")
    PARALLEL_TASK("ParallelTask"),

    /**
     * User credentials activity
     * 
     */
    @XmlEnumValue("UserCredentials")
    USER_CREDENTIALS("UserCredentials"),

    /**
     * General error activity
     * 
     */
    @XmlEnumValue("GeneralError")
    GENERAL_ERROR("GeneralError");
    private final String value;

    ActivityTypeEnum(String v) {
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
    public static ActivityTypeEnum fromValue(String v) {
        for (ActivityTypeEnum c: ActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
