package exercice05;

public class Main {
    public static void main(String[] args) {
        Film f1 = new Film("Yeux", 75, 156_000, 300_000);

        f1.calculerBenefice();
        System.out.println(f1);
        f1.retirerScene(5);
        System.out.println(f1);
        f1.ajouterScene();
        System.out.println(f1);
        f1.ajouterScene(2);
        System.out.println(f1);
    }
}
