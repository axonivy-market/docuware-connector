
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDialogFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultDialogFunctionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StartNewRetrieval"/&gt;
 *     &lt;enumeration value="LinkSearch"/&gt;
 *     &lt;enumeration value="DisplayDocument"/&gt;
 *     &lt;enumeration value="DisplayInfoBox"/&gt;
 *     &lt;enumeration value="PrintSelectedDocument"/&gt;
 *     &lt;enumeration value="DeleteSelectedDocument"/&gt;
 *     &lt;enumeration value="CopyToBasket"/&gt;
 *     &lt;enumeration value="Versions"/&gt;
 *     &lt;enumeration value="AppendFromBasket"/&gt;
 *     &lt;enumeration value="DownloadAsOriginal"/&gt;
 *     &lt;enumeration value="DownloadAsPDFWithoutAnno"/&gt;
 *     &lt;enumeration value="DownloadAsPDFWithAnno"/&gt;
 *     &lt;enumeration value="SendAsOriginal"/&gt;
 *     &lt;enumeration value="SendAsPDFWithoutAnno"/&gt;
 *     &lt;enumeration value="SendAsPDFWithAnno"/&gt;
 *     &lt;enumeration value="SendAsHyperlink"/&gt;
 *     &lt;enumeration value="SendResultList"/&gt;
 *     &lt;enumeration value="EMailReply"/&gt;
 *     &lt;enumeration value="EMailReplyAll"/&gt;
 *     &lt;enumeration value="EMailForward"/&gt;
 *     &lt;enumeration value="ShowInSeparateViewer"/&gt;
 *     &lt;enumeration value="EditDocument"/&gt;
 *     &lt;enumeration value="ShowWorkflowHistory"/&gt;
 *     &lt;enumeration value="ExportToCSV"/&gt;
 *     &lt;enumeration value="CreateREQUEST"/&gt;
 *     &lt;enumeration value="ChangeIndexOfMultipleDocuments"/&gt;
 *     &lt;enumeration value="CheckOutToBasket"/&gt;
 *     &lt;enumeration value="CheckOutToFileSystem"/&gt;
 *     &lt;enumeration value="ChangeDocumentStatus"/&gt;
 *     &lt;enumeration value="ShowVersionHistory"/&gt;
 *     &lt;enumeration value="CopyIntoAnotherFileCabinet"/&gt;
 *     &lt;enumeration value="SendREQUEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultDialogFunctionType")
@XmlEnum
public enum ResultDialogFunctionType {


    /**
     * 
     * 						Function for initiating a new search. The search dialog contains the search terms used in the last search.
     * 					
     * 
     */
    @XmlEnumValue("StartNewRetrieval")
    START_NEW_RETRIEVAL("StartNewRetrieval"),

    /**
     * 
     * 						Function for displaying documents linked to a document selected in the result list. It opens a dialog listing all the link definitions for that document. When you select one of these definitions, the linked documents are displayed.
     * 					
     * 
     */
    @XmlEnumValue("LinkSearch")
    LINK_SEARCH("LinkSearch"),

    /**
     * 
     * 						Function for displaying the document in the Viewer.
     * 					
     * 
     */
    @XmlEnumValue("DisplayDocument")
    DISPLAY_DOCUMENT("DisplayDocument"),

    /**
     * 
     * 						Function for opening the infobox for a highlighted document. This allows you to view and modify all database entries for the document as well as the contents of the system fields - such as store date and DocID.
     * 					
     * 
     */
    @XmlEnumValue("DisplayInfoBox")
    DISPLAY_INFO_BOX("DisplayInfoBox"),

    /**
     * 
     * 						Function for printing documents that are selected in the result list.
     * 					
     * 
     */
    @XmlEnumValue("PrintSelectedDocument")
    PRINT_SELECTED_DOCUMENT("PrintSelectedDocument"),

    /**
     * 
     * 						Function for deleting documents selected in the result list.
     * 					
     * 
     */
    @XmlEnumValue("DeleteSelectedDocument")
    DELETE_SELECTED_DOCUMENT("DeleteSelectedDocument"),

    /**
     * 
     * 						Function that allows you to place a copy of the selected documents in the selected basket / document tray in Windows Client or Web Client.
     * 					
     * 
     */
    @XmlEnumValue("CopyToBasket")
    COPY_TO_BASKET("CopyToBasket"),

    /**
     * 
     * 						Function that allows you to show or hide checked-out documents Checked-out documents can only be viewed by other users. No overlays can be shown, and no stamps added.
     * 					
     * 
     */
    @XmlEnumValue("Versions")
    VERSIONS("Versions"),

    /**
     * 
     * 						Function that allows you to attach selected documents from the selected basket / document tray to a document or database entry in the result list.
     * 					
     * 
     */
    @XmlEnumValue("AppendFromBasket")
    APPEND_FROM_BASKET("AppendFromBasket"),

    /**
     * 
     * 						The function for downloading a document in the original format from a result list.
     * 					
     * 
     */
    @XmlEnumValue("DownloadAsOriginal")
    DOWNLOAD_AS_ORIGINAL("DownloadAsOriginal"),

    /**
     * 
     * 						The function for downloading a document from a result list in PDF format without annotations.
     * 					
     * 
     */
    @XmlEnumValue("DownloadAsPDFWithoutAnno")
    DOWNLOAD_AS_PDF_WITHOUT_ANNO("DownloadAsPDFWithoutAnno"),

    /**
     * 
     * 						The function for downloading a document from a result list in PDF format with annotations.
     * 					
     * 
     */
    @XmlEnumValue("DownloadAsPDFWithAnno")
    DOWNLOAD_AS_PDF_WITH_ANNO("DownloadAsPDFWithAnno"),

