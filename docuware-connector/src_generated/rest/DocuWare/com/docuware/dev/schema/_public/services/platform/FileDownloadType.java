
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define the format that will be used to download a document
 * 
 * &lt;p&gt;Java class for FileDownloadType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="FileDownloadType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Zip"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "FileDownloadType")
@XmlEnum
public enum FileDownloadType {


    /**
     * The type of the downloaded file determined by the server automatically.
     *             In case of a single file this is directly downloaded, otherwise a ZIP file is created.
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * The files are always downloaded as ZIP file.
     * 
     */
    @XmlEnumValue("Zip")
    ZIP("Zip"),

    /**
     * The files are always downloaded as PDF file. If more than one document is downloaded then every document is converted to PDF and the PDF files are packed in a ZIP file.
     * 
     */
    PDF("PDF");
    private final String value;

    FileDownloadType(String v) {
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
    public static FileDownloadType fromValue(String v) {
        for (FileDownloadType c: FileDownloadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
