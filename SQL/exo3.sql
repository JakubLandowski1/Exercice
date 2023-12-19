CREATE TABLE professeur (
professeur_id INT AUTO_INCREMENT,
CONSTRAINT pk_professeur_id PRIMARY KEY (professeur_id),
num_classe INT,
num_departement INT,
prenom VARCHAR(50),
nom VARCHAR(100),
email VARCHAR (100) UNIQUE,
telephone INT UNIQUE
);
CREATE TABLE etudiant (
etudiant_id INT AUTO_INCREMENT,
CONSTRAINT pk_etudiant_id PRIMARY KEY(etudiant_id),
prenom VARCHAR (50),
nom VARCHAR(100),
telephone INT NOT NULL UNIQUE,
num_classe INT,
date_obtention_diplome DATETIME
);
CREATE TABLE COURS (
professeur_id INT,
etudiant_id INT,
CONSTRAINT fk_professeur_id FOREIGN KEY(professeur_id) REFERENCES professeur (professeur_id),
CONSTRAINT fk_etudiant_id FOREIGN KEY(etudiant_id) REFERENCES etudiant(etudiant_id)
);
INSERT INTO professeur VALUES (null,1,2, 'Jakub', 'Landowski', 'jakub@email.com', '1234567890');
INSERT INTO etudiant VALUES (null, 'Jak', 'Lan', '123456789', 10, '2023-01-01');
INSERT INTO cours VALUES (1, 1);