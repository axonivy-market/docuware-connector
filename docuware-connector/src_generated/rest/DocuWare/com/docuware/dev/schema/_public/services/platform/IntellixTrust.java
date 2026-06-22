
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define how much the intellix result is reliable
 * 
 * &lt;p&gt;Java class for IntellixTrust&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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
    public static IntellixTrust fromValue(String v) {
        for (IntellixTrust c: IntellixTrust.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
