# Axon Ivy Form Editor Demos

Dieses Demo-Projekt zeigt dir, wie du mit dem Axon Ivy Form Editor formularbasierte Benutzererlebnisse aufbaust und testest. Es liefert dir drei sofort nutzbare Beispiele für die Erfassung persönlicher Daten, die Prüfung persönlicher Informationen und den Umgang mit Reisekosten, damit du dynamische Felder, Validierung, schreibgeschützte Zustände und Tabellenbearbeitung an einem Ort ausprobieren kannst.

**Wichtigste Funktionen**

- Prototypische responsive Formulare mit dynamischen Feldern erstellen, die auf das ausgewählte Land reagieren.
- Umfangreichere persönliche Profile mit Validierung, Pflichtfeldern und bearbeitbaren oder schreibgeschützten Modi erfassen.
- Reisekosten in einer bearbeitbaren Tabelle mit Hinzufügen, Bearbeiten, Löschen und Summenanzeige verwalten.
- Formulardatenklassen wiederverwenden, damit Dialogdaten klar von der Prozesslogik getrennt bleiben.
- Demo-Prozesse Ende zu Ende ausführen, um zu sehen, wie Request Starts, Dialoge und Ergebnisse zusammenhängen.
- Beschriftungen und Prozessnamen über CMS-Einträge lokalisieren, damit das Benutzererlebnis konsistent bleibt.

## Demo

Erkunde die drei Demo-Implementierungen, um zu sehen, wie der Axon Ivy Form Editor mit unterschiedlichen Formularstilen umgeht. Die Workflows unten zeigen dir Schritt für Schritt, was du tust und was du als Nächstes siehst.

### Demo-Workflows

#### Form Editor Demos (formeditor-demos)

##### Dynamic UI Demo
1. Starte die Dynamic UI Demo über das Demo-Menü.
2. Gib deine persönlichen Daten ein und wähle ein Land aus.
3. Wenn du Deutschland auswählst, wird das Feld für das Bundesland sichtbar, damit du die Adressangaben vervollständigen kannst.
4. Sende den Dialog ab, um die gespeicherten Daten zu prüfen, und fahre mit dem schreibgeschützten Dialog fort.

##### Simple UI Demo
1. Starte die Simple UI Demo über das Demo-Menü.
2. Fülle die Felder für persönliche Informationen aus, einschließlich Kontaktdaten, Alter und kurzer Selbstbeschreibung.
3. Akzeptiere die Bedingungen, wenn es erforderlich ist, und sende das Formular ab.
4. Prüfe die Daten anschließend noch einmal im schreibgeschützten Dialog und bestätige das Ergebnis.

##### Table UI Demo
1. Starte die Table UI Demo über das Demo-Menü.
2. Füge Reisekostenzeilen in der Tabelle hinzu oder bearbeite sie.
3. Prüfe die laufende Gesamtsumme und passe die Zeilen an, bis die Liste passt.
4. Wechsle in die schreibgeschützte Ansicht, um das finale Ergebnis vor dem Abschluss zu prüfen.

## Einrichtung

- **Rollen:** Everybody (in config/roles.xml konfiguriert)
- **OpenAPI:** Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Variablen

```
@variables.yaml@
```

## Komponenten

### Aufrufbare Subprozesse

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Dialogkomponenten

#### DynamicUI — Persönliche Details mit dynamischen Feldern erfassen und bearbeiten
- **Namespace:** com.axonivy.demo.formeditordemos.DynamicUI
- **Komponententyp:** Formular-Dialog
- **Felder:**
  - `data` (com.axonivy.demo.formeditordemos.PersonalData) — persönliche Daten wie Vorname, Nachname, E-Mail, Geburtsdatum, Land und Bundesland
  - `isReadOnly` (Boolean) — steuert, ob der Dialog bearbeitet werden kann
- **Zweck:** Erfasse persönliche Daten mit länderspezifischen Feldern und einem schreibgeschützten Prüfmodus.

#### SimpleUI — Persönliche Informationen mit Validierung erfassen und prüfen
- **Namespace:** com.axonivy.demo.formeditordemos.SimpleUI
- **Komponententyp:** Formular-Dialog
- **Felder:**
  - `personalInfoData` (com.axonivy.demo.formeditordemos.PersonalInfoData) — persönliche Informationen einschließlich Kontaktdaten, Alter, Geburtsdatum, About Me, Land und Zustimmung
  - `isReadOnly` (Boolean) — steuert, ob der Dialog bearbeitet oder nur gelesen werden kann
- **Zweck:** Sammle persönliche Informationen mit Validierung, Pflichtfeldern und getrennten Senden- und Freigabeabläufen.

#### TableUI — Reisekosten in einer bearbeitbaren Tabelle verwalten
- **Namespace:** com.axonivy.demo.formeditordemos.TableUI
- **Komponententyp:** Formular-Dialog
- **Felder:**
  - `data` (List<com.axonivy.demo.formeditordemos.TravelData>) — Reisekostenzeilen mit Datum, Kategorie, Betrag und Beschreibung
  - `isReadOnly` (Boolean) — steuert, ob die Tabelle bearbeitet werden kann
- **Zweck:** Bearbeite Reisekosten, prüfe Summen und schließe mit einer Freigabe- oder Weiter-Aktion ab.

### Webservices

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.

### Maven-Artefakte

- Für diesen Abschnitt wurden keine Informationen bereitgestellt.
