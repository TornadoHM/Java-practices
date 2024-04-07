public class CicloFor
{
    public static void main(String args[])
    {
        for(int i=500;i<=1000;i+=2)
        {
            System.out.println(i);
        }
    }
}



// ----------------------------------


public class CicloInverso
{
    public static void main(String args[])
    {
        for(int i = 100; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}

// -----------------------------------

public class Multiplos
{
    public static void main(String args[])
    {
        int contador = 0; //Iniciamos el contador en cero

        for(int i = 0; i <= 10000; i++)
        {
            if(i % 20 == 0) //Preguntamos si el residuo es 0 (es múltiplo de 20)
            {
                contador++; //Si es múltiplo aumentamos el contador en 1
            }
            //Si no es múltiplo no hacemos nada
        }

        //Mostramos el valor del contador
        System.out.println(contador);
    }
}

