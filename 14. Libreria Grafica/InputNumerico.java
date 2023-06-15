import javax.swing.JOptionPane;

public class InputNumerico {
	public static void main(String[] args) {
        //Variables
        String miInput;
        double miNumero, resultado;

        miInput = JOptionPane.showInputDialog(null, "Introduce un numero", "Ventana con Input",-1);        

        //Parseo para llevar de String a numero
		miNumero = Double.parseDouble(miInput);
		
        resultado = miNumero *2;

        JOptionPane.showMessageDialog(null, "El resultado es "+resultado,"Cálculo",-1);

        System.out.println("** El programa finalizó correctamente **");
        
	}
}
