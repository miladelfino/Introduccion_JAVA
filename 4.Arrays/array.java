public class MiArray{
    public static void main(String[] args) {
        
        //Declaracion de un array
        int[] numeros;

        //Instanciacion
        numeros = new int[3];

        //Inicializacion
        numeros[0] = 1; //Indice 0 posicion 1
        numeros[1] = 5; //Indice 1 posicion 2
        numeros[2] = 15;//Indice 2 posicion 3

        //Declaracion de otra array en una sola linea
        String[] frutas = {"limon", "naranja", "frutilla"};

        //Recorrido por el array para imprimirlos
        for(int i=0; i<numeros.length; i++){
            System.out.println("Array de numeros "+ numeros[i]);
        }

        //Impresion de un objeto en particular
        System.out.println("El elemento del index 1 es "+ numeros[1]);

        //Reescritura
        numeros[2] = 16;

        System.out.println("El nuevo elemento del index 2 es "+numeros[2]);


    }
}
