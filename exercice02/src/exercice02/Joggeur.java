package exercice02;

import java.util.Objects;

public class Joggeur {
    //Initialisation des variables
    private String nom, prenom, numLicence;
    private float poids, tailleCm;
    private int tempsRef10KmSecondes;

    //Constructeur
    public Joggeur(String nom, String prenom, String numLicence, float poids, float tailleCm, int tempsRef10KmSecondes) {
        this.nom = nom;
        this.prenom = prenom;
        this.numLicence = numLicence;

        if (poids > 0)
            this.poids = poids;

        if (tailleCm > 0)
            this.tailleCm = tailleCm;

        setTempsRef10KmSecondes(tempsRef10KmSecondes);
    }


    //Partie statique
    public void augmenterPoids(float poidsEnPlus) {
        if (poidsEnPlus < 0)
            return;

        poids += poidsEnPlus;
    }

    //Setter
    public void setTempsRef10KmSecondes(int tempsRef10KmSecondes) {
        if (tempsRef10KmSecondes > 0)
            this.tempsRef10KmSecondes = tempsRef10KmSecondes;
    }

    //Getter
    public float getTailleCm() {
        return tailleCm;
    }

    //Equals
    public boolean equals(Joggeur autreJoggeur) {
        return numLicence.equals(autreJoggeur.numLicence);
    }
}
