
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Asc"/&gt;
 *     &lt;enumeration value="Desc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortDirection")
@XmlEnum
public enum SortDirection {


    /**
     * Sorts a field in the default order.
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * Sorts a field in ascending order.
     * 
     */
    @XmlEnumValue("Asc")
    ASC("Asc"),

    /**
     * Sorts a field in descending order.
     * 
     */
    @XmlEnumValue("Desc")
    DESC("Desc");
    private final String value;

    SortDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortDirection fromValue(String v) {
        for (SortDirection c: SortDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
