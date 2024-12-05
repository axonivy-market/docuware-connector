# DocuWare Connector

[DocuWare](https://start.docuware.com/) offers cloud-based document management and workflow automation software. It can be used to digitize, archive and process any business documents in an audit-proof manner to optimize your company's core processes.

The Axon Ivy DocuWare connector enables efficient integration of DocuWare functionalities into your Axon Ivy process applications

This connector:

- minimizes your integration effort: use the demo version, which contains examples of the API calls.
- is based on REST web service technologies.
- gives you access to basic DocuWare functions.

## Demo

The **DocuWare Demo UI** provides the following functionalities to help manage documents in DocuWare:

### Features

1. **Document Retrieval**  
   Automatically fetch documents using the predefined **organization** and **filecabinetid** fields from the `variables.yaml` file.

   ![fetch-documents](images/fetch-documents.png)

2. **Document Viewing**  
   View documents directly within the interface using DocuWare’s document viewer.

   ![view-document](images/view-document.png)

3. **Edit Document Properties**  
   Modify document properties, including metadata and custom fields.

   ![edit-document-properties](images/edit-document-properties.png)

4. **Document Deletion**  
   Delete documents from the file cabinet.

   ![delete-document](images/delete-document.png)

### DocuWare Advanced Operations

In case you want to perform advanced operations with DocuWare, including uploading documents or testing API calls, please run the process named **Start some DocuWare calls**. This process will guide you through:

1. **Get Organizations**: Click the **Organizations** button to retrieve the organization ID. The system will automatically include this ID in subsequent requests.
2. **Get File Cabinets**: Click the **File Cabinets** button to fetch the cabinet ID of the selected organization. The cabinet ID determines where the file will be uploaded.
3. **Upload Document**: Select a file to upload to the chosen DocuWare file cabinet. You can verify the uploaded file on the DocuWare dashboard.

## Setup

Before any interactions between the Axon Ivy Engine and DocuWare services can be run, they have to be introducted to each other. This can be done as follows:

1. Get a DocuWare account and the DocuWare cloud `host`, `user-name`, and `password` to use.

2. Override the global variables for `host`, `username`, and `password` in the demo project as shown in the example below.

```
@variables.yaml@
```

3. DocuWare supports 3 ways to generate an Access Token from the Identity Service:

    3.a Request Token by Username & Password - GrantType is `password`
    
    3.b Request Token by a DocuWare Token - GrantType is `dwtoken`
    
    3.c Request Token by Username & Password (Trusted User) - GrantType is `trusted`

4. For GrantType is `dwtoken`, we must get a LoginToken. Please start the process startRequestALoginToken.ivp and follow the guide to generate a new LoginToken

If your REST URL does not follow the predefined REST URL pattern of this connector, you can change the URL in the Engine Cockpit. To change the URL in the Designer, you have to unpack the connector project and change it there.

Run `start.ivp` of the DocuWareDemo demo process to test your setup.

