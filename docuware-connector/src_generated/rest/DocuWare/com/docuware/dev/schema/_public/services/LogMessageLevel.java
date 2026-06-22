
package com.docuware.dev.schema._public.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for LogMessageLevel&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="LogMessageLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *     &lt;enumeration value="Info"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Critical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "LogMessageLevel")
@XmlEnum
public enum LogMessageLevel {

    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical");
    private final String value;

    LogMessageLevel(String v) {
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
    public static LogMessageLevel fromValue(String v) {
        for (LogMessageLevel c: LogMessageLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
