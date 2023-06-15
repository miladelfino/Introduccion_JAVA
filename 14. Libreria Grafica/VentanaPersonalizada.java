import javax.swing.JOptionPane;

public class VentanaPersonalizada {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola Comision 22922", "Bibliotecas gráficas",-1);
        JOptionPane.showMessageDialog(null, "Ocurrió un error en la operación", "Error",0);
        JOptionPane.showMessageDialog(null, "Está a punto de hacer algo de lo que se puede arrepentir", "Mensaje de Advertencia",1);
        JOptionPane.showMessageDialog(null, "Presione OK para continuar ", "Mensaje interactivo",2);
        JOptionPane.showMessageDialog(null, "Esto es un mensaje de ayuda", "Mensaje informativo",3);
    }
}
