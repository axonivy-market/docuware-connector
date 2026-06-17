
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredefinedEntryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="CurrentUserShortName"/&gt;
 *     &lt;enumeration value="CurrentUserLongName"/&gt;
 *     &lt;enumeration value="CurrentDate"/&gt;
 *     &lt;enumeration value="CurrentDateTime"/&gt;
 *     &lt;enumeration value="CurrentUserEmail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredefinedEntryType")
@XmlEnum
public enum PredefinedEntryType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("CurrentUserShortName")
    CURRENT_USER_SHORT_NAME("CurrentUserShortName"),
    @XmlEnumValue("CurrentUserLongName")
    CURRENT_USER_LONG_NAME("CurrentUserLongName"),
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),
    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),
    @XmlEnumValue("CurrentUserEmail")
    CURRENT_USER_EMAIL("CurrentUserEmail");
    private final String value;

    PredefinedEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedEntryType fromValue(String v) {
        for (PredefinedEntryType c: PredefinedEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
