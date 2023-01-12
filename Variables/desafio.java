//Zona librerias
import java.util.*;

/* 
Hacer una aplicación que permita ingresar 2 números enteros y mostrarlos por pantalla.
*/

public class Desafio {
    public static void main(String[] args) {
    
        //Declaracion de variables
        double a, b;

        //Declaro el objeto miTeclado
        Scanner miTeclado;

        //Inicializo mi objeto
        miTeclado = new Scanner(System.in);

        //Instrucciones de salida-entrada
        System.out.println("Ingrese un numero");
        a = miTeclado.nextDouble();
        System.out.println("Ingrese otro numero");
        b = miTeclado.nextDouble();

        //Instrucciones de salida
        System.out.println("El primer numero es "+ a);
        System.out.println("El segundo numero es "+ b);
        System.out.println("\n *** El programa ha termino *** \n");
  }
}
