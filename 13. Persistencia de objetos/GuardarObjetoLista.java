import java.util.ArrayList;
import java.io.*;

public class GuardarObjetoLista implements Serializable {
public static void main(String[] args) throws IOException {
    //1-Objeto AL
    ArrayList<String> productos = new ArrayList<>();

    //2-Inicializamos el Objeto AL
        productos.add("pan 1k");
        productos.add("yerba 1k");
        productos.add("leche 1l");
        productos.add("yogur 1litro");
        productos.add("galletitas 3 paquetes");
        productos.add("arroz 1/2k");
        productos.add("gelatina 1 caja");
        productos.add("alcohol en gel");
        productos.add("Lavandina 1l");

    //3- Guardo el AL en local
    File archivo = new File("miLista.dat");
    FileOutputStream archivoSalida = new FileOutputStream(archivo);
    ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);

    //4- Escribo explicitamente el objeto ArrayList dentro del archivo miLista.dat
    objetoSalida.writeObject(productos);

    //5- Verificacion en if else
    if(archivo.exists()) {
            System.out.println("El archivo se ha creado correctamente");
    }else {
            System.out.println("El archivo no se pudo crear");
        };

    //6- Cerramos flujos
    archivoSalida.close();
    objetoSalida.close();

}
}
