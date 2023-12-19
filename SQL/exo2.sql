CREATE TABLE compte (
 compte_id INT NOT NULL AUTO_INCREMENT,
 CONSTRAINT pk_compte_id PRIMARY KEY(compte_id),
 pseudo VARCHAR (50),
 mot_de_passe VARCHAR(50),
 email VARCHAR(255),
 date_creation DATETIME,
 derniere_connexion VARCHAR(50)
);

CREATE TABLE role (
 role_id INT NOT NULL AUTO_INCREMENT,
 CONSTRAINT pk_role_id PRIMARY KEY (role_id),
 libelle VARCHAR (50)
);

CREATE TABLE compte_role (
 compte_id INT,
 role_id INT,
 date_ajout DATETIME,
 CONSTRAINT fk_compte_id FOREIGN KEY(compte_id) REFERENCES compte (compte_id),
 CONSTRAINT fk_role_id FOREIGN KEY(role_id) REFERENCES role(role_id)
);