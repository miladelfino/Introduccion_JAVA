//Zona de importaciones
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * A la funcion division la enriqueceremos con el lanzamiento de las excepciones
 * y bloques try-catch que gestionen los errores que permitan una salida menos traumatica
 * del programa.
 * La funcion division arrojará dos excepciones Exception y AritmeticException
 * El método main arrojará la excepcion InputMismatchException
 * */

public class ExDivision {

    //Zona de funciones
    //La funcion division lanza dos posibles excepciones una general y una especificamente artmética
    static double division (double dividendo, double divisor) throws ArithmeticException {
        //Variables
        double aux;

        //Estructura de control if evalúa y lanza excepciones
        if (divisor != 0){
            aux = dividendo/divisor;
        }
        else{
            throw new ArithmeticException();
        }
        return aux;
    }

    public static void main(String[] args) throws  Exception, InputMismatchException{ // InputMismatchException optativo lanzarlo desde la cabecera ya que lo lanza igualmente el objeto.
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        double dividendo = 0, divisor=1, resultado;

        //Salida-Entrada con excepciones en la entrada de datos
        try{
        System.out.println("Ingrese un numero");
        dividendo = sc.nextDouble();
        System.out.println("Ingrese otro numero");
        divisor = sc.nextDouble();
        }catch (InputMismatchException e0){
            System.out.println("Debe ingresar obligatoriamente un numero entero.\n");
            System.out.println("** Reinicie el programa y cargue adecuadamente los datos. **");
            System.exit(0);
        }

        //Proceso con excepciones en el calculo
        try {
            resultado = division(dividendo, divisor);
            System.out.println("El resultado es " + resultado);
        } catch (ArithmeticException e1){
            System.out.println("Intentaste dividir por 0 "+e1);
        } catch (Exception e2) {
            System.out.println("La operacion no se puede realizar");
        } finally {
            System.out.println("El programa ha terminado");
        }

    }
}
