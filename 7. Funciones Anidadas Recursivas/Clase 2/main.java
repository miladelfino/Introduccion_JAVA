public class Main {
    public static void main(String[] args) {
        //Declaramos dos variables
        String nombre;
        String clave;

        //Instrucciones S-E
        Imprimir.mensaje("Ingrese su nombre");
        nombre = Capturar.miTeclado("");
        Imprimir.mensaje("Ingrese su clave");
        clave = Capturar.miTeclado("");

        //Procesos y resultados. Utilizamos la funcion anidada
        Funcion.verificar(nombre, clave);
    }
}
