import java.util.Scanner;
public class Main
{
   
    public static void main(String[] args)
 {
   
       int opcion;
       Double num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero que deseas: "  );
        opcion = scanner.nextInt();
        
    if(opcion>= 18)
    {
        System.out.println("El numero es mayor a 18");
    }
    
    else    
    {
     System.out.println("El numero es menor a 18 ");    
    }
    
        
    }
    
}
