// Realizar un programa que calcule el suelo

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       String Empleado;
       String Puesto;
       Double Sueldo;
       Double Extras;
       Double Dias;
       Double Pago;
       Double Pconextras;
       
        Scanner scanner = new Scanner(System.in);
           
           System.out.println("Con el siguiente programa se obtiene el sueldo de un empleado" );
            System.out.println("Ingresa la informacion que corresponde a cada rubro" );
        
        System.out.print("Empleado: ");
        Empleado = scanner.nextLine();
        
         System.out.print("Puesto: ");
        Puesto = scanner.nextLine();
        
         System.out.print("Sueldo diario: ");
        Sueldo = scanner.nextDouble();
        
         System.out.print("Horas extras: ");
        Extras = scanner.nextDouble();
        
         System.out.print("Dias trabajados: ");
        Dias = scanner.nextDouble();
       
        
        Pconextras = ((Sueldo/8)*Extras)*2;
       Pago = (Sueldo*Dias) + Pconextras;
       
        System.out.println("El pago de las horas extras es: " + Pconextras);
        System.out.println("Tu pago total es: " + Pago);
    }
} 
