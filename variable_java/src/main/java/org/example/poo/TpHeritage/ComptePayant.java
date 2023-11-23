package org.example.poo.TpHeritage;

public class ComptePayant extends Compte{

    public ComptePayant(double solde) {
        super(solde);
    }

    public void retrait (double ret) {
        super.retrait(ret*1.05);

    }

    public void versement(double ajout) {
        super.versement(ajout*0.95);
    }


}
