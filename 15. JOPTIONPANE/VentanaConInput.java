import javax.swing.JOptionPane;

public class VentanaConInput {
public static void main(String[] args) {

//Variable
String miInput;

//Inicializacion de la variable
miInput = JOptionPane.showInputDialog(null, "Ingresá tu nombre", "Saludo",-1);

//Muestro el saludo personalizado
JOptionPane.showMessageDialog(null, "Hola "+miInput, "Respuesta", 2);

//Instruccion de salida por consola
System.out.println(miInput);

}
}
