//Zona de importacion de librerías
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realizaremos un ingreso numérico por teclado, y calcularemos el cuadrado de un número
 * */

public class ExTipos {

    public static void main(String[] ar) {
        //Objeto
        Scanner teclado = new Scanner(System.in);

        //Variable
        int num;

        //Bloque de excepciones para los tipos incorrectos
        try {
            System.out.print("Ingrese un valor entero: ");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un numero entero.");
           
        }
    }
}
