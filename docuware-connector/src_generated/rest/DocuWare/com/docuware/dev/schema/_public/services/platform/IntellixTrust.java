
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntellixTrust.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntellixTrust"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Red"/&gt;
 *     &lt;enumeration value="Yellow"/&gt;
 *     &lt;enumeration value="Green"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntellixTrust")
@XmlEnum
public enum IntellixTrust {


    /**
     * No intelix
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Intelix failed
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * Intelix still in progress
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Unrecognized
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * Predicted
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    /**
     * Recognized
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green");
    private final String value;

    IntellixTrust(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntellixTrust fromValue(String v) {
        for (IntellixTrust c: IntellixTrust.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
