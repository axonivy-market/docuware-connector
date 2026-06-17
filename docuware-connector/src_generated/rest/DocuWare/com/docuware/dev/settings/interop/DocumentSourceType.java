
package com.docuware.dev.settings.interop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Printer"/&gt;
 *     &lt;enumeration value="Scanner"/&gt;
 *     &lt;enumeration value="WebCapture"/&gt;
 *     &lt;enumeration value="DocTray"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="SmartConnect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentSourceType", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DocumentSourceType {

    @XmlEnumValue("Printer")
    PRINTER("Printer"),
    @XmlEnumValue("Scanner")
    SCANNER("Scanner"),
    @XmlEnumValue("WebCapture")
    WEB_CAPTURE("WebCapture"),
    @XmlEnumValue("DocTray")
    DOC_TRAY("DocTray"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect");
    private final String value;

    DocumentSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentSourceType fromValue(String v) {
        for (DocumentSourceType c: DocumentSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
