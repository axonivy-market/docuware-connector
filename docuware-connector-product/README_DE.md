# DocuWare Connector

DocuWare ist eine cloud- und On-Premises-Dokumentenmanagement-Plattform, mit der du Geschäftsdokumente digitalisierst, archivierst und verarbeitest. Dieser Connector integriert DocuWare in Axon Ivy-Prozessanwendungen und ermöglicht dir, Dokumente direkt aus deinen Prozessen zu durchsuchen, anzusehen, herunterzuladen, hochzuladen und zu indexieren.

**DocuWare-Organisation**  
Eine *DocuWare-Organisation* ist der oberste Mandant in DocuWare. Sie stellt eine isolierte Umgebung dar, die Benutzer, Rollen, Konfigurationen und alle Dokumentenablagen der Organisation enthält.

**Dateiablage**  
Eine *Dateiablage* ist ein Dokumenten-Repository innerhalb einer Organisation. Sie speichert Dokumente zusammen mit ihren indexierten Metadaten (Felder wie Rechnungsnummer, Datum, Lieferant) und ermöglicht das Suchen, Speichern und Abrufen von Dokumenten.

**Funktionen des Connectors**  
Dieser Connector ermöglicht es dir, **mehrere DocuWare-Organisationen**, die jeweils **mehrere Dateiablagen** enthalten, in einer einzigen Konfiguration zu verbinden. So kannst du Dokumente über mehrere DocuWare-Umgebungen hinweg zugreifen und verwalten. Er erlaubt die effiziente Integration von DocuWare-Funktionen in deine **Axon Ivy Prozessanwendungen**.

### Wichtigste Funktionen
- Verbinde mehrere DocuWare-Organisationen und Dateiablagen aus einer einzigen Axon Ivy-Anwendung.
- Durchsuche, finde, zeige eine Vorschau an und lade Dokumente herunter über integrierte REST-Integrationen und einen eingebetteten Viewer.
- Lade Dokumente hoch und checke sie ein; unterstützt Indexfelder und das Erstellen neuer Dokumentversionen.
- Unterstützt verschiedene Authentifizierungsmodi (username/password, trusted, token) sowie sicheres Einbetten mittels konfigurierbarer Passphrasen und Tokens.
- Bietet Hilfsfunktionen für Parameter-Verschlüsselung, Cache-Management und bequeme JSON-Abbildung von DocuWare-Objekten.

## Demo
### DocuWare-Grunddemo: Abrufen von Organisationen, Dateiablagen und Dokumenten

1. Starte den DocuWare-Demo-Prozess:
   
![Demo-Prozess starten](images/1-startdemo.png)

Die DocuWare-Demo stellt eine GUI bereit, mit der du verschiedene DocuWare-Konfigurationen testen kannst. Um alle Demo-Funktionen zu nutzen, müssen mehrere Konfigurationen mit unterschiedlichen Grant-Types in `variables.yaml` hinterlegt sein. **Für eine einfache Demo (Benutzername und Passwort): gib einfach eine defaultConfig an**.

#### Organisationen abrufen
![Organisationen abrufen](images/2-fetchorgas.png)

Wenn alles geklappt hat, siehst du `Response: Status: OK` im Textfeld unter den Buttons. Es könnte so aussehen:
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
#### Dateiablagen abrufen
Wenn du auf "Fetch File Cabinets" klickst, werden mehrere zusätzliche Schaltflächen (Features) verfügbar.

![Dateiablagen abrufen](images/3-fetchcabinets.png)

Du erhältst am Ende deines Log-Fensters eine Liste verfügbarer Dateiablagen. Sie könnte so aussehen:

```
File Cabinets:
Size: 5
Id: 4b4be7af-629f-4340-82cb-126d249d2b95 - 'Awesome Filecabinet'
Id: 90b4f666-b79f-4d26-97f7-7786d8fbe4c2 - 'TEST Filecabinet'
Id: 94532ab8-a22f-4b70-a15d-ba44d916bd45 - 'Archive Cabinet'
Id: wdss996-b61c-4b4b-88fd-e506a58156278 - 'Src'
Id: 43sfsdfb137-c5a8-4ab-ae73-715e7c360f - 'Not important'
```

Wähle eine Dateiablage aus, die du näher untersuchen möchtest, und kopiere ihre ID in die Oberfläche.

![Dateiablage auswählen](images/7-filecabinet.png)

#### Dokumente abrufen & herunterladen
![Dokument herunterladen](images/4-downloaddocument.png)

Um ein Dokument abzurufen und herunterzuladen, klicke auf "Fetch Documents" (1), um eine Liste verfügbarer Dokumente im Log-Viewer zu erhalten. Du bekommst eine Liste, die so aussehen kann:

```
Documents:
Size: 4
Id: 11 - 'Hello World'
Id: 10 - 'Bla'
Id: 7 - 'Umlaut.äöüÄÖÜß'
Id: 6 - 'Bla'
```
Merke dir die ID des Dokuments, das du näher betrachten möchtest, und gib sie in die UI ein (2). Mit "Download Document" (3) kannst du dann das zu dieser ID gehörende Dokument herunterladen.

