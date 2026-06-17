
package com.docuware.dev.settings.interop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DWSystemVariableName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DWSystemVariableName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CurrentUserShortName"/&gt;
 *     &lt;enumeration value="CurrentUserLongName"/&gt;
 *     &lt;enumeration value="CurrentDate"/&gt;
 *     &lt;enumeration value="CurrentDateTime"/&gt;
 *     &lt;enumeration value="CurrentUserEmail"/&gt;
 *     &lt;enumeration value="Clipboard"/&gt;
 *     &lt;enumeration value="ImportDirectoryName"/&gt;
 *     &lt;enumeration value="ImportParentDirectoryName"/&gt;
 *     &lt;enumeration value="FileName"/&gt;
 *     &lt;enumeration value="FileExtension"/&gt;
 *     &lt;enumeration value="FileNameWithExtension"/&gt;
 *     &lt;enumeration value="FileModificationDateTime"/&gt;
 *     &lt;enumeration value="FileCreationDateTime"/&gt;
 *     &lt;enumeration value="DocumentSplitNumber"/&gt;
 *     &lt;enumeration value="CurrentUserRole"/&gt;
 *     &lt;enumeration value="CurrentUserGroup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DWSystemVariableName", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWSystemVariableName {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CurrentUserShortName")
    CURRENT_USER_SHORT_NAME("CurrentUserShortName"),
    @XmlEnumValue("CurrentUserLongName")
    CURRENT_USER_LONG_NAME("CurrentUserLongName"),
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),
    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),
    @XmlEnumValue("CurrentUserEmail")
    CURRENT_USER_EMAIL("CurrentUserEmail"),
    @XmlEnumValue("Clipboard")
    CLIPBOARD("Clipboard"),
    @XmlEnumValue("ImportDirectoryName")
    IMPORT_DIRECTORY_NAME("ImportDirectoryName"),
    @XmlEnumValue("ImportParentDirectoryName")
    IMPORT_PARENT_DIRECTORY_NAME("ImportParentDirectoryName"),
    @XmlEnumValue("FileName")
    FILE_NAME("FileName"),
    @XmlEnumValue("FileExtension")
    FILE_EXTENSION("FileExtension"),
    @XmlEnumValue("FileNameWithExtension")
    FILE_NAME_WITH_EXTENSION("FileNameWithExtension"),
    @XmlEnumValue("FileModificationDateTime")
    FILE_MODIFICATION_DATE_TIME("FileModificationDateTime"),
    @XmlEnumValue("FileCreationDateTime")
    FILE_CREATION_DATE_TIME("FileCreationDateTime"),
    @XmlEnumValue("DocumentSplitNumber")
    DOCUMENT_SPLIT_NUMBER("DocumentSplitNumber"),
    @XmlEnumValue("CurrentUserRole")
    CURRENT_USER_ROLE("CurrentUserRole"),
    @XmlEnumValue("CurrentUserGroup")
    CURRENT_USER_GROUP("CurrentUserGroup");
    private final String value;

    DWSystemVariableName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DWSystemVariableName fromValue(String v) {
        for (DWSystemVariableName c: DWSystemVariableName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
