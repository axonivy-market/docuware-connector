
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for CFSTableNames&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="CFSTableNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name"&gt;
 *     &lt;enumeration value="Environment_Server"/&gt;
 *     &lt;enumeration value="Environment_Client"/&gt;
 *     &lt;enumeration value="Environment_DocuWare_General"/&gt;
 *     &lt;enumeration value="DocuWare_FileCabinet"/&gt;
 *     &lt;enumeration value="DocuWare_DocumentTray"/&gt;
 *     &lt;enumeration value="DocuWare_User"/&gt;
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Search"/&gt;
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Store"/&gt;
 *     &lt;enumeration value="DocuWare_List"/&gt;
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Tasklist"/&gt;
 *     &lt;enumeration value="Installation_App"/&gt;
 *     &lt;enumeration value="DocuWare_Desktop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "CFSTableNames")
@XmlEnum
public enum CFSTableNames {

    @XmlEnumValue("Environment_Server")
    ENVIRONMENT_SERVER("Environment_Server"),
    @XmlEnumValue("Environment_Client")
    ENVIRONMENT_CLIENT("Environment_Client"),
    @XmlEnumValue("Environment_DocuWare_General")
    ENVIRONMENT_DOCU_WARE_GENERAL("Environment_DocuWare_General"),
    @XmlEnumValue("DocuWare_FileCabinet")
    DOCU_WARE_FILE_CABINET("DocuWare_FileCabinet"),
    @XmlEnumValue("DocuWare_DocumentTray")
    DOCU_WARE_DOCUMENT_TRAY("DocuWare_DocumentTray"),
    @XmlEnumValue("DocuWare_User")
    DOCU_WARE_USER("DocuWare_User"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Search")
    DOCU_WARE_FILE_CABINET_DIALOG_SEARCH("DocuWare_FileCabinet_Dialog_Search"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Store")
    DOCU_WARE_FILE_CABINET_DIALOG_STORE("DocuWare_FileCabinet_Dialog_Store"),
    @XmlEnumValue("DocuWare_List")
    DOCU_WARE_LIST("DocuWare_List"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Tasklist")
    DOCU_WARE_FILE_CABINET_DIALOG_TASKLIST("DocuWare_FileCabinet_Dialog_Tasklist"),
    @XmlEnumValue("Installation_App")
    INSTALLATION_APP("Installation_App"),
    @XmlEnumValue("DocuWare_Desktop")
    DOCU_WARE_DESKTOP("DocuWare_Desktop");
    private final String value;

    CFSTableNames(String v) {
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
    public static CFSTableNames fromValue(String v) {
        for (CFSTableNames c: CFSTableNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
