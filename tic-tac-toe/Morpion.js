class Morpion {
  constructor() {
    this.grille = [[" ", " ", " "], [" ", " ", " "], [" ", " ", " "]];
    this.joueurActuel = "X";
    this.gagnant = null;
  }

  afficherGrille() {
    for (let i = 0; i < 3; i++) {
      console.log(this.grille[i].join(" | "));
      if (i < 2) {
        console.log("-".repeat(9));
      }
    }
  }

  jouer(ligne, colonne) {
    if (this.grille[ligne][colonne] === " ") {
      this.grille[ligne][colonne] = this.joueurActuel;
      this.changerJoueur();
      return true;
    } else {
      console.log("Case déjà occupée. Essayez à nouveau.");
      return false;
    }
  }

  changerJoueur() {
    this.joueurActuel = this.joueurActuel === "X" ? "O" : "X";
  }

  estPartieGagnee() {
    for (let i = 0; i < 3; i++) {
      if (
        this.grille[i][0] === this.grille[i][1] &&
        this.grille[i][1] === this.grille[i][2] &&
        this.grille[i][0] !== " "
      ) {
        this.gagnant = this.grille[i][0];
        return true;
      }
      if (
        this.grille[0][i] === this.grille[1][i] &&
        this.grille[1][i] === this.grille[2][i] &&
        this.grille[0][i] !== " "
      ) {
        this.gagnant = this.grille[0][i];
        return true;
      }
    }

    if (
      this.grille[0][0] === this.grille[1][1] &&
      this.grille[1][1] === this.grille[2][2] &&
      this.grille[0][0] !== " "
    ) {
      this.gagnant = this.grille[0][0];
      return true;
    }

    if (
      this.grille[0][2] === this.grille[1][1] &&
      this.grille[1][1] === this.grille[2][0] &&
      this.grille[0][2] !== " "
    ) {
      this.gagnant = this.grille[0][2];
      return true;
    }

    return false;
  }

  estPartieNulle() {
    return this.grille.every(row => row.every(cell => cell !== " "));
  }
}

export default Morpion;