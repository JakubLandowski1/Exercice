import { recipes } from './data/recipes.js';
// Déclaration des Selector
const spanTime = document.querySelector(".spanCompteurTime");
const spanCook = document.querySelector(".spanCompteurCook");
const rangeTime = document.querySelector("#customRange1");
const rangeCook = document.querySelector("#customRange2");
const divRecipies = document.querySelector('#divRecipies');
const inputSelect = document.querySelector('#exampleFormControlSelect2');
const main = document.querySelector('#main');
// function affichage de la valeur des ranges 
rangeTime.addEventListener('input', () => {
    spanTime.textContent = rangeTime.value;
});
rangeCook.addEventListener('input', () => {
    spanCook.textContent = rangeCook.value;
});
const tabRecipe = [];
for (const element in recipes) {
    tabRecipe.push(recipes[element]);
}
// console.log(tabRecipe)
function init() {
    const ingredientsList = [];
    let i = 0;
    tabRecipe.forEach(element => {
        let modal = document.createElement('div');
        modal.classList.add('modal', 'fade');
        modal.setAttribute('id', `#modal${++i}`);
        modal.innerHTML = `<div class="modal-dialog">
                                <div class="modal-content"> 

                                    <div class="modal-header"> 
                                        <h3 class="modal-title"> ${element.name}</h3>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
                                        
                                        </button>
                                    </div>

                                    <div class="modal-body"> 
                                         <p> Préparations time : <br> ${element.prepTime} </p> 
                                         <p> <br> ${element.cookTime} </p>
                                         <p> <br>  ${element.servings} </p>
                                         <p> <br> ${element.prepTime} </p>
                                    </div>
                                    
                                </div>

                            </div>
        `;
        let div = document.createElement(`div`);
        div.classList.add('border', 'border-light', 'rounded-2', 'text-center', 'mt-3');
        div.setAttribute("data-bs-toggle", "modal");
        div.setAttribute('data-bs-target', `#modal${i}`);
        div.innerHTML = `<h3> ${element.name} </h3> 
        <hr>
        ${element.prepTime} ${element.cookTime}
        `;
        divRecipies.appendChild(div);
        main.appendChild(modal);
        element.ingredients.forEach(elem => {
            if (!ingredientsList.find(item => (elem.name == item))) {
                ingredientsList.push(elem.name);
                let option = document.createElement('option');
                option.value = `${elem.name}`;
                option.textContent = `${elem.name}`;
                inputSelect.appendChild(option);
            }
        });
    });
}
init();
