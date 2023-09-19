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
                
            }
           
        });
    }

}