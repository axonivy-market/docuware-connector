
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchronizationOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SynchronizationOperation")
@XmlEnum
public enum SynchronizationOperation {


    /**
     * Specifies that the synchronization will apply ADD opration.
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * Specifies that the synchronization will apply Replace opration.
     * 
     */
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    SynchronizationOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronizationOperation fromValue(String v) {
        for (SynchronizationOperation c: SynchronizationOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
