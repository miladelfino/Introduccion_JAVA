import java.io.*;


public class EscribirArchivo {

public static void main(String[] args) throws IOException {
    //Instanciacion de objetos File FW BW
    File miArchivo = new File("misDatos.txt");
    FileWriter miArchivoFW = new FileWriter(miArchivo, true); //true es para cargar al final de la lista
    BufferedWriter miArchivoBW = new BufferedWriter(miArchivoFW);

    try{
        System.out.println("Verificacion de permisos de escrituras "+ miArchivo.setWritable(true));

        //Variables
        String dni, nombre, sueldo, carga;

        //Hardcodeamos las variables, esto se puede optimizar con un bucle while
        dni = "14566456";
        nombre = "Mengano";
        sueldo = "185000";

        carga = dni+","+nombre+","+sueldo;

        //Escritura en el archivo
        miArchivoBW.write(carga); //Carga la linea de datos
        miArchivoBW.newLine(); // Salto de linea

    }catch(IOException e1){
        System.out.println("Lo siento hubo un error en el procesamiento del archivo" + e1);
    }finally {
       miArchivoBW.close();
       System.out.println("** La carga ha sido realizada exitosamente **"); 
    }
}   

}
