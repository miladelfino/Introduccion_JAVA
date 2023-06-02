public class Funcion {

static String saludar( String nombre ){
    //Creamos una VL e inicializamos
    String saludo = "Hola. Bienvenido/a "+nombre;
    //Valor de retorno
    return saludo;  
}

static String error( String nombre){
    //Creamos una VL e inicializamos
    String error = "Ups. No pudimos validar tus datos, por favor "+nombre+" intentalo mas tarde";
    //Valor de retorno
    return error;
}

//Funcion principal que anida al resto

static void verificar(String nombre, String clave){
    //Declaracion e inicaalizacion de variables
    String nombreValido = "Codo";
    String claveValida = "22915";

    //Validación de datos
    if(nombreValido.equals(nombre)&&claveValida.equals(clave)){
        //Esta es una funcion de otra clase que recibe como parametro otra funcion de esta clase
        Imprimir.mensaje(saludar(nombre));
        return;
    }
    //Si los datos no validos
    Imprimir.mensaje(error(nombre));
  }
}
