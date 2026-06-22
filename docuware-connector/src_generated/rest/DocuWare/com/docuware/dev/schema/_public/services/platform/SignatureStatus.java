
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define allowed operations when there is signature
 * 
 * &lt;p&gt;Java class for SignatureStatus&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="SignatureStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Allow_Annotations"/&gt;
 *     &lt;enumeration value="Allow_Stamps"/&gt;
 *     &lt;enumeration value="Allow_Signature_Stamps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
    public static SignatureStatus fromValue(String v) {
        for (SignatureStatus c: SignatureStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
