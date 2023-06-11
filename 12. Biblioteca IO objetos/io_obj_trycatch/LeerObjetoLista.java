import java.io.*;
import java.util.ArrayList;

/*
 * Lectura de un archivo de un objeto ArrayList
 * El proceso de lectura es paralelo al proceso de escritura,
 * por lo que leer objetos del flujo de entrada  ObjectInputStream es muy simple en este práctico
 * veremos sus pasos.
 * */

public class LeerObjetoListaTryCatch {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Al utilizar try-catch debemos separar la declaracion de la instanciacion
        File archivo = null;
        FileInputStream archivoEntrada = null;
        ObjectInputStream objetoEntrada =null;

        try {
            //1- Creamos un fujo de entrada a disco, pasándole el nombre del archivo en disco al objeto de la clase File.
            archivo = new File("miLista.dat");
            archivoEntrada = new FileInputStream("miLista.dat");

            //2- El fujo de entrada ObjectInputStream es el que procesa los datos
            // y se vincula al objeto fileInputStrean que se llama archivoEntrada.
            objetoEntrada = new ObjectInputStream(archivoEntrada);

            //3- El método readObject lee los objetos del flujo de entrada,
            ArrayList<String> listaCompras = (ArrayList<String>) objetoEntrada.readObject();

            //4- Realizamos alguna tarea con el objeto por ejemplo agragamos un campo mas y lo
            System.out.println(listaCompras);
        }catch (FileNotFoundException e){
            e.getMessage();
        }catch (ClassNotFoundException e){
            e.getMessage();
        }catch (IOException e){
            e.getMessage();
        }finally {
            //5-Se cierran los flujos
            try {
                if (archivoEntrada != null) archivoEntrada.close();
                if (objetoEntrada != null) objetoEntrada.close();
            }catch (IOException e){
                e.getMessage();
            }
        }
    }
}

