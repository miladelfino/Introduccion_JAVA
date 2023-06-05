import java.util.Scanner;

public class Raiz{

    //Excepciones
    //raiz cuadrada de una letra
    //numeros decimales
    //simbolos
    //negativos

    public static void main(String[] args) {
     //Objetos
     Scanner teclado = new Scanner(System.in);

     //Variables
     double radicando, raiz;

     //Salida-Entrada
     System.out.println("Ingrese un numero para obtener su raiz cuadrada");
     radicando = teclado.nextDouble();

     //Proceso
     raiz = Math.sqrt(radicando);

     //Resultado
     System.out.println("El resultado es: "+raiz);


    }    

}
