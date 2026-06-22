
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for ConfigurationRight&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ConfigurationRight"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SmartConnect"/&gt;
 *     &lt;enumeration value="DocumentTray"/&gt;
 *     &lt;enumeration value="EmailNotification"/&gt;
 *     &lt;enumeration value="ConnectToMfp"/&gt;
 *     &lt;enumeration value="OcrTemplate"/&gt;
 *     &lt;enumeration value="ConnectToOutlook"/&gt;
 *     &lt;enumeration value="Printer"/&gt;
 *     &lt;enumeration value="Import"/&gt;
 *     &lt;enumeration value="DocuWareRequest"/&gt;
 *     &lt;enumeration value="IntelligentIndexing"/&gt;
 *     &lt;enumeration value="CONNECTToMail"/&gt;
 *     &lt;enumeration value="FileCabinets"/&gt;
 *     &lt;enumeration value="Stamps"/&gt;
 *     &lt;enumeration value="SelectLists"/&gt;
 *     &lt;enumeration value="MaintainFixedSelectLists"/&gt;
 *     &lt;enumeration value="UserManagement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ConfigurationRight")
@XmlEnum
public enum ConfigurationRight {


    /**
     * Manage SmartConnect configurations
     * 
     */
    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect"),

    /**
     * Manage Document Tray
     * 
     */
    @XmlEnumValue("DocumentTray")
    DOCUMENT_TRAY("DocumentTray"),

    /**
     * Manage E-Mail Alert
     * 
     */
    @XmlEnumValue("EmailNotification")
    EMAIL_NOTIFICATION("EmailNotification"),

    /**
     * Manage MFP Workflow
     * 
     */
    @XmlEnumValue("ConnectToMfp")
    CONNECT_TO_MFP("ConnectToMfp"),

    /**
     * Manage OCR template
     * 
     */
    @XmlEnumValue("OcrTemplate")
    OCR_TEMPLATE("OcrTemplate"),

    /**
     * Manage Connect to Outlook configurations
     * 
     */
    @XmlEnumValue("ConnectToOutlook")
    CONNECT_TO_OUTLOOK("ConnectToOutlook"),

    /**
     * Manage Printer configurations
     * 
     */
    @XmlEnumValue("Printer")
    PRINTER("Printer"),

    /**
     * Manage Web Import configurations
     * 
     */
    @XmlEnumValue("Import")
    IMPORT("Import"),

    /**
     * Manage REQUEST
     * 
     */
    @XmlEnumValue("DocuWareRequest")
    DOCU_WARE_REQUEST("DocuWareRequest"),

    /**
     * Manage Intelligent Indexing
     * 
     */
    @XmlEnumValue("IntelligentIndexing")
    INTELLIGENT_INDEXING("IntelligentIndexing"),

    /**
     * Manage Connect to Mail configurations
     * 
     */
    @XmlEnumValue("CONNECTToMail")
    CONNECT_TO_MAIL("CONNECTToMail"),

    /**
     * File cabinets
     * 
     */
    @XmlEnumValue("FileCabinets")
    FILE_CABINETS("FileCabinets"),

    /**
     * Manage stamps
     * 
     */
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),

    /**
     * Manage select lists
     * 
     */
    @XmlEnumValue("SelectLists")
    SELECT_LISTS("SelectLists"),

    /**
     * Maintain fixed select lists
     * 
     */
    @XmlEnumValue("MaintainFixedSelectLists")
    MAINTAIN_FIXED_SELECT_LISTS("MaintainFixedSelectLists"),

    /**
     * User Management
     * 
     */
    @XmlEnumValue("UserManagement")
    USER_MANAGEMENT("UserManagement");
    private final String value;

    ConfigurationRight(String v) {
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
    public static ConfigurationRight fromValue(String v) {
        for (ConfigurationRight c: ConfigurationRight.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
