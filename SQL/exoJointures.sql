-- 1. Obtenir la liste des 10 villes les plus peuplées en 2012 
SELECT ville_nom FROM villes_france_free ORDER BY ville_population_2012 DESC LIMIT 10;

-- 2. Obtenir la liste des 50 villes ayant la plus faible superficie
SELECT ville_nom FROM villes_france_free ORDER BY ville_surface LIMIT 50;

-- 3. Obtenir la liste des départements d’outre-mer, c’est-à-dire ceux dont le numéro de département commençant par “97” 
SELECT departement_nom FROM departement WHERE departement_code LIKE '97%' ;

-- 4. Obtenir le nom des 10 villes les plus peuplées en 2012, ainsi que le nom du département associé
SELECT ville_nom, departement_nom FROM villes_france_free 
INNER JOIN departement ON departement.departement_code = villes_france_free.ville_departement  ORDER BY ville_population_2012 DESC LIMIT 10;

-- 5. Obtenir la liste du nom de chaque département, associé à son code et du nombre de commune au sein de ces départements, en triant afin d’obtenir en priorité les départements qui possèdent le plus de communes 
SELECT departement_nom,departement_code, COUNT(ville_nom) FROM departement LEFT JOIN villes_france_free ON departement_code = ville_departement GROUP BY departement_nom, departement_code ORDER BY COUNT(ville_nom) DESC;

-- 6. Obtenir la liste des 10 plus grands départements, en termes de superficie 
SELECT departement_nom, departement_code, SUM(ville_surface) FROM departement LEFT JOIN villes_france_free ON departement_code = ville_departement GROUP BY departement_nom, departement_code ORDER BY SUM(ville_surface) DESC LIMIT 10;

-- 7. Compter le nombre de villes dont le nom commence par “Saint” 
SELECT count(ville_nom) FROM villes_france_free WHERE ville_nom LIKE 'SAINT%';

-- 8. Obtenir la liste des villes qui ont un nom existants plusieurs fois, et trier afin d’obtenir en premier celles dont le nom est le plus souvent utilisé par plusieurs communes
SELECT COUNT(ville_nom), ville_nom FROM villes_france_free GROUP BY ville_nom  HAVING COUNT(ville_nom)>1 ORDER BY COUNT(ville_nom) DESC ;

-- 9. Obtenir en une seule requête SQL la liste des villes dont la superficie est supérieure à la superficie moyenne 
SELECT ville_nom FROM villes_france_free WHERE ville_surface > (SELECT AVG(ville_surface) FROM villes_france_free) ;

-- 10. Obtenir la liste des départements qui possèdent plus de 2 millions d’habitants 
SELECT departement_nom, departement_code, SUM(ville_population_2012) FROM departement LEFT JOIN villes_france_free ON departement_code = ville_departement GROUP BY departement_nom, departement_code HAVING SUM(ville_population_2012) > 2000000;
  
-- 11. Remplacez les tirets par un espace vide, pour toutes les villes commençant par “SAINT-” (dans la colonne qui contient les noms en majuscule) 
UPDATE villes_france_free SET ville_nom = REPLACE(ville_nom, '-', ' ') WHERE ville_nom LIKE 'SAINT-%';
