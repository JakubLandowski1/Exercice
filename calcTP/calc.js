function afficher(param) {
    document.getElementById("result").innerHTML += param
}

function effacer() {
    document.getElementById("result").innerHTML = ""
    document.getElementById("resultCalc").innerHTML = ""
}

function calculer() {
    let nb1 = document.getElementById("result").innerHTML
    let nb2 = eval(nb1)
    document.getElementById("resultCalc").innerHTML = "=" + nb2
}



onkeydown = (e) => {
    switch (e.key) {
        case "0":
            afficher(0)
            break;
        case "1":
            afficher(1)
            break;
        case "2":
            afficher(2)
            break;
        case "3":
            afficher(3)
            break;
        case "4":
            afficher(4)
            break;
        case "5":
            afficher(5)
            break;
        case "6":
            afficher(6)
            break;
        case "7":
            afficher(7)
            break;
        case "8":
            afficher(8)
            break;
        case "9":
            afficher(9)
            break;
        case ")":
            afficher(')')
            break;
        case "(":
            afficher('(')
            break;
        case "/":
            afficher('/')
            break;
        case "*":
            afficher('*')
            break;
        case "-":
            afficher('-')
            break;
        case "+":
            afficher('+')
            break;
        case ".":
            afficher('.')
            break;
        case "Enter":
            calculer()
            break;
        case "Backspace":
            effacer()
            break;

        default:
            break;
    }
}