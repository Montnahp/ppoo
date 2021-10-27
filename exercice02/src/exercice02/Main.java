package exercice02;

public class Main {
    public static void main(String[] args) {
        Joggeur j1 = new Joggeur(
                "Dupont",
                "Smourbif",
                "BE1234567",
                70,
                180,
                10_000
        );

        Joggeur j2 = new Joggeur(
                "Dupont",
                "Sparadra",
                "BE1234565",
                70,
                180,
                10_000
        );
        j1.augmenterPoids(3);
        System.out.println(j1.getTailleCm());
        System.out.println(j1.equals(j2));
    }
}
