import javax.swing.JOptionPane;

public class VentanaPersonalizada {
public static void main(String[] args) {

//Array
String[] botones = {"Si", "No", "Cancelar", "No se que hacer"};

//Variable
int respuesta;

//Inicializacion
respuesta = JOptionPane.showOptionDialog(null, "Está seguro que quiere proseguir?", "Alerta", JOptionPane.DEFAULT_OPTION, 2, null, botones, botones[0]);

//Instruccion de salida por consola
System.out.println(respuesta);

}  

}
