
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A predefined DocuWare role types
 * 
 * &lt;p&gt;Java class for RoleTypes&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="RoleTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Administrator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "RoleTypes")
@XmlEnum
public enum RoleTypes {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator");
    private final String value;

    RoleTypes(String v) {
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
    public static RoleTypes fromValue(String v) {
        for (RoleTypes c: RoleTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
