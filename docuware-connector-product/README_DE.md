# DocuWare Connector

DocuWare ist eine cloud- und lokal (On‑Premises) einsetzbare Plattform zur Dokumentenverwaltung, mit der du Geschäftsdokumente digitalisierst, archivierst und verarbeitest. Dieser Connector integriert DocuWare in Axon Ivy Process‑Anwendungen und ermöglicht dir, Dokumente direkt aus deinen Prozessen heraus zu durchsuchen, anzusehen, herunterzuladen, hochzuladen und zu indexieren.

**DocuWare Organization**  
Eine DocuWare‑Organisation ist die oberste Mandantenebene in DocuWare. Sie stellt eine isolierte Umgebung dar, die Benutzer, Rollen, Konfigurationen und alle Dokumenten‑Repositorys der Organisation enthält.

**File Cabinet**  
Ein File Cabinet ist ein Dokumenten‑Repository innerhalb einer Organisation. Es speichert Dokumente zusammen mit indizierten Metadaten (z. B. Rechnungsnummer, Datum, Lieferant) und erlaubt Suchen, Speichern und Abrufen von Dokumenten.

**Connector Capability**  
Dieser Connector erlaubt dir, mehrere DocuWare‑Organisationen (mit jeweils mehreren File Cabinets) in einer einzigen Konfiguration zu verbinden. So kannst du Dokumente über mehrere DocuWare‑Instanzen hinweg abrufen und verwalten. Der Connector erleichtert die Integration von DocuWare‑Funktionen in deine Axon Ivy‑Prozesse.

### Wichtigste Funktionen
- Verbinde mehrere DocuWare‑Organisationen und File Cabinets aus einer einzigen Axon Ivy‑Anwendung.
- Durchsuche, finde, zeige in der Vorschau und lade Dokumente herunter – über integrierte REST‑Clients und einen eingebetteten Viewer.
- Lade Dokumente hoch und checke sie ein; unterstütze Indexfelder und das Erstellen neuer Dokumentversionen.
- Nutze mehrere Authentifizierungsmodi (`password`, `trusted`, `dwtoken`) und sichere Einbettung über konfigurierbare Passphrasen und Tokens.
- Stelle Hilfsfunktionen für Parameter‑Verschlüsselung, Cache‑Verwaltung und komfortable JSON‑Abbildung von DocuWare‑Objekten bereit.

## Demo
### DocuWare Basic Demo: Organisationen, File Cabinets und Dokumente abrufen

1. Starte den DocuWare‑Demo‑Prozess:
   
![Demo starten](images/1-startdemo.png)

Die DocuWare‑Demo bietet eine GUI, um verschiedene DocuWare‑Konfigurationen zu testen. Um alle Demo‑Funktionen zu nutzen, müssen mehrere Konfigurationen mit unterschiedlichen Grant‑Typen in `variables.yaml` vorhanden sein. Für eine einfache Demo (Benutzername/Passwort) genügt eine `defaultConfig`.

#### Organisationen abrufen 
![Organisationen abrufen](images/2-fetchorgas.png)

Wenn alles funktioniert hat, siehst du `Response: Status: OK` im Textfeld unter den Buttons. Es kann so aussehen:
```
Response: Status: OK

Headers
=======
Content-Type: application/xml; charset=utf-8
Date: Fri, 06 Mar 2026 03:57:13 GMT
Cache-Control: max-age=0, private
Set-Cookie: dwingressplatform=1772769434.007.32.96427|a8466521666073443d68d0f15f64584f; Path=/; Secure; HttpOnly
Transfer-Encoding: chunked
Vary: Cookie,Accept,Accept-Encoding
Strict-Transport-Security: max-age=31536000; includeSubDomains; preload
Server-Timing: proxy-start;dur=1.5

```
#### File Cabinets abrufen
Wenn du auf "Fetch File Cabinets" klickst, werden zusätzliche Buttons (Funktionen) verfügbar.

![File Cabinets anzeigen](images/3-fetchcabinets.png)

In deinem Log findest du dann eine Liste verfügbarer File Cabinets; sie könnte so aussehen:

```
File Cabinets:
Size: 5
Id: 4b4be7af-629f-4340-82cb-126d249d2b95 - 'Awesome Filecabinet'
Id: 90b4f666-b79f-4d26-97f7-7786d8fbe4c2 - 'TEST Filecabinet'
Id: 94532ab8-a22f-4b70-a15d-ba44d916bd45 - 'Archive Cabinet'
Id: wdss996-b61c-4b4b-88fd-e506a58156278 - 'Src'
Id: 43sfsdfb137-c5a8-4ab-ae73-715e7c360f - 'Not important'
```

