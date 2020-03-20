### Yuml script
```
// Cool Class Diagram
[Livre|titre : String; anneePremiereParution : int|affichePersonnages(); ajoutPersonnage(unPersonnage : Personnage); ajoutAuteur(auteur Auteur); contientPersonnage(nom : String) : boolean;toString() : String|getters pas de setters]<>-contient 0..*[Personnage|nom : String; description : String| toString() : String|getters pas de setters]
[Bibliothèque|ajoutLivre(livre : Livre; contientLivre(titre: String) : boolean ; afficherLivresAuteur(nomAuteur : string|getters pas de setters]<>--[Livre]
[Auteur| nom: String; prenom : String; langue : String| afficherLivres(); ajouterLivre(livre : Livre)|getters pas de setters]<>a été ecrit par 1..*--<>[Livre]
```

<img src="http://yuml.me/010e32e5.svg" alt="uml" />
