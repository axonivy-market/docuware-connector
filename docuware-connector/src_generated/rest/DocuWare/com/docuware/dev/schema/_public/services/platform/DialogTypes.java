
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Types of dialogs.
 * 
 * &lt;p&gt;Java class for DialogTypes&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DialogTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Search"/&gt;
 *     &lt;enumeration value="Store"/&gt;
 *     &lt;enumeration value="ResultList"/&gt;
 *     &lt;enumeration value="ResultTree"/&gt;
 *     &lt;enumeration value="InfoDialog"/&gt;
 *     &lt;enumeration value="TaskList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "DialogTypes")
@XmlEnum
public enum DialogTypes {


    /**
     * Unknown type.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Search dialog.
     * 
     */
    @XmlEnumValue("Search")
    SEARCH("Search"),

    /**
     * Store dialog.
     * 
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * Result list.
     * 
     */
    @XmlEnumValue("ResultList")
    RESULT_LIST("ResultList"),

    /**
     * Tree view.
     * 
     */
    @XmlEnumValue("ResultTree")
    RESULT_TREE("ResultTree"),

    /**
     * Info dialog.
     * 
     */
    @XmlEnumValue("InfoDialog")
    INFO_DIALOG("InfoDialog"),

    /**
     * Task list(result list with predefiened conditions).
     * 
     */
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList");
    private final String value;

    DialogTypes(String v) {
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
    public static DialogTypes fromValue(String v) {
        for (DialogTypes c: DialogTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
