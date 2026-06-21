# DocuWare Connector

Der DocuWare Connector integriert DocuWare-Dokumentverwaltung mit Axon Ivy und ermöglicht nahtlose Dokumentworkflows direkt aus Ihren Axon Ivy-Prozessen.

![DocuWare Demo](images/docuwaredemo.png)

Mit diesem Connector kannst du deine Dokumente und Dokumentworkflows programmgesteuert verwalten – Dateien mit Metadaten hochladen, Dokumente herunterladen, Aktenschränke abfragen, Stempel und Signaturen anwenden und Dokumente zwischen Aktenschränken übertragen – alles mit einfachen aufrufbaren Unterprozessen, die sich nativ in deine Ivy-Anwendungen integrieren.

**Wichtigste Funktionen**

- **Dokumentverwaltung** – Lade Dateien mit Index-Feldmetadaten hoch und verwalte Dokumente programmgesteuert
- **Dokumentabruf** – Lade Dokumente herunter und rufe sie bei Bedarf aus DocuWare-Aktenschränken ab
- **Metadatenvorgänge** – Abfrage und Aktualisierung von Dokumenteigenschaften und Indexfeldern in DocuWare
- **Dokumentorganisation** – Übertrage Dokumente zwischen Aktenschränken und lösche unerwünschte Dokumente
- **Stempel & Signatur** – Wende vordefinierte Stempel und Anmerkungen programmgesteuert auf Dokumente an
- **Konfigurationsflexibilität** – Unterstützung mehrerer DocuWare-Serverkonfigurationen mit flexibler Authentifizierung (Passwort, vertraut, tokenbasiert)

## Demo

Der DocuWare Connector umfasst zwei Demo-Workflows, die gängige Dokumentverwaltungsszenarien demonstrieren. Starten Sie die Demo, um zu sehen, wie Sie DocuWare-Dokumentvorgänge in Ihre Ivy-Prozesse integrieren.

![Demo Startbildschirm](images/1-startdemo.png)

### Demo-Workflows

##### DocuWare Demo

1. Starten Sie den DocuWare Demo-Prozess aus dem Demo-Menü
2. Sie sehen einen UI-Dialog, der grundlegende Dokumentverwaltungsvorgänge demonstriert

![DocuWare UI](images/2-fetchorgas.png)

3. Die Demo lädt Organisationen und Aktenschränke von Ihrem konfigurierten DocuWare-Server
4. Führen Sie Vorgänge aus, z. B. Abfragen von Dokumenten oder Anzeigen verfügbarer Aktenschränke
5. Überprüfen Sie die Ergebnisse und beobachten Sie, wie der Connector REST-API-Aufrufe an DocuWare ausführt

##### Dokumententabelle

1. Starten Sie die Dokumententabelle Demo aus dem Demo-Menü
2. Sie sehen eine Tabellenoberfläche mit Dokumenten aus Ihrem DocuWare-Aktenschrank

![Dokumententabelle Demo](images/6-tabledemo.png)

3. Wählen Sie ein Dokument aus, um seine Eigenschaften und Metadaten anzuzeigen
4. Führen Sie Vorgänge aus, z. B. das Herunterladen des Dokuments oder das Bearbeiten seiner Indexfelder
5. Überprüfen Sie Änderungen und bestätigen Sie erfolgreiche Dokumentvorgänge

##### Download-Workflow-Beispiel

1. Starten Sie das Download-Workflow-Beispiel aus dem Demo-Menü
2. Geben Sie die Dokument-ID und die Aktenschrank-ID an

![Dokument herunterladen](images/4-downloaddocument.png)

3. Der Workflow ruft das Dokument von DocuWare ab und hängt es an einen Ivy-Fall an
4. Sie sehen eine Bestätigungsmeldung mit dem Dokumentnamen
5. Greifen Sie auf das angehängte Dokument über die Dokumentverwaltungsschnittstelle des Falls zu

## Einrichtung

- **Rollen:** Everybody (konfiguriert in config/roles.xml)
- **OpenAPI:** Spezifikations-URL
- **REST-Client-Konfiguration:** Der Connector verwendet die DocuWare-REST-API (OpenAPI-Spezifikation), die in der Konfiguration rest-clients.yaml definiert ist

1. **Installieren Sie den Connector** – Fügen Sie das Artefakt docuware-connector über Maven zu Ihrem Ivy-Projekt hinzu
2. **Konfigurieren Sie die DocuWare-Verbindung** – Bearbeiten Sie `config/rest-clients.yaml` und legen Sie die DocuWare-Server-URL und API-Anmeldeinformationen in der REST-Client-Konfiguration `DocuWare` fest
3. **Wählen Sie Authentifizierung** – Wählen Sie Ihre bevorzugte Authentifizierungsmethode (Passwort, vertraut oder tokenbasiert), indem Sie die Variable `grantType` in `config/variables.yaml` konfigurieren
4. **Geben Sie Anmeldeinformationen an** – Speichern Sie Ihren DocuWare-Benutzernamen und -Passwort (oder Token) in der Konfiguration, verschlüsselt aus Sicherheitsgründen
5. **Optional: Multi-Umgebungs-Setup** – Erstellen Sie umgebungsspezifische `variables.yaml`-Dateien in Unterverzeichnissen, wenn Sie verschiedene Konfigurationen für Entwicklung, Staging und Produktion benötigen
6. **Verbindung überprüfen** – Führen Sie einen der Demo-Workflows aus, um zu bestätigen, dass Ihre DocuWare-Serververbindung funktioniert
7. **Aufrufbare Subprozesse integrieren** – Rufen Sie die aufrufbaren Subprozesse des DocuWare Connectors aus Ihren eigenen Prozessen auf, um Dokumente hochzuladen, herunterzuladen, abzufragen oder zu aktualisieren

