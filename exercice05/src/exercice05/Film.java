package exercice05;

public class Film {
    private String titre;
    private int dureeMin;
    private float budget, recettes, benefice;
    //Constructeur
    public Film(String titre, int dureeMin) {
        this(titre, dureeMin, 0, 0 );
    }


    public Film(String titre, int dureeMin, float budget, float recettes) {
        this.titre = titre;

        if (dureeMin > 0)
            this.dureeMin = dureeMin;

        if (budget < 3_000_000)
            this.budget = budget;

        if (recettes > 0)
            this.recettes = recettes;
    }

    //Statique
    public void ajouterScene(int sceneMin) {
        dureeMin += sceneMin;
    }

    public void ajouterScene() {
        dureeMin += 3;
    }

    public void retirerScene(int sceneMin) {
        dureeMin -= sceneMin;
    }

    public void calculerBenefice() {
        benefice = recettes - budget;
    }

    //toString

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", dureeMin=" + dureeMin +
                ", budget=" + budget +
                ", recettes=" + recettes +
                ", benefice=" + benefice +
                '}';
    }
}
