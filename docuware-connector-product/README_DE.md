# DocuWare Anschluss

[DocuWare](https://start.docuware.com/) bietet an Wolke-basisbezogenes Dokument
Management und workflow Automatisierung Software. Es kann sein benutzt zu
digitalisieren, Archiv und verarbeiten irgendwelche dienstlichen Dokumente in
einem Audit-Beweis Art zu optimieren euren GesellschaftInnenteil Arbeitsgänge.

Der #Axon Efeu DocuWare Anschluss aktiviert leistungsstarke Integration von
DocuWare Funktionalitäten hinein euren #Axon Efeu verarbeitet Anträge

Dieser Anschluss:

- Minimiert eure Integration Anstrengung: Benutz die Demo Version, #welche
  zügelt Beispiele von die API Anrufe.
- Ist gegründet auf REST Web Bedienung Technologien.
- Gibt du greifst zu zu einfach DocuWare Aufgaben.

## Demo

### Charakterzüge

1. **Organisation Rettung**\
   Klickt die **Organisationen** #zuknöpfen zu #wiedergewinnen die Organisation
   ID. Das System will automatisch einschließen dies ID in folgend Bitten.

   ![Organisation-resultier](images/get-organization-result.png)

2. **Datei Kabinette Rettung**\
   Klickt die **Datei Kabinette** #zuknöpfen zu holen das Kabinett Id von der
   exklusiven Organisation. Das Kabinett Id ermittelt #wo will die Datei sein
   #hochladen.

   ![Datei-Kabinett-resultier](images/get-file-cabinet-result.png)

3. **Dokument #Hochladen**\
   Wählt aus eine Datei zu #hochladen zu das auserwähltes DocuWare Datei
   Kabinett. Du kannst überprüfen das #hochladen weiter Datei die DocuWare
   Armaturenbrett.

   ![#Hochladen-dokumentier](images/upload-document-result.png)

4. **Dokument Rettung**\
   Automatisch holen Dokumente benutzend das #vordefiniert **Organisation** und
   **fileCabinetId** Felder von die `Variablen.yaml` Datei.

   Du kannst auch wechseln das **Organisation** und **fileCabinet** mal wechseln
   die **Filter**. Es unterstützt multi-Auslese für beide Felder.

   ![Holen-Dokumente](images/fetch-documents.png)

5. **Dokument Besichtigungstermin**\
   Ausblick Dokumente direkt benutzend innerhalb die Schnittstelle DocuWares
   Dokument Beschauer.

   ![Ausblick-dokumentier](images/view-document.png)

6. **Dokument #Besitz Bearbeitend**\
   Modifizieren Dokument #Besitz, einschließlich #Metadaten und
   #benutzerdefiniert Felder.

   ![Bearbeitung-Dokument-#Besitz](images/edit-document-properties.png)

7. **Dokument Löschung**\
   Streicht Dokumente von das Datei Kabinett.

   ![Streichen-dokumentier](images/delete-document.png)

Zu anschauen und Bearbeitung Dokumente und ihre #Besitz, rennt den Arbeitsgang
geheißen **DocuWare Ausblick/Bearbeitung Dokument**.

Zu #hochladen dokumentiert und aufführen Aktionen mögen #wiedergewinnen
Organisationen, bekommend Datei Kabinette, und #hochladen Dokumente, rennt den
Arbeitsgang geheißen **Startet #welche DocuWare Anrufe**.

## Einrichtung

Vor irgendwelche Interaktionen zwischen den #Axon Efeu Motor und DocuWare
Bedienungen können sein gerannt, sie müssen sein introducted zu #jede #andere.
Dies kann sein getan folgendermaßen:

1. Bekomm ein DocuWare Konto und das DocuWare Wolke `Gastgeber`, `Nutzer-Name`,
   und `Passwort` zu benutzen.

2. Überbrückung die globalen Variablen für `Gastgeber`, `Benutzername`, und
   `Passwort` in das Demo Projekt gezeigt da in dem Beispiel unten.

```
@variables.yaml@
```

3. DocuWare Unterstützt 3 Wege zu generieren eine Zugang Automatenmünze von die
   Identität Bedienung:

   3.Eine Bitte Automatenmünze bei Benutzername & Passwort - GrantType ist
   `Passwort`

   3.b Bitte Automatenmünze mal eine DocuWare Automatenmünze - GrantType ist
   `dwtoken`

   3.c Bitte Automatenmünze bei Benutzername & Passwort (#Bewährt Nutzer) -
   GrantType ist `gehofft`

4. Für GrantType ist `dwtoken`, wir müssen bekommen ein LoginToken. Bitte
   #starten den Arbeitsgang startRequestALoginToken.ivp Und folgen den
   Fremdenführer zu generieren ein neues LoginToken

Ob eure REST URL folgt nicht den #vordefiniert REST URL Muster von diesem
Anschluss, du kannst wechseln dem URL in die Motor Pilotenkabine. Zu wechseln
das URL in dem Designer, du müssen das Anschluss Projekt auspacken und wechseln
ihm dort.

Lauf `Start.ivp` Von das DocuWareDemo Demo Arbeitsgang zu testen eure
Einrichtung.

