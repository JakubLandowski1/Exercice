package org.example.poo.TpHeritage;

public class Compte {
    public static int counter = 0;
    public int code;
    public double solde;

    static {
        counter++;
    }

    public Compte(double solde) {
        this.code = counter;
        this.solde = solde;
    }

    public void versement(double ajout) {
        solde = solde + ajout;
    }

    public void retrait(double ret) {
        solde = solde - ret;
    }

    public String toString() {
        return String.format("Le numero du compte est %d /n Le solde actuel : %f", code, solde);
    }
}
