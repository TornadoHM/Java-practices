import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner( System.in );
        
        char n;
        
        char continuar = 'c';
        
        while(continuar == 'c'){
            System.out.println("ingrese una vocal");
            n = teclado.next().charAt(0);
            
            if (n == 'A' || n == 'a') {
                System.out.println("****");
                System.out.println("*  *");
                System.out.println("****");
                System.out.println("*  *");
                System.out.println("*  *");
            }else if (n == 'E' || n == 'e') {
                System.out.println("****");
                System.out.println("*   ");
                System.out.println("****");
                System.out.println("*   ");
                System.out.println("****");
            }else if (n == 'I' || n == 'i') {
                System.out.println("****");
                System.out.println(" ** ");
                System.out.println(" ** ");
                System.out.println(" ** ");
                System.out.println("****");
            }else if (n == 'O' || n == 'o') {
                System.out.println("****");
                System.out.println("*  *");
                System.out.println("*  *");
                System.out.println("*  *");
                System.out.println("****");
            }else if (n == 'U' || n == 'u') {
                System.out.println("*  *");
                System.out.println("*  *");
                System.out.println("*  *");
                System.out.println("*  *");
                System.out.println("****");
            }else {
                System.out.println("Has ingresado un carácter inválido.");}
        
        
        }
        
    }
}
