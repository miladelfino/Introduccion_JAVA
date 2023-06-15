import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import java.util.ArrayList;

/*
 * Realizaremos una aplicacion que simule una bola 8 de la suerte o galleta de la suerte, la cual a partir de un numero ingresado nos
 * arrojará un mensaje de la suerte
 * Este mensaje será almacenado en un ArrayList
 * Mediante la librería Math generaremos un numero aleatorio a partir del numero ingresado para acceder al indice del AL y mostrar por
 * consola el mensaje de la buena suerte.
 */

public class Galleta {
    public static void main(String[] args) {
        //Declaracion e instanciacion de objetos: ArrayList y Scanner
        ArrayList<String> frases = new ArrayList<>();

        //Declaración de variables
        int indice, indice2;

        //Inicialización del arraylist mediante la carga de Strings
        frases.add("Hoy tendras mucha suerte");
        frases.add("Hoy recibiras esa llamada");
        frases.add("Hoy encontraras dinero en la calle");
        frases.add("Hoy te prepararan tu comida favorita");
        frases.add("Sacaras un 10 en tu próximo examen");
        frases.add("Todo estara mas que bien");
        frases.add("Recibiras un regalo");
        frases.add("Recibiras un ascenso");
        frases.add("LLegaras a tu peso ideal sin hacer dieta");
        frases.add("Te encontraras una persona muy querida");
        frases.add("Encontrarás dinero en la calle");

        //Proceso
        //Instruccion de salida-entrada
        //System.out.println("Introduce tu numero de la suerte");
        //int num1=teclado.nextInt();

        //Objeto icono
        Icon miIcono = new ImageIcon("ball8-120.gif");
        Icon miIcono2 = new ImageIcon("nah-120.gif");
        Icon miIcono3 = new ImageIcon("galleta-120.gif");
        Icon miIcono4 = new ImageIcon("ball-star-120.gif");

        //Variables
        String str1;
        int num1;

        //Bienvenida
        JOptionPane.showMessageDialog(null,"Te doy la bienvenida a la galleta de la suerte","Bienvenida",-1,miIcono);

        str1 = (String) JOptionPane.showInputDialog(null, "Introduce tu número de la suerte", "Galleta de la suerte",-1, miIcono2,null, "");
        num1 = Integer.parseInt(str1);


        //Inicializacion de variables con expresiones matematicas
        indice = (int) Math.floor(Math.random()*num1); //Utilizamos los metodos floor y random
        indice2 = (int) Math.floor(Math.random()*(frases.size()-1));  //Utilizamos los metodos floor y random

        //Contruimos una estructura de seleccion donde primero se valida que el numero random esté dentro de los indices del AL, sino recurrimos a un segundo numero random que se arroje entre 0 y el ultimo index
        if(indice>=0 && indice<frases.size()){
            //System.out.println("Hoy la suerte te dice que... "+frases.get(indice));
            JOptionPane.showMessageDialog(null,"Hoy la suerte te dice que... "+frases.get(indice),"La suerte te dice",-1,miIcono3);
        }else{
            //System.out.println("Para tu numero de la suerte: "+frases.get(indice2));
            JOptionPane.showMessageDialog(null, "Para tu numero de la suerte... "+frases.get(indice2),"La suerte te dice",-1,miIcono3);
        }


        //System.out.println("*** Sucedera pronto hasta luego! ***");
        JOptionPane.showMessageDialog(null, "*** Sucederá pronto hasta luego ***", "Adios!",-1,miIcono4);
    }
}

