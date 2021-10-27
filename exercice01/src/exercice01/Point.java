package exercice01;

public class Point {
    // Initialisation des variables
    private float x, y, z;

    //Constructeur
    public Point(float x) {
        this(x, 0, 0);
    }

    public Point(float x, float y) {
        this(x, y, 0);
    }

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Partie statique
    public void deplacer(float x) {
        deplacer(x, 0, 0);
    }

    public void deplacer(float x, float y) {
        deplacer(x, y, 0);
    }

    public void  deplacer(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    //Getter
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

}
