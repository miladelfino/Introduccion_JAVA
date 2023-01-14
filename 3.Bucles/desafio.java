import java.util.Scanner;

/**
 * Desafio de clase
 * */

/*
* Hacer un programa que imprima los números enteros entre dos números enteros a ingresar por teclado.
* El programa deberá colocar el numero mayor en la variable num1 y el menor en la variable num2
* independiente a como se los ingrese por teclado.
* */

public class Desafio1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int num1;
        int num2;
        int aux;

        //Declaracion del objeto Scanner
        Scanner miTeclado;

        //Inicializacion del objeto
        miTeclado = new Scanner(System.in);

        //Instrucciones de entrada
        System.out.println("Ingrese el primer número:");
        num1 = miTeclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = miTeclado.nextInt();

        //Proceso de ordenamiento
        if (num2 < num1){
            aux = num2;
            num2 = num1;
            num1 = aux;
        }

        //Bucle while
        while (num1 <= num2){
            System.out.println("Contando...");
            System.out.println(num1);
            num1++;
        }

        System.out.println("*** Programa finalizado con éxito ***");


    }
}
