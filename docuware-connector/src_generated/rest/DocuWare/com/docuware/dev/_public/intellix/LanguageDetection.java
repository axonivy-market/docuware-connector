
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for LanguageDetection&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="LanguageDetection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="FallbackSystemCulture"/&gt;
 *     &lt;enumeration value="FallbackExplicite"/&gt;
 *     &lt;enumeration value="Explicite"/&gt;
 *     &lt;enumeration value="DocuWareLanguageIdentifier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "LanguageDetection")
@XmlEnum
public enum LanguageDetection {


    /**
     * The OCR could automatically detect the language.
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * The OCR could not automatically detect the language and used the culture of system the OCR was run.
     * 
     */
    @XmlEnumValue("FallbackSystemCulture")
    FALLBACK_SYSTEM_CULTURE("FallbackSystemCulture"),

    /**
     * The OCR could not automatically detect the language and used the languages which are explicitely specified by a user.
     * 
     */
    @XmlEnumValue("FallbackExplicite")
    FALLBACK_EXPLICITE("FallbackExplicite"),

    /**
     * The OCR did not try to automatically detect any language. Only the languages which are explicitely specified by a user are used.
     * 
     */
    @XmlEnumValue("Explicite")
    EXPLICITE("Explicite"),

    /**
     * The language was detected by the majority voting algorithm used inside DocuWare.
     * 
     */
    @XmlEnumValue("DocuWareLanguageIdentifier")
    DOCU_WARE_LANGUAGE_IDENTIFIER("DocuWareLanguageIdentifier");
    private final String value;

    LanguageDetection(String v) {
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
    public static LanguageDetection fromValue(String v) {
        for (LanguageDetection c: LanguageDetection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
