
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlatformImageFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlatformImageFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Png"/&gt;
 *     &lt;enumeration value="Jpeg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlatformImageFormat")
@XmlEnum
public enum PlatformImageFormat {

    @XmlEnumValue("Png")
    PNG("Png"),
    @XmlEnumValue("Jpeg")
    JPEG("Jpeg");
    private final String value;

    PlatformImageFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlatformImageFormat fromValue(String v) {
        for (PlatformImageFormat c: PlatformImageFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
