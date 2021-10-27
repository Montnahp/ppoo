package exercice04;

public class Cours {
    //Variable
    private String nomCours, nomEnseignant;
    private int nbreHeures, creditECTS, annee;

    //Constructeur
    public Cours(int annee) {
        this("", "", 0, 0, annee);
    }

    public Cours() {
        this("", "", 24, 2, 0);
    }

    public Cours(String nomCours, String nomEnseignant, int nbreHeures, int creditECTS, int annee) {
        this.nomCours = nomCours;
        this.nomEnseignant = nomEnseignant;

        if (nbreHeures > 11 && nbreHeures < 97)
            this.nbreHeures = nbreHeures;

        if (creditECTS > 0 && creditECTS < 16)
            this.creditECTS = creditECTS;

        if (annee > 1 && annee < 4)
            this.annee = annee;
    }

    //toString
    public String toString() {
        return "Cours{" +
                "nomCours='" + nomCours + '\'' +
                ", nomEnseignant='" + nomEnseignant + '\'' +
                ", nbreHeures=" + nbreHeures +
                ", creditECTS=" + creditECTS +
                ", annee=" + annee +
                '}';
    }

    //Statique
    public void changerNbreHeureCreditECTS(int nbreHeures, int creditECTS) {
        this.nbreHeures = nbreHeures;
        this.creditECTS = creditECTS;
    }

    //Setter
    public void setNbreHeures(int nbreHeures) {
        this.nbreHeures = nbreHeures;
    }

}
