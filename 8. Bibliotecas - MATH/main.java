import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        //Declaramos definimos e instanciamos el Objeto SC
        Scanner teclado = new Scanner(System.in);

        //Instrucciones de salida entrada
        System.out.println("Introduzca la base");
        double x = teclado.nextDouble();

        System.out.println("Introduzca la potencia como entero");
        int y = teclado.nextInt();

        double resultado = Math.pow(x, y);

        System.out.println("En numero "+x+" elevado a "+y+" es "+ resultado);
    }
}
