import { Vehicule } from "./Vehicule.js";

export class Voiture extends Vehicule{
    constructor(marque, modele,kilometrage,annee, clim){
        super(marque,modele,kilometrage,annee)
    
        this.clim = clim
        this.Display()
    }
    Display() {
        document.querySelector('div').innerHTML += `<strong> Voiture :  </strong>`+ super.Display() + '- '  + this.clim + '<br>'
    }
}