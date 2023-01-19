import java.util.ArrayList;
import java.util.Collections;

public class MiArrayList {
    public static void main(String[] args) {
        
        //Declaracion del arraylist
        ArrayList<String> autos;

        //Instanciacion del arraylist
        autos = new ArrayList<String>();

        //Metodos
        //1-Insertar
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");

        //2-Imprimir el arraylist
        System.out.println("El arraylist autos es "+ autos);

        //3-Obtengo la longitud del AL
        int tamanio = autos.size(); //este el metodo para obtener la longitud
        System.out.println("El tamanio del arraylist es");
        System.out.println("La longitud es "+ tamanio);

        //Añadimos elementos al arraylist en cualquier momento
        autos.add("Torino");
        System.out.println("El nuevo arraylist es "+ autos);

        //get para obtener el valor de un elemento
        autos.get(4);
        System.out.println("El ultimo elemento es "+autos.get(autos.size()-1));

        //set para cambiar un elemento en un arraylist
        System.out.println(autos);
        autos.set(2, "Fitito"); //Indicamos el indice y el valor a cargar
        System.out.println("El nuevo arraylist es "+ autos);

        //Remover elementos
        autos.remove(1); //Inicamos el indice

        System.out.println("El nuevo arraylist con el elemento borrado es"+ autos);

        //Ordenamos nuestra lista
        Collections.sort(autos); //llamo a la libreria java.util.Collections

        System.out.println("Nuesta lista ordenada es "+autos);

//Buscamos el index de un elementos
System.out.println("El indice de Mazda es "+ autos.indexOf("Mazda"));
}
    

    

}
