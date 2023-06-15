import javax.swing.JOptionPane;

public class DialogBotonesPersonalizados {
public static void main(String[] args) {

//Inicializo un array, las opciones se almacenan en un array
String[] opciones = {"Si", "No", "Cancelar", "No se que hacer"};

//Inicializo una variable del tipo int donde se almacenará la opcion escogida con un valor numerico
int x;

//Mensaje de prueba
System.out.println("Esperando un evento...");

//Inicializo el JOptioPane
x= JOptionPane.showOptionDialog(null, "Está seguro que quiere proseguir", "Alerta", JOptionPane.DEFAULT_OPTION, 2, null, opciones, opciones[0]);

//Imprimo el resultado por consola
System.out.println("La opcion elegida es "+ x);

}
}
