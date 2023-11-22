package org.example.poo.TpClasseChaise;

public class Chaises {
        public String color;
        public  int nbFoot;
        public String material;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNbFoot() {
        return nbFoot;
    }

    public void setNbFoot(int nbFoot) {
        this.nbFoot = nbFoot;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Chaises (String color, int nbFoot, String material ) {
        this.color= color;
        this.nbFoot = nbFoot;
        this.material = material;
    }

    public Chaises () {
         color= "blue";
         nbFoot = 3;
         material = "carbonne";
    }

    public static void display(Chaises chaise2) {

        System.out.printf("Je suis une chaise, avec %d pieds en %s et de couleur %s \n", chaise2.nbFoot, chaise2.material, chaise2.color );
    }





}
