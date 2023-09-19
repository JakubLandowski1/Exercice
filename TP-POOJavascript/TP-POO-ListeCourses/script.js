const btnSubmit = document.getElementById('btnSubmit')
const conteneurCourse = document.getElementById('conteneurCourse')
const btnClear = document.getElementById('btnClear')



btnSubmit.addEventListener("click", (e) => {
    const inpt = document.getElementById('inpt').value;

    const newDiv = document.createElement('div');

    newDiv.textContent = inpt;

    conteneurCourse.appendChild(newDiv);

    document.getElementById('inpt').value = '';
})

btnClear.addEventListener("click", (e) => {
    while (conteneurCourse.firstChild) {
        conteneurCourse.removeChild(conteneurCourse.firstChild);
    }
});

