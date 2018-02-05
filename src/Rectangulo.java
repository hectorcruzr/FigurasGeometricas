public class Rectangulo extends Figura {
    double base;
    double altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    private double getBase() {
        return base;
    }

    private double getAltura() {
        return altura;
    }

    public double obtenerArea() {
        return getBase() * getAltura();
    }
}
