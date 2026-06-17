
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FileSystem"/&gt;
 *     &lt;enumeration value="DocTray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileSource")
@XmlEnum
public enum FileSource {

    @XmlEnumValue("FileSystem")
    FILE_SYSTEM("FileSystem"),
    @XmlEnumValue("DocTray")
    DOC_TRAY("DocTray");
    private final String value;

    FileSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileSource fromValue(String v) {
        for (FileSource c: FileSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
