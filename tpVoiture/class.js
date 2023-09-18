class Voiture {
    constructor(marque, modele, vitesse) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse
    }

    accelerer() {
        this.vitesse = this.vitesse + 10
    }

    tourner() {
        this.vitesse = this.vitesse - 5
    }
}

let voiture1 = new Voiture("BMW", "Serie 1", 80)
let voiture2 = new Voiture("Mercedes", "GLB", 100)

voiture1.accelerer()
voiture1.accelerer()
voiture1.accelerer()
console.log(voiture1)

voiture2.accelerer()
voiture2.accelerer()
voiture2.tourner()
voiture2.tourner()
console.log(voiture2)
