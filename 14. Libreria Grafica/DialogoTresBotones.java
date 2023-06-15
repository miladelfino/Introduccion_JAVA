import javax.swing.JOptionPane;

public class DialogoTresBotones{
	public static void main(String[] args) {
        //Variable
		int x;
        
        //Mensaje de prueba
        System.out.println("Esperando un evento...");

        //Inicializacion de la variable con JOptionPane
        x = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?", "Atención", JOptionPane.YES_NO_CANCEL_OPTION, 2);		
	

        //Impresion por consola de la opcion capturada
        System.out.println("Opcion elegida (yes=0 no=1 cancel=2): "+x);
}
}
