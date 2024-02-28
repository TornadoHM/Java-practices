import java.util.Scanner;
public class Main
{
   
    public static void main(String[] args)
 {
   
       int opcion;
       Double area,b,h;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero para el area que deseas: "  );
        System.out.println("Triangulo - 1 , Cuadrado - 2" );
        opcion = scanner.nextInt();
        
        
        
        if(opcion < 2)
    
    {
        System.out.print("base: ");
        b = scanner.nextDouble();

        System.out.print("altura: ");
        h = scanner.nextDouble();
    
        area = (b*h)/2;
        System.out.println("EL area de tu triangulo es: " + area);        
    }
        
        else
        
    {
         System.out.println("Ingresa la medida de un lado del cuadrado");
         b = scanner.nextDouble();

        area = b*b;
        System.out.println("EL area de tu cuadrado es: " + area);
        
    }
    
    
 }
} 
