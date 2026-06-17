
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionManagementStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionManagementStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *     &lt;enumeration value="Initial"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static VersionManagementStatus fromValue(String v) {
        for (VersionManagementStatus c: VersionManagementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