#### Weitere Funktionen
- Unterstütze verschiedene Konfigurationen, z. B. für unterschiedliche Grant-Types
- Rufe Dokumentenfelder ab
- Lade ein Dokument herunter
- Erstelle eine neue Dokumentversion
- Hänge ein Dokument an einen Ivy-Fall an
- Lade ein Dokument hoch
- Lade ein Dokument mit Indexfeldern hoch
- Zeige Dateien im eingebetteten DocuWare-Viewer an (falls die Konfiguration `integrationPassphrase` gesetzt ist und deine DocuWare-Installation das Einbetten in ein Frame erlaubt – prüfe die Content-Security-Policy deiner DocuWare!)
- Verschlüssele und entschlüssele Parameter für das Einbetten


### Zweite Demo: Dokumententabelle

Stelle sicher, dass du in `variables.yaml` eine Dateiablage-ID konfiguriert hast. Du kannst verfügbare Dateiablagen mit dem ersten Demo-Prozess abrufen (siehe oben).

```
  # Variables used by the demo.
  docuwareWorkflow:
    fileCabinetId: ""
```

Starte den Prozess **Document Table**, um einen einfachen Viewer zu öffnen, der zeigt, wie du Dokumente hinzufügst, änderst, ansiehst und löschst.

![Zweite Demo starten](images/5-startseconddemo.png)

Eine benutzerfreundliche Oberfläche öffnet sich:

![Tabellen-Viewer](images/6-tabledemo.png)

**Dokumentvorschau**

Beachte, dass die Vorschau von Dokumenten zusätzliche Konfiguration der Content-Security-Policy (CSP) deiner DocuWare-Installation erfordern kann, damit DocuWare-Frames in Axon Ivy-Frames eingebettet werden dürfen.

![Dokument ansehen](images/view-document.png)

**Bearbeiten von Dokumenteigenschaften**  
Ändere Dokumenteigenschaften, einschließlich Metadaten und benutzerdefinierter Felder.

   ![Dokumenteigenschaften bearbeiten](images/edit-document-properties.png)

**Dokument löschen**  
Lösche Dokumente aus der Dateiablage.

   ![Dokument löschen](images/delete-document.png)

## Einrichtung
Kopiere `variables.yaml` in dein Projekt.

```
@variables.yaml@
```

Mindestens `url`, `username` und `password` müssen gesetzt sein.

### `configId`
Jeder Wert, der diese Version der Konfiguration identifiziert.

### `inherit`
Jeder Wert, der in der aktuellen Konfiguration nicht existiert, leer oder blank ist, wird in der durch diese Variable referenzierten Konfiguration nachgeschlagen. Der Nachschlag erfolgt rekursiv.

### `grantType`
Das ist der Grant-Type für deine Konfiguration. Mögliche Werte sind `password`, `trusted` und `dwtoken`.

#### `password`
Der Grant-Type `password` verwendet einen festen `username` und `password`, um sich mit deiner DocuWare-Instanz zu verbinden. Alle Operationen werden mit diesem Benutzerkonto ausgeführt, und alle Historieneinträge zeigen diesen Benutzer. Es ist eine einfache Einrichtung, die einen _technischen Benutzer_ nutzt, um sich mit einer Cloud- oder On-Premise-DocuWare-Instanz zu verbinden.

#### `trusted`
Der Grant-Type `trusted` verwendet `username` und `password`, um sich als vertrauenswürdiger Benutzer mit deiner DocuWare-Instanz zu verbinden. Derzeit unterstützt DocuWare vertrauenswürdige Benutzer nur für On-Premise-Installationen. Der vertrauenswürdige Benutzer wird nicht direkt verwendet, sondern impersoniert einen anderen Benutzer. Welcher Benutzer impersoniert werden soll, lässt sich über die globale Variable `impersonateUser` konfigurieren.

`impersonateUser` implementiert eine spezielle Syntax, mit der definiert wird, welcher Benutzer für Zugriffe durch den anonymen Ivy-Benutzer, den System-Ivy-Benutzer und andere Ivy-Benutzer verwendet werden soll:

- Verwende in allen Situationen einen konstanten Benutzernamen
- Verwende konstante Benutzernamen für anonyme und System-Benutzer, aber den Ivy-Benutzernamen für andere
- Setze den Benutzernamen in der Session des Benutzers, bevor du Aufrufe machst, und verwende diesen Namen

Weitere Dokumentation findest du in der Datei `variables.yaml`.

#### `dwtoken`
Das Token wird aus einem vorhandenen DocuWare-Token erzeugt. Hinweis: Dieser Anwendungsfall ist wahrscheinlich nicht vollständig unterstützt. Welches Token verwendet werden soll, wird in `dwToken` konfiguriert. Derzeit kann das vorhandene Token nur aus der Session geladen werden.

### Weitere Konfigurationsvariablen
Andere Konfigurationsvariablen sind direkt in den vom Connector unterstützten Variablen dokumentiert. Sieh dort nach für eine Beschreibung und kopiere sie in dein Projekt, falls du sie verwendest, damit sie im Engine-Cockpit deiner Anwendung sichtbar sind.

