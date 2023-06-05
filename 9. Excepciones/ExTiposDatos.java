//Zona de importacion de librerías
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realizaremos un ingreso numérico por teclado, y calcularemos el cuadrado de un número
 * mientras no se cumpla el ingreso de un numero el programa seguirá requiriendo el ingreso de
 * un numero.
 * */


public class ExTiposBucles {
    public static void main(String[] ar) {
        //Objeto
        Scanner teclado = new Scanner(System.in);

        //Variables
        double num;
        boolean continua = false; //Interruptor bandera

        //Bucle do-while
        do {
            //Bloque de excepciones para los tipos incorrectos
            try {
                System.out.print("Ingrese un valor: ");
                num = teclado.nextDouble();
                double cuadrado = Math.pow(num, 2);
                System.out.print("El cuadrado de " + num + " es " + cuadrado);
                continua = false;
            }catch (InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un número.");
                teclado.next();
                continua = true;
            }
        }while (continua);
    }
}
