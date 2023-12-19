-- 1 Créer une table nommée « livre » détenant les champs suivant :
CREATE TABLE livre (
id INT NOT NULL AUTO_INCREMENT,
CONSTRAINT pk_id PRIMARY key(id),
titre VARCHAR(150),
auteur VARCHAR(50),
editeur VARCHAR(50),
date_publication DATE,
isbn_10 VARCHAR(10),
isbn_13 VARCHAR(15) 
);

-- 2 Exécuter le script d’injection « AjoutLivres.sql » dans la BDD

-- 3 Créer une requête permettant d’afficher les 10 livres les plus anciens (avec toutes les colonnes) classés par ordre croissant 
SELECT * FROM livre ORDER BY date_publication ASC LIMIT 10;

-- 4 Créer une requête permettant d’afficher les 10 livres les plus anciens (seulement l’affichage des colonnes : date_publication, auteur, titre) classés par date de publication croissante
SELECT date_publication, auteur, titre FROM livre ORDER BY date_publication ASC LIMIT 10;

-- 5 Créer une requête permettant d’afficher tous les livres de « Agatha Christie » présent dans la base (à ce stade 3 livres).
SELECT * FROM livre WHERE auteur = "Agatha Christie";

/* -- 6 On nous informe qu’une erreur s’est glissée sur un livre de « Agatha Christie » présent dans
la base. En effet, une entrée de la BDD aurait comme auteur « Agatha Christies ». Faites une
requête permettant de modifier cette erreur puis exécutez de nouveau la requête de la
question 5 afin d’afficher de nouveau le nombre de livre de « Agatha christie » présent dans
la BDD (4 à ce stade). */ 
UPDATE livre SET auteur = "Agatha Christie" WHERE auteur = "Agatha Christies" ;

-- 7 Insérer le livre de votre choix dans la BDD en respectant toutes les colonnes. 
INSERT INTO livre (titre, auteur, editeur, date_publication, isbn_10, isbn_13 ) VALUES ('LOTR', 'J.R.R TOLKIEN', 'Hachette', '1974-12-10','1234567891', '1234567981234' ); 

-- 8 Supprimer le livre de votre choix par les critères d’auteur et titre. 
DELETE FROM livre WHERE auteur= 'J.R.R TOLKIEN' AND titre = 'LOTR';