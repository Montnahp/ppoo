package exercice01;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 4);

        System.out.println("(" + p1.getX() + ";" + p1.getY() + ")");

        p1.deplacer(1, 1, 8);

        System.out.println("(" + p1.getX() + ";" + p1.getY() + ";" + p1.getZ() + ")");
        System.out.println("Test");
    }
}
