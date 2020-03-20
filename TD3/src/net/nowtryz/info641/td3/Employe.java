package net.nowtryz.info641.td3;

abstract public class Employe {
    protected String nom, prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    abstract float getSalaireNet();
    abstract float getSalaireBrut();

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
