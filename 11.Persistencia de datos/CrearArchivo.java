import java.io.File;
import java.io.IOException;

public class CrearArchivo {
public static void main(String[] args) throws IOException {

//Declaracion e instanciacion del obj File con el nombre del archivo
File miArchivo = new File("misDatos.txt");

//Creacion del objeto mediante el metodo createNewFile() dentro de un try-catch

try{
    miArchivo.createNewFile();
if(miArchivo.exists()){
    System.out.println("El archivo se ha creado correctamente");
}else{
    System.out.println("No se pudo crear el archivo");
}
}catch (IOException e1) {
    System.out.println("Se produjo un error de E/S" + e1);
}
//Verificacion y seteo del archivo creado
System.out.println("Estado de la escritura "+miArchivo.setWritable(true));
}
}
