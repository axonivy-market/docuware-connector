
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StampSignatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StampSignatureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="XMLDSIG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StampSignatureType")
@XmlEnum
public enum StampSignatureType {


    /**
     * Not a signature
     * 
     */
    @XmlEnumValue("No")
    NO("No"),

    /**
     * Simple signature - checksum only
     * 
     */
    @XmlEnumValue("Simple")
    SIMPLE("Simple"),

    /**
     * Xml digital signature - certificate based
     * 
     */
    XMLDSIG("XMLDSIG");
    private final String value;

    StampSignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StampSignatureType fromValue(String v) {
        for (StampSignatureType c: StampSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
