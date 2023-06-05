/*
 * Mediante una funcion accederemos a un array.
 * Esta funcion arrojara una excepcion del tipo ArrayIndexOutOfBoundsException
 * en caso de querer acceder a un index no existente
 * El lanzamiento throws se realizará desde el método main 
 * El error será gestionado con el bloque try-catch-finally en el metodo main. *
 * */
public class OutBoundIndex {

//Zona de funciones, programo la funcion dividir con un lanzamiento de excepciones
    
    public static double accederArray (double [] v, int j) {
       //Estructura de control para evaluar la condicion de existencia del indice
       if (0 <= j && j < v.length){
       return v[j];
       }else{
       //Si el indice no existe arrojo una excepcion
       throw new ArrayIndexOutOfBoundsException ("El indice " + j + " no existe en el vector");
       }
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        //Declaracion e inicializacion de un array
        double [] v = new double [15];

        //Proceso
        try{
        accederArray (v, 14);
            System.out.println("El indice indicado existe, no se produjo una excepcion");
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("El indice indicado no existe, se produjo una excepcion");
        } finally {
            System.out.println("Busqueda finalizada");
        }


    }
}
