import javax.swing.JOptionPane;

public class VentanaTresBotones {
    public static void main(String[] args) {

     //Variable
     int respuesta;

     //Inicializamos la variable
     respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere salir del programa?", "Atención", JOptionPane.YES_NO_CANCEL_OPTION, 2);

     //Instruccion de salida por consola
     System.out.println(respuesta);

    }      

}
