package net.nowtryz.info641.tp1;

import java.util.*;
import java.util.stream.Collectors;

public class Livre {
    private String titre;
    private int anneePremiereParution;
    private List<Personnage> personnages = new ArrayList<>();
    private Set<Auteur> auteurs = new HashSet<>();

    public Livre(String titre, int anneePremiereParution) {
        this.titre = titre;
        this.anneePremiereParution = anneePremiereParution;
    }

    public Livre(String titre, Set<Auteur> auteurs, int anneePremiereParution) {
        this(titre, anneePremiereParution);
        this.auteurs = auteurs;
    }

    public String getTitre() {
        return titre;
    }

    public Set<Auteur> getAuteurs() {
        return auteurs;
    }

    public int getAnneePremiereParution() {
        return anneePremiereParution;
    }

    public void affichePersonnages() {
        personnages.stream()
                .map(Objects::toString)
                .forEach(System.out::println);
    }

    public void ajoutPersonnage(Personnage nouveauPersonnage) {
        personnages.add(nouveauPersonnage);
    }

    public boolean contientPersonnage(String nom) {
        return personnages
                .stream().parallel()
                .map(Personnage::getNom)
                .anyMatch(x -> x.equals(nom));
    }

    public void ajouterAuteur(Auteur auteur) {
        auteurs.add(auteur);
        auteur.ajouterLivre(this);
    }

    @Override
    public String toString() {
        String auteursString = auteurs.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", ", "", "."));
        return titre + " de " + auteursString + " Parru en " + anneePremiereParution;
    }
}
