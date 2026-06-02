# DocuWare Connector

The DocuWare Connector integrates DocuWare with Axon Ivy, allowing you to upload, download, search, and manage documents and metadata directly from your processes.

![DocuWare Demo](images/docuwaredemo.png)

## Key features

- Upload files with optional index fields to store metadata in DocuWare.
- Download documents and file contents for processing and storage.
- Check documents in and out of the file system, supporting streams and files.
- Update document index fields and metadata programmatically.
- Delete documents from DocuWare from your processes.
- Search and retrieve document metadata using configured REST clients.

## Demo

Check the demo implementations provided: DocuWare Demo and Document Table. These demos show how to upload and download documents, view document tables, and update metadata using the connector.

### Demo Workflows

#### DocuWare Demo (docuware-connector-demo)

##### DocuWare Demo

1. Launch the DocuWare Demo from the demo menu or dashboard.
2. You'll see a simple UI that demonstrates DocuWare calls such as loading organizations and file cabinets.
3. Use the controls to load organizations, select a file cabinet, and query documents.
4. View or open documents and perform actions like download or update.

#### Document Table (docuware-connector-demo)

##### Document Table

1. Launch the Document Table demo from the demo menu.
2. A table displays documents from the selected file cabinet.
3. Select a document to view details, edit index fields, or download the file.

## Setup

- **Roles:** Everybody (configured in config/roles.xml)
- **OpenAPI:** file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json

### Variables

```yaml
@variables.yaml@
```

## Components

### Callable Subprocesses

#### CheckinService.p.json

- **Signature**: checkOutToFileSystem(String configKey, String documentId, String fileCabinetId) -> file: File, error: ch.ivyteam.ivy.bpm.error.BpmError
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `file` (File)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

- **Signature**: checkInFromFileSystem(String configKey, String documentId, String fileCabinetId, com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters checkInParameters, File file) -> document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `checkInParameters` (com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters)
        - `file` (File)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

#### DeleteService.p.json

- **Signature**: deleteDocument(String configKey, String documentId, String fileCabinetId) -> (none)
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - (none)

#### DownloadService.p.json

- **Signature**: getDocument(String configKey, String documentId, String fileCabinetId) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

- **Signature**: downloadFile(String configKey, String documentId, String fileCabinetId) -> file: File
    - Input:
        - `configKey` (String) - 
        - `documentId` (String) - 
        - `fileCabinetId` (String) - 
    - Result:
        - `file` (File) - 

#### UpdateService.p.json

- **Signature**: updateDocument(String configKey, String documentId, String fileCabinetId, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields) -> documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields
    - Input:
        - `configKey` (String) - 
        - `documentId` (String) - 
        - `fileCabinetId` (String) - 
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - 
    - Result:
        - `documentIndexFields` (com.docuware.dev.schema._public.services.platform.DocumentIndexFields) - 

#### UploadService.p.json

- **Signature**: uploadFileWithIndexFields(String configKey, String fileCabinetId, File file, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields, String storeDialogId) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Input:
        - `configKey` (String)
        - `fileCabinetId` (String)
        - `file` (File)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
        - `storeDialogId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

### Dialog Components

#### RequestLoginToken

- **Namespace:** com.axonivy.market.docuware.connector.RequestLoginToken
- **Component type:** UI dialog
- **Fields:** - (none)
- **Purpose:** Request a login token to authenticate with DocuWare from the UI

### Web Services

- Spec URL: file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json

### Maven Artifacts

1. docuware-connector

```xml
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector</artifactId>
  <type>iar</type>
</dependency>
```

2. docuware-connector-demo *(optional)*

```xml
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector-demo</artifactId>
  <type>iar</type>
</dependency>
```
