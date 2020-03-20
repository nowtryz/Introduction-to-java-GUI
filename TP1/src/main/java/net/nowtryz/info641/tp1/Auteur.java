package net.nowtryz.info641.tp1;

import java.util.*;

public class Auteur {
    private String nom, prenom, langue;
    private Set<Livre> livres = new HashSet<>();
    private Set<String> pouvoirs = new HashSet<>();

    public Auteur(String nom, String prenom, String langue) {
        this.nom = nom;
        this.prenom = prenom;
        this.langue = langue;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLangue() {
        return langue;
    }

    public void ajouterLivre(Livre livre) {
        if (!livres.contains(livre)) {
            livre.ajouterAuteur(this);
            livres.add(livre);
        }
    }

    public void afficherLivres() {
        livres.stream().parallel()
                .map(Objects::toString)
                .forEach(System.out::println);
    }

    // TODO uml
    public void ajouterPouvoir(String nomPouvoir) {
        pouvoirs.add(nomPouvoir);
    }

    // TODO uml
    public boolean possedeLePouvoir(String pouvoir) {
        return pouvoirs.contains(pouvoir);
    }
}
