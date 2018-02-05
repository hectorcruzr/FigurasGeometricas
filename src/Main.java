
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        String linea;
        do {
            menu();
            linea = new Scanner(System.in).nextLine();
            opcion = Integer.parseInt(linea);
            switch (opcion) {
                case 1:
                    rectangulos();
                    break;
                case 2:
                    cuadrados();
                    break;
                case 3:
                    circulos();
                    break;
                default:
                    System.out.println("chauchau");
            }

        } while (opcion != 0);
    }

    public static void menu() {
        System.out.print("-------------\nFiguras v0.2\n-------------\n" +
                "1 Rectangulos\n2 Cuadrados\n3 Circulos\nElige (0 para salir):");
    }

    public static void rectangulos() {
        boolean seguir;
        int opcion;
        double base, altura;
        Rectangulo rectangulo1;
        do {
            System.out.print("---Rectangulos---\n" + "Ingresar Base: ");
            base = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.print("Ingresar Altura: ");
            altura = Double.parseDouble(new Scanner(System.in).nextLine());
            rectangulo1 = new Rectangulo(base, altura);
            System.out.print("Area: " + rectangulo1.obtenerArea() + " unidades\n......");
            System.out.println("mas calculos? 1-Si/2-No  :");
            opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            if (opcion == 1) seguir = true;
            else seguir = false;
        } while (seguir);
    }

    public static void cuadrados() {
        boolean seguir;
        int opcion;
        double lado;
        Cuadrado cuadrado;
        do {
            System.out.print("---Cuadrados---\n" + "Ingresar longitud de un lado: ");
            lado = Double.parseDouble(new Scanner(System.in).nextLine());
            cuadrado = new Cuadrado(lado);
            System.out.print("Area: " + redondear(cuadrado.obtenerArea(), 2) + " unidades\n......");
            System.out.println("mas calculos? 1-Si/2-No  :");
            opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            if (opcion == 1) seguir = true;
            else seguir = false;
        } while (seguir);
    }

    public static void circulos() {
        boolean seguir;
        int opcion;
        double radio;
        Circulo circulo;
        do {
            System.out.println("---Circulos---\n" + "Ingresar longitud de radio: ");
            radio = Double.parseDouble(new Scanner(System.in).nextLine());
            circulo = new Circulo(radio);
            System.out.print("Area: " + redondear(circulo.obtenerArea(), 2) + " unidades\n......");
            System.out.println("mas calculos? 1-Si/2-No  :");
            opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            if (opcion == 1) seguir = true;
            else seguir = false;
        } while (seguir);
    }

    public static double redondear(double valorInicial, int decimales) {
        double entero, resultado;
        resultado = valorInicial;
        entero = Math.floor(resultado);
        resultado = (resultado - entero) * Math.pow(10, decimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, decimales)) + entero;
        return resultado;
    }

}
