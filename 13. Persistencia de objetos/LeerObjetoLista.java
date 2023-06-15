import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/*
* Lectura de un archivo de un objeto ArrayList
* El proceso de lectura es paralelo al proceso de escritura,
* por lo que leer objetos del flujo de entrada  ObjectInputStream es muy simple en este práctico
* veremos sus pasos.
* */

public class LeerObjetoLista {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1- Creamos un fujo de entrada a disco, pasándole el nombre del archivo en disco al objeto de la clase File.
        File archivo = new File("miLista.dat");
        FileInputStream archivoEntrada = new FileInputStream(archivo);
        ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);

        //3- El método readObject lee los objetos del flujo de entrada,
        ArrayList<String> listaCompras = (ArrayList<String>) objetoEntrada.readObject();

       

        //4- Realizamos alguna tarea con el objeto por ejemplo agragamos un campo mas y lo 
        System.out.println(listaCompras);
        
        listaCompras.add("Limones");

        System.out.println(listaCompras);

        //5-Se cierran los flujos
        archivoEntrada.close();
        objetoEntrada.close();
    }
}
