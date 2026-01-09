# Axon Ivy Form Editor Demos

The Axon Ivy Form Editor is an easy-to-use design tool that lets you create forms visually. Instead of writing code, you simply drag and drop elements to build the screen, making it faster and more accessible for everyone.

This demo project shows how forms can be created and used within a process. It provides three simple and practical examples to help users understand how to design a form, connect it to data, and interact with it step by step—even without deep technical knowledge. For better understanding, each demo is accompanied by a short video walkthrough.

**Simple UI Demo:**  This demo is a simple UI with static elements to demonstrate not only the core features of the Form Editor. As use case, we have implemented an onboarding UI. In addition, we will show you
- how field input can be validated
- how data is transferred from one UI to the next
- how to set some fields to read-only
- how to influence the visibility of fields

[Video Tutorial Simple UI](https://app.supademo.com/demo/cmjcix7zw0016wh0irwpr3p0s)


**Dynamic UI Demo:** A dynamic UI is a user interface that changes its structure, content, or behavior at runtime based on user input, data, or context. For Axon Ivy, the key setting for this is Update Form on Change — but let’s go through it step by step.

[Video Tutorial Dynamic UI](https://app.supademo.com/demo/cmjb7s95v0054wz0ib8sahygj)

**Table UI Demo:** In this example, we show how to configure a dynamic table in the UI, i.e. a table that allows rows to be created at runtime and supports calculations based on the table content.

[Video Tutorial Table UI](https://app.supademo.com/demo/cmjbhfvry0001zf0hermiv6a6)


## Demo

### Simple UI
This demo is a simple UI with static elements to demonstrate not only the core features of the Form Editor. As use case, we have implemented an onboarding UI. In addition, we will show you
- how field input can be validated
- how data is transferred from one UI to the next
- how to set some fields to read-only
- how to influence the visibility of fields


| First UI | Second UI | 
|----------|----------|
| <img height="300" alt="image" src="https://github.com/user-attachments/assets/8b860005-6d6d-48e7-b7cd-72248f9a11f2" />  | <img height="300" alt="image" src="https://github.com/user-attachments/assets/8b719acf-1ed6-4fe2-b905-ce714a730e6c" /> |
|  ||


The documentation below is not a step-by-step guide. For that, you can check out our  [video tutorial](https://app.supademo.com/demo/cmjcix7zw0016wh0irwpr3p0s)

We create a Dialog and a Data Class: 

<img width="1801" alt="image" src="https://github.com/user-attachments/assets/121ca934-568a-4b89-b021-6f487afe947d" />

And a second data class connected to our UI:

<img width="1280" alt="image" src="https://github.com/user-attachments/assets/7a9d31a8-cd86-438a-b816-dfae8ae4de06" />

Now we can start to visually create our form - do not forget to save your data, otherwise it will not be accessible in the forms editor

<img width="1280" alt="image" src="https://github.com/user-attachments/assets/42680139-024c-4f16-ba07-4f7e34b171f1" />

We add a condition to the Disable field so we can set our Input fields to read-only: (need that later, just keep it in mind for now)

<img width="775" alt="image" src="https://github.com/user-attachments/assets/8d00db14-616d-433d-92a2-c0f270aa3521" />

For making fields mandatory use the required field below: 

<img width="349" alt="image" src="https://github.com/user-attachments/assets/979f58b6-1cad-44d0-acef-d40d84b42a7a" />

The first screen contains mandatory text fields for First Name and Last Name, an email field with validation, a numeric age input, a date picker for date of birth, a country dropdown, a textarea for a short description, a terms acceptance checkbox, and submit and cancel buttons.

After modelling the entire form 2 very important buttons must be added: proceed and cancel. Click the database symbol at the bottom of the UI

<img width="1023" alt="image" src="https://github.com/user-attachments/assets/a7ecc29a-3098-4533-b070-6070bdca10da" />

and create them by activating the checkbox:

<img width="640" alt="image" src="https://github.com/user-attachments/assets/eac618e4-e161-4097-8684-dca831a7667e" />

For these fields now the visibility is controlled:

<img width="1084" alt="image" src="https://github.com/user-attachments/assets/bf4be6c7-1048-4f41-9d31-098081141578" />

Cancel/Submit is only visible if data.isReadOnly is set to `true`.

Cancel/Approve is only visible if data.isReadOnly is set to `false`.

Some magic data mapping must happen now in our logic of the UI element:

<img width="1280" alt="image" src="https://github.com/user-attachments/assets/3173daf9-dba6-4436-9e78-9ad00660ed38" />

<img width="1280"  alt="image" src="https://github.com/user-attachments/assets/beb177ed-135c-4c48-afa7-feb07860b675" />

For using the UI we have to integrate it into a process and map the data accordingly:

We create another data class:

<img width="458" alt="image" src="https://github.com/user-attachments/assets/52f81970-11bf-4eeb-9d67-5b9678d097e3" />

<img width="650"  alt="image" src="https://github.com/user-attachments/assets/4adec0fc-d72d-42a3-930d-edc40dc7f47f" />

and add again the formerly created PersonalInfo:

<img width="887" alt="image" src="https://github.com/user-attachments/assets/c548cd26-9ef3-479a-832d-f8fe497f097a" />

Our process contains 2 User Dialoges - for the ReadOnly version “isReadOnly” must be set to `true`. In addition data from the first dialog element must be mapped.

<img width="1085"  alt="image" src="https://github.com/user-attachments/assets/291283dd-ea3a-4ef5-8a4d-447a18168f02" />








### Dynamic UI Demo

A dynamic UI is a user interface that changes its structure, content, or behavior at runtime based on user input, data, or context. For Axon Ivy, the key setting for this is Update Form on Change — but let’s go through it step by step. Again, we have prepared a super detailed video for you, check [this](https://app.supademo.com/demo/cmjb7s95v0054wz0ib8sahygj?utm_source=link) - the documentation below is just a summary.

In this UI, the “Federal State” select menu is only visible when Germany is selected as the country.


| `country != Germany` | `country == Germany`| 
|----------|----------|
|<img height="300" alt="image" src="https://github.com/user-attachments/assets/cd8694bd-2f50-4baf-8a6c-afe2257048e4" />| <img  height="300" alt="image" src="https://github.com/user-attachments/assets/9517f9f3-83af-463e-b520-5bfef4167b75" />|
|  | Federal states are shown only if Germany is selected as the country. |


The only “magic” in this example is enabling “Update form on Change” for the Country select menu and making the visibility of the Federal State select menu dependent on that field.

<img width="1461"  alt="image" src="https://github.com/user-attachments/assets/cb280b5a-5047-45f9-8753-e49d659066ee" />

 ... making the visibility of the Federal State select menu dependent on country eq Germany by configuring the visibility field:

 <img width="456"  alt="image" src="https://github.com/user-attachments/assets/671d3c1f-958a-4c5e-ae1f-a832198b9bb8" />

<img width="1447" alt="image" src="https://github.com/user-attachments/assets/acbe2d95-6726-4869-af65-c071e7d7a1c3" />



### Table UI Demo

In this example, we show how to configure a dynamic table in the UI, i.e. a table that allows rows to be created at runtime and supports calculations based on the table content.

For a detailed video instruction check [this](https://app.supademo.com/demo/cmjbhfvry0001zf0hermiv6a6)

UI for a table row:

<img width="823"  alt="image" src="https://github.com/user-attachments/assets/bd5a002d-42f4-4f12-9fb2-8c6b221a9f32" />

And how it will look like in the table:

<img width="1024" alt="image" src="https://github.com/user-attachments/assets/dc25762e-b2de-473d-a20e-2e0cfe79f4bf" />

The use case for our example is a travel expense form.

Let’s take a closer look at the data structure, as it is a bit tricky. We define a new data class with one attribute per table column.

<img width="1024" alt="image" src="https://github.com/user-attachments/assets/e33b8240-830b-4534-b0ff-f9bcd57ff3b9" />

We define a list of this data class : 

<img width="529"  alt="image" src="https://github.com/user-attachments/assets/aedcff3c-e30b-42b8-8976-e1c890a4aaac" />

<img width="1024"  alt="image" src="https://github.com/user-attachments/assets/7756f558-04ee-453c-991d-cc9681f15767" />

… and add this list as data source to our table:

<img width="1024"  alt="image" src="https://github.com/user-attachments/assets/1d0ec02a-c69e-4fef-a673-d12e6152a449" />



