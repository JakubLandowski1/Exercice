package org.example.poo.TpHeritage;

public class CompteEpargne extends Compte {

    public double interet ;

    public CompteEpargne(double solde) {
        super(solde);
    }

    public void calculInteret(double interet) {
        solde= solde*(interet/100+1);
    }
}
