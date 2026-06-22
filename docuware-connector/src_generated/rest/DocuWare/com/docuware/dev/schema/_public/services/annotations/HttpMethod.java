
package com.docuware.dev.schema._public.services.annotations;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for HttpMethod&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="HttpMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Get"/&gt;
 *     &lt;enumeration value="Put"/&gt;
 *     &lt;enumeration value="Post"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Head"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "HttpMethod")
@XmlEnum
public enum HttpMethod {

    @XmlEnumValue("Get")
    GET("Get"),
    @XmlEnumValue("Put")
    PUT("Put"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Head")
    HEAD("Head");
    private final String value;

    HttpMethod(String v) {
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
    public static HttpMethod fromValue(String v) {
        for (HttpMethod c: HttpMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
