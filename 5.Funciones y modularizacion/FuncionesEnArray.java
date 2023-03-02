public class FuncionesEnArray{
//1- Funcion para hallar la long de un Array numerico
    static void size(int [] nombreArray){
        System.out.println("La longitud del array es "+nombreArray.length);
    }
//2- Funcion para hallar la long de un Array String
   static void size(String [] nombreArrayString){
        System.out.println("La longitud del array es "+nombreArrayString.length);
    }
//3- Funcion para imprimir leyendas
    static void imprimir(String leyenda){
        System.out.println(leyenda);
    }

//4- frutas[index]="foo"; vamos a hacer nuestro set
 static void set(int [] nombreArray, int indice, int nuevoValor){
     nombreArray[indice] = nuevoValor;
 }

 //5- Funcion imprimir mi array
 static void imprimir(int[] nombreArray){
 for(int nombre: nombreArray){
     System.out.println(nombre);
 }
 }

    public static void main(String[] args) {

    //Declaramos, instanciamos e inicializamos un array
    int [] numeros = {23,89,54};
    int [] numeros1 = {23,89,12,59,84,54};
    int [] numeros2 = {23,89,12,159,123,0,5,54};
    String [] nombres = {"Fulana","Mengano"};

    //Hallo la longitud con mi propia funcion
    imprimir("La logitud de numeros es");
    size(numeros);
    imprimir("La logitud de numeros1 es");
    size(numeros1);
    imprimir("La logitud de numeros2 es");
    size(numeros2);
    imprimir("La logitud de nombres es");
    size(nombres);

    imprimir("Los valores de numeros1 son:");
    imprimir(numeros1);

    //Seteo de valores
    set(numeros1, 3, 80);

    //Imprimimos la funcion
    imprimir("Los nuevos valores de numeros1 son:");
    imprimir(numeros1);     
    }
}
