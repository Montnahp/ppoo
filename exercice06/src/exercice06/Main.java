package exercice06;

public class Main {
    public static void main(String[] args) {
        Signalisation s1 = new Signalisation(0, 10, 30);

        System.out.println(s1);
        s1.augmenterDureeDepuis(15);
        s1.modifierDureeApres(30);

    }
}
