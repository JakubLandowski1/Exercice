import {Voiture} from "./Voiture.js"

export class Parking {
    constructor(){
        this.tabParking = []
    }

    inTab(plate) {
        let vehicule = new Voiture(plate)
        this.tabParking.push(vehicule)
        console.log(this.tabParking)
    }

    pay(plate){
        this.tabParking.forEach(element => {
            if (plate === element.plate) {
                const today = new Date()


                let duree = element.date - today
                duree = (duree/1000) / 60
                if (duree <= 15) {
                    console.log("0.8€")
                }
                if (duree > 15 && duree <= 30) {
                    console.log("1.30€")
                }
                if (duree > 30 && duree<=45) {
                    console.log("1.7€")
                }
                if (duree> 45) {
                    console.log("6€")
                }

            
            }
           
        });
    }

}