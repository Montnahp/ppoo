package exercice06;

public class Signalisation {
    //Variable
    private int dureeDepuis, dureeApres;
    private String couleur;

    //Constructeur
    public Signalisation(int dureeDepuis, int dureeApres) {
        this(0, dureeDepuis, dureeApres);
    }

    public Signalisation(int couleur, int dureeDepuis, int dureeApres) {
        if (couleur == 0)
            this.couleur = "vert";

        if (couleur == 1)
            this.couleur = "orange";

        if (couleur == 2)
            this.couleur = "rouge";

        this.dureeDepuis = dureeDepuis;
        this.dureeApres = dureeApres;
    }

    //Statique
    public void augmenterDureeDepuis(int ajout) {
        if (ajout > 0)
            dureeDepuis += ajout;
    }

    public void modifierDureeApres(int modifier) {
        dureeApres += modifier;
    }

    //toString
    public String toString() {
        return "Signalisation{" +
                "couleur=" + couleur +
                '}';
    }
}