### Variablen

```
@variables.yaml@
```

## Komponenten

### Aufrufbare Subprozesse

#### CheckinService.p.json

- **Signatur**: checkOutToFileSystem(String, String, String) -> file: File
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des herunterzuladenden Dokuments
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, der das Dokument enthält
    - Ergebnis:
        - `file` (File) - Von DocuWare heruntergeladene lokale Datei

- **Signatur**: checkOutToFileSystem(String, String, String, Boolean) -> file: File
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des herunterzuladenden Dokuments
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, der das Dokument enthält
        - `checkOutAsStream` (Boolean) - Flag zum Bestimmen, ob als Stream oder Datei ausgecheckt werden soll
    - Ergebnis:
        - `file` (File) - Von DocuWare heruntergeladene lokale Datei

#### DeleteService.p.json

- **Signatur**: deleteDocument(String, String, String) -> (keine)
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des zu löschenden Dokuments
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, der das Dokument enthält
    - Ergebnis: (keine)

#### DownloadService.p.json

- **Signatur**: downloadFile(String, String, String) -> file: File
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des herunterzuladenden Dokuments
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, der das Dokument enthält
    - Ergebnis:
        - `file` (File) - Von DocuWare heruntergeladene lokale Datei

#### StampService.p.json

- **Signatur**: addStamp(String, String, String, List<String>, String) -> annotations: com.docuware.dev.schema._public.services.platform.DocumentAnnotations
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Serververbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des Dokuments, auf das der Stempel angewendet wird
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, in dem sich das Dokument befindet
        - `stampFieldValues` (List<String>) - Dynamische Textwerte für Stempelformularfelder (z. B. Name des Unterzeichners, Datum usw.)
        - `stampPassword` (String) - Optionales Passwort zum Anwenden passwortgeschützter Stempel
    - Ergebnis:
        - `annotations` (com.docuware.dev.schema._public.services.platform.DocumentAnnotations) - Dokumentanmerkungen nach Stempelanwendung

#### TransferService.p.json

- **Signatur**: moveDocument(String, String, String, String) -> result: com.docuware.dev.schema._public.services.platform.DocumentsQueryResult
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des zu verschiebenden Dokuments
        - `sourceFileCabinetId` (String) - Eindeutige Kennung des Quellaktenschranks, der das Dokument enthält
        - `targetFileCabinetId` (String) - Eindeutige Kennung des Zielaktenschranks, in den das Dokument verschoben werden soll
    - Ergebnis:
        - `result` (com.docuware.dev.schema._public.services.platform.DocumentsQueryResult) - Ergebnisobjekt mit der Dokumentabfrageantwort

#### UpdateService.p.json

- **Signatur**: updateDocumentIndexFields(String, String, String, List<com.axonivy.connector.docuware.connector.DocuWareProperty>) -> (keine)
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `documentId` (String) - Eindeutige Kennung des zu aktualisierenden Dokuments
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, der das Dokument enthält
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - Liste der zu aktualisierenden DocuWare-Indexfeld-Zuweisungen
    - Ergebnis: (keine)

#### UploadService.p.json

- **Signatur**: uploadFileWithIndexFields(String, String, File, List<com.axonivy.connector.docuware.connector.DocuWareProperty>, String) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, in den das Dokument hochgeladen werden soll
        - `file` (File) - Lokales Dateiobjekt, dessen Inhalt in den ausgewählten DocuWare-Aktenschrank hochgeladen wird
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - Liste der DocuWare-Indexfeld-Zuweisungen
        - `storeDialogId` (String) - Optionale Speicherdialog-Kennung, die DocuWare beim Speichern des Dokuments verwendet
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document) - Erstellte DocuWare-Dokumentmetadaten

- **Signatur**: uploadFileWithIndexFields(String, String, InputStream, String, List<com.axonivy.connector.docuware.connector.DocuWareProperty>, String) -> document: com.docuware.dev.schema._public.services.platform.Document
    - Eingabe:
        - `configKey` (String) - REST-Client-Konfigurationsschlüssel zur Identifizierung der DocuWare-Verbindung aus rest-clients.yaml
        - `fileCabinetId` (String) - Eindeutige Kennung des Aktenschranks, in den das Dokument hochgeladen werden soll
        - `fileStream` (java.io.InputStream) - Eingabestrom mit den binären Dateidaten zum Hochladen
        - `fileName` (String) - Dateiname für das hochgeladene Dokument
        - `indexFields` (List<com.axonivy.connector.docuware.connector.DocuWareProperty>) - Liste der DocuWare-Indexfeld-Zuweisungen
        - `storeDialogId` (String) - Optionale Speicherdialog-Kennung, die DocuWare beim Speichern des Dokuments verwendet
    - Ergebnis:
        - `document` (com.docuware.dev.schema._public.services.platform.Document) - Erstellte DocuWare-Dokumentmetadaten

### Dialog-Komponenten

- Für diese Markterweiterung stellen wir keine Dialog-Komponenten bereit.

### Rest-Clients

- **OpenAPI:** [DocuWare API-Spezifikation](file:///X:/AxonIvy/marketplace/docuware/openapi-handmade.json)

### Webdienste

- Für diese Markterweiterung stellen wir keine Webdienste bereit.

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
