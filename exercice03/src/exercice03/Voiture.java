package exercice03;

public class Voiture {
    //Variable
    private final String NUM_CHASSIS;
    private float valeur;
    private String couleur;
    private String plaqueImmatriculation;

    //Constructeur
    public Voiture(String numChassis, float valeur, String couleur, String plaqueImmatriculation) {
        this.NUM_CHASSIS = numChassis;

        if (valeur > 0)
            this.valeur = valeur;

        if (couleur.equalsIgnoreCase("rouge") || couleur.equalsIgnoreCase("gris") || couleur.equalsIgnoreCase("bleu"))
            this.couleur = couleur;

        this.plaqueImmatriculation = plaqueImmatriculation;
    }

    public boolean equals(Voiture autreVoiture) {
        return plaqueImmatriculation.equals(autreVoiture.getPlaqueImmatriculation());
    }

    public Voiture clone() {
        return new Voiture("cop-" + NUM_CHASSIS, valeur, couleur, plaqueImmatriculation);
    }

    //Getter
    public String getNumChassis() {
        return NUM_CHASSIS;
    }

    public float getValeur() {
        return valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getPlaqueImmatriculation() {
        return plaqueImmatriculation;
    }
}
