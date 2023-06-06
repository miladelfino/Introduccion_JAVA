import java.io.*;

public class BorrarArchivo {
public static void main(String[] args) throws IOException {
    //Objeto File
    File archivo = new File("misDatos.txt");

    //Estructura If
    if(archivo.exists()){
        archivo.getAbsolutePath();
        archivo.delete();

        if(!archivo.exists()){
            System.out.println("Archivo eliminado");
        }else {
            System.out.println("No se ha podido eliminar el archivo");
        }
    }else {
        System.out.println("El archivo "+archivo.getAbsolutePath()+" no existe");
    }
} 
}
