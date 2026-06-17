
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedirectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedirectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReturnToForm"/&gt;
 *     &lt;enumeration value="URL"/&gt;
 *     &lt;enumeration value="StoredDocument"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RedirectType")
@XmlEnum
public enum RedirectType {

    @XmlEnumValue("ReturnToForm")
    RETURN_TO_FORM("ReturnToForm"),
    URL("URL"),
    @XmlEnumValue("StoredDocument")
    STORED_DOCUMENT("StoredDocument");
    private final String value;

    RedirectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedirectType fromValue(String v) {
        for (RedirectType c: RedirectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
