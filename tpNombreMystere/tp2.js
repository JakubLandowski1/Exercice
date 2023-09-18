let nbRandom,
    nbUser,
    i = 0

nbRandom = Math.floor(Math.random() * 50) + 1;

console.log(nbRandom)

function getValue() {
    nbUser = Number(document.getElementById("nbUserHtml").value);
    nbUser = verif()

}

function verif() {

    if (nbUser > 0 && nbUser < 51) {
        nbCoup = ++i
        if (i === 5) {
            document.getElementById("nbUserHtml").disabled = true;
            document.getElementById("btnValider").disabled = true;
        }
        console.log(nbCoup)
        document.querySelector('.nbCoup').innerHTML = nbCoup
        switch (true) {
            case nbRandom === nbUser:
                document.querySelector('.spanInfo').innerHTML = `Vous avez gagné en ${i + 1} coup`;
                document.getElementById("nbUserHtml").disabled = true;
                document.getElementById("btnValider").disabled = true;
                break;

            case nbRandom > nbUser:
                document.querySelector('.spanInfo').innerHTML = 'le chiffre est plus grand'
                break;

            case nbRandom < nbUser:
                document.querySelector('.spanInfo').innerHTML = 'le chiffre est plus petit'
                break;


            default:
                break;

        }

    } else {
        nbUser = false
        console.log(nbUser);
    }
}

function rejouer() {
    nbRandom = Math.floor(Math.random() * 50) + 1;
    i = 0
    document.querySelector('.nbCoup').innerHTML = i
    document.querySelector('.spanInfo').innerHTML = ``;
    document.getElementById("nbUserHtml").disabled = false;
    document.getElementById("btnValider").disabled = false;

}




