import java.util.ArrayList;
import java.util.Collections;

public class FuncionesArrayList {
    public static void main(String[] args) {
        
        //Declaramos un arraylist
        ArrayList<String> frutas;

        //Instanciamos nuestro AL
        frutas = new ArrayList<String>();

        //Inicializacion del AL
        //1- Metodo de insersion de elementos
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("sandia");
        frutas.add("manzana");

        //2- Imprimimos el AL
        System.out.println(frutas);

        //3- Obtenemos un elemento a partir de su indice
        frutas.get(0);
        System.out.println("El elemento en el index 0 es "+ frutas.get(0));
        //4- Cambiamos valores con set
        frutas.set(2,"mandarina");
        System.out.println("El nuevo AL es "+frutas);

        //5- Hallamos las long del AL mediante el metodo size
        System.out.println("La longitud del array es "+frutas.size());

        //6- Utilizamos el metodo sort para ordenar alfabeticamente
        Collections.sort(frutas);
        System.out.println("El AL ordenado es "+frutas); 


    }

}
