
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Signature wise stamps.
 * 
 * &lt;p&gt;Java class for StampSignatureType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="StampSignatureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="XMLDSIG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
    public static StampSignatureType fromValue(String v) {
        for (StampSignatureType c: StampSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
