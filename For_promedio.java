 import java.util.Scanner;
 public class Main

{
    public static void main(String[] args)
    
  {

	Scanner scanner = new Scanner(System.in);
	
	double Calf, Final;
	double Aux = 0 ;
	
	for (int i = 1; i <= 5; i++) 
	
	{
	    
    System.out.println ("Escribe la calificacion de la materia: " + i);
        
        Calf = scanner.nextDouble();
        
    Aux = Aux + Calf;
    
	}
	    
	   Final = Aux/5;
	   
	  System.out.println ("Tu promedio es " + Final);  
  }
}
