
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for ImportEntryVersionStatus&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ImportEntryVersionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Succeeded"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Aborted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ImportEntryVersionStatus")
@XmlEnum
public enum ImportEntryVersionStatus {


    /**
     * A value that indicates whether importing of the version is successful.
     * 
     */
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    /**
     * A value that indicates whether importing of the version failed.
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * A value that indicates whether importing of the version is not started.
     * 
     */
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    ImportEntryVersionStatus(String v) {
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
    public static ImportEntryVersionStatus fromValue(String v) {
        for (ImportEntryVersionStatus c: ImportEntryVersionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
