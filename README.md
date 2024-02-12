# Brief_1
# Gestion de Bibliothèque - Application Console

## Contexte du Projet

L'école ENAA Béni Mellal a sollicité vos compétences en tant que développeur back-end Java pour la création d'une application console dédiée à la gestion de bibliothèque.

## Fonctionnalités

### Bibliothèque (classe Library)

- Cette classe principale gère l'ensemble de la bibliothèque.
- Elle maintient une liste de Livres et une liste d'Apprenants.
- Des méthodes sont disponibles pour ajouter, supprimer et rechercher des livres dans la bibliothèque.

### Livre (classe Book)

- Représente un livre avec des attributs tels que le titre, l'auteur, le numéro ISBN, la date de publication, etc.
- Des méthodes permettent la modification des détails du livre.
- Un attribut est prévu pour stocker l'emprunteur actuel du livre, généralement de type Apprenant (Student).

### Apprenant (classe Student)

- Représente un apprenant avec des informations personnelles telles que le nom, l'adresse, le numéro d'identification, etc.
- Possède un attribut pour stocker la liste des livres empruntés par cet apprenant. Cette liste peut être une collection (par exemple, une liste ou un tableau) d'objets Livre.

### Menu (classe Menu)

- Gère l'interface utilisateur en console.
- Affiche les options disponibles, recueille l'entrée de l'utilisateur et déclenche les actions appropriées en fonction du choix de l'utilisateur.

## Bonus

- Rappels automatiques pour les retours en retard.

## Remarques

- Assurez-vous que le menu est intuitif et facilite la navigation dans l'application.

## Comment Utiliser l'Application

1. Exécutez le programme.
2. Utilisez le menu pour naviguer entre les différentes fonctionnalités.
3. Ajoutez, supprimez ou recherchez des livres.
4. Gérez les informations sur les apprenants.
5. Profitez des rappels automatiques pour les retours en retard.

## Comment exécuter l'application

1. Assurez-vous d'avoir une version récente de Java installée.
2. Clonez ce dépôt : `https://github.com/manbarmohamed/Brief_1.git`
3. Naviguez vers le répertoire du projet : `cd Brief_1`
4. Compilez le code : `javac Main.java`
5. Exécutez l'application : `java Main`

## Contribution

Les contributions sous forme de suggestions d'amélioration, signalement de bugs ou de nouvelles fonctionnalités sont les bienvenues. Merci de contribuer à rendre cette application encore meilleure!

## Auteurs
Ce projet a été développé par [Manbar Mohamed], sous la supervision de l'école ENAA Béni Mellal.

## Contact
Pour toute question ou commentaire, veuillez contacter [manbar.mohammed@gmail.com] ou [+212 6 90 47 25 90].

---

*Note : Assurez-vous d'avoir une version récente de Java installée pour exécuter cette application console.*

