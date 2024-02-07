// Realizar un programa que calcule costo con Iva

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       String Cliente;
       String Producto;
       Double Precio;
       Double Cantidad;
       Double Descuento;
       Double Subtotal;
       Double IVA;
       Double Total;
       Double Recibi;
       Double Cambio;
       
        Scanner scanner = new Scanner(System.in);
           
           System.out.println("Con el siguiente programa se obtiene el recibo de tu producto" );
            System.out.println("Ingresa la informacion que corresponde a cada rubro" );
        
        System.out.print("Cliente: ");
        Cliente = scanner.nextLine();
        
         System.out.print("Producto: ");
        Producto = scanner.nextLine();
        
         System.out.print("Precio: ");
        Precio = scanner.nextDouble();
        
         System.out.print("Cantidad: ");
        Cantidad = scanner.nextDouble();
        
         System.out.print("Descuento: ");
        Descuento = scanner.nextDouble(); 

         System.out.print("Recibi: ");
        Recibi = scanner.nextDouble(); 
        
        Subtotal = Precio*Cantidad;
        IVA = Precio*0.16;
        Descuento = Precio*Descuento;
        Total = (Subtotal + IVA) - Descuento;
        Cambio = Recibi - Total;
       
        System.out.println("Subtotal: " + Subtotal);
        System.out.println("Total de IVA: " + IVA);
        System.out.println("Total de descuento: " + Descuento);    
        System.out.println("Total a pagar: " + Total);        
        System.out.println("Recibi: " + Recibi);
        System.out.println("Tu cambio o adeudo es: " + Cambio);
        
    }
} 
