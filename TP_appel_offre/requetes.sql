CREATE TABLE Fournisseur(
   id_fournisseur INT,
   nom VARCHAR(50),
   adresse VARCHAR(150),
   code_postal VARCHAR(50),
   ville VARCHAR(50),
   PRIMARY KEY(id_fournisseur)
);

CREATE TABLE Produit(
   id_produit INT,
   nom_produit VARCHAR(100),
   prix_unitaire DECIMAL(15,2),
   id_fournisseur INT NOT NULL,
   PRIMARY KEY(id_produit),
   FOREIGN KEY(id_fournisseur) REFERENCES Fournisseur(id_fournisseur)
);

CREATE TABLE Offre(
   id_offre INT,
   date_offre DATE,
   date_cloture DATE,
   quantite INT,
   id_produit INT NOT NULL,
   PRIMARY KEY(id_offre),
   FOREIGN KEY(id_produit) REFERENCES Produit(id_produit)
);

CREATE TABLE Contrat(
   id_contrat INT,
   signature BOOLEAN,
   date_contrat DATE,
   quantité_negocie INT,
   id_fournisseur INT NOT NULL,
   id_offre INT NOT NULL,
   PRIMARY KEY(id_contrat),
   FOREIGN KEY(id_fournisseur) REFERENCES Fournisseur(id_fournisseur),
   FOREIGN KEY(id_offre) REFERENCES Offre(id_offre)
);

INSERT INTO Fournisseur (id_fournisseur, nom, adresse, code_postal, ville)
VALUES 
(4, 'Fournisseur D', 'Adresse D, Ville D', '99999', 'Ville D'),
(5, 'Fournisseur E', 'Adresse E, Ville E', '54321', 'Ville E');

INSERT INTO Produit (id_produit, nom_produit, prix_unitaire, id_fournisseur)
VALUES 
(104, 'Produit D', 25.50, 4),
(105, 'Produit E', 18.75, 5);

INSERT INTO Offre (id_offre, date_offre, date_cloture, quantite, id_produit)
VALUES 
(204, '2023-04-01', '2023-04-15', 120, 104),
(205, '2023-05-01', '2023-05-15', 150, 105);

INSERT INTO Contrat (id_contrat, signature, date_contrat, quantité_negocie, id_fournisseur, id_offre)
VALUES 
(304, TRUE, '2023-04-20', 100, 4, 204),
(305, FALSE, '2023-05-10', 80, 5, 205);

SELECT nom_produit, prix_unitaire FROM Produit;

SELECT COUNT(*) AS total_offres FROM Offre;

SELECT * FROM Fournisseur WHERE ville = 'Paris';

SELECT Offre.id_offre, Offre.quantite, SUM(Offre.quantite) OVER () AS quantite_totale FROM Offre;

SELECT produit.*
FROM Produit
LEFT JOIN contrat ON produit.id_produit = contrat.id_produit
WHERE contrat.id_produit IS NULL;

SELECT Fournisseur.nom AS nom_fournisseur, Contrat.id_contrat, Contrat.date_contrat
FROM Contrat
JOIN Fournisseur ON Contrat.id_fournisseur = Fournisseur.id_fournisseur;

SELECT Offre.*, Produit.nom_produit
FROM Offre
JOIN Produit ON Offre.id_produit = Produit.id_produit;

SELECT Fournisseur.id_fournisseur, Fournisseur.nom, COUNT(Offre.id_offre) AS nombre_offres
FROM Fournisseur
JOIN Produit ON Fournisseur.id_fournisseur = Produit.id_fournisseur
JOIN Offre ON Produit.id_produit = Offre.id_produit
GROUP BY Fournisseur.id_fournisseur, Fournisseur.nom
ORDER BY nombre_offres DESC
LIMIT 1;

SELECT Produit.nom_produit, SUM(Contrat.quantité_negocie * Produit.prix_unitaire) AS montant_total
FROM Contrat
JOIN Produit ON Contrat.id_produit = Produit.id_produit
GROUP BY Produit.nom_produit;

SELECT Offre.id_offre, Offre.date_cloture, Fournisseur.nom AS nom_fournisseur
FROM Offre
JOIN Produit ON Offre.id_produit = Produit.id_produit
JOIN Fournisseur ON Produit.id_fournisseur = Fournisseur.id_fournisseur
WHERE Offre.date_cloture < CURRENT_DATE AND Offre.id_offre NOT IN (SELECT id_offre FROM Contrat);