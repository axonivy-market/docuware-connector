
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlDSigStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlDSigStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotChecked"/&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="NotOk"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "XmlDSigStatusType")
@XmlEnum
public enum XmlDSigStatusType {


    /**
     * 
     *             Not checked.
     *           
     * 
     */
    @XmlEnumValue("NotChecked")
    NOT_CHECKED("NotChecked"),

    /**
     * 
     *             Okay.
     *           
     * 
     */
    @XmlEnumValue("Ok")
    OK("Ok"),

    /**
     * 
     *             Failed. Details in ErrorInfo.
     *           
     * 
     */
    @XmlEnumValue("NotOk")
    NOT_OK("NotOk");
    private final String value;

    XmlDSigStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlDSigStatusType fromValue(String v) {
        for (XmlDSigStatusType c: XmlDSigStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
