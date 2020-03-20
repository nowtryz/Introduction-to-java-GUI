package net.nowtryz.info641.td3;

import java.util.Date;

public class Consultant extends Employe {
    private Date datePremiereIntervention;
    private float coutHorraire, nbHeuresTravailles = 0;

    public Consultant(String nom, String prenom, Date datePremiereIntervention, float coutHorraire) {
        super(nom, prenom);
        this.datePremiereIntervention = datePremiereIntervention;
        this.coutHorraire = coutHorraire;
    }

    public Consultant(String nom, String prenom, Date datePremiereIntervention, float coutHorraire, float nbHeuresTravailles) {
        this(nom, prenom, datePremiereIntervention, coutHorraire);
        this.nbHeuresTravailles = nbHeuresTravailles;
    }

    public void setNbHeuresTravailles(float nbHeuresTravailles) {
        this.nbHeuresTravailles = nbHeuresTravailles;
    }

    @Override
    public float getSalaireNet() {
        return getSalaireBrut();
    }

    @Override
    public float getSalaireBrut() {
        return coutHorraire * nbHeuresTravailles;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (consultant)";
    }
}
