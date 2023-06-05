import java.util.Scanner;
import java.util.InputMismatchException;

public class ExRaiz {

    //Excepciones
    //raiz cuadrada de una letra
    //numeros decimales ESTO PODRÍA SER UNA CONDICION INDUCIDA POR EL OBJETIVO DE MI PROGRAMA
    //simbolos
    //negativos NO PRODUCE UNA EXCEPCION EXPLICITA PERO DEBO DECLARA UNA ANOMALIA

    public static void main(String[] args) throws ArithmeticException {
     //Objetos
     Scanner teclado = new Scanner(System.in);

     //Variables
     double radicando, raiz;

    try{
     //Salida-Entrada
     System.out.println("Ingrese un numero para obtener su raiz cuadrada");
     radicando = teclado.nextDouble(); //PUNTO DE EXCEPCION

    //TRY ANIDADO
            try{

                if(radicando>=0){
                //Proceso
                raiz = Math.sqrt(radicando); //PUNTO DE EXCEPCION NAN
                //Resultado
                System.out.println("El resultado es: "+raiz);
                }else{
                    throw new ArithmeticException();
                }
            
            }catch (ArithmeticException e1) {
                System.out.println("La operacion no se puede realizar con numeros negativos");
            }finally {
               teclado.close();
               System.out.println("** El programa finalizó correctamente **");
               System.exit(0); 
            }

    }catch(InputMismatchException e2){
        System.out.println("Debe ingresar solo valores numéricos "+ e2);
    }finally {
        teclado.close();
        System.out.println("** El programa finalizó correctamente **");
    }
}
}
