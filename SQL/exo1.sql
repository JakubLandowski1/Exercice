CREATE DATABASE utilisateur;

CREATE TABLE personne
(
    personne_id INT NOT NULL AUTO_INCREMENT,
    CONSTRAINT pk_personne_id PRIMARY KEY (personne_id),
    titre VARCHAR(4),
    prenom VARCHAR(50),
    nom VARCHAR(50),
    telephone INT,
    email VARCHAR(100)
);

CREATE TABLE adresse (
    adresse_id INT PRIMARY KEY AUTO_INCREMENT,
    personne_id INT,
    rue VARCHAR (150),
    ville VARCHAR(75),
    code_postal INT,
    CONSTRAINT fk_adresse_id FOREIGN KEY (personne_id) REFERENCES personne (personne_id)
)