
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define the version management status of a document
 * 
 * &lt;p&gt;Java class for VersionManagementStatus&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="VersionManagementStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *     &lt;enumeration value="Initial"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "VersionManagementStatus")
@XmlEnum
public enum VersionManagementStatus {


    /**
     * Version management is disabled.
     * 
     */
    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    /**
     * The initial version of the document.
     * 
     */
    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    /**
     * Manual version management is in progress.
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Manual version of the document.
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Automatic version of the document.
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VersionManagementStatus(String v) {
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
    public static VersionManagementStatus fromValue(String v) {
        for (VersionManagementStatus c: VersionManagementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
