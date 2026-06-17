
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenUsage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenUsage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Multi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TokenUsage")
@XmlEnum
public enum TokenUsage {


    /**
     * The token can be used to login only once
     * 
     */
    @XmlEnumValue("Single")
    SINGLE("Single"),

    /**
     * The token can be used multiple times
     * 
     */
    @XmlEnumValue("Multi")
    MULTI("Multi");
    private final String value;

    TokenUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenUsage fromValue(String v) {
        for (TokenUsage c: TokenUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
