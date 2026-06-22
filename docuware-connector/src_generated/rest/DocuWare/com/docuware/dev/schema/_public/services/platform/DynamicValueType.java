
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for DynamicValueType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DynamicValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CurrentDate"/&gt;
 *     &lt;enumeration value="CurrentDateTime"/&gt;
 *     &lt;enumeration value="CurrentTime"/&gt;
 *     &lt;enumeration value="AutoNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "DynamicValueType")
@XmlEnum
public enum DynamicValueType {

    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Current date.
     * 
     */
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),

    /**
     * Current date including the time.
     * 
     */
    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),

    /**
     * Current time.
     * 
     */
    @XmlEnumValue("CurrentTime")
    CURRENT_TIME("CurrentTime"),

    /**
     * Auto incrementing number.
     * 
     */
    @XmlEnumValue("AutoNumber")
    AUTO_NUMBER("AutoNumber");
    private final String value;

    DynamicValueType(String v) {
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
    public static DynamicValueType fromValue(String v) {
        for (DynamicValueType c: DynamicValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
