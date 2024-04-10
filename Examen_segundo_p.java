
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trenesEstacionados = 0;
        int opcion;
        
        do {
            
            
            System.out.println("Bienvenido a la central de trenes");
            System.out.println("1. Registrar tren que llega");
            System.out.println("2. Registrar tren que sale");
            System.out.println("3. Ver trenes estacionados");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    trenesEstacionados++;
                    System.out.println("Se ha registrado un tren que llega.");
                    break;
                case 2:
                    if (trenesEstacionados > 0) {
                        trenesEstacionados--;
                        System.out.println("Se ha registrado un tren que sale.");
                    } else {
                        System.out.println("No hay trenes estacionados para salir.");
                    }
                    break;
                case 3:
                    System.out.println("Trenes estacionados actualmente: " + trenesEstacionados);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
            
            System.out.println(); // Salto de línea para mejorar la legibilidad
        } while (opcion != 4);
        
        scanner.close();
    }
}



// Este código simula una central de trenes donde puedes registrar trenes que llegan
// Dependiendo de la opcion selecionada (1,2,3,4), el programa utilizarà los ciclos y condiciones para
// Posteriormente ejecutar la opcion seleccionada, ya sea si se quiere ingresar que trenes llegan o salen
// Saber cuantos se encuentran en la terminar y por ultimo para ejecutar el final del codigo
