import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String user = "Jesus" , password = "loco";
        String user, password;
        System.out.print(" Ingrese su usuario:");
        user = sc.nextLine();
        System.out.print(" Ingrese su contraseña:");
        password = sc.nextLine();
        if (us.equals ( user) && pass.equals (password)){
        System.out.print("Bienvenidos al sistema");
    }
    
    while( pass.equals(password)==false){
    System.out.println("La contraseña no es correcta, vuelve a intentar");
    System.out.print(" Ingrese su usuario:");
        user = sc.nextLine();
        System.out.print(" Ingrese su contraseña:");
        password = sc.nextLine();
    }
}
}
}
