# DocuWare Connector

Der DocuWare Connector integriert Axon Ivy mit DocuWare. Du kannst Dokumente hochladen, herunterladen, Metadaten aktualisieren und löschen sowie direkt aus deinen Prozessen mit DocuWare-File-Cabinets interagieren.

## Wichtigste Funktionen

- Dokumente hochladen und indexieren direkt aus Axon Ivy-Prozessen, dabei Metadaten und Dateiinhalte erhalten.
- Dokumente herunterladen und in prozessgesteuerte Dateiabläufe einbinden, inklusive Dateinamens-Extraktion und Binär-Download.
- Indexfelder und Metadaten von Dokumenten aktualisieren, um Datensätze mit Geschäftsprozessen synchron zu halten.
- Dokumente sicher aus konfigurierten File Cabinets entfernen, inklusive Berechtigungsprüfungen.
- Dokumente ein- und auschecken, um externe Verarbeitung zu ermöglichen und später wieder hochzuladen.
- Unterstützung für mehrere DocuWare-Instanzen über die konfigurierbare `docuwareConnector.defaultConfig`.

## Demo

Sieh dir die bereitgestellten Demos an: DocuWare Demo und Document Table. Die Demos zeigen typische Dokumentenoperationen wie das Durchsuchen von File Cabinets, Anzeigen von Dokumenten, Hochladen und Bearbeiten von Metadaten.

### Demo-Workflows

#### docuware-connector-demo (docuware-connector-demo)

##### DocuWare Demo
1. Starte die DocuWare Demo aus dem Demo-Menü.
2. Du siehst eine UI, die Organisationen und File Cabinets lädt; wähle eines aus, um fortzufahren.

![Organisationen laden](images/2-fetchorgas.png)

3. Öffne Dokumente in der Document Table, um Details anzuzeigen oder Metadaten zu bearbeiten.
4. Nutze die bereitgestellten Aktionen zum Hochladen, Bearbeiten von Eigenschaften oder Löschen von Dokumenten.
5. Optional: Wenn eine Docker-Bereitstellung konfiguriert ist, kannst du die Demo lokal ausführen.

##### Document Table
1. Starte die Document Table Demo aus dem Demo-Menü.
2. Wähle ein File Cabinet aus, um Dokumente zu laden.

![Dokumente laden](images/fetch-documents.png)

3. Überprüfe die Liste und klicke ein Dokument an, um Details anzuzeigen oder Metadaten zu bearbeiten.
4. Verwende die Filter, um Ergebnisse zu durchsuchen und zu aktualisieren.
5. Optional: Für große Datensätze konfiguriere die Download-Einstellungen.

##### Beispiel: Mit Dokumentabschnitten arbeiten
1. Starte den Workflow „Example: Work with document sections“ aus dem Demo-Menü.
2. Der Workflow zeigt Listing, Lesen, Herunterladen und Hochladen von Dokumentabschnitten.
3. Beobachte die Logdateien, um die Ergebnisse zu sehen und angehängte Dateien zu prüfen.

##### Beispiel: Mit Dialogen arbeiten
1. Starte den Workflow „Example: Work with dialogs“ aus dem Demo-Menü.
2. Der Workflow demonstriert das Abfragen von Dialogausdrücken und das Lesen der Ergebnisse.
3. Beobachte die Logs und die Dialog-UI.

##### Beispiel: Mit Index-Feldern arbeiten
1. Starte den Workflow „Example: Work with index fields“ aus dem Demo-Menü.
2. Der Workflow zeigt, wie Indexfeldwerte vorbereitet und hochgeladen werden.
3. Prüfe anschließend die Indexfelder des hochgeladenen Dokuments in der Document Table.

## Einrichtung

- **Rollen:** Everybody (konfiguriert in config/roles.xml)
- **OpenAPI:** Keine öffentlichen OpenAPI-Spezifikationen wurden von dieser Extension bereitgestellt.

### Variablen

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

### Authentifizierung

- Keine Informationen wurden für diesen Abschnitt geliefert.

## Komponenten

### Connector-Prozesse

#### CheckinService.p.json

- **checkOutToFileSystem(String configKey, String documentId, String fileCabinetId) -> file: File, error: ch.ivyteam.ivy.bpm.error.BpmError**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis:
        - `file` (File)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

- **checkInFromFileSystem(String configKey, String documentId, String fileCabinetId, String fileName, InputStream stream, com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters checkInParameters) -> document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `fileName` (String)
        - `stream` (java.io.InputStream)
        - `checkInParameters` (com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters)
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)

- **checkOutToFileSystemAsStream(String configKey, String documentId, String fileCabinetId) -> stream: java.io.InputStream, error: ch.ivyteam.ivy.bpm.error.BpmError, fileName: String**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis:
        - `stream` (java.io.InputStream)
        - `error` (ch.ivyteam.ivy.bpm.error.BpmError)
        - `fileName` (String)

- **checkInFromFileSystem(String configKey, String documentId, String fileCabinetId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

#### DeleteService.p.json

- **deleteDocument(String configKey, String documentId, String fileCabinetId) -> (none)**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis: (none)

#### DownloadService.p.json

- **getDocument(String configKey, String documentId, String fileCabinetId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

- **downloadFile(String configKey, String documentId, String fileCabinetId) -> file: File**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
    - Ergebnis:
        - `file` (File)

#### UpdateService.p.json

- **updateDocument(String configKey, String documentId, String fileCabinetId, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields) -> documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields**
    - Eingabe:
        - `configKey` (String)
        - `documentId` (String)
        - `fileCabinetId` (String)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
    - Ergebnis:
        - `documentIndexFields` (com.docuware.dev.schema._public.services.platform.DocumentIndexFields)

#### UploadService.p.json

- **uploadFileWithIndexFields(String configKey, String fileCabinetId, File file, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields, String storeDialogId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Eingabe:
        - `configKey` (String)
        - `fileCabinetId` (String)
        - `file` (File)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
        - `storeDialogId` (String)
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

- **uploadFileWithIndexFields(String configKey, String fileCabinetId, java.io.InputStream fileStream, String fileName, List<com.axonivy.connector.docuware.connector.DocuWareProperty> indexFields, String storeDialogId) -> document: com.docuware.dev.schema._public.services.platform.Document**
    - Eingabe:
        - `configKey` (String)
        - `fileCabinetId` (String)
        - `fileStream` (java.io.InputStream)
        - `fileName` (String)
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>)
        - `storeDialogId` (String)
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document)

### Formular-Komponenten

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

### Maven-Artefakte

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
