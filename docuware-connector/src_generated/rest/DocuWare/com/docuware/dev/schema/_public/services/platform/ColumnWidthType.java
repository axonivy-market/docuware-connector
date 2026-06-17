
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnWidthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColumnWidthType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Equal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColumnWidthType")
@XmlEnum
public enum ColumnWidthType {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Equal")
    EQUAL("Equal");
    private final String value;

    ColumnWidthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnWidthType fromValue(String v) {
        for (ColumnWidthType c: ColumnWidthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
