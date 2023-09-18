let tab = [
    {
        personne: ["Jean", "Dupont", 15]
    },
    {
        personne: ["Pierre", "Durant", 16]
    },
    {
        personne: ["Jean", "Martin", 17]
    }
],
affichage = "La personne à la 2ème position de l'annuaire est : <br>"

tab.forEach((element) => {
    document.querySelector(
        "tbody"
    ).innerHTML += `<tr> <td> ${element.personne[0]} </td> <td> ${element.personne[1]}</td> <td> ${element.personne[2]} </td></tr>`
});

document.getElementById('result').innerHTML = affichage + tab[1].personne[0]+" "+ tab[1].personne[1]