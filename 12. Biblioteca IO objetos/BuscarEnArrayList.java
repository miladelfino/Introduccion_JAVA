import java.io.*;
import java.util.ArrayList;

/*
 * Este programa me permite consultar un listado de compras almacenado en un archivo y buscar productos de compras en el.
 Utilizamos funciones.
 En este ejemplo no se propagan ni gestionan excepciones  
 * */
public class BuscarEnArrayList {
    //Zona de funciones

    static void buscar(ArrayList<String> nombreAL, String miProducto) {
        String buscador = miProducto;
        String encontrado="";
        String noEncontrado="";

        for (String producto : nombreAL) {
            if (producto.contains(buscador)) {
                encontrado = producto ;
            } else{
                noEncontrado = buscador;
            }
        }

        if(!encontrado.isEmpty()){
            System.out.println("Tenes que comprar "+ encontrado);
            return;
        }
        if (!noEncontrado.isEmpty()){
            System.out.println("No tenes que comprar "+noEncontrado);
            return;
        }
    }

    static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1- Creamos un fujo de entrada a disco, pasándole el nombre del archivo en disco al objeto de la clase File.
        File archivo = new File("miLista.dat");
        FileInputStream archivoEntrada = new FileInputStream(archivo);

        //2- El fujo de entrada ObjectInputStream es el que procesa los datos
        // y se vincula al objeto fileInputStrean que se llama archivoEntrada.
        ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);

        //3- El método readObject lee los objetos del flujo de entrada,
        ArrayList<String> listaCompras = (ArrayList<String>) objetoEntrada.readObject();

        //4- Realizamos alguna tarea con el objeto por ejemplo agragamos un campo mas y lo
        System.out.println(listaCompras);

        //Buscamos en el arraylist
        imprimir("Busco limones");
        buscar(listaCompras,"limones");
        imprimir("Busco pan");
        buscar(listaCompras,"pan");
        imprimir("Busco leche");
        buscar(listaCompras,"leche");


        //5-Se cierran los flujos
        archivoEntrada.close();
        objetoEntrada.close();

    }
}