    /**
     * 
     * 						The function for sending a document in the original format from a result list as an email attachment.
     * 					
     * 
     */
    @XmlEnumValue("SendAsOriginal")
    SEND_AS_ORIGINAL("SendAsOriginal"),

    /**
     * 
     * 						The function for sending a document from a result list in PDF format without annotations as an email attachment.
     * 					
     * 
     */
    @XmlEnumValue("SendAsPDFWithoutAnno")
    SEND_AS_PDF_WITHOUT_ANNO("SendAsPDFWithoutAnno"),

    /**
     * 
     * 						The function for sending a document from a result list in PDF format with annotations as an email attachment.
     * 					
     * 
     */
    @XmlEnumValue("SendAsPDFWithAnno")
    SEND_AS_PDF_WITH_ANNO("SendAsPDFWithAnno"),

    /**
     * 
     * 						The function for sending a document from a result list as a hyperlink in an email.
     * 					
     * 
     */
    @XmlEnumValue("SendAsHyperlink")
    SEND_AS_HYPERLINK("SendAsHyperlink"),

    /**
     * 
     * 						The function for sending a currently open result list by email. A hyperlink is inserted in the email with the search query on which the current result list is based.
     * 					
     * 
     */
    @XmlEnumValue("SendResultList")
    SEND_RESULT_LIST("SendResultList"),

    /**
     * 
     * 						The function for creating a reply email to an email that is stored in DocuWare. If this function is used in the result list, the email client, e.g. Outlook, opens with a normal reply email.
     * 					
     * 
     */
    @XmlEnumValue("EMailReply")
    E_MAIL_REPLY("EMailReply"),

    /**
     * 
     * 						The function for creating a reply email to all parties for an email that is stored in DocuWare. If this function is used in the result list, the email client, e.g. Outlook, opens with a normal reply-to-all email.
     * 					
     * 
     */
    @XmlEnumValue("EMailReplyAll")
    E_MAIL_REPLY_ALL("EMailReplyAll"),

    /**
     * 
     * 						The function for forwarding an email that is stored in DocuWare. If this function is used in the result list, the email client, e.g. Outlook, opens with a normal forward email.
     * 					
     * 
     */
    @XmlEnumValue("EMailForward")
    E_MAIL_FORWARD("EMailForward"),

    /**
     * 
     * 						The function for opening the documents of a result list in different viewers. A new Viewer is opened for each document when you want to view the document. This makes it easy to compare documents with each other.
     * 					
     * 
     */
    @XmlEnumValue("ShowInSeparateViewer")
    SHOW_IN_SEPARATE_VIEWER("ShowInSeparateViewer"),

    /**
     * 
     * 						The function for editing documents in the original program and saving the changes back to the archived document.
     * 					
     * 
     */
    @XmlEnumValue("EditDocument")
    EDIT_DOCUMENT("EditDocument"),

    /**
     * 
     * 						Function for displaying the workflow tracking which is linked to the document.
     * 					
     * 
     */
    @XmlEnumValue("ShowWorkflowHistory")
    SHOW_WORKFLOW_HISTORY("ShowWorkflowHistory"),

    /**
     * 
     * 						Function for exporting the document to CSV.
     * 					
     * 
     */
    @XmlEnumValue("ExportToCSV")
    EXPORT_TO_CSV("ExportToCSV"),

    /**
     * 
     * 						Functions for storing the documents in a DocuWare Request.
     * 					
     * 
     */
    @XmlEnumValue("CreateREQUEST")
    CREATE_REQUEST("CreateREQUEST"),

    /**
     * 
     * 						Function for selecting several documents, calling up an index field and editing the entry for all selected documents.
     * 					
     * 
     */
    @XmlEnumValue("ChangeIndexOfMultipleDocuments")
    CHANGE_INDEX_OF_MULTIPLE_DOCUMENTS("ChangeIndexOfMultipleDocuments"),

    /**
     * 
     * 						The function for checking out a document from the file cabinet to a basket / document tray and editing it there. During this time, the document is locked in the file cabinet, but can be viewed in read-only mode.
     * 					
     * 
     */
    @XmlEnumValue("CheckOutToBasket")
    CHECK_OUT_TO_BASKET("CheckOutToBasket"),

    /**
     * 
     * 						The function for checking out a document from the file cabinet to a Windows file system and editing it there. During this time, the document is locked in the file cabinet, but can be viewed in read-only mode.
     * 					
     * 
     */
    @XmlEnumValue("CheckOutToFileSystem")
    CHECK_OUT_TO_FILE_SYSTEM("CheckOutToFileSystem"),

    /**
     * 
     * 						The function for setting the status of a document version from, e.g. "Out of Date" or "In Progress" to "Up to Date".
     * 					
     * 
     */
    @XmlEnumValue("ChangeDocumentStatus")
    CHANGE_DOCUMENT_STATUS("ChangeDocumentStatus"),

    /**
     * 
     * 						The function for displaying all versions of a document.
     * 					
     * 
     */
    @XmlEnumValue("ShowVersionHistory")
    SHOW_VERSION_HISTORY("ShowVersionHistory"),

    /**
     * 
     * 						Function that allows you to copy a selected document into a different file cabinet.
     * 					
     * 
     */
    @XmlEnumValue("CopyIntoAnotherFileCabinet")
    COPY_INTO_ANOTHER_FILE_CABINET("CopyIntoAnotherFileCabinet"),

    /**
     * 
     *             Functions for sending a DocuWare Request.
     *           
     * 
     */
    @XmlEnumValue("SendREQUEST")
    SEND_REQUEST("SendREQUEST");
    private final String value;

    ResultDialogFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultDialogFunctionType fromValue(String v) {
        for (ResultDialogFunctionType c: ResultDialogFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
