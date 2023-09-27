interface User {
  nom: string; 
  age:number;
  occupation: string;

}

interface Admin {
  nom: string; 
  age: number;
  role : string;

}

type Personne =  User | Admin;

const tab : Personne[] = [
  {
    nom: "Toto Dupont",
    age: 35,
    occupation: "Facteur"
  },
  {
    nom: "Jeanne Doe",
    age: 25,
    role: "Admin"
  },
  {
    nom: "Michel Michel",
    age: 23,
    occupation: "Lutteur"
  },
  {
    nom: "Michel Flinch",
    age: 64,
    role: "Gérant"
  }

]
tab.forEach(element => {
  console.log(element.nom + " " +element.age) 
 });