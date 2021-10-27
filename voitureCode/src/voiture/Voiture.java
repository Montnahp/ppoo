package voiture;

public class Voiture {
    private String marque;
    private String couleur;
    private int nbChevaux;
    private int nb = 1;

    //méthode de classe
    private static final int NB_ROUES = 4;

    public static int getNbRoues() {
        return NB_ROUES;
    }
    Voiture(String marque){
        this.marque = marque;
    }

    Voiture(String marque, int nbChevaux){
        this.marque = marque;
        this.nbChevaux = nbChevaux;
        this.couleur = "";
    }

    Voiture(String marque, int nbChevaux, String couleur){
        this.marque = marque;
        this.nbChevaux = nbChevaux;
        this.couleur = couleur;
    }

    public void augmenterNbChevaux(int nbChevaux){
        if (nbChevaux > 0)
            this.nbChevaux += nbChevaux;
    }

    public boolean equals(Voiture autreVoiture){
        return marque.equals(autreVoiture.marque)
                && nbChevaux == autreVoiture.nbChevaux
                && couleur.equals(autreVoiture.couleur);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", nbChevaux=" + nbChevaux +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public Voiture clone() {
        return new Voiture(marque, nbChevaux, couleur);
    }
}
