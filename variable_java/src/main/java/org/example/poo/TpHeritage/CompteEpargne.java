package org.example.poo.TpHeritage;

public class CompteEpargne extends Compte {

    public double interet ;

    public CompteEpargne(double solde, double interet) {
        super(solde);
        this.interet = interet;
    }

    public void calculiInterest() {
        solde= solde*(interet/100+1);
    }


}
