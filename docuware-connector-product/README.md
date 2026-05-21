# DocuWare Connector

The DocuWare Connector integrates Axon Ivy with DocuWare, enabling processes to manage documents (upload, download, update metadata, delete) and interact with DocuWare file cabinets directly from your workflows.

## Key features

- Upload and index documents directly from Axon Ivy processes, preserving metadata and file content.
- Download and open documents into process-driven file handling, including filename extraction and binary download.
- Update document index fields and metadata to keep records synchronized with business processes.
- Delete documents securely from configured file cabinets with permission checks.
- Check documents in and out to the file system for external processing and re-upload as needed.
- Support for multiple DocuWare instances via a configurable `docuwareConnector.defaultConfig`, enabling flexible deployments.

## Demo

Check the demo implementations provided: DocuWare Demo and Document Table. The demos show common document operations such as browsing file cabinets, viewing documents, uploading files, and editing metadata.

### Demo workflows

#### docuware-connector-demo (docuware-connector-demo)

##### DocuWare Demo
1. Launch the DocuWare Demo from the demo menu.
2. You'll see a UI that loads organizations and file cabinets; select one to continue.

![Fetch organizations](images/2-fetchorgas.png)

3. Open documents in the Document Table to view or edit metadata.
4. Use provided actions to upload, edit properties, or delete documents.
5. Optional: If a Docker deployment is configured, run the demo locally for quicker testing.

##### Document Table
1. Launch the Document Table demo from the demo menu.
2. Select a file cabinet to load documents.

![Fetch documents](images/fetch-documents.png)

3. Review the list and click a document to view details or edit metadata.
4. Use the available filters to query and refresh results.
5. Optional: For large datasets, configure download settings as needed.

##### Example: Work with document sections
1. Launch the "Example: Work with document sections" workflow from the demo menu.
2. The workflow demonstrates listing, reading, downloading and uploading document sections.
3. Watch the log files to see the results and attached documents.

##### Example: Work with dialogs
1. Launch the "Example: Work with dialogs" workflow from the demo menu.
2. The workflow demonstrates querying dialog expressions and reading dialog results.
3. Observe results in the logs and dialog UI.

##### Example: Work with index fields
1. Launch the "Example: Work with index fields" workflow from the demo menu.
2. The workflow demonstrates how to prepare and upload index field values for documents.
3. Review the uploaded document's index fields in the Document Table.

## Setup

- **Roles:** Everybody (configured in config/roles.xml)
- **OpenAPI:** No public OpenAPI specs delivered by this extension.

### Variables

```yaml
# yaml-language-server: $schema=https://json-schema.axonivy.com/app/12.0.0/variables.json
# == Variables ==
#
# You can define here your project Variables.
# If you want to define/override a Variable for a specific Environment, 
# add an additional ‘variables.yaml’ file in a subdirectory in the ‘Config’ folder: 
# '<project>/Config/_<environment>/variables.yaml
#
Variables:
  docuwareConnector:
    # The DocuWare default configuration.
    defaultConfig:
      # The Id of this configuration. It is only used to invalidate any cached connection based on this (and inherited) configuration.
      configId: "1"
      # The URL of the server, including the platform part (compare to Postman collection), eg. https://acme.docuware.cloud/DocuWare/Platform
      url: ""
      # The type of authorization grant to provide.
      # [enum: password, trusted, dwtoken]
      grantType: "password"
      # The username used for authenticating to DocuWare.
      username: ""
      # The password used for authenticating to DocuWare.
      #[password]
      password: ${decrypt:}
      # Impersonate a specific DocuWare user (only used for granttype trusted).
      #
      # DW name is constant
      # <dwuser>
      #
      # DW names are fixed for system (developer), anonymous and user
      # ^fixed:system=<dwuser>,anonymous=<dwuser>,user=<dwuser>
      #
      # DW names are fixed for system (developer) and anonymous but current ivy user name for other users
      # ^ivy:system=<dwuser>,anonymous=<dwuser>
      # 
      # DW name is taken from an attribute of the current session (needs to be set by a service function)
      # ^session
      impersonateUser: ""
      # Where to find the DW token (only used for granttype dwtoken).
      #
      # DW token is taken from an attribute of the current session (needs to be set by a service function)
      # ^session
      dwToken: ""
      # This property sets the maximum time (in milliseconds) that the client will wait when attempting to establish a connection with the server.
      # The value MUST be an instance convertible to Integer. A value of zero (0) is equivalent to an interval of infinity.
      connectTimeout: "0"
      # This property sets the maximum time (in milliseconds) that the client will wait when attempting to establish a connection with the server.
      # The value MUST be an instance convertible to Integer. A value of zero (0) is equivalent to an interval of infinity.
      readTimeout: "0"
      # This property defines the maximum number of characters of an entity that will be logged.
      loggingEntityMaxSize: "8192"
      # The password used for encrypting parameters of embedded urls (set in Configurations/Organization Settings/Security)
      #[password]
      integrationPassphrase: ""
```

