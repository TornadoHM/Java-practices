import java.util.Scanner;
public class Main

{
    public static void main(String[] args)
    {
       double lado;
       double altura;
       double base;
       double area;
       double volumen;
       
        Scanner scanner = new Scanner(System.in);
           
            System.out.println("Ingresa los datos" );
        
        System.out.print("lado: ");
        lado = scanner.nextDouble();
        
        System.out.print("altura: ");
        altura = scanner.nextDouble();        
        
        System.out.print("base: ");
        base = scanner.nextDouble();
        
       volumen = ((altura*(lado*lado)*1.73205080757)/4);  
       
       area = lado*((3*altura)+((lado*1.73205080757)/2));
       
        System.out.println("Tu volumen es: " + volumen);
        System.out.println("Tu area es: " + area);
    }
} 
