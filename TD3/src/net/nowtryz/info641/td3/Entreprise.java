package net.nowtryz.info641.td3;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Entreprise {
    private List<Employe> empoles = new LinkedList<>();

    public void ajouterEmploye(Employe employe) {
        this.empoles.add(employe);
    }

    public void afficherEmployes() {
        this.empoles.stream()
                .map(Objects::toString)
                .forEach(System.out::println);
    }

    public double sommeSalairesNet() {
        return this.empoles.stream()
                .mapToDouble(Employe::getSalaireNet)
                .sum();
    }

    public double coutEntreprise() {
        return this.empoles.stream()
                .mapToDouble(Employe::getSalaireBrut)
                .sum();
    }
}
