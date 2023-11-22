package org.example.poo.TpClasseChaise;

public class Main {

        public static void main(String[] args) {

            Chaises chaise1 = new Chaises();
            Chaises chaise2 = new Chaises("bleu", 4 , "pvc");

            Chaises.display(chaise1);
            Chaises.display(chaise2);
        }
}
