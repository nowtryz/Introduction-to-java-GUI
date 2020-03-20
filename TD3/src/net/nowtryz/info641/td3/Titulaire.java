package net.nowtryz.info641.td3;

import java.util.Date;

public class Titulaire extends Employe{
    public static final float POURCENTAGE_CHARGES = 40.0f;// %
    private Date dateEmbauche;
    private float salaire;

    public Titulaire(String nom, String prenom, Date dateEmbauche, float salaire) {
        super(nom, prenom);
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    @Override
    public float getSalaireNet() {
        return salaire;
    }

    @Override
    public float getSalaireBrut() {
        return salaire * (1 + POURCENTAGE_CHARGES / 100);
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (titulaire)";
    }
}
