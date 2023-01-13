import java.util.*;

public class EstructuraIfElse{
    public static void main(String[] args) {
        //Declaramos nuestro objeto Scanner
        Scanner miTeclado;
        //Inicializacion del objeto
        miTeclado = new Scanner(System.in);

        //Inicializamos una variable
        int nota;

        //Instruccion de entrada - salida
        System.out.println("Por favor ingrese una nota:");
        nota = miTeclado.nextInt();

        //Estructura de seleccion if-else-if
        if(nota == 10){
            System.out.println("Es cuadro de honor");
        }else if(nota>=6 && nota<10){
            System.out.println("Es alumno/a es regular");
        }else if(nota>=1 && nota<6){
            System.out.println("El alumno/a está en proceso");
        }else if(nota == 0){
            System.out.println("El alumno debe recursar");
        }else{
            System.out.println("Se ha introducido una calificacion no valida");}

            System.out.println("*** El programa ha finalizado ***");
    }
    
}
