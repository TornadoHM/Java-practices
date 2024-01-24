import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Float Cd;
       Float PrP;
       Float Prdc;
       Float PyT;
       Float Ltrt;
       Float Ingl;
       Float prom;
       
        Scanner scanner = new Scanner(System.in);
           
            System.out.println("Ingresa tu calificacion en la materia" );
        
        System.out.print("Calculo diferencial: ");
        Cd = scanner.nextFloat();
        
         System.out.print("Procesos de pensamiento: ");
        PrP = scanner.nextFloat();
        
         System.out.print("Produccion: ");
        Prdc = scanner.nextFloat();
        
         System.out.print("Persona y Trasendencia: ");
        PyT = scanner.nextFloat();
        
         System.out.print("Literatura: ");
        Ltrt = scanner.nextFloat();
        
         System.out.print("Ingles: ");
        Ingl= scanner.nextFloat();
        
       
        
        prom = (Cd + PrP + Prdc + PyT + Ltrt + Ingl)/6;
       
        System.out.println("Tu promedio es: " + prom);
    }
} 