Wähle ein File Cabinet aus und kopiere die ID in die UI.

![File Cabinet auswählen](images/7-filecabinet.png)

#### Dokumente abrufen & herunterladen
![Dokument herunterladen](images/4-downloaddocument.png)

Zum Abrufen und Herunterladen eines Dokuments klicke auf "Fetch Documents" (1), um die verfügbaren Dokumente im Log anzuzeigen. Du bekommst eine Liste wie diese:

```
Documents:
Size: 4
Id: 11 - 'Hello World'
Id: 10 - 'Bla'
Id: 7 - 'Umlaut.äöüÄÖÜß'
Id: 6 - 'Bla'
```

Merke dir die ID des gewünschten Dokuments und gib sie in die UI ein (2). Mit "Download Document" (3) kannst du die Datei herunterladen.

#### Weitere Funktionen
- Nutze verschiedene Konfigurationen (z. B. unterschiedliche Grant‑Typen)
- Hole Dokumentfelder ab
- Lade ein Dokument herunter
- Erstelle eine neue Version eines Dokuments
- Hänge ein Dokument an einen Ivy‑Case an
- Lade Dokumente hoch
- Lade Dokumente mit Indexfeldern hoch
- Zeige Dateien im eingebetteten DocuWare‑Viewer (wenn `integrationPassphrase` gesetzt ist und deine DocuWare‑Installation das Einbetten in Frames erlaubt — kontrolliere die CSP!)
- Verschlüssele und entschlüssele Parameter für die Einbettung


### Zweite Demo: Document Table

Stelle sicher, dass du eine `fileCabinetId` in `variables.yaml` konfiguriert hast. Du kannst die File Cabinet IDs mit der ersten Demo ermitteln.

```
  # Variables used by the demo.
  docuwareWorkflow:
    fileCabinetId: ""
```

Starte den Prozess **Document Table**, um einen einfachen Viewer zu öffnen, der zeigt, wie du Dokumente hinzufügst, änderst, ansiehst und löschst. 

![Second demo starten](images/5-startseconddemo.png)

Die Benutzeroberfläche öffnet sich:

![Tabellen‑Demo](images/6-tabledemo.png)

**Dokument‑Vorschau**

Die Vorschau von Dokumenten kann zusätzliche CSP‑Konfiguration (Content Security Policy) in DocuWare erfordern, damit DocuWare‑Frames in Axon Ivy‑Frames eingebettet werden dürfen.

![Dokument anzeigen](images/view-document.png)

**Eigenschaften bearbeiten**  
Ändere Dokument‑Metadaten und benutzerdefinierte Felder.

   ![Eigenschaften bearbeiten](images/edit-document-properties.png)

**Dokument löschen**  
Lösche Dokumente aus dem File Cabinet.

   ![Dokument löschen](images/delete-document.png)





## Einrichtung
Kopiere `variables.yaml` in dein Projekt.

```
@variables.yaml@
```

Mindestens `url`, `username` und `password` müssen gesetzt sein.

### `configId`

Ein Wert, der diese Version der Konfiguration identifiziert.

### `inherit`

Fehlende, leere oder blanke Werte in der aktuellen Konfiguration werden rekursiv in der referenzierten Konfiguration nachgeschlagen.

### `grantType`

Der Grant‑Typ deiner Konfiguration. Mögliche Werte: `password`, `trusted`, `dwtoken`.

#### `password`

`password` nutzt festen `username` und `password`. Alle Operationen laufen mit diesem Nutzerkonto; der Verlauf zeigt diesen Nutzer an. Das ist eine einfache Einrichtung für technische Nutzer.

#### `trusted`

`trusted` verwendet einen Benutzername/Passwort‑Eintrag, um sich als vertrauenswürdiger Benutzer anzumelden (nur On‑Premise). Der vertrauenswürdige Nutzer wird zur Impersonation genutzt. Welcher Nutzer impersoniert wird, konfigurierst du über die globale Variable `impersonateUser`.

`impersonateUser` unterstützt mehrere syntaktische Varianten:
- Verwende einen konstanten Benutzernamen in allen Situationen
- Verwende konstante Namen für anonymous/system, aber den Ivy‑Benutzernamen für andere
- Setze den Benutzernamen in der Session vor dem Aufruf und verwende ihn dann

