# DocuWare Konnektor

 [DocuWare](https://start.docuware.com/) bietet Cloud-basiertes Dokumenten-Management und Software zur Workflow-Automation. Damit lassen sich beliebige Geschäftsdokumente digitalisieren, revisionssicher archivieren und bearbeiten, um so die Kernprozesse deines Unternehmens zu optimieren.

**Der Axon Ivy DocuWare Konnektor ermöglicht eine effiziente Integration von DocuWare Funktionalitäten in Deine Prozessanwendungen**

Dieser Konnektor:

- minimiert deinen Integrationsaufwand: Nutze die Demoversion, die Beispiele für die API-Aufrufe enthält.
- basiert auf REST-Webservice-Technologien.
- ermöglicht dir den Zugriff auf grundlegende DocuWare-Funktionen.

## Demo

1. Upload a document to a DocuWare file cabinet.

Upload result

![demo-dialog](images/demo1.png)

![demo-dialog](images/demo2.png)

The uploaded file in Docuware dashboard.

![demo-dialog](images/demo3.png)

2. Provide a GUI to test some basic DocuWare calls.

![demo-dialog](images/demo4.png)

Get Organizations: click on Organizations button to get the organization id and automatically add to the request when upload file.

![demo-dialog](images/demo5.png)

Get File Cabinets: click on File Cabinets button to get the cabinet ID of the organization to locate which cabinet that the file will be uploaded.

![demo-dialog](images/demo6.png)

## Setup

Before any interactions between the Axon Ivy Engine and DocuWare services can be run, they have to be introducted to each other. This can be done as follows:

1. Get a DocuWare account and the DocuWare cloud `host-name`, `user-name`, `password` and `host-id` to use.

1. Override the global variables for `host-name`, `user-name`, `password` and `host-id` in the demo project as shown in the example below.

```
Variables:
  
  docuware-connector:
  
    host: <myhost>.docuware.cloud

    username: <myuser>
  
    # [password]
    password: <mypass>
    
    hostid: <mhostid>
```

3. DocuWare supports 3 ways to generate an Access Token from the Identity Service:

    3.a Request Token by Username & Password - GrantType is `password`
    
    3.b Request Token by a DocuWare Token - GrantType is `dwtoken`
    
    3.c Request Token by Username & Password (Trusted User) - GrantType is `trusted`

4. For GrantType is `dwtoken`, we must get a LoginToken. Please start the process startRequestALoginToken.ivp and follow the guide to generate a new LoginToken

If your REST URL does not follow the predefined REST URL pattern of this connector, you can change the URL in the Engine Cockpit. To change the URL in the Designer, you have to unpack the connector project and change it there.

Run `start.ivp` of the DocuWareDemo demo process to test your setup.


