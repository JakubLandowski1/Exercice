import { Voiture } from "./Voiture.js"

export class Parking {
    constructor() {
        this.tabParking = []
    }

    inTab(plate) {


        if (plate === "") {
            alert("la plaque n'est pas valide")
        } else {
            let vehicule = new Voiture(plate)
            this.tabParking.push(vehicule)
            console.log(this.tabParking)
        }
    }


    pay(plate) {
        let bool = false;

        this.tabParking.forEach(element => {
            if (plate === element.plate) {
                bool = true;
                const today = new Date()


                let duree = element.date - today
                duree = (duree / 1000) / 60
                if (duree <= 15) {
                    alert("0.8€")
                }
                if (duree > 15 && duree <= 30) {
                    alert("1.30€")
                }
                if (duree > 30 && duree <= 45) {
                    alert("1.7€")
                }
                if (duree > 45) {
                    alert("6€")
                }


            }
            
        });
        if (bool === false) {

            alert("la voiture n'existe pas")
        }
    }

}