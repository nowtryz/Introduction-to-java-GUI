package net.nowtryz.info641.td3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();
        entreprise.ajouterEmploye(new Titulaire("Simmard", "Adrien", new Date(), 7000));
        entreprise.ajouterEmploye(new Consultant("Fanton", "Kévin", new Date(), 23.7f, 50));
        entreprise.afficherEmployes();
        System.out.println(entreprise.sommeSalairesNet());
        System.out.println(entreprise.coutEntreprise());
    }
}
