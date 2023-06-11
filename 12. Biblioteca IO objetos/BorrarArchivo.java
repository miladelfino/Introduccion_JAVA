import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        File archivo = new File("miLista.dat");

        if(archivo.exists()){
            archivo.delete();
            System.out.println("Archivo borrado");
        }else{
            System.out.println("No se puede borrar el archivo");
        }

    }
}
