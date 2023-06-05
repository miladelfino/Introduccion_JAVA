import java.util.Scanner;

/*
* Realizaremos una función división, la dividiremos por 0 y observaremos el resultado.
* */

public class Division {
    //Zona de funciones
    static double division (double dividendo, double divisor){
        double aux;
        aux = dividendo/divisor;
        return aux;
    }

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        double dividendo, divisor, resultado;

        //Salida-Entrada
        System.out.println("Ingrese un numero");
        dividendo = sc.nextDouble();
        System.out.println("Ingrese otro numero");
        divisor = sc.nextDouble();

        //Proceso
            resultado = division(dividendo, divisor);
            System.out.println("El resultado es " + resultado);
    }
}
