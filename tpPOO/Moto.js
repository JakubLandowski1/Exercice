import { Vehicule } from "./Vehicule.js";

export class Moto extends Vehicule{
    constructor(marque, modele,kilometrage,annee){
        super(marque,modele,kilometrage,annee)
        this.Display()
    }
    Display(){
        document.querySelector('div').innerHTML += `<strong> Moto :  </strong>` + super.Display() + '<br>'
    }
}