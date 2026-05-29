# Axon Ivy Form Editor Demos

Demo-Projekt für den Axon Ivy Form Editor

Lies unsere [Dokumentation](formeditor-demos-product/README.md).

**Wichtigste Funktionen**

- Erkunde interaktive Formular‑UIs (Dynamic, Simple, Table), um Benutzer‑Eingabe‑Flows schnell zu prototypisieren.
- Verwende vorgefertigte Dialogkomponenten und Dataklassen, um Entwicklungszeit für Formulare zu reduzieren.
- Führe Demo‑Prozesse aus, um Ende‑zu‑Ende‑Workflows und Integrationspunkte zu validieren.
- Verwalte tabellarische Daten mit Table‑UIs, die Validierung und Summen unterstützen.
- Lokalisier Beschriftungen und Dialoge über CMS‑Dateien für schnelle Mehrsprachen‑Unterstützung.
- Passe Demos an oder erweitere sie, um sie an deine Prozesse anzupassen und die Produktion zu beschleunigen.

## Demo

Schau dir die bereitgestellten Demo‑Implementierungen für Dynamic UI, Simple UI und Table UI an. Unten findest du schrittweise Anleitungen zu den Demo‑Abläufen.

### Demo‑Workflows

#### Form Editor Demos (formeditor-demos)

##### Dynamic UI Demo
1. Starte die Dynamic UI Demo über das Demo‑Menü.
2. Fülle die persönlichen Daten aus (firstName, lastName, email, dateOfBirth).
3. Sende das Formular ab, um die Verarbeitung zu sehen und das Ergebnis zu prüfen.

##### Simple UI Demo
1. Starte die Simple UI Demo über das Demo‑Menü.
2. Fülle die persönlichen Felder aus und akzeptiere gegebenenfalls die Bedingungen.
3. Sende das Formular ab, um die Daten zu speichern und eine Bestätigung zu sehen.

##### Table UI Demo
1. Starte die Table UI Demo über das Demo‑Menü.
2. Erfasse Reisekosten‑Einträge oder importiere sie in die Tabelle.
3. Prüfe die Summen und fahre mit Freigabe oder Export fort.

## Einrichtung

- **Rollen:** Everybody (in config/roles.xml konfiguriert)
- **OpenAPI:** Für diesen Abschnitt wurden keine Informationen bereitgestellt.

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Variablen

```
@variables.yaml@
```

## Komponenten

### Aufrufbare Subprozesse

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Dialogkomponenten

#### DynamicUI — Erfasse und bearbeite persönliche Daten mit dynamischen Feldern
- **Namespace:** com.axonivy.demo.formeditordemos.DynamicUI
- **Komponententyp:** HTML Dialog
- **Felder:**
   - `data` (com.axonivy.demo.formeditordemos.PersonalData) — enthält persönliche Felder wie firstName, lastName, email, dateOfBirth, country
   - `isReadOnly` (Boolean) — ob der Dialog schreibgeschützt ist
- **Verwendet in:** DynamicUI Prozess (Dialoge: Dynamic UI demo, Read only dialog)
- **Zweck:** Bietet ein interaktives Formular zur Eingabe persönlicher Daten mit bedingten Feldern.

#### SimpleUI — Kompakter Dialog zur Erfassung persönlicher Basisdaten
- **Namespace:** com.axonivy.demo.formeditordemos.SimpleUI
- **Komponententyp:** HTML Dialog
- **Felder:**
   - `personalInfoData` (com.axonivy.demo.formeditordemos.PersonalInfoData) — strukturierte persönliche Felder
   - `isReadOnly` (Boolean) — ob der Dialog schreibgeschützt ist
- **Verwendet in:** SimpleUI Prozess (Dialoge: Simple UI Demo, Readonly Simple UI)
- **Zweck:** Erfasst grundlegende persönliche Informationen in einem kompakten Dialog.

#### TableUI — Tabellen‑UI zur Verwaltung von Eintragsmengen
- **Namespace:** com.axonivy.demo.formeditordemos.TableUI
- **Komponententyp:** HTML Dialog / Table UI
- **Felder:**
   - `data` (List<com.axonivy.demo.formeditordemos.TravelData>) — Liste von Reisekosteneinträgen
- **Verwendet in:** TableUI Prozess (Dialoge: Table UI Dialog)
- **Zweck:** Anzeige und Bearbeitung tabellarischer Daten wie Reisekosten mit Summenfunktion.

### Webservices

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Maven‑Artefakte

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.
