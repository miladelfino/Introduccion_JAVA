import java.io.*;

/*
* Leeremos por consola objeto File que almacena al archivo datos.txt 
* */


public class LeerArchivo {
    public static void main(String[] args) throws FileNotFoundException {

        //Instanciacion de los objetos e impresion del contenido por consola
        File archivo = new File("datos.txt");
        FileReader archivoFr = new FileReader(archivo);
        BufferedReader archivoBr = new BufferedReader(archivoFr);

        //Lectura del archivo en String
        //Variable
        String linea;


        //Bloque try-catch para lanzar excepciones
        try{
            //Bucle para la impresion de las lineas del archivo
            while((linea = archivoBr.readLine())!= null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e2) {
            System.out.println("Operacion de E/S interrumpida o fallida");
        } catch (Exception e4){
            System.out.println("Se ha producido un error en la operación");
        } finally {
            /* En finally cerramos el archivo tanto si la operacion fue exitosa
             * como por si alguna excepcion fue capturada*/
            try {
                if(null != archivoFr ){
                    archivoFr.close();
                }
            }catch (Exception e2){
                System.out.println("Se produjo un erro al cerrar el archivo");
            }
        }
    }
}
