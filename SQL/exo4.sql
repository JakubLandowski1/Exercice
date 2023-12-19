SELECT * FROM utilisateur.adresse;
SELECT * FROM utilisateur.personne;

INSERT INTO personne (titre, prenom, nom, telephone, email) 
VALUES 
('mlle', 'test', 'ran', 0621220022, 'jak12@mail.com'),
( 'mlle', 'test1', 'zze', 06654654, 'jak56@mail.com'),
( 'm', 'aaaz', 'ka', 062789722, 'jak45@mail.com'),
('mme', 'testaa', 'ranaa', 0621220022, 'jak14452@mail.com'),
( 'mlle', 'test1', 'zzezz', 06654654, 'jak5126@mail.com'),
( 'mme', 'te', 'kaa', 062789722, 'jak4005@mail.com');

INSERT INTO adresse ( personne_id, rue, ville, code_postal) 
VALUES 
(2, 'rue test', 'Lille', 59800),
(2, 'rue test2', 'Douai', 59100),
(3, 'rue test3', 'Armentieres', 59000);

DELETE FROM adresse WHERE adresse_id = 1;

DELETE FROM adresse WHERE personne_id = 1;
DELETE FROM personne WHERE prenom = "jak";

UPDATE personne SET telephone = 125488 WHERE nom = 'lanaea';

DELETE FROM adresse;

UPDATE personne SET titre="mr" WHERE nom = "ka";




