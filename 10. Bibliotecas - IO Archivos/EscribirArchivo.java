import java.io.*;

/*
* Esctibiremos objeto File que almacena al archivo datos.txt 
* */

public class EscribirArchivo {
    public static void main(String[] args) throws IOException {

        //Instanciación de objetos
        File archivo = new File("datos.txt");
        FileWriter archivoFw = new FileWriter(archivo,true) ;
        BufferedWriter archivoBw = new BufferedWriter(archivoFw);


        //Bloque try-catch
        try{
            //Verificamos si el archivo tiene permisos de escrituras
            System.out.println("Verficacion de permisos de escrituras: "+ archivo.setWritable(true));

            //Variables para la carga de datos
           String dni, nombre, apellido, sueldo, carga;

            //Hardcodeamos sabiendo que esto se puede optimizar con un bucle while
                dni = "385261497";
                nombre = "Mengano";
                apellido = "Fulanez";
                sueldo = "160000";

                carga = dni+","+nombre+","+apellido+","+sueldo;

                //Escritura en el archivo
                archivoBw.write(carga); // Carga la linea de datos
                archivoBw.newLine();    // Salta una linea

        }  catch (FileNotFoundException e1) {
            System.out.println("Archivo no encontrado");
        }  catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lo siento el archivo no se puede imprimir ni cerrar");
        }finally {
            archivoBw.close();
            System.out.println("** La carga ha finalizado exitosamente el archivo ha sido cerrado **");
        }
    }
}
