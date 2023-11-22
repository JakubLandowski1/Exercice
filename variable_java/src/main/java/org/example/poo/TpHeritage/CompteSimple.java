package org.example.poo.TpHeritage;

public class CompteSimple extends Compte{
    public int decouvert ;
    public CompteSimple(double solde, int decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    public void retrait (int ret) {
        if (decouvert >  solde) {
            System.out.println("Erreur pas assez de fond");
        } else {
            super.retrait(ret);
        }

    }

}
