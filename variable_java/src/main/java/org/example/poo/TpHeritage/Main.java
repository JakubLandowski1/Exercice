package org.example.poo.TpHeritage;


public class Main {

    public static void main(String[] args) {


        Compte compte1 = new Compte(1000);

        Compte compte2 = new CompteSimple(1000, -200);

        CompteEpargne compte3 = new CompteEpargne(1500, 5);

        Compte compte4 = new ComptePayant(2000);

        System.out.println(compte1);

        compte2.retrait(500);
        System.out.println(compte2);

        System.out.println(compte3);
        compte3.calculiInterest();
        System.out.println(compte3);

        compte4.versement(500);
        System.out.println(compte4);
        compte4.retrait(500);
        System.out.println(compte4);

    }
}
