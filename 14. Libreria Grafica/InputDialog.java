import javax.swing.JOptionPane;

public class InputDialog {
	public static void main(String[] args) {
        //Variables
        String miInput;
        
        //Inicializacion de la variable con JOptionPane
        miInput = JOptionPane.showInputDialog(null, "Introduce una frase", "Ventana con Input",-1);        

        //Imprimo por consola el dato almacenado en la variable
        System.out.println("El mensaje es: "+miInput);
        System.out.println("** El programa finalizó correctamente **");
        
	}
}
