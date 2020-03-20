package net.nowtryz.info641.td1;

public class Module {
    private String name;
    private int code, nbHCM, nbHTD, nbHTP;

    public Module(String name, int code, int nbHCM, int nbHTD, int nbHTP) {
        this.name = name;
        this.code = code;
        this.nbHCM = nbHCM;
        this.nbHTD = nbHTD;
        this.nbHTP = nbHTP;
    }

    public int getNbHCM() {
        return nbHCM;
    }

    public void setNbHCM(int nbHCM) {
        this.nbHCM = nbHCM;
    }

    public int getNbHTD() {
        return nbHTD;
    }

    public void setNbHTD(int nbHTD) {
        this.nbHTD = nbHTD;
    }

    public int getNbHTP() {
        return nbHTP;
    }

    public void setNbHTP(int nbHTP) {
        this.nbHTP = nbHTP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int nbHeuresEtudiant() {
        return nbHCM + nbHTD + nbHTD;
    }

    public double coutEqTD(int nbGroupesTD, int nbGroupesTP) {
        return
                nbHCM * 1.5
                        + nbGroupesTD * nbHTD
                        + nbGroupesTP * nbHTP * 2./3;
    }

    @Override
    public String toString() {
        return name + code;
    }
}
