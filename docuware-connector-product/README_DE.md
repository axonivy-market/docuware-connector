# DocuWare Connector

Der DocuWare-Connector integriert DocuWare in Axon Ivy und ermöglicht dir, Dateien hoch- und herunterzuladen, zu durchsuchen sowie Dokumente und Metadaten direkt aus deinen Prozessen zu verwalten.

![DocuWare Demo](images/docuwaredemo.png)

## Wichtigste Funktionen

- Lade Dateien hoch und füge optional Indexfelder hinzu, um Metadaten in DocuWare zu speichern.
- Lade Dokumente und Dateiinhalte zum Verarbeiten oder Speichern herunter.
- Checke Dokumente in bzw. aus dem Dateisystem ein/aus — unterstützt Streams und Dateien.
- Aktualisiere Indexfelder und Metadaten von Dokumenten programmatisch.
- Lösche Dokumente in DocuWare direkt aus deinen Prozessen.
- Suche und rufe Dokumentmetadaten über konfigurierte REST-Clients ab.

## Demo

Sieh dir die Demo-Implementierungen an: DocuWare Demo und Document Table. Diese Demos zeigen, wie du Dokumente hoch- und herunterladen, Dokumenttabellen anzeigen und Metadaten aktualisieren kannst.

### Demo Workflows

#### DocuWare Demo (docuware-connector-demo)

##### DocuWare Demo

1. Starte die DocuWare Demo über das Demo-Menü oder Dashboard.
2. Du siehst eine einfache Oberfläche, die DocuWare-Aufrufe wie das Laden von Organisationen und Dateiablagen demonstriert.
3. Nutze die Steuerelemente, um Organisationen zu laden, wähle eine Dateiablage und frage Dokumente ab.
4. Öffne oder zeige Dokumente an und führe Aktionen wie Herunterladen oder Aktualisieren aus.

#### Document Table (docuware-connector-demo)

##### Document Table

1. Starte die Document Table Demo über das Demo-Menü.
2. Eine Tabelle zeigt Dokumente aus der ausgewählten Dateiablage an.
3. Wähle ein Dokument aus, um Details anzuzeigen, Indexfelder zu bearbeiten oder die Datei herunterzuladen.

## Einrichtung

- **Rollen:** Everybody (konfiguriert in config/roles.xml)
- **OpenAPI:** file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json

### Variablen

```yaml
@variables.yaml@
```

## Komponenten

### Aufrufbare Teilprozesse

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
        - `configKey` (String) 
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Result:
        - `file` (File)

#### UpdateService.p.json

- **Signature**: updateDocument(String configKey, String documentId, String fileCabinetId, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields) -> documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields
    - Input:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
    - Result:
        - `documentIndexFields` (com.docuware.dev.schema._public.services.platform.DocumentIndexFields)

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

### Dialogkomponenten

#### RequestLoginToken

- **Namespace:** com.axonivy.market.docuware.connector.RequestLoginToken
- **Component type:** UI dialog
- **Felder:** - (keine)
- **Purpose:** Fordere ein Login-Token an, um dich über die Benutzeroberfläche bei DocuWare zu authentifizieren.

### Web-Services

- Spec URL: file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json

### Maven-Artefakte

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
