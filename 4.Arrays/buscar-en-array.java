import java.util.ArrayList;

public class BuscarEnArray{
    public static void main(String[] args) {
        //Declaro un arraylist
        ArrayList<String> productos;

        //Instancio el arraylist
        productos = new ArrayList<String>();

        //Agrego productos al arraylist
        productos.add("pan");
        productos.add("yerba");
        productos.add("leche");
        productos.add("yogur");
        productos.add("galletitas");
        productos.add("arroz");

        //Buscamos en el arraylist
        //Declaro una variable para buscar y las inicializo
        String buscador = "pan";

        for (String producto : productos) {
            if (producto.equals(buscador)) {
                System.out.println("Tenes que comprar este producto: " + buscador);
            }
        }
}
}
