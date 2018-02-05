public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    private double getLado() {
        return lado;
    }

    public double obtenerArea() {
        return 4 * getLado();
    }
}
