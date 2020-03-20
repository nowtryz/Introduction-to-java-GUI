package net.nowtryz.info641.tp1;

public class Personnage {
    private String nom, description;

    public Personnage(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
