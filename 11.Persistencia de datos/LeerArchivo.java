import java.io.*;

public class LeerArchivo {
public static void main(String[] args) throws IOException {

//Instanciacion de los objetos para manipulacion del archivo
File archivo = new File("misDatos.txt");
FileReader archivoFR = new FileReader(archivo);
BufferedReader archivoBR = new BufferedReader(archivoFR);

//Variable
String linea;

//Proceso, hacemos un bucle while
while((linea = archivoBR.readLine())!= null){
    System.out.println(linea);
}

archivoBR.close();


}
}
