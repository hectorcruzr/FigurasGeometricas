public class Circulo extends Figura {

    private double radio = 0.00 % 2f;

    public Circulo(double radio) {
        this.radio = radio;
    }

    private double getRadio() {
        return radio;
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }
}
