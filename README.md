## ` Auteur : Fallou DIAKHATE EPT - DIC2 - 2021`

# Travaux Pratique : Java Persistence API

## Partie I : Création d’entités à partir d’une base de données existante

### 1) Créer les bases de données production et vente à partir du fichier backup.
Ligne de commande Linux : `source db.sql;`

> Schema des deux DBs.

![Image](https://i.imgur.com/Wd3RSFh.png)


### 2) Créer un projet web NetBeans qui utilise une des bases de données précédentes (production ou vente) dans sa configuration JPA (ne pas mettre de stratégie pour la génération de la base de données)

Fait avec IntelliJ IDEA Ultimate Edition

### 3) Générer les entités à partir de l’outils NetBeans Create « Entity Classes from Database ». Créer un `EJB Singleton` (qui est créé au démarrage) avec une méthode `init` ayant l’annotation `@ PostConstruct` qui affiche `dans les logs` la liste des `employés` et la liste des `produits`

> Générationn des entités de la base de données `production` par `IntelliJ IDEA Ultimate Edition`

![Image](https://i.imgur.com/tkaR7mo.png)

------------------------------------------------

> Générationn des entités de la base de données `vente` par `IntelliJ IDEA Ultimate Edition`

![Image](https://i.imgur.com/Y36XEMw.png)

------------------------------------------------

Check le Commit  `Question 1 - 2 - 3 / OK `  pour la création du  `EJB Singleton`  et les  `Logs`

------------------------------------------------

### 4) Modifier les Entités pour avoir le principe d’héritage (employe, client qui sont des personnes) sans changer la structure de la base de données (NB voir la documentation JPA sur l’annotation  `@MappedSuperclass`). Relancer l’application pour vérifier que le Singleton créer en 3) continue de marcher

> Le nouveau Schema `AVANT` les modifications 

![Image](https://i.imgur.com/CZmQUrT.png)

------------------------------------------------

> Le nouveau Schema 'APRES' les modifications 

![Image](https://i.imgur.com/xSIptsg.png)

------------------------------------------------

Check le Commit  `Question 4 / OK `  pour voir les modifcations

-----------------------------------------------

### 5) En utilisant les annotations `@Embedded` et `@Embeddable` (voir documentation) créer une classe Adresse qui sera un champ des classes magasin et client avec les attributs relatifs à l’adresse du magasin et du client

> Le nouveau Schema aprés les modifications 

![Image](https://i.imgur.com/S9MtMLG.png)

------------------------------------------------

Check le Commit  `Question 5 / OK `  pour voir les modifcations

-----------------------------------------------

## Partie II : Proposition de solution from scratch

On veut développer une application de gestion de l’entreprise de vente de vélo avec une
nouvelle base de données.
Proposer une nouvelle solution JPA pour une nouvelle Base de données

> Le nouveau Schema

![Image](https://i.imgur.com/QRiHObi.png)

------------------------------------------------

Check le Commit  `Partie II / OK `  pour voir les modifcations

-----------------------------------------------
