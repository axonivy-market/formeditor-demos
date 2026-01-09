# Axon Ivy Form Editor Demos

The Axon Ivy Form Editor is an easy-to-use design tool that lets you create forms visually. Instead of writing code, you simply drag and drop elements to build the screen, making it faster and more accessible for everyone.

This demo project shows how forms can be created and used within a process. It provides three simple and practical examples to help users understand how to design a form, connect it to data, and interact with it step by step—even without deep technical knowledge. For better understanding, each demo is accompanied by a short video walkthrough.

**Simple UI Demo:**  This demo is a simple UI with static elements to demonstrate not only the core features of the Form Editor. As use case, we have implemented an onboarding UI. In addition, we will show you
- how field input can be validated
- how data is transferred from one UI to the next
- how to set some fields to read-only
- how to influence the visibility of fields

[Video Tutorial Simple UI](https://app.supademo.com/demo/cmjcix7zw0016wh0irwpr3p0s?utm_source=link)


**Dynamic UI Demo:** A dynamic UI is a user interface that changes its structure, content, or behavior at runtime based on user input, data, or context. For Axon Ivy, the key setting for this is Update Form on Change — but let’s go through it step by step.

**Table UI Demo:** In this example, we show how to configure a dynamic table in the UI, i.e. a table that allows rows to be created at runtime and supports calculations based on the table content.

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
|  | Content is copied from First UI and read-only |


The documentation below is not a step-by-step guide. For that, you can check out our  [video tutorial](https://app.supademo.com/demo/cmjcix7zw0016wh0irwpr3p0s?utm_source=link)

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









### Table UI Demo
[![Table UI Demo](images/table-ui.png)](https://app.supademo.com/embed/cmjbhfvry0001zf0hermiv6a6?embed_v=2)
