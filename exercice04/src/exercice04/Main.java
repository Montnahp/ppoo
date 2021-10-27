package exercice04;

public class Main {
    public static void main(String[] args) {
        Cours c1 = new Cours("français", "Dandoy", 16, 6, 2);
        Cours c2 = new Cours();
        Cours c3 = new Cours(2);
        System.out.println(c1);
        c1.changerNbreHeureCreditECTS(24, 2);
        System.out.println(c1);
        c1.setNbreHeures(60);
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);
    }
}
