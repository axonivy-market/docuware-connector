
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskTableFieldJoinTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskTableFieldJoinTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Prepend"/&gt;
 *     &lt;enumeration value="Append"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskTableFieldJoinTypeEnum")
@XmlEnum
public enum TaskTableFieldJoinTypeEnum {


    /**
     * Insert before
     * 
     */
    @XmlEnumValue("Prepend")
    PREPEND("Prepend"),

    /**
     * Insert after
     * 
     */
    @XmlEnumValue("Append")
    APPEND("Append"),

    /**
     * Replace values
     * 
     */
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    TaskTableFieldJoinTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskTableFieldJoinTypeEnum fromValue(String v) {
        for (TaskTableFieldJoinTypeEnum c: TaskTableFieldJoinTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
