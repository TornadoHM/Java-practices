// Realizar un programa que calcule el promedio de matematicas
// Asistencia 5% 
// Examen 45%  
// Tareas 25%
// Trabajos en clase 20%
// Participacion 5%

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Double Asistencia;
       Double Examen;
       Double Tareas;
       Double Trabajo;
       Double Participacion;
       Double Cal;
        Scanner scanner = new Scanner(System.in);
           
           System.out.println("A continuacion tienes un programa para saber la calificacion de tu materia" );
            System.out.println("Ingresa tu calificacion en cada rubro" );
        
        System.out.print("Asistencia: ");
        Asistencia = scanner.nextDouble()*0.05;
        
         System.out.print("Examen: ");
        Examen = scanner.nextFloat()*0.45;
        
         System.out.print("Tareas: ");
        Tareas = scanner.nextFloat()*0.25;
        
         System.out.print("Trabajo en clase: ");
        Trabajo = scanner.nextFloat()*0.20;
        
         System.out.print("Participacion: ");
        Participacion = scanner.nextFloat()*0.05;
       
        
        Cal = (Asistencia + Examen + Tareas + Trabajo + Participacion);
       
        System.out.println("Tu promedio es: " + Cal);
    }
} 
