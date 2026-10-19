# Axon Ivy Form Editor Demos

This demo project shows how to build and test form-driven user experiences with Axon Ivy Form Editor. It gives you three ready-to-run examples for personal data entry, personal info review, and travel expense handling so you can explore dynamic fields, validation, read-only states, and table editing in one place.

**Key features**

- Prototype responsive personal forms with dynamic fields that react to the selected country.
- Capture richer personal profiles with validation, required fields, and editable or read-only modes.
- Manage travel expenses in an editable table with add, edit, delete, and summary total support.
- Reuse form data classes to keep dialog data separated from process logic.
- Run demo processes end to end to see how request starts, dialogs, and results connect.
- Localize labels and process names through CMS entries for a consistent user experience.

## Demo

Explore the three demo implementations to see how Axon Ivy Form Editor handles different form styles. Each workflow below walks through what the user does and what they see next.

### Demo Workflows

#### Form Editor Demos (formeditor-demos)

##### Dynamic UI Demo
1. Launch the Dynamic UI Demo from the demo menu.
2. Enter your personal details and choose a country.
3. If you select Germany, the form reveals the federal state field so you can complete the address details.
4. Submit the dialog to review the saved data and continue with the read-only dialog.

##### Simple UI Demo
1. Launch the Simple UI Demo from the demo menu.
2. Fill in the personal info fields, including contact details, age, and your short bio.
3. Accept the terms when required and submit the form.
4. Review the data again in the read-only dialog and confirm the result.

##### Table UI Demo
1. Launch the Table UI Demo from the demo menu.
2. Add or edit travel expense entries in the table.
3. Review the running total and adjust the rows until the list looks right.
4. Continue to the read-only view to check the final result before finishing.

## Setup

- **Roles:** Everybody (configured in config/roles.xml)
- **OpenAPI:** No information was delivered for this section.

### Variables

```
@variables.yaml@
```

## Components

### Callable Subprocesses

- No information was delivered for this section.

### Dialog Components

#### DynamicUI — Collect and edit personal details with dynamic fields
- **Namespace:** com.axonivy.demo.formeditordemos.DynamicUI
- **Component type:** Form dialog
- **Fields:**
  - `data` (com.axonivy.demo.formeditordemos.PersonalData) — personal details such as first name, last name, email, date of birth, country, and federal state
  - `isReadOnly` (Boolean) — controls whether the dialog can be edited
- **Purpose:** Capture personal data with country-sensitive fields and a read-only review mode.

#### SimpleUI — Capture and review personal information with validation
- **Namespace:** com.axonivy.demo.formeditordemos.SimpleUI
- **Component type:** Form dialog
- **Fields:**
  - `personalInfoData` (com.axonivy.demo.formeditordemos.PersonalInfoData) — personal information including contact details, age, date of birth, about me, country, and terms acceptance
  - `isReadOnly` (Boolean) — controls whether the dialog is editable or read-only
- **Purpose:** Collect personal information with validation, required fields, and separate submit and approve flows.

#### TableUI — Manage travel expenses in an editable table
- **Namespace:** com.axonivy.demo.formeditordemos.TableUI
- **Component type:** Form dialog
- **Fields:**
  - `data` (List<com.axonivy.demo.formeditordemos.TravelData>) — travel expense rows with date, category, amount, and description
  - `isReadOnly` (Boolean) — controls whether the table can be edited
- **Purpose:** Add, edit, review, and approve travel expense entries with a summary total.

### Web Services

- No information was delivered for this section.

### Maven Artifacts

- No information was delivered for this section.
