package net.nowtryz.info641.tp1;

import java.util.ArrayList;
import java.util.List;

public class Bibliothèque {
    private List<Livre> livres = new ArrayList<>();

    public void ajoputLivre(Livre livre) {
        livres.add(livre);
    }

    public boolean contientLivre(String titre) {
        return livres.stream().parallel().anyMatch(x -> x.getTitre().equals(titre));
    }

    public void afficherLivresAuteur(String nomAuteur) {
        livres.stream().parallel()
                .filter(livre -> livre.getAuteur().equals(nomAuteur))
                .forEach(System.out::println);
    }
}
