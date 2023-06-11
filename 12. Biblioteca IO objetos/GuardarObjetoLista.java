import java.io.*;
import java.util.ArrayList;

/*
* Creamos un arraylist y lo almacenamos en un archivo dat
* */

public class GuardarObjetoLista implements Serializable {

    public static void main(String[] args) throws IOException {
        //1- Declaramos en instanciamos un objeto ArrayList
        ArrayList<String> productos = new ArrayList<>();

        //2- Inicializamos el objeto ArrayList
        productos.add("pan 1k");
        productos.add("yerba 1k");
        productos.add("leche 1l");
        productos.add("yogur 1litro");
        productos.add("galletitas 3 paquetes");
        productos.add("arroz 1/2k");
        productos.add("gelatina 1 caja");
        productos.add("alcohol en gel");
        productos.add("Lavandina 1l");

        //Guardo el ArrayList en local

        //Inicializacion de los objetos como null fuera del try
        //3- Creamos un fujo de salida a disco, pasándole el nombre del archivo en disco o un objeto de la clase File.
        File archivo = new File("miLista.dat");
        FileOutputStream archivoSalida = new FileOutputStream(archivo);

        //4- El fujo de salida dado por el objeto ObjectOutputStream
        // es el que procesa los datos del objeto archivoSalida preparandolo para la escritura de salida .
        ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);

        //5- El método writeObject escribe los objetos al flujo de salida y los guarda en un archivo en disco.
        // Por ejemplo, un string y un objeto de la clase ArrayList.
        objetoSalida.writeObject(productos);

        //Borrar
        //archivo.delete();

        //6- Finalmente, se cierran los flujos
        archivoSalida.close();
        objetoSalida.close();

        }
    }

