# Axon Ivy Form Editor Demos

Demo project for Axon Ivy Form editor

Read our [documentation](formeditor-demos-product/README.md).

**Key features**

- Explore interactive form UIs (Dynamic, Simple, Table) to prototype user input flows quickly.
- Use pre-built dialog components and dataclasses to reduce form development time.
- Run demo processes to validate end-to-end workflows and integration points.
- Manage tabular data with table UIs supporting validation and summary totals.
- Localize labels and dialogs via CMS files for quick multilingual support.
- Customize and extend demos to fit your processes and accelerate production rollout.

## Demo

Check the demo implementations provided for Dynamic UI, Simple UI, and Table UI. See the demo workflows below for step-by-step guides.

### Demo Workflows

#### Form Editor Demos (formeditor-demos)

##### Dynamic UI Demo
1. Launch the Dynamic UI Demo from the demo menu.
2. Fill in the personal details (first name, last name, email, date of birth).
3. Submit the form to see the data processed and review the result.

##### Simple UI Demo
1. Launch the Simple UI Demo from the demo menu.
2. Fill in the personal info fields and accept the terms where required.
3. Submit to save the data and view a confirmation.

##### Table UI Demo
1. Launch the Table UI Demo from the demo menu.
2. Enter travel expense entries or import them into the table.
3. Review summary totals and proceed to approval or export.

## Setup

- **Roles:** Everybody (configured in config/roles.xml)
- **OpenAPI:** No information was delivered for this section.

- No information was delivered for this section.

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
- **Component type:** HTML Dialog
- **Fields:**
   - `data` (com.axonivy.demo.formeditordemos.PersonalData) — contains personal fields like firstName, lastName, email, dateOfBirth, country
   - `isReadOnly` (Boolean) — whether the dialog is read-only
- **Where used:** DynamicUI process (dialogs: Dynamic UI demo, Read only dialog)
- **Purpose:** Provide an interactive form for personal data input with conditional fields.

#### SimpleUI — Simple personal info dialog for quick input
- **Namespace:** com.axonivy.demo.formeditordemos.SimpleUI
- **Component type:** HTML Dialog
- **Fields:**
   - `personalInfoData` (com.axonivy.demo.formeditordemos.PersonalInfoData) — structured personal info fields
   - `isReadOnly` (Boolean) — whether the dialog is read-only
- **Where used:** SimpleUI process (dialogs: Simple UI Demo, Readonly Simple UI)
- **Purpose:** Capture basic personal information in a compact dialog.

#### TableUI — Table-based UI for managing collections of entries
- **Namespace:** com.axonivy.demo.formeditordemos.TableUI
- **Component type:** HTML Dialog / Table UI
- **Fields:**
   - `data` (List<com.axonivy.demo.formeditordemos.TravelData>) — list of travel expense entries
- **Where used:** TableUI process (dialogs: Table UI Dialog)
- **Purpose:** Display and edit tabular data such as travel expenses with summary totals.

### Web Services

- No information was delivered for this section.

### Maven Artifacts

- No information was delivered for this section.
