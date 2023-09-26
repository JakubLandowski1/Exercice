import { Person } from "./classes/Person.js";
// selecteur input non editable 
const firstname = document.querySelector('#firstname');
const lastname = document.querySelector('#lastname');
const dateOfBirth = document.querySelector('#dateOfBirth');
const email = document.querySelector('#email');
const phoneNumber = document.querySelector('#phoneNumber');
const contactDiv = document.querySelector('.contact');
// selecteur input editable dans la div edit
const firstnameEdit = document.querySelector('#firstnameEdit');
const lastnameEdit = document.querySelector('#lastnameEdit');
const dateOfBirthEdit = document.querySelector('#dateOfBirthEdit');
const emailEdit = document.querySelector('#emailEdit');
const phoneNumberEdit = document.querySelector('#phoneNumberEdit');
// selecteur bouton edit, delete et add
const btnAdd = document.querySelector('.AddBtn');
const btnDelete = document.querySelector('.deleteBtn');
const btnEdit = document.querySelector('.editBtn');
const btnEditForm = document.querySelector('.editFormBtn');
// Création des dates pour les date de naissance des objets Person
let datePers1 = new Date("1964/02/22");
let datePers2 = new Date("2000/02/22");
let datePers3 = new Date("1990/04/30");
// Création en dure des objets issu de la classe Person
let person1 = new Person("Albert", "Dupont", datePers1, "e.martin@exemple.com", +33119788254);
let person2 = new Person("John", "Dupont", datePers2, "e.john@exemple.com", +33119788000);
let person3 = new Person("Albert", "Dupont", datePers3, "e.martin@exemple.com", +33119787897);
// Création du tableau Person pour stocker les objets de la classe Person
let personTab = [];
personTab.push(person1);
personTab.push(person2);
personTab.push(person3);
function displayContact() {
    for (let i = 0; i < personTab.length; i++) {
        let child = document.createElement(`button`);
        child.classList.add('btn');
        child.textContent = personTab[i].firstname + " " + personTab[i].lastname;
        child.setAttribute('data-id', `${personTab[i].id}`);
        contactDiv.appendChild(child);
    }
}
function displayInput(param) {
    for (let i = 0; i < personTab.length; i++) {
        if (param == personTab[i].id) {
            firstname.value = personTab[i].firstname;
            lastname.value = personTab[i].lastname;
            // dateOfBirth.value = personTab[i].dateOfBith
            email.value = personTab[i].email;
            phoneNumber.value = `${personTab[i].phoneNumber}`;
        }
    }
}
displayContact();
displayInput(2);
