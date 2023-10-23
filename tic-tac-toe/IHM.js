// IHM.js
import readline from 'readline';
import Morpion from './Morpion.js';

class IHM {
  constructor() {
    this.morpion = new Morpion();
    this.rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });
  }

  jouerPartie() {
    this.afficherMessageDeBienvenue();
    this.jouerCoup();
  }

  afficherMessageDeBienvenue() {
    console.log("Bienvenue dans le jeu du Morpion !");
    this.morpion.afficherGrille();
  }

  jouerCoup() {
    this.rl.question(
      `Joueur ${this.morpion.joueurActuel}, choisissez une ligne (0, 1, 2) : `,
      ligne => {
        this.rl.question(
          `Joueur ${this.morpion.joueurActuel}, choisissez une colonne (0, 1, 2) : `,
          colonne => {
            const ligneNum = parseInt(ligne);
            const colonneNum = parseInt(colonne);

            if (isNaN(ligneNum) || isNaN(colonneNum) || ligneNum < 0 || ligneNum > 2 || colonneNum < 0 || colonneNum > 2) {
              console.log("Ligne et colonne doivent être comprises entre 0 et 2.");
              this.jouerCoup();
            } else {
              if (this.morpion.jouer(ligneNum, colonneNum)) {
                this.morpion.afficherGrille();
                if (this.morpion.estPartieGagnee()) {
                  console.log(`Joueur ${this.morpion.gagnant} a gagné !`);
                  this.rl.close();
                } else if (this.morpion.estPartieNulle()) {
                  console.log("Partie nulle !");
                  this.rl.close();
                } else {
                  this.jouerCoup();
                }
              } else {
                this.jouerCoup();
              }
            }
          }
        );
      }
    );
  }
}

export default IHM;