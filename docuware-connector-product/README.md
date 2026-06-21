# DocuWare Connector

The DocuWare Connector integrates DocuWare document management with Axon Ivy, enabling seamless document workflows directly from your Axon Ivy processes.

![DocuWare Demo](images/docuwaredemo.png)

With this connector, you can manage your documents and document workflows programmatically—upload files with metadata, download documents, query file cabinets, apply stamps and signatures, and transfer documents between cabinets—all with simple callable subprocesses that integrate natively into your Ivy applications.

**Key features**

- **Document Management** — Upload files with index field metadata and manage documents programmatically
- **Document Retrieval** — Download documents and check them out from DocuWare file cabinets on demand
- **Metadata Operations** — Query and update document properties and index fields in DocuWare
- **Document Organization** — Transfer documents between file cabinets and delete unwanted documents
- **Stamp & Signature** — Apply predefined stamps and annotations to documents programmatically
- **Configuration Flexibility** — Support for multiple DocuWare server configurations with flexible authentication (password, trusted, token-based)

## Demo

The DocuWare Connector includes two demo workflows that showcase common document management scenarios. Launch the demo to see how to integrate DocuWare document operations into your Ivy processes.

![Demo start screen](images/1-startdemo.png)

### Demo Workflows

##### DocuWare Demo

1. Launch the DocuWare Demo process from the demo menu
2. You'll see a UI dialog that demonstrates basic document management operations

![DocuWare UI](images/2-fetchorgas.png)

3. The demo loads organizations and file cabinets from your configured DocuWare server
4. Perform actions such as querying documents or viewing available file cabinets
5. Review the results and observe how the connector executes REST API calls to DocuWare

##### Document Table

1. Start the Document Table demo from the demo menu
2. You'll see a table interface showing documents from your DocuWare file cabinet

![Document Table Demo](images/6-tabledemo.png)

3. Select a document to view its properties and metadata
4. Perform operations such as downloading the document or editing its index fields
5. Review changes and confirm successful document operations

##### Download Workflow Example

1. Launch the Download Workflow Example from the demo menu
2. Specify the document ID and file cabinet ID

![Download Document](images/4-downloaddocument.png)

3. The workflow retrieves the document from DocuWare and attaches it to an Ivy case
4. You'll see a confirmation message with the document name
5. Access the attached document from the case document management interface

## Setup

- **Roles:** Everybody (configured in config/roles.xml)
- **OpenAPI:** Spec URL
- **REST Client Configuration:** The connector uses the DocuWare REST API (OpenAPI specification) defined in the rest-clients.yaml configuration

1. **Install the connector** — Add the docuware-connector artifact to your Ivy project via Maven
2. **Configure DocuWare connection** — Edit `config/rest-clients.yaml` and set the DocuWare server URL and API credentials in the `DocuWare` rest client configuration
3. **Set authentication** — Choose your preferred authentication method (password, trusted, or token-based) by configuring the `grantType` variable in `config/variables.yaml`
4. **Provide credentials** — Store your DocuWare username and password (or token) in the configuration, encrypted for security
5. **Optional: Multi-environment setup** — Create environment-specific `variables.yaml` files in subdirectories if you need different configurations for development, staging, and production
6. **Verify connection** — Run one of the demo workflows to confirm your DocuWare server connection is working correctly
7. **Integrate callable subs** — Call the DocuWare connector callable subprocesses from your own processes to upload, download, query, or update documents

### Variables

```
@variables.yaml@
```

## Components

### Callable Subprocesses

#### CheckinService.p.json

- **Signature**: checkOutToFileSystem(String, String, String) -> file: File
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to download
        - `fileCabinetId` (String) - The unique identifier of the file cabinet containing the document
    - Result:
        - `file` (File) - Local file downloaded from DocuWare

- **Signature**: checkOutToFileSystem(String, String, String, Boolean) -> file: File
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to download
        - `fileCabinetId` (String) - The unique identifier of the file cabinet containing the document
        - `checkOutAsStream` (Boolean) - Flag to determine whether to checkout as stream or file
    - Result:
        - `file` (File) - Local file downloaded from DocuWare

#### DeleteService.p.json

- **Signature**: deleteDocument(String, String, String) -> (none)
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to delete
        - `fileCabinetId` (String) - The unique identifier of the file cabinet containing the document
    - Result: (none)

#### DownloadService.p.json

- **Signature**: downloadFile(String, String, String) -> file: File
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to download
        - `fileCabinetId` (String) - The unique identifier of the file cabinet containing the document
    - Result:
        - `file` (File) - Local file downloaded from DocuWare

#### StampService.p.json

- **Signature**: addStamp(String, String, String, List<String>, String) -> annotations: com.docuware.dev.schema._public.services.platform.DocumentAnnotations
    - Input:
        - `configKey` (String) - REST client configuration key to identify the DocuWare server connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document where the stamp will be applied
        - `fileCabinetId` (String) - The unique identifier of the file cabinet where the document resides
        - `stampFieldValues` (List<String>) - Dynamic text values for stamp form fields (e.g., signer name, date, etc.)
        - `stampPassword` (String) - Optional password required to apply password-protected stamps
    - Result:
        - `annotations` (com.docuware.dev.schema._public.services.platform.DocumentAnnotations) - Document annotations after stamp application

#### TransferService.p.json

- **Signature**: moveDocument(String, String, String, String) -> result: com.docuware.dev.schema._public.services.platform.DocumentsQueryResult
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to move
        - `sourceFileCabinetId` (String) - The unique identifier of the source file cabinet containing the document
        - `targetFileCabinetId` (String) - The unique identifier of the target file cabinet to move the document into
    - Result:
        - `result` (com.docuware.dev.schema._public.services.platform.DocumentsQueryResult) - Result object containing the document query response

#### UpdateService.p.json

- **Signature**: updateDocumentIndexFields(String, String, String, List<com.axonivy.connector.docuware.connector.DocuWareProperty>) -> (none)
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `documentId` (String) - The unique identifier of the document to update
        - `fileCabinetId` (String) - The unique identifier of the file cabinet containing the document
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - List of DocuWare index field assignments to update
    - Result: (none)

#### UploadService.p.json

- **Signature**: uploadFileWithIndexFields(String, String, File, List<com.axonivy.connector.docuware.connector.DocuWareProperty>, String) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `fileCabinetId` (String) - The unique identifier of the file cabinet where the document should be uploaded
        - `file` (File) - Local file object whose content is uploaded to the selected DocuWare file cabinet
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - List of DocuWare index field assignments
        - `storeDialogId` (String) - Optional store dialog identifier used by DocuWare when storing the document
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document) - Created DocuWare document metadata

- **Signature**: uploadFileWithIndexFields(String, String, InputStream, String, List<com.axonivy.connector.docuware.connector.DocuWareProperty>, String) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Input:
        - `configKey` (String) - REST client configuration key identifying the DocuWare connection from rest-clients.yaml
        - `fileCabinetId` (String) - The unique identifier of the file cabinet where the document should be uploaded
        - `fileStream` (java.io.InputStream) - Input stream containing the binary file data to upload
        - `fileName` (String) - Filename to assign to the uploaded document
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - List of DocuWare index field assignments
        - `storeDialogId` (String) - Optional store dialog identifier used by DocuWare
    - Result:
        - `document` (com.docuware.dev.schema._public.services.platform.Document) - Created DocuWare document metadata

### Dialog Components

- For this market extension we do not provide any Dialog Components.

### Rest Clients

- **OpenAPI:** [DocuWare API specification](file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json)

### Web Services

- For this market extension we do not provide any Web Services.

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