### Authentication

- No information was delivered for this section.

## Components

### Connector processes

#### CheckinService.p.json

- **checkOutToFileSystem(String configKey, String documentId, String fileCabinetId) -> file: File, error: ch.ivyteam.ivy.bpm.error.BpmError**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `file` (File)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

- **checkInFromFileSystem(String configKey, String documentId, String fileCabinetId, String fileName, InputStream stream, com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters checkInParameters) -> document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `fileName` (String)
        - `stream` (java.io.InputStream)
        - `checkInParameters` (com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

- **checkOutToFileSystemAsStream(String configKey, String documentId, String fileCabinetId) -> stream: java.io.InputStream, error: ch.ivyteam.ivy.bpm.error.BpmError, fileName: String**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `stream` (java.io.InputStream)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)
        - `fileName` (String)

- **checkInFromFileSystem(String configKey, String documentId, String fileCabinetId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

#### DeleteService.p.json

- **deleteDocument(String configKey, String documentId, String fileCabinetId) -> (none)**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result: (none)

#### DownloadService.p.json

- **getDocument(String configKey, String documentId, String fileCabinetId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

- **downloadFile(String configKey, String documentId, String fileCabinetId) -> file: File**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `file` (File)

#### UpdateService.p.json

- **updateDocument(String configKey, String documentId, String fileCabinetId, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields) -> documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields**
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
    - Result:
        - `documentIndexFields` (com.docuware.dev.schema._public.services.platform.DocumentIndexFields)

#### UploadService.p.json

- **uploadFileWithIndexFields(String configKey, String fileCabinetId, File file, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields, String storeDialogId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Input:
        - `configKey` (String)
        - `fileCabinetId` (String)
        - `file` (File)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
        - `storeDialogId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

- **uploadFileWithIndexFields(String configKey, String fileCabinetId, java.io.InputStream fileStream, String fileName, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields, String storeDialogId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Input:
        - `configKey` (String)
        - `fileCabinetId` (String)
        - `fileStream` (java.io.InputStream)
        - `fileName` (String)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
        - `storeDialogId` (String)
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

### Form components

#### UploadServiceData — Data class for upload operations
- **Namespace:** com.axonivy.market.docuware.connector
- **Component type:** Data Class
- **Fields:**
   - `configKey` (String)
   - `fileCabinetId` (String)
   - `storeDialogId` (String)
   - `uploadFile` (File)
   - `properties` (com.axonivy.connector.docuware.connector.DocuWareProperties)
   - `document` (com.docuware.dev.schema._public.services.platform.Document)
   - `fileStream` (java.io.InputStream)
   - `fileName` (String)
   - `file` (List<java.lang.Byte>)
- **Where used:** UploadService.p.json

#### UpdateServiceData — Data class for update operations
- **Namespace:** com.axonivy.market.docuware.connector
- **Component type:** Data Class
- **Fields:**
   - `configKey` (String)
   - `documentId` (String)
   - `fileCabinetId` (String)
   - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
   - `document` (com.docuware.dev.schema._public.services.platform.Document)
   - `error` (ch.ivyteam.ivy.bpm.error.BpmError)
   - `propertiesJson` (String)
   - `documentIndexFields` (com.docuware.dev.schema._public.services.platform.DocumentIndexFields)
- **Where used:** UpdateService.p.json

#### DownloadServiceData — Data class for download operations
- **Namespace:** com.axonivy.market.docuware.connector
- **Component type:** Data Class
- **Fields:**
   - `configKey` (String)
   - `documentId` (String)
   - `fileCabinetId` (String)
   - `document` (com.docuware.dev.schema._public.services.platform.Document)
   - `file` (File)
   - `downloadFolder` (String)
- **Where used:** DownloadService.p.json

#### DeleteServiceData — Data class for delete operations
- **Namespace:** com.axonivy.market.docuware.connector
- **Component type:** Data Class
- **Fields:**
   - `configKey` (String)
   - `documentId` (String)
   - `fileCabinetId` (String)
- **Where used:** DeleteService.p.json

### Maven artifacts

1. docuware-connector

```xml
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector</artifactId>
  <version>@version@</version>
  <type>iar</type>
</dependency>
```

2. docuware-connector-demo *(optional)*

```xml
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector-demo</artifactId>
  <version>@version@</version>
  <type>iar</type>
</dependency>
```