```
@variables.yaml@
```

### Verwendung einer einzelnen DocuWare-Instanz
Wenn du nur mit einer Instanz arbeitest, solltest du sie `defaultConfig` nennen; sie wird dann automatisch ohne weitere Einstellungen verwendet.

### Gleichzeitige Nutzung mehrerer DocuWare-Instanzen
Wenn du mit mehreren Instanzen arbeitest, muss jeder Aufruf wissen, welche Instanz verwendet werden soll. Daher bieten alle instanzspezifischen Subprozesse dieses Connectors einen zusätzlichen `configKey`-Parameter, der auf den Namen der zu verwendenden Konfiguration gesetzt werden muss. Ist `configKey` leer, wird automatisch `defaultConfig` verwendet.

Wenn du REST-Aufrufe dieses Connectors direkt verwenden möchtest, kannst du die Eigenschaft `configKey` des Aufrufs auf dieselbe Weise nutzen. Schau dir die instanzbewussten Subprozesse an, um zu sehen, wie das gemacht wird!

### Wesentliche Änderungen in dieser Version

- Die globale Variablenkonfiguration wurde geändert, um mehrere Instanzen zu unterstützen.
- Standardwerte für Dateiablagen in den globalen Variablen wurden entfernt; verschiebe solche Defaults bei Bedarf in dein Projekt.
- Die Fehlerbehandlung wirft jetzt standardmäßige AxonIvy-Ausnahmen anstatt Fehlerobjekte zurückzugeben.

## Komponenten

### Verfügbare CALLABLE_SUB-Prozesse

#### docuware-connector/processes/CheckinService.p.json
- Signatur: checkOutToFileSystem
  Eingabe: configKey: String, documentId: String, fileCabinetId: String
  Ergebnis: file: File, error: ch.ivyteam.ivy.bpm.error.BpmError

- Signatur: checkInFromFileSystem
  Eingabe: configKey: String, documentId: String, fileCabinetId: String, checkInParameters: com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters, file: File
  Ergebnis: document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError

- Signatur: checkOutToFileSystemAsStream
  Eingabe: configKey: String, documentId: String, fileCabinetId: String
  Ergebnis: stream: java.io.InputStream, error: ch.ivyteam.ivy.bpm.error.BpmError, fileName: String

- Signatur: checkInFromFileSystem
  Eingabe: configKey: String, documentId: String, fileCabinetId: String, fileName: String, stream: java.io.InputStream, checkInParameters: com.axonivy.connector.docuware.connector.DocuWareCheckInActionParameters
  Ergebnis: document: com.docuware.dev.schema._public.services.platform.Document, error: ch.ivyteam.ivy.bpm.error.BpmError


#### docuware-connector/processes/DeleteService.p.json
- Signatur: deleteDocument
  Eingabe: configKey: String, documentId: String, fileCabinetId: String
  Ergebnis: none


#### docuware-connector/processes/DownloadService.p.json
- Signatur: getDocument
  Eingabe: configKey: String, documentId: String, fileCabinetId: String
  Ergebnis: document: com.docuware.dev.schema._public.services.platform.Document

- Signatur: downloadFile
  Eingabe: configKey: String, documentId: String, fileCabinetId: String
  Ergebnis: file: File


#### docuware-connector/processes/UpdateService.p.json
- Signatur: updateDocument
  Eingabe: configKey: String, documentId: String, fileCabinetId: String, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>
  Ergebnis: documentIndexFields: com.docuware.dev.schema._public.services.platform.DocumentIndexFields


#### docuware-connector/processes/UploadService.p.json
- Signatur: uploadFileWithIndexFields
  Eingabe: configKey: String, fileCabinetId: String, file: File, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>, storeDialogId: String
  Ergebnis: document: com.docuware.dev.schema._public.services.platform.Document

- Signatur: uploadFileWithIndexFields
  Eingabe: configKey: String, fileCabinetId: String, fileStream: java.io.InputStream, fileName: String, indexFields: List<com.axonivy.connector.docuware.connector.DocuWareProperty>, storeDialogId: String
  Ergebnis: document: com.docuware.dev.schema._public.services.platform.Document

### Formular-Komponenten

UI-Dialogname: RequestLoginToken
- namespace: com.axonivy.market.docuware.connector.RequestLoginToken
- Start-Parameter: start()
- Hauptfunktion/-logik: Fordere einen DocuWare-LoginToken mit Benutzername und Passwort an; zeige das Token zur Kopie/Sicherung an und aktualisiere bei Erfolg eine Ivy-Variable.

### OpenAPI-Ressourcen

- Es sind keine öffentlichen OpenAPI-Spezifikationen für dieses Produkt verfügbar.

### Maven-Artefakte

1.docuware-connector
xml```
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector</artifactId>
  <type>iar</type>
</dependency>
```

2.docuware-connector-demo
xml```
<dependency>
  <groupId>com.axonivy.connector.docuware</groupId>
  <artifactId>docuware-connector-demo</artifactId>
  <type>iar</type>
</dependency>
```
