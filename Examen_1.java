import java.util.Scanner;
public class Main

{
    public static void main(String[] args)
    {
       double radio;
       double pi;
       double area;
       double volumen;
       
        Scanner scanner = new Scanner(System.in);
           
            System.out.println("Ingresa los datos" );
        
        System.out.print("radio: ");
        radio = scanner.nextDouble();
        
        pi = 3.1416;
       volumen = (4)*((pi)*(radio*radio*radio))/3;
       area = (4)*(pi)*(radio*radio);
       
        System.out.println("Tu volumen es: " + volumen);
        System.out.println("Tu area es: " + area);
    }
} 
