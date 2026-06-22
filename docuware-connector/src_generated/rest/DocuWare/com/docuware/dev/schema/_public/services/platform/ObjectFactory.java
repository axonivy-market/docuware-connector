
package com.docuware.dev.schema._public.services.platform;

import javax.xml.namespace.QName;
import com.docuware.dev.settings.common.DWRectangle;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.docuware.dev.schema._public.services.platform package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Annotation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation");
    private static final QName _IntegerList_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList");
    private static final QName _DocumentIndexFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields");
    private static final QName _UpdateIndexFieldsInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo");
    private static final QName _Page_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Page");
    private static final QName _Pages_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Pages");
    private static final QName _PagesBlockQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery");
    private static final QName _FileDownload_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload");
    private static final QName _FileDownloadPage_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage");
    private static final QName _DocumentActionInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo");
    private static final QName _Document_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Document");
    private static final QName _InputDocument_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "InputDocument");
    private static final QName _Section_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Section");
    private static final QName _Sections_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Sections");
    private static final QName _DocumentsQueryResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsQueryResult");
    private static final QName _ContentMergeOperationInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo");
    private static final QName _ContentDivideOperationInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo");
    private static final QName _LockInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo");
    private static final QName _SearchPositionQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery");
    private static final QName _WordSearchResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "WordSearchResult");
    private static final QName _DocumentWordSearchResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentWordSearchResult");
    private static final QName _DocumentApplicationProperty_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperty");
    private static final QName _DocumentApplicationProperties_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties");
    private static final QName _DocumentLink_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentLink");
    private static final QName _DocumentLinks_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentLinks");
    private static final QName _XmlDSigContentType_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "XmlDSigContentType");
    private static final QName _CheckOutToFileSystemInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo");
    private static final QName _BatchUpdateIndexFieldsResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateIndexFieldsResult");
    private static final QName _SelectListResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListResult");
    private static final QName _FieldValueStatisticsResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsResult");
    private static final QName _ResultListQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery");
    private static final QName _DialogExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression");
    private static final QName _CsvExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CsvExpression");
    private static final QName _CountExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CountExpression");
    private static final QName _SelectListExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression");
    private static final QName _FieldValueStatisticsExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression");
    private static final QName _FunctionExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FunctionExpression");
    private static final QName _SuggestionFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SuggestionFields");
    private static final QName _SuggestionTableFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SuggestionTableFields");
    private static final QName _BatchAppendKeywordValues_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchAppendKeywordValues");
    private static final QName _BatchUpdateProcess_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess");
    private static final QName _BatchUpdateProcessData_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData");
    private static final QName _DocumentsQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsQuery");
    private static final QName _UserDefinedSearchInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo");
    private static final QName _DialogFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DialogFields");
    private static final QName _Dialog_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Dialog");
    private static final QName _Dialogs_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Dialogs");
    private static final QName _RequestDialogQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery");
    private static final QName _SelectListValuesQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery");
    private static final QName _StampFormFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields");
    private static final QName _Stamps_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Stamps");
    private static final QName _StampPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement");
    private static final QName _StampFormFieldValues_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues");
    private static final QName _AnnotationsPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement");
    private static final QName _DocumentAnnotationsPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement");
    private static final QName _DocumentAnnotations_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotations");
    private static final QName _DocumentsTransferInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo");
    private static final QName _FileCabinetTransferInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo");
    private static final QName _FileCabinet_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinet");
    private static final QName _FileCabinets_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinets");
    private static final QName _SequenceResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceResult");
    private static final QName _SequenceRequest_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest");
    private static final QName _AdhocRenderingFile_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingFile");
    private static final QName _AdhocRenderingFiles_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingFiles");
    private static final QName _AdhocRenderingQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery");
    private static final QName _Group_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Group");
    private static final QName _Groups_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Groups");
    private static final QName _Role_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Role");
    private static final QName _Roles_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Roles");
    private static final QName _UserValidation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation");
    private static final QName _User_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "User");
    private static final QName _Users_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Users");
    private static final QName _TokenDescription_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription");
    private static final QName _Notifications_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications");
    private static final QName _WebSettings_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings");
    private static final QName _FormInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FormInfo");
    private static final QName _CreateFormsFileResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CreateFormsFileResult");
    private static final QName _FormsInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FormsInput");
    private static final QName _UploadTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UploadTemplateInput");
    private static final QName _UploadTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UploadTemplateResult");
    private static final QName _SaveTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SaveTemplateInput");
    private static final QName _SaveTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SaveTemplateResult");
    private static final QName _CopyTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CopyTemplateInput");
    private static final QName _CopyTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CopyTemplateResult");
    private static final QName _DeleteTemplatesInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DeleteTemplatesInput");
    private static final QName _DeleteTemplatesResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DeleteTemplatesResult");
    private static final QName _GetTemplateImageInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "GetTemplateImageInput");
    private static final QName _GetTemplateImageResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "GetTemplateImageResult");
    private static final QName _ExportConfigInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ExportConfigInput");
    private static final QName _ExportConfigResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ExportConfigResult");
    private static final QName _ImportConfigInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ImportConfigInput");
    private static final QName _ImportConfigResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ImportConfigResult");
    private static final QName _ExportTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ExportTemplateInput");
    private static final QName _ExportTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ExportTemplateResult");
    private static final QName _ImportTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ImportTemplateInput");
    private static final QName _ImportTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ImportTemplateResult");
    private static final QName _CFSStatistic_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CFSStatistic");
    private static final QName _DocumentAuditInformation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAuditInformation");
    private static final QName _DocumentAuditEventInformation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAuditEventInformation");
    private static final QName _Organization_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Organization");
    private static final QName _Organizations_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Organizations");
    private static final QName _ServiceDescription_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ServiceDescription");
    private static final QName _XmlSchemas_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "XmlSchemas");
    private static final QName _AssignmentOperation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation");
    private static final QName _NumberFieldMinValue_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "MinValue");
    private static final QName _NumberFieldMaxValue_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "MaxValue");
    private static final QName _NumberFieldPredefinedCustomEntry_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "PredefinedCustomEntry");
    private static final QName _MultiLineTextFieldMinLength_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "MinLength");
    private static final QName _MultiLineTextFieldMaxLength_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "MaxLength");
    private static final QName _PageDataContentArea_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentArea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev.schema._public.services.platform
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewerPreferences }
     * 
     * @return
     *     the new instance of {@link ViewerPreferences }
     */
    public ViewerPreferences createViewerPreferences() {
        return new ViewerPreferences();
    }

    /**
     * Create an instance of {@link ViewerToolbar }
     * 
     * @return
     *     the new instance of {@link ViewerToolbar }
     */
    public ViewerToolbar createViewerToolbar() {
        return new ViewerToolbar();
    }

    /**
     * Create an instance of {@link MultiColSelectListValuesResult }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListValuesResult }
     */
    public MultiColSelectListValuesResult createMultiColSelectListValuesResult() {
        return new MultiColSelectListValuesResult();
    }

    /**
     * Create an instance of {@link MultiColSelectListInfo }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListInfo }
     */
    public MultiColSelectListInfo createMultiColSelectListInfo() {
        return new MultiColSelectListInfo();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult }
     * 
     * @return
     *     the new instance of {@link DocumentsQueryTableResult }
     */
    public DocumentsQueryTableResult createDocumentsQueryTableResult() {
        return new DocumentsQueryTableResult();
    }

    /**
     * Create an instance of {@link DocumentsTransferInfo }
     * 
     * @return
     *     the new instance of {@link DocumentsTransferInfo }
     */
    public DocumentsTransferInfo createDocumentsTransferInfo() {
        return new DocumentsTransferInfo();
    }

    /**
     * Create an instance of {@link DocumentWordSearchResult }
     * 
     * @return
     *     the new instance of {@link DocumentWordSearchResult }
     */
    public DocumentWordSearchResult createDocumentWordSearchResult() {
        return new DocumentWordSearchResult();
    }

    /**
     * Create an instance of {@link DocumentsQueryResult }
     * 
     * @return
     *     the new instance of {@link DocumentsQueryResult }
     */
    public DocumentsQueryResult createDocumentsQueryResult() {
        return new DocumentsQueryResult();
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     * @return
     *     the new instance of {@link Annotation }
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link IntegerList }
     * 
     * @return
     *     the new instance of {@link IntegerList }
     */
    public IntegerList createIntegerList() {
        return new IntegerList();
    }

    /**
     * Create an instance of {@link DocumentIndexFields }
     * 
     * @return
     *     the new instance of {@link DocumentIndexFields }
     */
    public DocumentIndexFields createDocumentIndexFields() {
        return new DocumentIndexFields();
    }

    /**
     * Create an instance of {@link UpdateIndexFieldsInfo }
     * 
     * @return
     *     the new instance of {@link UpdateIndexFieldsInfo }
     */
    public UpdateIndexFieldsInfo createUpdateIndexFieldsInfo() {
        return new UpdateIndexFieldsInfo();
    }

    /**
     * Create an instance of {@link Page }
     * 
     * @return
     *     the new instance of {@link Page }
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Pages }
     * 
     * @return
     *     the new instance of {@link Pages }
     */
    public Pages createPages() {
        return new Pages();
    }

    /**
     * Create an instance of {@link PagesBlockQuery }
     * 
     * @return
     *     the new instance of {@link PagesBlockQuery }
     */
    public PagesBlockQuery createPagesBlockQuery() {
        return new PagesBlockQuery();
    }

    /**
     * Create an instance of {@link FileDownload }
     * 
     * @return
     *     the new instance of {@link FileDownload }
     */
    public FileDownload createFileDownload() {
        return new FileDownload();
    }

    /**
     * Create an instance of {@link FileDownloadPage }
     * 
     * @return
     *     the new instance of {@link FileDownloadPage }
     */
    public FileDownloadPage createFileDownloadPage() {
        return new FileDownloadPage();
    }

    /**
     * Create an instance of {@link DocumentActionInfo }
     * 
     * @return
     *     the new instance of {@link DocumentActionInfo }
     */
    public DocumentActionInfo createDocumentActionInfo() {
        return new DocumentActionInfo();
    }

    /**
     * Create an instance of {@link InputDocument }
     * 
     * @return
     *     the new instance of {@link InputDocument }
     */
    public InputDocument createInputDocument() {
        return new InputDocument();
    }

    /**
     * Create an instance of {@link Section }
     * 
     * @return
     *     the new instance of {@link Section }
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Sections }
     * 
     * @return
     *     the new instance of {@link Sections }
     */
    public Sections createSections() {
        return new Sections();
    }

    /**
     * Create an instance of {@link ContentMergeOperationInfo }
     * 
     * @return
     *     the new instance of {@link ContentMergeOperationInfo }
     */
    public ContentMergeOperationInfo createContentMergeOperationInfo() {
        return new ContentMergeOperationInfo();
    }

    /**
     * Create an instance of {@link ContentDivideOperationInfo }
     * 
     * @return
     *     the new instance of {@link ContentDivideOperationInfo }
     */
    public ContentDivideOperationInfo createContentDivideOperationInfo() {
        return new ContentDivideOperationInfo();
    }

    /**
     * Create an instance of {@link LockInfo }
     * 
     * @return
     *     the new instance of {@link LockInfo }
     */
    public LockInfo createLockInfo() {
        return new LockInfo();
    }

    /**
     * Create an instance of {@link SearchPositionQuery }
     * 
     * @return
     *     the new instance of {@link SearchPositionQuery }
     */
    public SearchPositionQuery createSearchPositionQuery() {
        return new SearchPositionQuery();
    }

    /**
     * Create an instance of {@link WordSearchResult }
     * 
     * @return
     *     the new instance of {@link WordSearchResult }
     */
    public WordSearchResult createWordSearchResult() {
        return new WordSearchResult();
    }

    /**
     * Create an instance of {@link DocumentApplicationProperty }
     * 
     * @return
     *     the new instance of {@link DocumentApplicationProperty }
     */
    public DocumentApplicationProperty createDocumentApplicationProperty() {
        return new DocumentApplicationProperty();
    }

    /**
     * Create an instance of {@link DocumentApplicationProperties }
     * 
     * @return
     *     the new instance of {@link DocumentApplicationProperties }
     */
    public DocumentApplicationProperties createDocumentApplicationProperties() {
        return new DocumentApplicationProperties();
    }

    /**
     * Create an instance of {@link DocumentLink }
     * 
     * @return
     *     the new instance of {@link DocumentLink }
     */
    public DocumentLink createDocumentLink() {
        return new DocumentLink();
    }

    /**
     * Create an instance of {@link DocumentLinks }
     * 
     * @return
     *     the new instance of {@link DocumentLinks }
     */
    public DocumentLinks createDocumentLinks() {
        return new DocumentLinks();
    }

    /**
     * Create an instance of {@link XmlDSigContentType }
     * 
     * @return
     *     the new instance of {@link XmlDSigContentType }
     */
    public XmlDSigContentType createXmlDSigContentType() {
        return new XmlDSigContentType();
    }

    /**
     * Create an instance of {@link CheckOutToFileSystemInfo }
     * 
     * @return
     *     the new instance of {@link CheckOutToFileSystemInfo }
     */
    public CheckOutToFileSystemInfo createCheckOutToFileSystemInfo() {
        return new CheckOutToFileSystemInfo();
    }

    /**
     * Create an instance of {@link BatchUpdateIndexFieldsResult }
     * 
     * @return
     *     the new instance of {@link BatchUpdateIndexFieldsResult }
     */
    public BatchUpdateIndexFieldsResult createBatchUpdateIndexFieldsResult() {
        return new BatchUpdateIndexFieldsResult();
    }

    /**
     * Create an instance of {@link SelectListResult }
     * 
     * @return
     *     the new instance of {@link SelectListResult }
     */
    public SelectListResult createSelectListResult() {
        return new SelectListResult();
    }

    /**
     * Create an instance of {@link FieldValueStatisticsResult }
     * 
     * @return
     *     the new instance of {@link FieldValueStatisticsResult }
     */
    public FieldValueStatisticsResult createFieldValueStatisticsResult() {
        return new FieldValueStatisticsResult();
    }

    /**
     * Create an instance of {@link ResultListQuery }
     * 
     * @return
     *     the new instance of {@link ResultListQuery }
     */
    public ResultListQuery createResultListQuery() {
        return new ResultListQuery();
    }

    /**
     * Create an instance of {@link DialogExpression }
     * 
     * @return
     *     the new instance of {@link DialogExpression }
     */
    public DialogExpression createDialogExpression() {
        return new DialogExpression();
    }

    /**
     * Create an instance of {@link CsvExpression }
     * 
     * @return
     *     the new instance of {@link CsvExpression }
     */
    public CsvExpression createCsvExpression() {
        return new CsvExpression();
    }

    /**
     * Create an instance of {@link CountExpression }
     * 
     * @return
     *     the new instance of {@link CountExpression }
     */
    public CountExpression createCountExpression() {
        return new CountExpression();
    }

    /**
     * Create an instance of {@link SelectListExpression }
     * 
     * @return
     *     the new instance of {@link SelectListExpression }
     */
    public SelectListExpression createSelectListExpression() {
        return new SelectListExpression();
    }

    /**
     * Create an instance of {@link FieldValueStatisticsExpression }
     * 
     * @return
     *     the new instance of {@link FieldValueStatisticsExpression }
     */
    public FieldValueStatisticsExpression createFieldValueStatisticsExpression() {
        return new FieldValueStatisticsExpression();
    }

    /**
     * Create an instance of {@link FunctionExpression }
     * 
     * @return
     *     the new instance of {@link FunctionExpression }
     */
    public FunctionExpression createFunctionExpression() {
        return new FunctionExpression();
    }

    /**
     * Create an instance of {@link SuggestionFields }
     * 
     * @return
     *     the new instance of {@link SuggestionFields }
     */
    public SuggestionFields createSuggestionFields() {
        return new SuggestionFields();
    }

    /**
     * Create an instance of {@link SuggestionTableFields }
     * 
     * @return
     *     the new instance of {@link SuggestionTableFields }
     */
    public SuggestionTableFields createSuggestionTableFields() {
        return new SuggestionTableFields();
    }

    /**
     * Create an instance of {@link BatchAppendKeywordValues }
     * 
     * @return
     *     the new instance of {@link BatchAppendKeywordValues }
     */
    public BatchAppendKeywordValues createBatchAppendKeywordValues() {
        return new BatchAppendKeywordValues();
    }

    /**
     * Create an instance of {@link BatchUpdateProcess }
     * 
     * @return
     *     the new instance of {@link BatchUpdateProcess }
     */
    public BatchUpdateProcess createBatchUpdateProcess() {
        return new BatchUpdateProcess();
    }

    /**
     * Create an instance of {@link BatchUpdateProcessData }
     * 
     * @return
     *     the new instance of {@link BatchUpdateProcessData }
     */
    public BatchUpdateProcessData createBatchUpdateProcessData() {
        return new BatchUpdateProcessData();
    }

    /**
     * Create an instance of {@link DocumentsQuery }
     * 
     * @return
     *     the new instance of {@link DocumentsQuery }
     */
    public DocumentsQuery createDocumentsQuery() {
        return new DocumentsQuery();
    }

    /**
     * Create an instance of {@link UserDefinedSearchInfo }
     * 
     * @return
     *     the new instance of {@link UserDefinedSearchInfo }
     */
    public UserDefinedSearchInfo createUserDefinedSearchInfo() {
        return new UserDefinedSearchInfo();
    }

    /**
     * Create an instance of {@link DialogFields }
     * 
     * @return
     *     the new instance of {@link DialogFields }
     */
    public DialogFields createDialogFields() {
        return new DialogFields();
    }

    /**
     * Create an instance of {@link Dialog }
     * 
     * @return
     *     the new instance of {@link Dialog }
     */
    public Dialog createDialog() {
        return new Dialog();
    }

    /**
     * Create an instance of {@link DialogInfos }
     * 
     * @return
     *     the new instance of {@link DialogInfos }
     */
    public DialogInfos createDialogInfos() {
        return new DialogInfos();
    }

    /**
     * Create an instance of {@link RequestDialogQuery }
     * 
     * @return
     *     the new instance of {@link RequestDialogQuery }
     */
    public RequestDialogQuery createRequestDialogQuery() {
        return new RequestDialogQuery();
    }

    /**
     * Create an instance of {@link SelectListValuesQuery }
     * 
     * @return
     *     the new instance of {@link SelectListValuesQuery }
     */
    public SelectListValuesQuery createSelectListValuesQuery() {
        return new SelectListValuesQuery();
    }

    /**
     * Create an instance of {@link FormFieldValues }
     * 
     * @return
     *     the new instance of {@link FormFieldValues }
     */
    public FormFieldValues createFormFieldValues() {
        return new FormFieldValues();
    }

    /**
     * Create an instance of {@link Stamps }
     * 
     * @return
     *     the new instance of {@link Stamps }
     */
    public Stamps createStamps() {
        return new Stamps();
    }

    /**
     * Create an instance of {@link StampPlacement }
     * 
     * @return
     *     the new instance of {@link StampPlacement }
     */
    public StampPlacement createStampPlacement() {
        return new StampPlacement();
    }

    /**
     * Create an instance of {@link StampFormFieldValues }
     * 
     * @return
     *     the new instance of {@link StampFormFieldValues }
     */
    public StampFormFieldValues createStampFormFieldValues() {
        return new StampFormFieldValues();
    }

    /**
     * Create an instance of {@link AnnotationsPlacement }
     * 
     * @return
     *     the new instance of {@link AnnotationsPlacement }
     */
    public AnnotationsPlacement createAnnotationsPlacement() {
        return new AnnotationsPlacement();
    }

    /**
     * Create an instance of {@link DocumentAnnotationsPlacement }
     * 
     * @return
     *     the new instance of {@link DocumentAnnotationsPlacement }
     */
    public DocumentAnnotationsPlacement createDocumentAnnotationsPlacement() {
        return new DocumentAnnotationsPlacement();
    }

    /**
     * Create an instance of {@link DocumentAnnotations }
     * 
     * @return
     *     the new instance of {@link DocumentAnnotations }
     */
    public DocumentAnnotations createDocumentAnnotations() {
        return new DocumentAnnotations();
    }

    /**
     * Create an instance of {@link FileCabinetTransferInfo }
     * 
     * @return
     *     the new instance of {@link FileCabinetTransferInfo }
     */
    public FileCabinetTransferInfo createFileCabinetTransferInfo() {
        return new FileCabinetTransferInfo();
    }

    /**
     * Create an instance of {@link FileCabinet }
     * 
     * @return
     *     the new instance of {@link FileCabinet }
     */
    public FileCabinet createFileCabinet() {
        return new FileCabinet();
    }

    /**
     * Create an instance of {@link FileCabinets }
     * 
     * @return
     *     the new instance of {@link FileCabinets }
     */
    public FileCabinets createFileCabinets() {
        return new FileCabinets();
    }

    /**
     * Create an instance of {@link SequenceResult }
     * 
     * @return
     *     the new instance of {@link SequenceResult }
     */
    public SequenceResult createSequenceResult() {
        return new SequenceResult();
    }

    /**
     * Create an instance of {@link SequenceRequest }
     * 
     * @return
     *     the new instance of {@link SequenceRequest }
     */
    public SequenceRequest createSequenceRequest() {
        return new SequenceRequest();
    }

    /**
     * Create an instance of {@link AdhocRenderingFile }
     * 
     * @return
     *     the new instance of {@link AdhocRenderingFile }
     */
    public AdhocRenderingFile createAdhocRenderingFile() {
        return new AdhocRenderingFile();
    }

    /**
     * Create an instance of {@link AdhocRenderingFiles }
     * 
     * @return
     *     the new instance of {@link AdhocRenderingFiles }
     */
    public AdhocRenderingFiles createAdhocRenderingFiles() {
        return new AdhocRenderingFiles();
    }

    /**
     * Create an instance of {@link AdhocRenderingQuery }
     * 
     * @return
     *     the new instance of {@link AdhocRenderingQuery }
     */
    public AdhocRenderingQuery createAdhocRenderingQuery() {
        return new AdhocRenderingQuery();
    }

    /**
     * Create an instance of {@link Group }
     * 
     * @return
     *     the new instance of {@link Group }
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     * @return
     *     the new instance of {@link Groups }
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link Role }
     * 
     * @return
     *     the new instance of {@link Role }
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     * @return
     *     the new instance of {@link Roles }
     */
    public Roles createRoles() {
        return new Roles();
    }

    /**
     * Create an instance of {@link UserValidation }
     * 
     * @return
     *     the new instance of {@link UserValidation }
     */
    public UserValidation createUserValidation() {
        return new UserValidation();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Users }
     * 
     * @return
     *     the new instance of {@link Users }
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link TokenDescription }
     * 
     * @return
     *     the new instance of {@link TokenDescription }
     */
    public TokenDescription createTokenDescription() {
        return new TokenDescription();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     * @return
     *     the new instance of {@link Notifications }
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link WebSettings }
     * 
     * @return
     *     the new instance of {@link WebSettings }
     */
    public WebSettings createWebSettings() {
        return new WebSettings();
    }

    /**
     * Create an instance of {@link FormInfo }
     * 
     * @return
     *     the new instance of {@link FormInfo }
     */
    public FormInfo createFormInfo() {
        return new FormInfo();
    }

    /**
     * Create an instance of {@link CreateFormsFileResult }
     * 
     * @return
     *     the new instance of {@link CreateFormsFileResult }
     */
    public CreateFormsFileResult createCreateFormsFileResult() {
        return new CreateFormsFileResult();
    }

    /**
     * Create an instance of {@link FormsInput }
     * 
     * @return
     *     the new instance of {@link FormsInput }
     */
    public FormsInput createFormsInput() {
        return new FormsInput();
    }

    /**
     * Create an instance of {@link UploadTemplateInput }
     * 
     * @return
     *     the new instance of {@link UploadTemplateInput }
     */
    public UploadTemplateInput createUploadTemplateInput() {
        return new UploadTemplateInput();
    }

    /**
     * Create an instance of {@link UploadTemplateResult }
     * 
     * @return
     *     the new instance of {@link UploadTemplateResult }
     */
    public UploadTemplateResult createUploadTemplateResult() {
        return new UploadTemplateResult();
    }

    /**
     * Create an instance of {@link SaveTemplateInput }
     * 
     * @return
     *     the new instance of {@link SaveTemplateInput }
     */
    public SaveTemplateInput createSaveTemplateInput() {
        return new SaveTemplateInput();
    }

    /**
     * Create an instance of {@link SaveTemplateResult }
     * 
     * @return
     *     the new instance of {@link SaveTemplateResult }
     */
    public SaveTemplateResult createSaveTemplateResult() {
        return new SaveTemplateResult();
    }

    /**
     * Create an instance of {@link CopyTemplateInput }
     * 
     * @return
     *     the new instance of {@link CopyTemplateInput }
     */
    public CopyTemplateInput createCopyTemplateInput() {
        return new CopyTemplateInput();
    }

    /**
     * Create an instance of {@link CopyTemplateResult }
     * 
     * @return
     *     the new instance of {@link CopyTemplateResult }
     */
    public CopyTemplateResult createCopyTemplateResult() {
        return new CopyTemplateResult();
    }

    /**
     * Create an instance of {@link DeleteTemplatesInput }
     * 
     * @return
     *     the new instance of {@link DeleteTemplatesInput }
     */
    public DeleteTemplatesInput createDeleteTemplatesInput() {
        return new DeleteTemplatesInput();
    }

    /**
     * Create an instance of {@link DeleteTemplatesResult }
     * 
     * @return
     *     the new instance of {@link DeleteTemplatesResult }
     */
    public DeleteTemplatesResult createDeleteTemplatesResult() {
        return new DeleteTemplatesResult();
    }

    /**
     * Create an instance of {@link GetTemplateImageInput }
     * 
     * @return
     *     the new instance of {@link GetTemplateImageInput }
     */
    public GetTemplateImageInput createGetTemplateImageInput() {
        return new GetTemplateImageInput();
    }

    /**
     * Create an instance of {@link GetTemplateImageResult }
     * 
     * @return
     *     the new instance of {@link GetTemplateImageResult }
     */
    public GetTemplateImageResult createGetTemplateImageResult() {
        return new GetTemplateImageResult();
    }

    /**
     * Create an instance of {@link ExportConfigInput }
     * 
     * @return
     *     the new instance of {@link ExportConfigInput }
     */
    public ExportConfigInput createExportConfigInput() {
        return new ExportConfigInput();
    }

    /**
     * Create an instance of {@link ExportConfigResult }
     * 
     * @return
     *     the new instance of {@link ExportConfigResult }
     */
    public ExportConfigResult createExportConfigResult() {
        return new ExportConfigResult();
    }

    /**
     * Create an instance of {@link ImportConfigInput }
     * 
     * @return
     *     the new instance of {@link ImportConfigInput }
     */
    public ImportConfigInput createImportConfigInput() {
        return new ImportConfigInput();
    }

    /**
     * Create an instance of {@link ImportConfigResult }
     * 
     * @return
     *     the new instance of {@link ImportConfigResult }
     */
    public ImportConfigResult createImportConfigResult() {
        return new ImportConfigResult();
    }

    /**
     * Create an instance of {@link ExportTemplateInput }
     * 
     * @return
     *     the new instance of {@link ExportTemplateInput }
     */
    public ExportTemplateInput createExportTemplateInput() {
        return new ExportTemplateInput();
    }

    /**
     * Create an instance of {@link ExportTemplateResult }
     * 
     * @return
     *     the new instance of {@link ExportTemplateResult }
     */
    public ExportTemplateResult createExportTemplateResult() {
        return new ExportTemplateResult();
    }

    /**
     * Create an instance of {@link ImportTemplateInput }
     * 
     * @return
     *     the new instance of {@link ImportTemplateInput }
     */
    public ImportTemplateInput createImportTemplateInput() {
        return new ImportTemplateInput();
    }

    /**
     * Create an instance of {@link ImportTemplateResult }
     * 
     * @return
     *     the new instance of {@link ImportTemplateResult }
     */
    public ImportTemplateResult createImportTemplateResult() {
        return new ImportTemplateResult();
    }

    /**
     * Create an instance of {@link CFSStatisticGeneral }
     * 
     * @return
     *     the new instance of {@link CFSStatisticGeneral }
     */
    public CFSStatisticGeneral createCFSStatisticGeneral() {
        return new CFSStatisticGeneral();
    }

    /**
     * Create an instance of {@link DocumentAuditInformation }
     * 
     * @return
     *     the new instance of {@link DocumentAuditInformation }
     */
    public DocumentAuditInformation createDocumentAuditInformation() {
        return new DocumentAuditInformation();
    }

    /**
     * Create an instance of {@link DocumentAuditEventInformation }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventInformation }
     */
    public DocumentAuditEventInformation createDocumentAuditEventInformation() {
        return new DocumentAuditEventInformation();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     * @return
     *     the new instance of {@link Organization }
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Organizations }
     * 
     * @return
     *     the new instance of {@link Organizations }
     */
    public Organizations createOrganizations() {
        return new Organizations();
    }

    /**
     * Create an instance of {@link ServiceDescription }
     * 
     * @return
     *     the new instance of {@link ServiceDescription }
     */
    public ServiceDescription createServiceDescription() {
        return new ServiceDescription();
    }

    /**
     * Create an instance of {@link XmlSchemas }
     * 
     * @return
     *     the new instance of {@link XmlSchemas }
     */
    public XmlSchemas createXmlSchemas() {
        return new XmlSchemas();
    }

    /**
     * Create an instance of {@link AssignmentOperation }
     * 
     * @return
     *     the new instance of {@link AssignmentOperation }
     */
    public AssignmentOperation createAssignmentOperation() {
        return new AssignmentOperation();
    }

    /**
     * Create an instance of {@link AnnotationRectangle }
     * 
     * @return
     *     the new instance of {@link AnnotationRectangle }
     */
    public AnnotationRectangle createAnnotationRectangle() {
        return new AnnotationRectangle();
    }

    /**
     * Create an instance of {@link AnnotationPoint }
     * 
     * @return
     *     the new instance of {@link AnnotationPoint }
     */
    public AnnotationPoint createAnnotationPoint() {
        return new AnnotationPoint();
    }

    /**
     * Create an instance of {@link Layer }
     * 
     * @return
     *     the new instance of {@link Layer }
     */
    public Layer createLayer() {
        return new Layer();
    }

    /**
     * Create an instance of {@link EntryBase }
     * 
     * @return
     *     the new instance of {@link EntryBase }
     */
    public EntryBase createEntryBase() {
        return new EntryBase();
    }

    /**
     * Create an instance of {@link DeleteEntry }
     * 
     * @return
     *     the new instance of {@link DeleteEntry }
     */
    public DeleteEntry createDeleteEntry() {
        return new DeleteEntry();
    }

    /**
     * Create an instance of {@link TextEntry }
     * 
     * @return
     *     the new instance of {@link TextEntry }
     */
    public TextEntry createTextEntry() {
        return new TextEntry();
    }

    /**
     * Create an instance of {@link LineEntry }
     * 
     * @return
     *     the new instance of {@link LineEntry }
     */
    public LineEntry createLineEntry() {
        return new LineEntry();
    }

    /**
     * Create an instance of {@link RectEntry }
     * 
     * @return
     *     the new instance of {@link RectEntry }
     */
    public RectEntry createRectEntry() {
        return new RectEntry();
    }

    /**
     * Create an instance of {@link PolyLineEntry }
     * 
     * @return
     *     the new instance of {@link PolyLineEntry }
     */
    public PolyLineEntry createPolyLineEntry() {
        return new PolyLineEntry();
    }

    /**
     * Create an instance of {@link Stroke }
     * 
     * @return
     *     the new instance of {@link Stroke }
     */
    public Stroke createStroke() {
        return new Stroke();
    }

    /**
     * Create an instance of {@link StampBase }
     * 
     * @return
     *     the new instance of {@link StampBase }
     */
    public StampBase createStampBase() {
        return new StampBase();
    }

    /**
     * Create an instance of {@link TextStampEntry }
     * 
     * @return
     *     the new instance of {@link TextStampEntry }
     */
    public TextStampEntry createTextStampEntry() {
        return new TextStampEntry();
    }

    /**
     * Create an instance of {@link BitmapStampEntry }
     * 
     * @return
     *     the new instance of {@link BitmapStampEntry }
     */
    public BitmapStampEntry createBitmapStampEntry() {
        return new BitmapStampEntry();
    }

    /**
     * Create an instance of {@link PolyLineStampEntry }
     * 
     * @return
     *     the new instance of {@link PolyLineStampEntry }
     */
    public PolyLineStampEntry createPolyLineStampEntry() {
        return new PolyLineStampEntry();
    }

    /**
     * Create an instance of {@link CreatedInfo }
     * 
     * @return
     *     the new instance of {@link CreatedInfo }
     */
    public CreatedInfo createCreatedInfo() {
        return new CreatedInfo();
    }

    /**
     * Create an instance of {@link Font }
     * 
     * @return
     *     the new instance of {@link Font }
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldKeywords }
     * 
     * @return
     *     the new instance of {@link DocumentIndexFieldKeywords }
     */
    public DocumentIndexFieldKeywords createDocumentIndexFieldKeywords() {
        return new DocumentIndexFieldKeywords();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldTable }
     * 
     * @return
     *     the new instance of {@link DocumentIndexFieldTable }
     */
    public DocumentIndexFieldTable createDocumentIndexFieldTable() {
        return new DocumentIndexFieldTable();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldTableRow }
     * 
     * @return
     *     the new instance of {@link DocumentIndexFieldTableRow }
     */
    public DocumentIndexFieldTableRow createDocumentIndexFieldTableRow() {
        return new DocumentIndexFieldTableRow();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldValue }
     * 
     * @return
     *     the new instance of {@link DocumentIndexFieldValue }
     */
    public DocumentIndexFieldValue createDocumentIndexFieldValue() {
        return new DocumentIndexFieldValue();
    }

    /**
     * Create an instance of {@link PointAndShootInfo }
     * 
     * @return
     *     the new instance of {@link PointAndShootInfo }
     */
    public PointAndShootInfo createPointAndShootInfo() {
        return new PointAndShootInfo();
    }

    /**
     * Create an instance of {@link DocumentIndexField }
     * 
     * @return
     *     the new instance of {@link DocumentIndexField }
     */
    public DocumentIndexField createDocumentIndexField() {
        return new DocumentIndexField();
    }

    /**
     * Create an instance of {@link PageData }
     * 
     * @return
     *     the new instance of {@link PageData }
     */
    public PageData createPageData() {
        return new PageData();
    }

    /**
     * Create an instance of {@link SortedField }
     * 
     * @return
     *     the new instance of {@link SortedField }
     */
    public SortedField createSortedField() {
        return new SortedField();
    }

    /**
     * Create an instance of {@link SortedFieldsList }
     * 
     * @return
     *     the new instance of {@link SortedFieldsList }
     */
    public SortedFieldsList createSortedFieldsList() {
        return new SortedFieldsList();
    }

    /**
     * Create an instance of {@link CountPlusValue }
     * 
     * @return
     *     the new instance of {@link CountPlusValue }
     */
    public CountPlusValue createCountPlusValue() {
        return new CountPlusValue();
    }

    /**
     * Create an instance of {@link TableResultHeader }
     * 
     * @return
     *     the new instance of {@link TableResultHeader }
     */
    public TableResultHeader createTableResultHeader() {
        return new TableResultHeader();
    }

    /**
     * Create an instance of {@link NullTableResultValue }
     * 
     * @return
     *     the new instance of {@link NullTableResultValue }
     */
    public NullTableResultValue createNullTableResultValue() {
        return new NullTableResultValue();
    }

    /**
     * Create an instance of {@link TableResultRow }
     * 
     * @return
     *     the new instance of {@link TableResultRow }
     */
    public TableResultRow createTableResultRow() {
        return new TableResultRow();
    }

    /**
     * Create an instance of {@link UploadedFileChunk }
     * 
     * @return
     *     the new instance of {@link UploadedFileChunk }
     */
    public UploadedFileChunk createUploadedFileChunk() {
        return new UploadedFileChunk();
    }

    /**
     * Create an instance of {@link InputSections }
     * 
     * @return
     *     the new instance of {@link InputSections }
     */
    public InputSections createInputSections() {
        return new InputSections();
    }

    /**
     * Create an instance of {@link InputSection }
     * 
     * @return
     *     the new instance of {@link InputSection }
     */
    public InputSection createInputSection() {
        return new InputSection();
    }

    /**
     * Create an instance of {@link InputFlags }
     * 
     * @return
     *     the new instance of {@link InputFlags }
     */
    public InputFlags createInputFlags() {
        return new InputFlags();
    }

    /**
     * Create an instance of {@link ApplicationProperties }
     * 
     * @return
     *     the new instance of {@link ApplicationProperties }
     */
    public ApplicationProperties createApplicationProperties() {
        return new ApplicationProperties();
    }

    /**
     * Create an instance of {@link ApplicationProperty }
     * 
     * @return
     *     the new instance of {@link ApplicationProperty }
     */
    public ApplicationProperty createApplicationProperty() {
        return new ApplicationProperty();
    }

    /**
     * Create an instance of {@link WordSearchResultWordHit }
     * 
     * @return
     *     the new instance of {@link WordSearchResultWordHit }
     */
    public WordSearchResultWordHit createWordSearchResultWordHit() {
        return new WordSearchResultWordHit();
    }

    /**
     * Create an instance of {@link WordSearchResultWordHits }
     * 
     * @return
     *     the new instance of {@link WordSearchResultWordHits }
     */
    public WordSearchResultWordHits createWordSearchResultWordHits() {
        return new WordSearchResultWordHits();
    }

    /**
     * Create an instance of {@link WordSearchResultPageHit }
     * 
     * @return
     *     the new instance of {@link WordSearchResultPageHit }
     */
    public WordSearchResultPageHit createWordSearchResultPageHit() {
        return new WordSearchResultPageHit();
    }

    /**
     * Create an instance of {@link PageHits }
     * 
     * @return
     *     the new instance of {@link PageHits }
     */
    public PageHits createPageHits() {
        return new PageHits();
    }

    /**
     * Create an instance of {@link DocumentActionParameters }
     * 
     * @return
     *     the new instance of {@link DocumentActionParameters }
     */
    public DocumentActionParameters createDocumentActionParameters() {
        return new DocumentActionParameters();
    }

    /**
     * Create an instance of {@link CheckOutActionParameters }
     * 
     * @return
     *     the new instance of {@link CheckOutActionParameters }
     */
    public CheckOutActionParameters createCheckOutActionParameters() {
        return new CheckOutActionParameters();
    }

    /**
     * Create an instance of {@link CheckInActionParameters }
     * 
     * @return
     *     the new instance of {@link CheckInActionParameters }
     */
    public CheckInActionParameters createCheckInActionParameters() {
        return new CheckInActionParameters();
    }

    /**
     * Create an instance of {@link CheckOutResult }
     * 
     * @return
     *     the new instance of {@link CheckOutResult }
     */
    public CheckOutResult createCheckOutResult() {
        return new CheckOutResult();
    }

    /**
     * Create an instance of {@link EnhanceImageParameters }
     * 
     * @return
     *     the new instance of {@link EnhanceImageParameters }
     */
    public EnhanceImageParameters createEnhanceImageParameters() {
        return new EnhanceImageParameters();
    }

    /**
     * Create an instance of {@link MergeAnnotationsParameters }
     * 
     * @return
     *     the new instance of {@link MergeAnnotationsParameters }
     */
    public MergeAnnotationsParameters createMergeAnnotationsParameters() {
        return new MergeAnnotationsParameters();
    }

    /**
     * Create an instance of {@link RotatePageParameters }
     * 
     * @return
     *     the new instance of {@link RotatePageParameters }
     */
    public RotatePageParameters createRotatePageParameters() {
        return new RotatePageParameters();
    }

    /**
     * Create an instance of {@link DocumentVersion }
     * 
     * @return
     *     the new instance of {@link DocumentVersion }
     */
    public DocumentVersion createDocumentVersion() {
        return new DocumentVersion();
    }

    /**
     * Create an instance of {@link AppendActionParameters }
     * 
     * @return
     *     the new instance of {@link AppendActionParameters }
     */
    public AppendActionParameters createAppendActionParameters() {
        return new AppendActionParameters();
    }

    /**
     * Create an instance of {@link AppendActionDocuments }
     * 
     * @return
     *     the new instance of {@link AppendActionDocuments }
     */
    public AppendActionDocuments createAppendActionDocuments() {
        return new AppendActionDocuments();
    }

    /**
     * Create an instance of {@link DocumentFlags }
     * 
     * @return
     *     the new instance of {@link DocumentFlags }
     */
    public DocumentFlags createDocumentFlags() {
        return new DocumentFlags();
    }

    /**
     * Create an instance of {@link ExportSettings }
     * 
     * @return
     *     the new instance of {@link ExportSettings }
     */
    public ExportSettings createExportSettings() {
        return new ExportSettings();
    }

    /**
     * Create an instance of {@link ImportSettings }
     * 
     * @return
     *     the new instance of {@link ImportSettings }
     */
    public ImportSettings createImportSettings() {
        return new ImportSettings();
    }

    /**
     * Create an instance of {@link SynchronizationSettings }
     * 
     * @return
     *     the new instance of {@link SynchronizationSettings }
     */
    public SynchronizationSettings createSynchronizationSettings() {
        return new SynchronizationSettings();
    }

    /**
     * Create an instance of {@link FieldMappings }
     * 
     * @return
     *     the new instance of {@link FieldMappings }
     */
    public FieldMappings createFieldMappings() {
        return new FieldMappings();
    }

    /**
     * Create an instance of {@link FieldMapping }
     * 
     * @return
     *     the new instance of {@link FieldMapping }
     */
    public FieldMapping createFieldMapping() {
        return new FieldMapping();
    }

    /**
     * Create an instance of {@link BatchUpdateResultItem }
     * 
     * @return
     *     the new instance of {@link BatchUpdateResultItem }
     */
    public BatchUpdateResultItem createBatchUpdateResultItem() {
        return new BatchUpdateResultItem();
    }

    /**
     * Create an instance of {@link FieldValueStatistics }
     * 
     * @return
     *     the new instance of {@link FieldValueStatistics }
     */
    public FieldValueStatistics createFieldValueStatistics() {
        return new FieldValueStatistics();
    }

    /**
     * Create an instance of {@link StringConstant }
     * 
     * @return
     *     the new instance of {@link StringConstant }
     */
    public StringConstant createStringConstant() {
        return new StringConstant();
    }

    /**
     * Create an instance of {@link DateConstant }
     * 
     * @return
     *     the new instance of {@link DateConstant }
     */
    public DateConstant createDateConstant() {
        return new DateConstant();
    }

    /**
     * Create an instance of {@link DateTimeConstant }
     * 
     * @return
     *     the new instance of {@link DateTimeConstant }
     */
    public DateTimeConstant createDateTimeConstant() {
        return new DateTimeConstant();
    }

    /**
     * Create an instance of {@link IntConstant }
     * 
     * @return
     *     the new instance of {@link IntConstant }
     */
    public IntConstant createIntConstant() {
        return new IntConstant();
    }

    /**
     * Create an instance of {@link DoubleConstant }
     * 
     * @return
     *     the new instance of {@link DoubleConstant }
     */
    public DoubleConstant createDoubleConstant() {
        return new DoubleConstant();
    }

    /**
     * Create an instance of {@link BooleanConstant }
     * 
     * @return
     *     the new instance of {@link BooleanConstant }
     */
    public BooleanConstant createBooleanConstant() {
        return new BooleanConstant();
    }

    /**
     * Create an instance of {@link DecimalConstant }
     * 
     * @return
     *     the new instance of {@link DecimalConstant }
     */
    public DecimalConstant createDecimalConstant() {
        return new DecimalConstant();
    }

    /**
     * Create an instance of {@link FieldValueExpression }
     * 
     * @return
     *     the new instance of {@link FieldValueExpression }
     */
    public FieldValueExpression createFieldValueExpression() {
        return new FieldValueExpression();
    }

    /**
     * Create an instance of {@link SystemVariableExpression }
     * 
     * @return
     *     the new instance of {@link SystemVariableExpression }
     */
    public SystemVariableExpression createSystemVariableExpression() {
        return new SystemVariableExpression();
    }

    /**
     * Create an instance of {@link AnyExpression }
     * 
     * @return
     *     the new instance of {@link AnyExpression }
     */
    public AnyExpression createAnyExpression() {
        return new AnyExpression();
    }

    /**
     * Create an instance of {@link DialogExpressionCondition }
     * 
     * @return
     *     the new instance of {@link DialogExpressionCondition }
     */
    public DialogExpressionCondition createDialogExpressionCondition() {
        return new DialogExpressionCondition();
    }

    /**
     * Create an instance of {@link MultiColumnSelectListExpressionCondition }
     * 
     * @return
     *     the new instance of {@link MultiColumnSelectListExpressionCondition }
     */
    public MultiColumnSelectListExpressionCondition createMultiColumnSelectListExpressionCondition() {
        return new MultiColumnSelectListExpressionCondition();
    }

    /**
     * Create an instance of {@link FlagConditions }
     * 
     * @return
     *     the new instance of {@link FlagConditions }
     */
    public FlagConditions createFlagConditions() {
        return new FlagConditions();
    }

    /**
     * Create an instance of {@link SuggestionField }
     * 
     * @return
     *     the new instance of {@link SuggestionField }
     */
    public SuggestionField createSuggestionField() {
        return new SuggestionField();
    }

    /**
     * Create an instance of {@link SuggestionTableField }
     * 
     * @return
     *     the new instance of {@link SuggestionTableField }
     */
    public SuggestionTableField createSuggestionTableField() {
        return new SuggestionTableField();
    }

    /**
     * Create an instance of {@link SuggestionTable }
     * 
     * @return
     *     the new instance of {@link SuggestionTable }
     */
    public SuggestionTable createSuggestionTable() {
        return new SuggestionTable();
    }

    /**
     * Create an instance of {@link SuggestionCellValue }
     * 
     * @return
     *     the new instance of {@link SuggestionCellValue }
     */
    public SuggestionCellValue createSuggestionCellValue() {
        return new SuggestionCellValue();
    }

    /**
     * Create an instance of {@link SuggestionValue }
     * 
     * @return
     *     the new instance of {@link SuggestionValue }
     */
    public SuggestionValue createSuggestionValue() {
        return new SuggestionValue();
    }

    /**
     * Create an instance of {@link BatchUpdateDialogExpressionSource }
     * 
     * @return
     *     the new instance of {@link BatchUpdateDialogExpressionSource }
     */
    public BatchUpdateDialogExpressionSource createBatchUpdateDialogExpressionSource() {
        return new BatchUpdateDialogExpressionSource();
    }

    /**
     * Create an instance of {@link BatchUpdateDocumentsSource }
     * 
     * @return
     *     the new instance of {@link BatchUpdateDocumentsSource }
     */
    public BatchUpdateDocumentsSource createBatchUpdateDocumentsSource() {
        return new BatchUpdateDocumentsSource();
    }

    /**
     * Create an instance of {@link FieldsList }
     * 
     * @return
     *     the new instance of {@link FieldsList }
     */
    public FieldsList createFieldsList() {
        return new FieldsList();
    }

    /**
     * Create an instance of {@link ExportQuery }
     * 
     * @return
     *     the new instance of {@link ExportQuery }
     */
    public ExportQuery createExportQuery() {
        return new ExportQuery();
    }

    /**
     * Create an instance of {@link DialogInfo }
     * 
     * @return
     *     the new instance of {@link DialogInfo }
     */
    public DialogInfo createDialogInfo() {
        return new DialogInfo();
    }

    /**
     * Create an instance of {@link LogicalOperator }
     * 
     * @return
     *     the new instance of {@link LogicalOperator }
     */
    public LogicalOperator createLogicalOperator() {
        return new LogicalOperator();
    }

    /**
     * Create an instance of {@link ViewerDialog }
     * 
     * @return
     *     the new instance of {@link ViewerDialog }
     */
    public ViewerDialog createViewerDialog() {
        return new ViewerDialog();
    }

    /**
     * Create an instance of {@link DialogProperties }
     * 
     * @return
     *     the new instance of {@link DialogProperties }
     */
    public DialogProperties createDialogProperties() {
        return new DialogProperties();
    }

    /**
     * Create an instance of {@link DialogPropertiesSearch }
     * 
     * @return
     *     the new instance of {@link DialogPropertiesSearch }
     */
    public DialogPropertiesSearch createDialogPropertiesSearch() {
        return new DialogPropertiesSearch();
    }

    /**
     * Create an instance of {@link DialogPropertiesResultList }
     * 
     * @return
     *     the new instance of {@link DialogPropertiesResultList }
     */
    public DialogPropertiesResultList createDialogPropertiesResultList() {
        return new DialogPropertiesResultList();
    }

    /**
     * Create an instance of {@link DialogPropertiesTaskList }
     * 
     * @return
     *     the new instance of {@link DialogPropertiesTaskList }
     */
    public DialogPropertiesTaskList createDialogPropertiesTaskList() {
        return new DialogPropertiesTaskList();
    }

    /**
     * Create an instance of {@link DialogPropertiesTreeView }
     * 
     * @return
     *     the new instance of {@link DialogPropertiesTreeView }
     */
    public DialogPropertiesTreeView createDialogPropertiesTreeView() {
        return new DialogPropertiesTreeView();
    }

    /**
     * Create an instance of {@link ResultDialogFunction }
     * 
     * @return
     *     the new instance of {@link ResultDialogFunction }
     */
    public ResultDialogFunction createResultDialogFunction() {
        return new ResultDialogFunction();
    }

    /**
     * Create an instance of {@link DialogField }
     * 
     * @return
     *     the new instance of {@link DialogField }
     */
    public DialogField createDialogField() {
        return new DialogField();
    }

    /**
     * Create an instance of {@link DialogFieldBase }
     * 
     * @return
     *     the new instance of {@link DialogFieldBase }
     */
    public DialogFieldBase createDialogFieldBase() {
        return new DialogFieldBase();
    }

    /**
     * Create an instance of {@link DialogTableFieldColumns }
     * 
     * @return
     *     the new instance of {@link DialogTableFieldColumns }
     */
    public DialogTableFieldColumns createDialogTableFieldColumns() {
        return new DialogTableFieldColumns();
    }

    /**
     * Create an instance of {@link SelectListInfos }
     * 
     * @return
     *     the new instance of {@link SelectListInfos }
     */
    public SelectListInfos createSelectListInfos() {
        return new SelectListInfos();
    }

    /**
     * Create an instance of {@link SelectListInfo }
     * 
     * @return
     *     the new instance of {@link SelectListInfo }
     */
    public SelectListInfo createSelectListInfo() {
        return new SelectListInfo();
    }

    /**
     * Create an instance of {@link SelectListValuesResult }
     * 
     * @return
     *     the new instance of {@link SelectListValuesResult }
     */
    public SelectListValuesResult createSelectListValuesResult() {
        return new SelectListValuesResult();
    }

    /**
     * Create an instance of {@link SingleColumnSelectListValues }
     * 
     * @return
     *     the new instance of {@link SingleColumnSelectListValues }
     */
    public SingleColumnSelectListValues createSingleColumnSelectListValues() {
        return new SingleColumnSelectListValues();
    }

    /**
     * Create an instance of {@link MultiColumnSelectListValuesQuery }
     * 
     * @return
     *     the new instance of {@link MultiColumnSelectListValuesQuery }
     */
    public MultiColumnSelectListValuesQuery createMultiColumnSelectListValuesQuery() {
        return new MultiColumnSelectListValuesQuery();
    }

    /**
     * Create an instance of {@link SelectListValueToCheck }
     * 
     * @return
     *     the new instance of {@link SelectListValueToCheck }
     */
    public SelectListValueToCheck createSelectListValueToCheck() {
        return new SelectListValueToCheck();
    }

    /**
     * Create an instance of {@link SelectListValuesToCheck }
     * 
     * @return
     *     the new instance of {@link SelectListValuesToCheck }
     */
    public SelectListValuesToCheck createSelectListValuesToCheck() {
        return new SelectListValuesToCheck();
    }

    /**
     * Create an instance of {@link AreValuesInSelectListsQuery }
     * 
     * @return
     *     the new instance of {@link AreValuesInSelectListsQuery }
     */
    public AreValuesInSelectListsQuery createAreValuesInSelectListsQuery() {
        return new AreValuesInSelectListsQuery();
    }

    /**
     * Create an instance of {@link AreValuesInSelectListsResult }
     * 
     * @return
     *     the new instance of {@link AreValuesInSelectListsResult }
     */
    public AreValuesInSelectListsResult createAreValuesInSelectListsResult() {
        return new AreValuesInSelectListsResult();
    }

    /**
     * Create an instance of {@link MultiColSelectListInfos }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListInfos }
     */
    public MultiColSelectListInfos createMultiColSelectListInfos() {
        return new MultiColSelectListInfos();
    }

    /**
     * Create an instance of {@link MultiColSelectListColumn }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListColumn }
     */
    public MultiColSelectListColumn createMultiColSelectListColumn() {
        return new MultiColSelectListColumn();
    }

    /**
     * Create an instance of {@link MultiColSelectListRow }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListRow }
     */
    public MultiColSelectListRow createMultiColSelectListRow() {
        return new MultiColSelectListRow();
    }

    /**
     * Create an instance of {@link MultiColSelectListValuesQuery }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListValuesQuery }
     */
    public MultiColSelectListValuesQuery createMultiColSelectListValuesQuery() {
        return new MultiColSelectListValuesQuery();
    }

    /**
     * Create an instance of {@link MultiColSelectListExpressionCondition }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListExpressionCondition }
     */
    public MultiColSelectListExpressionCondition createMultiColSelectListExpressionCondition() {
        return new MultiColSelectListExpressionCondition();
    }

    /**
     * Create an instance of {@link TextStamp }
     * 
     * @return
     *     the new instance of {@link TextStamp }
     */
    public TextStamp createTextStamp() {
        return new TextStamp();
    }

    /**
     * Create an instance of {@link BitmapStamp }
     * 
     * @return
     *     the new instance of {@link BitmapStamp }
     */
    public BitmapStamp createBitmapStamp() {
        return new BitmapStamp();
    }

    /**
     * Create an instance of {@link StrokeStamp }
     * 
     * @return
     *     the new instance of {@link StrokeStamp }
     */
    public StrokeStamp createStrokeStamp() {
        return new StrokeStamp();
    }

    /**
     * Create an instance of {@link StampFormField }
     * 
     * @return
     *     the new instance of {@link StampFormField }
     */
    public StampFormField createStampFormField() {
        return new StampFormField();
    }

    /**
     * Create an instance of {@link StampField }
     * 
     * @return
     *     the new instance of {@link StampField }
     */
    public StampField createStampField() {
        return new StampField();
    }

    /**
     * Create an instance of {@link Stamp }
     * 
     * @return
     *     the new instance of {@link Stamp }
     */
    public Stamp createStamp() {
        return new Stamp();
    }

    /**
     * Create an instance of {@link FormFieldValue }
     * 
     * @return
     *     the new instance of {@link FormFieldValue }
     */
    public FormFieldValue createFormFieldValue() {
        return new FormFieldValue();
    }

    /**
     * Create an instance of {@link DecisionStampPlacement }
     * 
     * @return
     *     the new instance of {@link DecisionStampPlacement }
     */
    public DecisionStampPlacement createDecisionStampPlacement() {
        return new DecisionStampPlacement();
    }

    /**
     * Create an instance of {@link DecisionFormFieldValue }
     * 
     * @return
     *     the new instance of {@link DecisionFormFieldValue }
     */
    public DecisionFormFieldValue createDecisionFormFieldValue() {
        return new DecisionFormFieldValue();
    }

    /**
     * Create an instance of {@link SectionAnnotationsPlacement }
     * 
     * @return
     *     the new instance of {@link SectionAnnotationsPlacement }
     */
    public SectionAnnotationsPlacement createSectionAnnotationsPlacement() {
        return new SectionAnnotationsPlacement();
    }

    /**
     * Create an instance of {@link SectionAnnotation }
     * 
     * @return
     *     the new instance of {@link SectionAnnotation }
     */
    public SectionAnnotation createSectionAnnotation() {
        return new SectionAnnotation();
    }

    /**
     * Create an instance of {@link FileCabinetField }
     * 
     * @return
     *     the new instance of {@link FileCabinetField }
     */
    public FileCabinetField createFileCabinetField() {
        return new FileCabinetField();
    }

    /**
     * Create an instance of {@link FileCabinetFieldBase }
     * 
     * @return
     *     the new instance of {@link FileCabinetFieldBase }
     */
    public FileCabinetFieldBase createFileCabinetFieldBase() {
        return new FileCabinetFieldBase();
    }

    /**
     * Create an instance of {@link FileCabinetFields }
     * 
     * @return
     *     the new instance of {@link FileCabinetFields }
     */
    public FileCabinetFields createFileCabinetFields() {
        return new FileCabinetFields();
    }

    /**
     * Create an instance of {@link TableFieldColumns }
     * 
     * @return
     *     the new instance of {@link TableFieldColumns }
     */
    public TableFieldColumns createTableFieldColumns() {
        return new TableFieldColumns();
    }

    /**
     * Create an instance of {@link ConfigurationRights }
     * 
     * @return
     *     the new instance of {@link ConfigurationRights }
     */
    public ConfigurationRights createConfigurationRights() {
        return new ConfigurationRights();
    }

    /**
     * Create an instance of {@link Rights }
     * 
     * @return
     *     the new instance of {@link Rights }
     */
    public Rights createRights() {
        return new Rights();
    }

    /**
     * Create an instance of {@link ExtendedUserRights }
     * 
     * @return
     *     the new instance of {@link ExtendedUserRights }
     */
    public ExtendedUserRights createExtendedUserRights() {
        return new ExtendedUserRights();
    }

    /**
     * Create an instance of {@link ImportResult }
     * 
     * @return
     *     the new instance of {@link ImportResult }
     */
    public ImportResult createImportResult() {
        return new ImportResult();
    }

    /**
     * Create an instance of {@link ImportResultEntry }
     * 
     * @return
     *     the new instance of {@link ImportResultEntry }
     */
    public ImportResultEntry createImportResultEntry() {
        return new ImportResultEntry();
    }

    /**
     * Create an instance of {@link ImportEntryVersion }
     * 
     * @return
     *     the new instance of {@link ImportEntryVersion }
     */
    public ImportEntryVersion createImportEntryVersion() {
        return new ImportEntryVersion();
    }

    /**
     * Create an instance of {@link OrganizationUser }
     * 
     * @return
     *     the new instance of {@link OrganizationUser }
     */
    public OrganizationUser createOrganizationUser() {
        return new OrganizationUser();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     * @return
     *     the new instance of {@link UserInfo }
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link LoginInfo }
     * 
     * @return
     *     the new instance of {@link LoginInfo }
     */
    public LoginInfo createLoginInfo() {
        return new LoginInfo();
    }

    /**
     * Create an instance of {@link NewUser }
     * 
     * @return
     *     the new instance of {@link NewUser }
     */
    public NewUser createNewUser() {
        return new NewUser();
    }

    /**
     * Create an instance of {@link OutOfOffice }
     * 
     * @return
     *     the new instance of {@link OutOfOffice }
     */
    public OutOfOffice createOutOfOffice() {
        return new OutOfOffice();
    }

    /**
     * Create an instance of {@link RegionalSettings }
     * 
     * @return
     *     the new instance of {@link RegionalSettings }
     */
    public RegionalSettings createRegionalSettings() {
        return new RegionalSettings();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     * @return
     *     the new instance of {@link Notification }
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link ViewerToolbarControl }
     * 
     * @return
     *     the new instance of {@link ViewerToolbarControl }
     */
    public ViewerToolbarControl createViewerToolbarControl() {
        return new ViewerToolbarControl();
    }

    /**
     * Create an instance of {@link FontSettings }
     * 
     * @return
     *     the new instance of {@link FontSettings }
     */
    public FontSettings createFontSettings() {
        return new FontSettings();
    }

    /**
     * Create an instance of {@link TextAnnotationToolSettings }
     * 
     * @return
     *     the new instance of {@link TextAnnotationToolSettings }
     */
    public TextAnnotationToolSettings createTextAnnotationToolSettings() {
        return new TextAnnotationToolSettings();
    }

    /**
     * Create an instance of {@link SizedAnnotationToolSettings }
     * 
     * @return
     *     the new instance of {@link SizedAnnotationToolSettings }
     */
    public SizedAnnotationToolSettings createSizedAnnotationToolSettings() {
        return new SizedAnnotationToolSettings();
    }

    /**
     * Create an instance of {@link AnnotationToolSettings }
     * 
     * @return
     *     the new instance of {@link AnnotationToolSettings }
     */
    public AnnotationToolSettings createAnnotationToolSettings() {
        return new AnnotationToolSettings();
    }

    /**
     * Create an instance of {@link ApplicationPreferences }
     * 
     * @return
     *     the new instance of {@link ApplicationPreferences }
     */
    public ApplicationPreferences createApplicationPreferences() {
        return new ApplicationPreferences();
    }

    /**
     * Create an instance of {@link ApplicationPreferencesHolder }
     * 
     * @return
     *     the new instance of {@link ApplicationPreferencesHolder }
     */
    public ApplicationPreferencesHolder createApplicationPreferencesHolder() {
        return new ApplicationPreferencesHolder();
    }

    /**
     * Create an instance of {@link WebClientPreferences }
     * 
     * @return
     *     the new instance of {@link WebClientPreferences }
     */
    public WebClientPreferences createWebClientPreferences() {
        return new WebClientPreferences();
    }

    /**
     * Create an instance of {@link GeneralSettings }
     * 
     * @return
     *     the new instance of {@link GeneralSettings }
     */
    public GeneralSettings createGeneralSettings() {
        return new GeneralSettings();
    }

    /**
     * Create an instance of {@link WebClientLayout }
     * 
     * @return
     *     the new instance of {@link WebClientLayout }
     */
    public WebClientLayout createWebClientLayout() {
        return new WebClientLayout();
    }

    /**
     * Create an instance of {@link Favorites }
     * 
     * @return
     *     the new instance of {@link Favorites }
     */
    public Favorites createFavorites() {
        return new Favorites();
    }

    /**
     * Create an instance of {@link FavoriteItems }
     * 
     * @return
     *     the new instance of {@link FavoriteItems }
     */
    public FavoriteItems createFavoriteItems() {
        return new FavoriteItems();
    }

    /**
     * Create an instance of {@link WorkAreaPreferences }
     * 
     * @return
     *     the new instance of {@link WorkAreaPreferences }
     */
    public WorkAreaPreferences createWorkAreaPreferences() {
        return new WorkAreaPreferences();
    }

    /**
     * Create an instance of {@link MultiFCSearches }
     * 
     * @return
     *     the new instance of {@link MultiFCSearches }
     */
    public MultiFCSearches createMultiFCSearches() {
        return new MultiFCSearches();
    }

    /**
     * Create an instance of {@link MultiFCSearchConfiguration }
     * 
     * @return
     *     the new instance of {@link MultiFCSearchConfiguration }
     */
    public MultiFCSearchConfiguration createMultiFCSearchConfiguration() {
        return new MultiFCSearchConfiguration();
    }

    /**
     * Create an instance of {@link ContentAreaPreferences }
     * 
     * @return
     *     the new instance of {@link ContentAreaPreferences }
     */
    public ContentAreaPreferences createContentAreaPreferences() {
        return new ContentAreaPreferences();
    }

    /**
     * Create an instance of {@link WorkInstance }
     * 
     * @return
     *     the new instance of {@link WorkInstance }
     */
    public WorkInstance createWorkInstance() {
        return new WorkInstance();
    }

    /**
     * Create an instance of {@link BasketAreaPreferences }
     * 
     * @return
     *     the new instance of {@link BasketAreaPreferences }
     */
    public BasketAreaPreferences createBasketAreaPreferences() {
        return new BasketAreaPreferences();
    }

    /**
     * Create an instance of {@link WorkflowAreaPreferences }
     * 
     * @return
     *     the new instance of {@link WorkflowAreaPreferences }
     */
    public WorkflowAreaPreferences createWorkflowAreaPreferences() {
        return new WorkflowAreaPreferences();
    }

    /**
     * Create an instance of {@link Position }
     * 
     * @return
     *     the new instance of {@link Position }
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link TextField }
     * 
     * @return
     *     the new instance of {@link TextField }
     */
    public TextField createTextField() {
        return new TextField();
    }

    /**
     * Create an instance of {@link MultiLineTextField }
     * 
     * @return
     *     the new instance of {@link MultiLineTextField }
     */
    public MultiLineTextField createMultiLineTextField() {
        return new MultiLineTextField();
    }

    /**
     * Create an instance of {@link NumberField }
     * 
     * @return
     *     the new instance of {@link NumberField }
     */
    public NumberField createNumberField() {
        return new NumberField();
    }

    /**
     * Create an instance of {@link DateField }
     * 
     * @return
     *     the new instance of {@link DateField }
     */
    public DateField createDateField() {
        return new DateField();
    }

    /**
     * Create an instance of {@link RadioGroup }
     * 
     * @return
     *     the new instance of {@link RadioGroup }
     */
    public RadioGroup createRadioGroup() {
        return new RadioGroup();
    }

    /**
     * Create an instance of {@link CheckGroup }
     * 
     * @return
     *     the new instance of {@link CheckGroup }
     */
    public CheckGroup createCheckGroup() {
        return new CheckGroup();
    }

    /**
     * Create an instance of {@link DropDownList }
     * 
     * @return
     *     the new instance of {@link DropDownList }
     */
    public DropDownList createDropDownList() {
        return new DropDownList();
    }

    /**
     * Create an instance of {@link Headline }
     * 
     * @return
     *     the new instance of {@link Headline }
     */
    public Headline createHeadline() {
        return new Headline();
    }

    /**
     * Create an instance of {@link SignatureField }
     * 
     * @return
     *     the new instance of {@link SignatureField }
     */
    public SignatureField createSignatureField() {
        return new SignatureField();
    }

    /**
     * Create an instance of {@link AttachFileField }
     * 
     * @return
     *     the new instance of {@link AttachFileField }
     */
    public AttachFileField createAttachFileField() {
        return new AttachFileField();
    }

    /**
     * Create an instance of {@link AttachFileInfo }
     * 
     * @return
     *     the new instance of {@link AttachFileInfo }
     */
    public AttachFileInfo createAttachFileInfo() {
        return new AttachFileInfo();
    }

    /**
     * Create an instance of {@link FixedText }
     * 
     * @return
     *     the new instance of {@link FixedText }
     */
    public FixedText createFixedText() {
        return new FixedText();
    }

    /**
     * Create an instance of {@link ImageField }
     * 
     * @return
     *     the new instance of {@link ImageField }
     */
    public ImageField createImageField() {
        return new ImageField();
    }

    /**
     * Create an instance of {@link AutoNumberField }
     * 
     * @return
     *     the new instance of {@link AutoNumberField }
     */
    public AutoNumberField createAutoNumberField() {
        return new AutoNumberField();
    }

    /**
     * Create an instance of {@link SpacerField }
     * 
     * @return
     *     the new instance of {@link SpacerField }
     */
    public SpacerField createSpacerField() {
        return new SpacerField();
    }

    /**
     * Create an instance of {@link WebFormControls }
     * 
     * @return
     *     the new instance of {@link WebFormControls }
     */
    public WebFormControls createWebFormControls() {
        return new WebFormControls();
    }

    /**
     * Create an instance of {@link Behaviors }
     * 
     * @return
     *     the new instance of {@link Behaviors }
     */
    public Behaviors createBehaviors() {
        return new Behaviors();
    }

    /**
     * Create an instance of {@link FieldValidations }
     * 
     * @return
     *     the new instance of {@link FieldValidations }
     */
    public FieldValidations createFieldValidations() {
        return new FieldValidations();
    }

    /**
     * Create an instance of {@link WebFormOption }
     * 
     * @return
     *     the new instance of {@link WebFormOption }
     */
    public WebFormOption createWebFormOption() {
        return new WebFormOption();
    }

    /**
     * Create an instance of {@link WebFormOptions }
     * 
     * @return
     *     the new instance of {@link WebFormOptions }
     */
    public WebFormOptions createWebFormOptions() {
        return new WebFormOptions();
    }

    /**
     * Create an instance of {@link WebFormOptionsRows }
     * 
     * @return
     *     the new instance of {@link WebFormOptionsRows }
     */
    public WebFormOptionsRows createWebFormOptionsRows() {
        return new WebFormOptionsRows();
    }

    /**
     * Create an instance of {@link WebFormListOptions }
     * 
     * @return
     *     the new instance of {@link WebFormListOptions }
     */
    public WebFormListOptions createWebFormListOptions() {
        return new WebFormListOptions();
    }

    /**
     * Create an instance of {@link SubmissionOptions }
     * 
     * @return
     *     the new instance of {@link SubmissionOptions }
     */
    public SubmissionOptions createSubmissionOptions() {
        return new SubmissionOptions();
    }

    /**
     * Create an instance of {@link FormInfoHeader }
     * 
     * @return
     *     the new instance of {@link FormInfoHeader }
     */
    public FormInfoHeader createFormInfoHeader() {
        return new FormInfoHeader();
    }

    /**
     * Create an instance of {@link FormProperties }
     * 
     * @return
     *     the new instance of {@link FormProperties }
     */
    public FormProperties createFormProperties() {
        return new FormProperties();
    }

    /**
     * Create an instance of {@link FormTemplate }
     * 
     * @return
     *     the new instance of {@link FormTemplate }
     */
    public FormTemplate createFormTemplate() {
        return new FormTemplate();
    }

    /**
     * Create an instance of {@link FormTemplates }
     * 
     * @return
     *     the new instance of {@link FormTemplates }
     */
    public FormTemplates createFormTemplates() {
        return new FormTemplates();
    }

    /**
     * Create an instance of {@link Zone }
     * 
     * @return
     *     the new instance of {@link Zone }
     */
    public Zone createZone() {
        return new Zone();
    }

    /**
     * Create an instance of {@link Zones }
     * 
     * @return
     *     the new instance of {@link Zones }
     */
    public Zones createZones() {
        return new Zones();
    }

    /**
     * Create an instance of {@link ExcludedFileAttachments }
     * 
     * @return
     *     the new instance of {@link ExcludedFileAttachments }
     */
    public ExcludedFileAttachments createExcludedFileAttachments() {
        return new ExcludedFileAttachments();
    }

    /**
     * Create an instance of {@link TemplateGUIDS }
     * 
     * @return
     *     the new instance of {@link TemplateGUIDS }
     */
    public TemplateGUIDS createTemplateGUIDS() {
        return new TemplateGUIDS();
    }

    /**
     * Create an instance of {@link BehaviorCondition }
     * 
     * @return
     *     the new instance of {@link BehaviorCondition }
     */
    public BehaviorCondition createBehaviorCondition() {
        return new BehaviorCondition();
    }

    /**
     * Create an instance of {@link ValidationCondition }
     * 
     * @return
     *     the new instance of {@link ValidationCondition }
     */
    public ValidationCondition createValidationCondition() {
        return new ValidationCondition();
    }

    /**
     * Create an instance of {@link FormCondition }
     * 
     * @return
     *     the new instance of {@link FormCondition }
     */
    public FormCondition createFormCondition() {
        return new FormCondition();
    }

    /**
     * Create an instance of {@link BehaviorAction }
     * 
     * @return
     *     the new instance of {@link BehaviorAction }
     */
    public BehaviorAction createBehaviorAction() {
        return new BehaviorAction();
    }

    /**
     * Create an instance of {@link ToggleBehaviorAction }
     * 
     * @return
     *     the new instance of {@link ToggleBehaviorAction }
     */
    public ToggleBehaviorAction createToggleBehaviorAction() {
        return new ToggleBehaviorAction();
    }

    /**
     * Create an instance of {@link Behavior }
     * 
     * @return
     *     the new instance of {@link Behavior }
     */
    public Behavior createBehavior() {
        return new Behavior();
    }

    /**
     * Create an instance of {@link CustomFieldValidation }
     * 
     * @return
     *     the new instance of {@link CustomFieldValidation }
     */
    public CustomFieldValidation createCustomFieldValidation() {
        return new CustomFieldValidation();
    }

    /**
     * Create an instance of {@link CFSStatisticSpecific }
     * 
     * @return
     *     the new instance of {@link CFSStatisticSpecific }
     */
    public CFSStatisticSpecific createCFSStatisticSpecific() {
        return new CFSStatisticSpecific();
    }

    /**
     * Create an instance of {@link CFSSpecificValue }
     * 
     * @return
     *     the new instance of {@link CFSSpecificValue }
     */
    public CFSSpecificValue createCFSSpecificValue() {
        return new CFSSpecificValue();
    }

    /**
     * Create an instance of {@link SubstitutionList }
     * 
     * @return
     *     the new instance of {@link SubstitutionList }
     */
    public SubstitutionList createSubstitutionList() {
        return new SubstitutionList();
    }

    /**
     * Create an instance of {@link SubstitutionRule }
     * 
     * @return
     *     the new instance of {@link SubstitutionRule }
     */
    public SubstitutionRule createSubstitutionRule() {
        return new SubstitutionRule();
    }

    /**
     * Create an instance of {@link SubstitutionLists }
     * 
     * @return
     *     the new instance of {@link SubstitutionLists }
     */
    public SubstitutionLists createSubstitutionLists() {
        return new SubstitutionLists();
    }

    /**
     * Create an instance of {@link SubstitutionRules }
     * 
     * @return
     *     the new instance of {@link SubstitutionRules }
     */
    public SubstitutionRules createSubstitutionRules() {
        return new SubstitutionRules();
    }

    /**
     * Create an instance of {@link DocumentAuditQuery }
     * 
     * @return
     *     the new instance of {@link DocumentAuditQuery }
     */
    public DocumentAuditQuery createDocumentAuditQuery() {
        return new DocumentAuditQuery();
    }

    /**
     * Create an instance of {@link AuditEvent }
     * 
     * @return
     *     the new instance of {@link AuditEvent }
     */
    public AuditEvent createAuditEvent() {
        return new AuditEvent();
    }

    /**
     * Create an instance of {@link DocumentAuditEvent }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEvent }
     */
    public DocumentAuditEvent createDocumentAuditEvent() {
        return new DocumentAuditEvent();
    }

    /**
     * Create an instance of {@link DocumentAuditEventProperty }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventProperty }
     */
    public DocumentAuditEventProperty createDocumentAuditEventProperty() {
        return new DocumentAuditEventProperty();
    }

    /**
     * Create an instance of {@link DocumentAuditEventTableProperty }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventTableProperty }
     */
    public DocumentAuditEventTableProperty createDocumentAuditEventTableProperty() {
        return new DocumentAuditEventTableProperty();
    }

    /**
     * Create an instance of {@link DocumentAuditEventTablePropertyColumn }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventTablePropertyColumn }
     */
    public DocumentAuditEventTablePropertyColumn createDocumentAuditEventTablePropertyColumn() {
        return new DocumentAuditEventTablePropertyColumn();
    }

    /**
     * Create an instance of {@link DocumentAuditEventTablePropertyValues }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventTablePropertyValues }
     */
    public DocumentAuditEventTablePropertyValues createDocumentAuditEventTablePropertyValues() {
        return new DocumentAuditEventTablePropertyValues();
    }

    /**
     * Create an instance of {@link DocumentAuditEventTablePropertyRow }
     * 
     * @return
     *     the new instance of {@link DocumentAuditEventTablePropertyRow }
     */
    public DocumentAuditEventTablePropertyRow createDocumentAuditEventTablePropertyRow() {
        return new DocumentAuditEventTablePropertyRow();
    }

    /**
     * Create an instance of {@link ServiceDescriptionDocumentation }
     * 
     * @return
     *     the new instance of {@link ServiceDescriptionDocumentation }
     */
    public ServiceDescriptionDocumentation createServiceDescriptionDocumentation() {
        return new ServiceDescriptionDocumentation();
    }

    /**
     * Create an instance of {@link ServiceDescriptionStatistics }
     * 
     * @return
     *     the new instance of {@link ServiceDescriptionStatistics }
     */
    public ServiceDescriptionStatistics createServiceDescriptionStatistics() {
        return new ServiceDescriptionStatistics();
    }

    /**
     * Create an instance of {@link ServiceDescriptionTests }
     * 
     * @return
     *     the new instance of {@link ServiceDescriptionTests }
     */
    public ServiceDescriptionTests createServiceDescriptionTests() {
        return new ServiceDescriptionTests();
    }

    /**
     * Create an instance of {@link ExtendedConfigurationRights }
     * 
     * @return
     *     the new instance of {@link ExtendedConfigurationRights }
     */
    public ExtendedConfigurationRights createExtendedConfigurationRights() {
        return new ExtendedConfigurationRights();
    }

    /**
     * Create an instance of {@link AdditionalOrganizationInfo }
     * 
     * @return
     *     the new instance of {@link AdditionalOrganizationInfo }
     */
    public AdditionalOrganizationInfo createAdditionalOrganizationInfo() {
        return new AdditionalOrganizationInfo();
    }

    /**
     * Create an instance of {@link CountResultItem }
     * 
     * @return
     *     the new instance of {@link CountResultItem }
     */
    public CountResultItem createCountResultItem() {
        return new CountResultItem();
    }

    /**
     * Create an instance of {@link CountResult }
     * 
     * @return
     *     the new instance of {@link CountResult }
     */
    public CountResult createCountResult() {
        return new CountResult();
    }

    /**
     * Create an instance of {@link XmlSchema }
     * 
     * @return
     *     the new instance of {@link XmlSchema }
     */
    public XmlSchema createXmlSchema() {
        return new XmlSchema();
    }

    /**
     * Create an instance of {@link IdentityServiceInfo }
     * 
     * @return
     *     the new instance of {@link IdentityServiceInfo }
     */
    public IdentityServiceInfo createIdentityServiceInfo() {
        return new IdentityServiceInfo();
    }

    /**
     * Create an instance of {@link ViewerPreferences.Annotations }
     * 
     * @return
     *     the new instance of {@link ViewerPreferences.Annotations }
     */
    public ViewerPreferences.Annotations createViewerPreferencesAnnotations() {
        return new ViewerPreferences.Annotations();
    }

    /**
     * Create an instance of {@link ViewerPreferences.Toolbars }
     * 
     * @return
     *     the new instance of {@link ViewerPreferences.Toolbars }
     */
    public ViewerPreferences.Toolbars createViewerPreferencesToolbars() {
        return new ViewerPreferences.Toolbars();
    }

    /**
     * Create an instance of {@link ViewerToolbar.Controls }
     * 
     * @return
     *     the new instance of {@link ViewerToolbar.Controls }
     */
    public ViewerToolbar.Controls createViewerToolbarControls() {
        return new ViewerToolbar.Controls();
    }

    /**
     * Create an instance of {@link MultiColSelectListValuesResult.Columns }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListValuesResult.Columns }
     */
    public MultiColSelectListValuesResult.Columns createMultiColSelectListValuesResultColumns() {
        return new MultiColSelectListValuesResult.Columns();
    }

    /**
     * Create an instance of {@link MultiColSelectListValuesResult.Rows }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListValuesResult.Rows }
     */
    public MultiColSelectListValuesResult.Rows createMultiColSelectListValuesResultRows() {
        return new MultiColSelectListValuesResult.Rows();
    }

    /**
     * Create an instance of {@link MultiColSelectListInfo.Columns }
     * 
     * @return
     *     the new instance of {@link MultiColSelectListInfo.Columns }
     */
    public MultiColSelectListInfo.Columns createMultiColSelectListInfoColumns() {
        return new MultiColSelectListInfo.Columns();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult.Headers }
     * 
     * @return
     *     the new instance of {@link DocumentsQueryTableResult.Headers }
     */
    public DocumentsQueryTableResult.Headers createDocumentsQueryTableResultHeaders() {
        return new DocumentsQueryTableResult.Headers();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult.Rows }
     * 
     * @return
     *     the new instance of {@link DocumentsQueryTableResult.Rows }
     */
    public DocumentsQueryTableResult.Rows createDocumentsQueryTableResultRows() {
        return new DocumentsQueryTableResult.Rows();
    }

    /**
     * Create an instance of {@link DocumentsTransferInfo.Documents }
     * 
     * @return
     *     the new instance of {@link DocumentsTransferInfo.Documents }
     */
    public DocumentsTransferInfo.Documents createDocumentsTransferInfoDocuments() {
        return new DocumentsTransferInfo.Documents();
    }

    /**
     * Create an instance of {@link DocumentWordSearchResult.SectionHits }
     * 
     * @return
     *     the new instance of {@link DocumentWordSearchResult.SectionHits }
     */
    public DocumentWordSearchResult.SectionHits createDocumentWordSearchResultSectionHits() {
        return new DocumentWordSearchResult.SectionHits();
    }

    /**
     * Create an instance of {@link DocumentsQueryResult.Items }
     * 
     * @return
     *     the new instance of {@link DocumentsQueryResult.Items }
     */
    public DocumentsQueryResult.Items createDocumentsQueryResultItems() {
        return new DocumentsQueryResult.Items();
    }

    /**
     * Create an instance of {@link Document.Preview }
     * 
     * @return
     *     the new instance of {@link Document.Preview }
     */
    public Document.Preview createDocumentPreview() {
        return new Document.Preview();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Annotation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Annotation }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Annotation")
    public JAXBElement<Annotation> createAnnotation(Annotation value) {
        return new JAXBElement<>(_Annotation_QNAME, Annotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegerList }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "IntegerList")
    public JAXBElement<IntegerList> createIntegerList(IntegerList value) {
        return new JAXBElement<>(_IntegerList_QNAME, IntegerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIndexFields }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentIndexFields }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentIndexFields")
    public JAXBElement<DocumentIndexFields> createDocumentIndexFields(DocumentIndexFields value) {
        return new JAXBElement<>(_DocumentIndexFields_QNAME, DocumentIndexFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndexFieldsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateIndexFieldsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UpdateIndexFieldsInfo")
    public JAXBElement<UpdateIndexFieldsInfo> createUpdateIndexFieldsInfo(UpdateIndexFieldsInfo value) {
        return new JAXBElement<>(_UpdateIndexFieldsInfo_QNAME, UpdateIndexFieldsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Page }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Page }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Page")
    public JAXBElement<Page> createPage(Page value) {
        return new JAXBElement<>(_Page_QNAME, Page.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Pages }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Pages")
    public JAXBElement<Pages> createPages(Pages value) {
        return new JAXBElement<>(_Pages_QNAME, Pages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagesBlockQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagesBlockQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "PagesBlockQuery")
    public JAXBElement<PagesBlockQuery> createPagesBlockQuery(PagesBlockQuery value) {
        return new JAXBElement<>(_PagesBlockQuery_QNAME, PagesBlockQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileDownload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileDownload }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownload")
    public JAXBElement<FileDownload> createFileDownload(FileDownload value) {
        return new JAXBElement<>(_FileDownload_QNAME, FileDownload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileDownloadPage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileDownloadPage }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownloadPage")
    public JAXBElement<FileDownloadPage> createFileDownloadPage(FileDownloadPage value) {
        return new JAXBElement<>(_FileDownloadPage_QNAME, FileDownloadPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentActionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentActionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentActionInfo")
    public JAXBElement<DocumentActionInfo> createDocumentActionInfo(DocumentActionInfo value) {
        return new JAXBElement<>(_DocumentActionInfo_QNAME, DocumentActionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "InputDocument")
    public JAXBElement<InputDocument> createInputDocument(InputDocument value) {
        return new JAXBElement<>(_InputDocument_QNAME, InputDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Section }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Section }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Section")
    public JAXBElement<Section> createSection(Section value) {
        return new JAXBElement<>(_Section_QNAME, Section.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sections }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sections }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Sections")
    public JAXBElement<Sections> createSections(Sections value) {
        return new JAXBElement<>(_Sections_QNAME, Sections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsQueryResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsQueryResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQueryResult")
    public JAXBElement<DocumentsQueryResult> createDocumentsQueryResult(DocumentsQueryResult value) {
        return new JAXBElement<>(_DocumentsQueryResult_QNAME, DocumentsQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentMergeOperationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContentMergeOperationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentMergeOperationInfo")
    public JAXBElement<ContentMergeOperationInfo> createContentMergeOperationInfo(ContentMergeOperationInfo value) {
        return new JAXBElement<>(_ContentMergeOperationInfo_QNAME, ContentMergeOperationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentDivideOperationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContentDivideOperationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentDivideOperationInfo")
    public JAXBElement<ContentDivideOperationInfo> createContentDivideOperationInfo(ContentDivideOperationInfo value) {
        return new JAXBElement<>(_ContentDivideOperationInfo_QNAME, ContentDivideOperationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LockInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "LockInfo")
    public JAXBElement<LockInfo> createLockInfo(LockInfo value) {
        return new JAXBElement<>(_LockInfo_QNAME, LockInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPositionQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPositionQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SearchPositionQuery")
    public JAXBElement<SearchPositionQuery> createSearchPositionQuery(SearchPositionQuery value) {
        return new JAXBElement<>(_SearchPositionQuery_QNAME, SearchPositionQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordSearchResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WordSearchResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WordSearchResult")
    public JAXBElement<WordSearchResult> createWordSearchResult(WordSearchResult value) {
        return new JAXBElement<>(_WordSearchResult_QNAME, WordSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentWordSearchResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentWordSearchResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentWordSearchResult")
    public JAXBElement<DocumentWordSearchResult> createDocumentWordSearchResult(DocumentWordSearchResult value) {
        return new JAXBElement<>(_DocumentWordSearchResult_QNAME, DocumentWordSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperty")
    public JAXBElement<DocumentApplicationProperty> createDocumentApplicationProperty(DocumentApplicationProperty value) {
        return new JAXBElement<>(_DocumentApplicationProperty_QNAME, DocumentApplicationProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperties }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperties")
    public JAXBElement<DocumentApplicationProperties> createDocumentApplicationProperties(DocumentApplicationProperties value) {
        return new JAXBElement<>(_DocumentApplicationProperties_QNAME, DocumentApplicationProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentLink }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLink")
    public JAXBElement<DocumentLink> createDocumentLink(DocumentLink value) {
        return new JAXBElement<>(_DocumentLink_QNAME, DocumentLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentLinks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentLinks }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLinks")
    public JAXBElement<DocumentLinks> createDocumentLinks(DocumentLinks value) {
        return new JAXBElement<>(_DocumentLinks_QNAME, DocumentLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlDSigContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XmlDSigContentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "XmlDSigContentType")
    public JAXBElement<XmlDSigContentType> createXmlDSigContentType(XmlDSigContentType value) {
        return new JAXBElement<>(_XmlDSigContentType_QNAME, XmlDSigContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutToFileSystemInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckOutToFileSystemInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CheckOutToFileSystemInfo")
    public JAXBElement<CheckOutToFileSystemInfo> createCheckOutToFileSystemInfo(CheckOutToFileSystemInfo value) {
        return new JAXBElement<>(_CheckOutToFileSystemInfo_QNAME, CheckOutToFileSystemInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateIndexFieldsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchUpdateIndexFieldsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateIndexFieldsResult")
    public JAXBElement<BatchUpdateIndexFieldsResult> createBatchUpdateIndexFieldsResult(BatchUpdateIndexFieldsResult value) {
        return new JAXBElement<>(_BatchUpdateIndexFieldsResult_QNAME, BatchUpdateIndexFieldsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectListResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectListResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListResult")
    public JAXBElement<SelectListResult> createSelectListResult(SelectListResult value) {
        return new JAXBElement<>(_SelectListResult_QNAME, SelectListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsResult")
    public JAXBElement<FieldValueStatisticsResult> createFieldValueStatisticsResult(FieldValueStatisticsResult value) {
        return new JAXBElement<>(_FieldValueStatisticsResult_QNAME, FieldValueStatisticsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultListQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultListQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ResultListQuery")
    public JAXBElement<ResultListQuery> createResultListQuery(ResultListQuery value) {
        return new JAXBElement<>(_ResultListQuery_QNAME, ResultListQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DialogExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogExpression")
    public JAXBElement<DialogExpression> createDialogExpression(DialogExpression value) {
        return new JAXBElement<>(_DialogExpression_QNAME, DialogExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CsvExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CsvExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CsvExpression")
    public JAXBElement<CsvExpression> createCsvExpression(CsvExpression value) {
        return new JAXBElement<>(_CsvExpression_QNAME, CsvExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CountExpression")
    public JAXBElement<CountExpression> createCountExpression(CountExpression value) {
        return new JAXBElement<>(_CountExpression_QNAME, CountExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectListExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectListExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListExpression")
    public JAXBElement<SelectListExpression> createSelectListExpression(SelectListExpression value) {
        return new JAXBElement<>(_SelectListExpression_QNAME, SelectListExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsExpression")
    public JAXBElement<FieldValueStatisticsExpression> createFieldValueStatisticsExpression(FieldValueStatisticsExpression value) {
        return new JAXBElement<>(_FieldValueStatisticsExpression_QNAME, FieldValueStatisticsExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionExpression }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FunctionExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FunctionExpression")
    public JAXBElement<FunctionExpression> createFunctionExpression(FunctionExpression value) {
        return new JAXBElement<>(_FunctionExpression_QNAME, FunctionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestionFields }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuggestionFields }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SuggestionFields")
    public JAXBElement<SuggestionFields> createSuggestionFields(SuggestionFields value) {
        return new JAXBElement<>(_SuggestionFields_QNAME, SuggestionFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestionTableFields }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuggestionTableFields }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SuggestionTableFields")
    public JAXBElement<SuggestionTableFields> createSuggestionTableFields(SuggestionTableFields value) {
        return new JAXBElement<>(_SuggestionTableFields_QNAME, SuggestionTableFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchAppendKeywordValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchAppendKeywordValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchAppendKeywordValues")
    public JAXBElement<BatchAppendKeywordValues> createBatchAppendKeywordValues(BatchAppendKeywordValues value) {
        return new JAXBElement<>(_BatchAppendKeywordValues_QNAME, BatchAppendKeywordValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcess }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcess")
    public JAXBElement<BatchUpdateProcess> createBatchUpdateProcess(BatchUpdateProcess value) {
        return new JAXBElement<>(_BatchUpdateProcess_QNAME, BatchUpdateProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcessData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcessData }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcessData")
    public JAXBElement<BatchUpdateProcessData> createBatchUpdateProcessData(BatchUpdateProcessData value) {
        return new JAXBElement<>(_BatchUpdateProcessData_QNAME, BatchUpdateProcessData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQuery")
    public JAXBElement<DocumentsQuery> createDocumentsQuery(DocumentsQuery value) {
        return new JAXBElement<>(_DocumentsQuery_QNAME, DocumentsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedSearchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDefinedSearchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserDefinedSearchInfo")
    public JAXBElement<UserDefinedSearchInfo> createUserDefinedSearchInfo(UserDefinedSearchInfo value) {
        return new JAXBElement<>(_UserDefinedSearchInfo_QNAME, UserDefinedSearchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogFields }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DialogFields }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogFields")
    public JAXBElement<DialogFields> createDialogFields(DialogFields value) {
        return new JAXBElement<>(_DialogFields_QNAME, DialogFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dialog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dialog }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialog")
    public JAXBElement<Dialog> createDialog(Dialog value) {
        return new JAXBElement<>(_Dialog_QNAME, Dialog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogInfos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DialogInfos }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialogs")
    public JAXBElement<DialogInfos> createDialogs(DialogInfos value) {
        return new JAXBElement<>(_Dialogs_QNAME, DialogInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDialogQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestDialogQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "RequestDialogQuery")
    public JAXBElement<RequestDialogQuery> createRequestDialogQuery(RequestDialogQuery value) {
        return new JAXBElement<>(_RequestDialogQuery_QNAME, RequestDialogQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectListValuesQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelectListValuesQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListValuesQuery")
    public JAXBElement<SelectListValuesQuery> createSelectListValuesQuery(SelectListValuesQuery value) {
        return new JAXBElement<>(_SelectListValuesQuery_QNAME, SelectListValuesQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormFieldValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormFieldValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFields")
    public JAXBElement<FormFieldValues> createStampFormFields(FormFieldValues value) {
        return new JAXBElement<>(_StampFormFields_QNAME, FormFieldValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stamps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Stamps }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Stamps")
    public JAXBElement<Stamps> createStamps(Stamps value) {
        return new JAXBElement<>(_Stamps_QNAME, Stamps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampPlacement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StampPlacement }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampPlacement")
    public JAXBElement<StampPlacement> createStampPlacement(StampPlacement value) {
        return new JAXBElement<>(_StampPlacement_QNAME, StampPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampFormFieldValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StampFormFieldValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFieldValues")
    public JAXBElement<StampFormFieldValues> createStampFormFieldValues(StampFormFieldValues value) {
        return new JAXBElement<>(_StampFormFieldValues_QNAME, StampFormFieldValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationsPlacement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnotationsPlacement }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AnnotationsPlacement")
    public JAXBElement<AnnotationsPlacement> createAnnotationsPlacement(AnnotationsPlacement value) {
        return new JAXBElement<>(_AnnotationsPlacement_QNAME, AnnotationsPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAnnotationsPlacement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentAnnotationsPlacement }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotationsPlacement")
    public JAXBElement<DocumentAnnotationsPlacement> createDocumentAnnotationsPlacement(DocumentAnnotationsPlacement value) {
        return new JAXBElement<>(_DocumentAnnotationsPlacement_QNAME, DocumentAnnotationsPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAnnotations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentAnnotations }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotations")
    public JAXBElement<DocumentAnnotations> createDocumentAnnotations(DocumentAnnotations value) {
        return new JAXBElement<>(_DocumentAnnotations_QNAME, DocumentAnnotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsTransferInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsTransferInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsTransferInfo")
    public JAXBElement<DocumentsTransferInfo> createDocumentsTransferInfo(DocumentsTransferInfo value) {
        return new JAXBElement<>(_DocumentsTransferInfo_QNAME, DocumentsTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinetTransferInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileCabinetTransferInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinetTransferInfo")
    public JAXBElement<FileCabinetTransferInfo> createFileCabinetTransferInfo(FileCabinetTransferInfo value) {
        return new JAXBElement<>(_FileCabinetTransferInfo_QNAME, FileCabinetTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileCabinet }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinet")
    public JAXBElement<FileCabinet> createFileCabinet(FileCabinet value) {
        return new JAXBElement<>(_FileCabinet_QNAME, FileCabinet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinets }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileCabinets }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinets")
    public JAXBElement<FileCabinets> createFileCabinets(FileCabinets value) {
        return new JAXBElement<>(_FileCabinets_QNAME, FileCabinets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SequenceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceResult")
    public JAXBElement<SequenceResult> createSequenceResult(SequenceResult value) {
        return new JAXBElement<>(_SequenceResult_QNAME, SequenceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SequenceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceRequest")
    public JAXBElement<SequenceRequest> createSequenceRequest(SequenceRequest value) {
        return new JAXBElement<>(_SequenceRequest_QNAME, SequenceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFile")
    public JAXBElement<AdhocRenderingFile> createAdhocRenderingFile(AdhocRenderingFile value) {
        return new JAXBElement<>(_AdhocRenderingFile_QNAME, AdhocRenderingFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFiles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFiles }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFiles")
    public JAXBElement<AdhocRenderingFiles> createAdhocRenderingFiles(AdhocRenderingFiles value) {
        return new JAXBElement<>(_AdhocRenderingFiles_QNAME, AdhocRenderingFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingQuery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdhocRenderingQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingQuery")
    public JAXBElement<AdhocRenderingQuery> createAdhocRenderingQuery(AdhocRenderingQuery value) {
        return new JAXBElement<>(_AdhocRenderingQuery_QNAME, AdhocRenderingQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groups }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Groups")
    public JAXBElement<Groups> createGroups(Groups value) {
        return new JAXBElement<>(_Groups_QNAME, Groups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Roles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Roles }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Roles")
    public JAXBElement<Roles> createRoles(Roles value) {
        return new JAXBElement<>(_Roles_QNAME, Roles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserValidation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserValidation }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserValidation")
    public JAXBElement<UserValidation> createUserValidation(UserValidation value) {
        return new JAXBElement<>(_UserValidation_QNAME, UserValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Users }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "TokenDescription")
    public JAXBElement<TokenDescription> createTokenDescription(TokenDescription value) {
        return new JAXBElement<>(_TokenDescription_QNAME, TokenDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notifications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Notifications }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Notifications")
    public JAXBElement<Notifications> createNotifications(Notifications value) {
        return new JAXBElement<>(_Notifications_QNAME, Notifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WebSettings")
    public JAXBElement<WebSettings> createWebSettings(WebSettings value) {
        return new JAXBElement<>(_WebSettings_QNAME, WebSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormInfo")
    public JAXBElement<FormInfo> createFormInfo(FormInfo value) {
        return new JAXBElement<>(_FormInfo_QNAME, FormInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFormsFileResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFormsFileResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CreateFormsFileResult")
    public JAXBElement<CreateFormsFileResult> createCreateFormsFileResult(CreateFormsFileResult value) {
        return new JAXBElement<>(_CreateFormsFileResult_QNAME, CreateFormsFileResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormsInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormsInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormsInput")
    public JAXBElement<FormsInput> createFormsInput(FormsInput value) {
        return new JAXBElement<>(_FormsInput_QNAME, FormsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTemplateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadTemplateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateInput")
    public JAXBElement<UploadTemplateInput> createUploadTemplateInput(UploadTemplateInput value) {
        return new JAXBElement<>(_UploadTemplateInput_QNAME, UploadTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTemplateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadTemplateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateResult")
    public JAXBElement<UploadTemplateResult> createUploadTemplateResult(UploadTemplateResult value) {
        return new JAXBElement<>(_UploadTemplateResult_QNAME, UploadTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveTemplateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateInput")
    public JAXBElement<SaveTemplateInput> createSaveTemplateInput(SaveTemplateInput value) {
        return new JAXBElement<>(_SaveTemplateInput_QNAME, SaveTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveTemplateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateResult")
    public JAXBElement<SaveTemplateResult> createSaveTemplateResult(SaveTemplateResult value) {
        return new JAXBElement<>(_SaveTemplateResult_QNAME, SaveTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTemplateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyTemplateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateInput")
    public JAXBElement<CopyTemplateInput> createCopyTemplateInput(CopyTemplateInput value) {
        return new JAXBElement<>(_CopyTemplateInput_QNAME, CopyTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTemplateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyTemplateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateResult")
    public JAXBElement<CopyTemplateResult> createCopyTemplateResult(CopyTemplateResult value) {
        return new JAXBElement<>(_CopyTemplateResult_QNAME, CopyTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesInput")
    public JAXBElement<DeleteTemplatesInput> createDeleteTemplatesInput(DeleteTemplatesInput value) {
        return new JAXBElement<>(_DeleteTemplatesInput_QNAME, DeleteTemplatesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesResult")
    public JAXBElement<DeleteTemplatesResult> createDeleteTemplatesResult(DeleteTemplatesResult value) {
        return new JAXBElement<>(_DeleteTemplatesResult_QNAME, DeleteTemplatesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateImageInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemplateImageInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageInput")
    public JAXBElement<GetTemplateImageInput> createGetTemplateImageInput(GetTemplateImageInput value) {
        return new JAXBElement<>(_GetTemplateImageInput_QNAME, GetTemplateImageInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateImageResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemplateImageResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageResult")
    public JAXBElement<GetTemplateImageResult> createGetTemplateImageResult(GetTemplateImageResult value) {
        return new JAXBElement<>(_GetTemplateImageResult_QNAME, GetTemplateImageResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportConfigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportConfigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ExportConfigInput")
    public JAXBElement<ExportConfigInput> createExportConfigInput(ExportConfigInput value) {
        return new JAXBElement<>(_ExportConfigInput_QNAME, ExportConfigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportConfigResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportConfigResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ExportConfigResult")
    public JAXBElement<ExportConfigResult> createExportConfigResult(ExportConfigResult value) {
        return new JAXBElement<>(_ExportConfigResult_QNAME, ExportConfigResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportConfigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportConfigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ImportConfigInput")
    public JAXBElement<ImportConfigInput> createImportConfigInput(ImportConfigInput value) {
        return new JAXBElement<>(_ImportConfigInput_QNAME, ImportConfigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportConfigResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportConfigResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ImportConfigResult")
    public JAXBElement<ImportConfigResult> createImportConfigResult(ImportConfigResult value) {
        return new JAXBElement<>(_ImportConfigResult_QNAME, ImportConfigResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportTemplateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportTemplateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ExportTemplateInput")
    public JAXBElement<ExportTemplateInput> createExportTemplateInput(ExportTemplateInput value) {
        return new JAXBElement<>(_ExportTemplateInput_QNAME, ExportTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportTemplateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportTemplateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ExportTemplateResult")
    public JAXBElement<ExportTemplateResult> createExportTemplateResult(ExportTemplateResult value) {
        return new JAXBElement<>(_ExportTemplateResult_QNAME, ExportTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportTemplateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportTemplateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ImportTemplateInput")
    public JAXBElement<ImportTemplateInput> createImportTemplateInput(ImportTemplateInput value) {
        return new JAXBElement<>(_ImportTemplateInput_QNAME, ImportTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportTemplateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportTemplateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ImportTemplateResult")
    public JAXBElement<ImportTemplateResult> createImportTemplateResult(ImportTemplateResult value) {
        return new JAXBElement<>(_ImportTemplateResult_QNAME, ImportTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CFSStatisticGeneral }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CFSStatisticGeneral }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CFSStatistic")
    public JAXBElement<CFSStatisticGeneral> createCFSStatistic(CFSStatisticGeneral value) {
        return new JAXBElement<>(_CFSStatistic_QNAME, CFSStatisticGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAuditInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentAuditInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAuditInformation")
    public JAXBElement<DocumentAuditInformation> createDocumentAuditInformation(DocumentAuditInformation value) {
        return new JAXBElement<>(_DocumentAuditInformation_QNAME, DocumentAuditInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAuditEventInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentAuditEventInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAuditEventInformation")
    public JAXBElement<DocumentAuditEventInformation> createDocumentAuditEventInformation(DocumentAuditEventInformation value) {
        return new JAXBElement<>(_DocumentAuditEventInformation_QNAME, DocumentAuditEventInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organizations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Organizations }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organizations")
    public JAXBElement<Organizations> createOrganizations(Organizations value) {
        return new JAXBElement<>(_Organizations_QNAME, Organizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ServiceDescription")
    public JAXBElement<ServiceDescription> createServiceDescription(ServiceDescription value) {
        return new JAXBElement<>(_ServiceDescription_QNAME, ServiceDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlSchemas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XmlSchemas }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "XmlSchemas")
    public JAXBElement<XmlSchemas> createXmlSchemas(XmlSchemas value) {
        return new JAXBElement<>(_XmlSchemas_QNAME, XmlSchemas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentOperation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignmentOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AssignmentOperation")
    public JAXBElement<AssignmentOperation> createAssignmentOperation(AssignmentOperation value) {
        return new JAXBElement<>(_AssignmentOperation_QNAME, AssignmentOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MinValue", scope = NumberField.class)
    public JAXBElement<Double> createNumberFieldMinValue(Double value) {
        return new JAXBElement<>(_NumberFieldMinValue_QNAME, Double.class, NumberField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MaxValue", scope = NumberField.class)
    public JAXBElement<Double> createNumberFieldMaxValue(Double value) {
        return new JAXBElement<>(_NumberFieldMaxValue_QNAME, Double.class, NumberField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "PredefinedCustomEntry", scope = NumberField.class)
    public JAXBElement<Double> createNumberFieldPredefinedCustomEntry(Double value) {
        return new JAXBElement<>(_NumberFieldPredefinedCustomEntry_QNAME, Double.class, NumberField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MinLength", scope = MultiLineTextField.class)
    public JAXBElement<Integer> createMultiLineTextFieldMinLength(Integer value) {
        return new JAXBElement<>(_MultiLineTextFieldMinLength_QNAME, Integer.class, MultiLineTextField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MaxLength", scope = MultiLineTextField.class)
    public JAXBElement<Integer> createMultiLineTextFieldMaxLength(Integer value) {
        return new JAXBElement<>(_MultiLineTextFieldMaxLength_QNAME, Integer.class, MultiLineTextField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MinLength", scope = TextField.class)
    public JAXBElement<Integer> createTextFieldMinLength(Integer value) {
        return new JAXBElement<>(_MultiLineTextFieldMinLength_QNAME, Integer.class, TextField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "MaxLength", scope = TextField.class)
    public JAXBElement<Integer> createTextFieldMaxLength(Integer value) {
        return new JAXBElement<>(_MultiLineTextFieldMaxLength_QNAME, Integer.class, TextField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentArea", scope = PageData.class)
    public JAXBElement<DWRectangle> createPageDataContentArea(DWRectangle value) {
        return new JAXBElement<>(_PageDataContentArea_QNAME, DWRectangle.class, PageData.class, value);
    }

}
