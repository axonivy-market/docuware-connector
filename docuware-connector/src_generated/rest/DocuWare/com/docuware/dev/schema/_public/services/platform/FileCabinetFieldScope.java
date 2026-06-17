
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileCabinetFieldScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileCabinetFieldScope"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileCabinetFieldScope")
@XmlEnum
public enum FileCabinetFieldScope {


    /**
     * User defined field.
     * 
     */
    @XmlEnumValue("User")
    USER("User"),

    /**
     * System field.
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    FileCabinetFieldScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileCabinetFieldScope fromValue(String v) {
        for (FileCabinetFieldScope c: FileCabinetFieldScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
