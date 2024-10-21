//Ivan camilo Diaz Rodriguez 935388
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Figura> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una figura:");
        System.out.println("1. RECTANGULO");
        System.out.println("2. TRIANGULO");
        System.out.println("3. CIRCULO");
        int opcion = scanner.nextInt();

        Figura figura = null;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                break;

               // figura = new Rectáangulo(base, altura);
                break;
                double radio = scanner.nextDouble();
                figura = new Circulo(radio);
               // break;
            case 2:
                System.out.print("Ingrese los lado 1  del triangulo : ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese los lado 2 del triangulo : ");
                double lado2 = scanner.nextDouble();
                System.out.print("Ingrese los lado 3  del triangulo : ");
                double lado3 = scanner.nextDouble();
                figura = new Rectáangulo(base, altura);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        if (figura != null) {
            System.out.println("Área: " + figura.getarea());
            System.out.println("Perímetro: " + figura.getperimetro());
        }
    }
}