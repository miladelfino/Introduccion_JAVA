import java.util.Scanner;

/*
 * Realizaremos un ingreso numérico por teclado, y calcularemos el cuadrado de un número
 * Introducimos un numero decimal y observamos que sucede
 * Introducimos un caracter y observamos que sucede
 * */

public class Tipos {

    public static void main(String[] ar) {
        //Objeto
        Scanner teclado = new Scanner(System.in);
        //Variables
        int num, cuadrado;

        //Salida-Entrada
        System.out.print("Ingrese un valor entero: ");
        num = teclado.nextInt();
        cuadrado = num * num;
        System.out.println("El cuadrado de " + num + " es " + cuadrado);
        
    }
}
