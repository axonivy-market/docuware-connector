
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FixedValue"/&gt;
 *     &lt;enumeration value="WebFormField"/&gt;
 *     &lt;enumeration value="CurrentDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComparisonType")
@XmlEnum
public enum ComparisonType {

    @XmlEnumValue("FixedValue")
    FIXED_VALUE("FixedValue"),
    @XmlEnumValue("WebFormField")
    WEB_FORM_FIELD("WebFormField"),
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate");
    private final String value;

    ComparisonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonType fromValue(String v) {
        for (ComparisonType c: ComparisonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
