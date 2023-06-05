import java.util.ArrayList;
import java.util.Scanner;

public class Galleta {

    public static void main(String[] args) {
        //Declaracion e instanciacion de un AL
        ArrayList<String> frases = new ArrayList<>();
        Scanner miTeclado = new Scanner(System.in);

        //Declaracion de variables
        int indice, indice2, num1;

        //Inicializamos el AL
        frases.add("Hoy tendras mucha suerte");
        frases.add("Hoy recibiras ese llamado");
        frases.add("Hoy encontraras dinero en la calle");
        frases.add("Hoy te prepararan tu comida favorita");
        frases.add("Sacaras un 10 en tu próximo examen");
        frases.add("Todo estara mas que bien");
        frases.add("Recibiras un regalo");
        frases.add("Recibiras un ascenso");
        frases.add("LLegaras a tu peso ideal sin hacer dieta");
        frases.add("Te encontraras una persona muy querida");
        frases.add("Pronto recibiras ese llamado esperado");

        //Proceso
        System.out.println("Introduzca un numero de la suerte");
        num1 = miTeclado.nextInt();

        //Inicializamos las variables indices con expresiones random
        indice = (int)Math.floor(Math.random()*num1);
        indice2 = (int)Math.floor(Math.random()*(frases.size()-1));

        //Construimos un if
        if(indice>=0&&indice<frases.size()){
        System.out.println("Hoy la suerte te dice que... "+frases.get(indice));
        }else{
        System.out.println("Para tu numero de la suerte: "+frases.get(indice2));    
        }

        System.out.println("*** Sucedera pronto hasta luego! ***");

    }
    

}
