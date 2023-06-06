import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
* Trabajaremos con el objeto File y sus operaciones básicas
* Crear, leer, actualizar y borrar.
* */

public class CrearArchivo {
    public static void main(String[] args){

        /* *** CREAR *** */
        //Declaracion e instanciacion del objeto File con la ruta a la carpeta
        //File ruta = new File("C:\\miCarpetaJava");

        //Declaracion e instanciacion del objeto File con el nombre del archivo
        File archivo = new File("datos.txt");


       //Creación del objeto mediante el metodo createNewFile();
        try {
            archivo.createNewFile(); //O colocarlo como argumento logico en el if
            // A partir del objeto File creamos el fichero físicamente
            if (archivo.exists())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No se ha podido crear el fichero");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //Verificamos si el archivo tiene permisos de escrituras
        System.out.println("Verficacion de permisos de escrituras: " + archivo.setWritable(true));

    }
}
