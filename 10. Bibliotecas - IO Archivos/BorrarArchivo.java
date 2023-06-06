import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Realizaremos un programa que borre el archivo de nombre datos.txt creado con la clase CrearArchivo.java
 * */

public class BorrarArchivo {
    public static void main(String[] args) {
        try {
        //Creo nuevamente el objeto con la ruta precisa
        File archivo = new File("datos.txt");


            if (archivo.exists()) {
                System.out.println(archivo.getAbsolutePath());
                if (archivo.delete()) {
                    System.out.println("Fichero eliminado");
                } else {
                    System.out.println("No se ha podido eliminar");
                }
            } else {
                System.out.println("El fichero " + archivo.getAbsolutePath() + " no existe");
            }
        }catch (Exception e){
            System.out.println("Se produjo un error al tratar de borrar el archivo");
        }
    }
}