Weitere Details stehen in `variables.yaml`.

#### `dwtoken`

Der Token wird aus einem vorhandenen DocuWare‑Token erzeugt. Hinweis: dieser Anwendungsfall ist möglicherweise nicht komplett unterstützt. Welcher Token verwendet wird, konfigurierst du über `dwToken`. Derzeit kann ein bestehender Token nur aus der Session geladen werden.

### Weitere Konfigurationsvariablen
Weitere Variablen sind in den vom Connector unterstützten Variablen dokumentiert. Kopiere sie in dein Projekt, wenn du sie verwendest, damit sie im Engine‑Cockpit sichtbar sind.

```
@variables.yaml@
```

### Einzelne DocuWare‑Instanz
Arbeitest du nur mit einer Instanz, nenne sie `defaultConfig`; sie wird automatisch verwendet.

### Mehrere DocuWare‑Instanzen gleichzeitig
Bei mehreren Instanzen muss jeder Aufruf wissen, welche Instanz verwendet werden soll. Daher haben die instanz‑spezifischen Subprozesse einen Parameter `configKey`, der den Namen der zu verwendenden Konfiguration angibt. Ist `configKey` leer, wird `defaultConfig` verwendet.

Möchtest du REST‑Aufrufe des Connectors direkt nutzen, verwende ebenfalls die `configKey`‑Eigenschaft.

### Breaking changes in this version
- Globale Variablenkonfiguration wurde geändert, um mehrere Instanzen zu unterstützen.
- Standardwerte für File Cabinets in globalen Variablen wurden entfernt; verschiebe solche Defaults bei Bedarf in dein Projekt.
- Die Fehlerbehandlung wirft jetzt Standard‑AxonIvy‑Ausnahmen anstelle der Rückgabe von Fehlerobjekten.

## Komponenten

### Exponierte CALLABLE_SUB‑Prozesse

#### docuware-connector/processes/CheckinService.p.json
- Signature: checkOutToFileSystem
  Input: configKey: String, documentId: String, fileCabinetId: String
  Result: file: File, error: ch.ivyteam.ivy.bpm.error.BpmError

- Signature: checkInFromFileSystem
  Input: configKey: String, documentId: String, fileCabinetId: String, checkInParameters: com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters, file: File
  Result: document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError

- Signature: checkOutToFileSystemAsStream
  Input: configKey: String, documentId: String, fileCabinetId: String
  Result: stream: java.io.InputStream, error: ch.ivyteam.ivy.bpm.error.BpmError, fileName: String

- Signature: checkInFromFileSystem
  Input: configKey: String, documentId: String, fileCabinetId: String, fileName: String, stream: java.io.InputStream, checkInParameters: com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters
  Result: document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError

#### docuware-connector/processes/DeleteService.p.json
- Signature: deleteDocument
  Input: configKey: String, documentId: String, fileCabinetId: String
  Result: none

#### docuware-connector/processes/DownloadService.p.json
- Signature: getDocument
  Input: configKey: String, documentId: String, fileCabinetId: String
  Result: document: com.docuware.dev.schema._public.services.platform.Document

- Signature: downloadFile
  Input: configKey: String, documentId: String, fileCabinetId: String
  Result: file: File

#### docuware-connector/processes/UpdateService.p.json
- Signature: updateDocument
  Input: configKey: String, documentId: String, fileCabinetId: String, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>
  Result: documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields

#### docuware-connector/processes/UploadService.p.json
- Signature: uploadFileWithIndexFields
  Input: configKey: String, fileCabinetId: String, file: File, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>, storeDialogId: String
  Result: document: com.docuware.dev.schema._public.services.platform.Document

- Signature: uploadFileWithIndexFields
  Input: configKey: String, fileCabinetId: String, fileStream: java.io.InputStream, fileName: String, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>, storeDialogId: String
  Result: document: com.docuware.dev.schema._public.services.platform.Document

### Formular‑Komponenten

UI dialog name: RequestLoginToken
- namespace: com.axonivy.market.docuware.connector.RequestLoginToken
- start parameter: start()
- main feature/logic: Requests a DocuWare LoginToken using username and password; displays the token for copy/backup and updates an Ivy variable on success.

### Open API resources

- No public OpenAPI specs are available for this product.

### Maven artifacts

1.docuware-connector
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector</artifactId>
  <type>iar</type>
</dependency>

2.docuware-connector-demo
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector-demo</artifactId>
  <type>iar</type>
</dependency>
