const tab = [
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
];
tab.forEach(element => {
    console.log(element.nom + " " + element.age);
});
