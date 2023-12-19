-- Créez une requête SQL permettant d’afficher l’intégralité des personnes présentent dans la BDD ordonnées par nom de famille de manière décroissante
SELECT nom, prenom FROM personne ORDER BY nom DESC;

-- Créer une requête SQL permettant d’afficher l’intégralité des personnes triées par le titre « Mlle » puis « Mme », puis « Mr »
SELECT nom, prenom, titre FROM personne ORDER BY titre ASC;

-- Créer une requête SQL permettant de rechercher une personne par son adresse email
SELECT nom, prenom, titre FROM personne WHERE email='jak4005@mail.com';

SELECT nom, prenom, titre FROM personne ORDER BY nom DESC, titre ASC;
