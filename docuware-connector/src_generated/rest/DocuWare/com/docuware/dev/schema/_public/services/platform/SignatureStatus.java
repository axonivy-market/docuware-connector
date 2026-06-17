
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Allow_Annotations"/&gt;
 *     &lt;enumeration value="Allow_Stamps"/&gt;
 *     &lt;enumeration value="Allow_Signature_Stamps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SignatureStatus")
@XmlEnum
public enum SignatureStatus {


    /**
     * Allow placing of annotations
     * 
     */
    @XmlEnumValue("Allow_Annotations")
    ALLOW_ANNOTATIONS("Allow_Annotations"),

    /**
     * Allow placing of stamps
     * 
     */
    @XmlEnumValue("Allow_Stamps")
    ALLOW_STAMPS("Allow_Stamps"),

    /**
     * Allow placing of signature stamps
     * 
     */
    @XmlEnumValue("Allow_Signature_Stamps")
    ALLOW_SIGNATURE_STAMPS("Allow_Signature_Stamps");
    private final String value;

    SignatureStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureStatus fromValue(String v) {
        for (SignatureStatus c: SignatureStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
