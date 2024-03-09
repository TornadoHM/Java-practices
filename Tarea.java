import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular promedio de 5 materias");
            System.out.println("2. Calcular volumen de un cubo");
            System.out.println("3. Calcular área de un trapecio");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularPromedioMaterias(scanner);
                    break;
                case 2:
                    calcularVolumenCubo(scanner);
                    break;
                case 3:
                    calcularAreaTrapecio(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void calcularPromedioMaterias(Scanner scanner) {
        System.out.println("Ingrese las calificaciones de las 5 materias:");
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += scanner.nextDouble();
        }
        double promedio = suma / 5;
        System.out.println("El promedio de las 5 materias es: " + promedio);
    }

    public static void calcularVolumenCubo(Scanner scanner) {
        System.out.println("Ingrese la longitud del lado del cubo:");
        double lado = scanner.nextDouble();
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

    public static void calcularAreaTrapecio(Scanner scanner) {
        System.out.println("Ingrese la base mayor del trapecio:");
        double baseMayor = scanner.nextDouble();
        System.out.println("Ingrese la base menor del trapecio:");
        double baseMenor = scanner.nextDouble();
        System.out.println("Ingrese la altura del trapecio:");
        double altura = scanner.nextDouble();
        double area = ((baseMayor + baseMenor) * altura) / 2;
        System.out.println("El área del trapecio es: " + area);
    }
}
