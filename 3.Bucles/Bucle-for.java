public class BucleFor{
    public static void main(String[] args) {

        //Declaracion de variables
        int n = 5; // El numero a hace factorial
        int f = 1; // Acumulador

        //Bucle for
        for( int i =1; i<=5; i++){
            f = f*i;
            System.out.println("El resultado es "+i);
        } 

        System.out.println("El resultado es "+f);
        System.out.println("** El programa finalizó **");

    }
      

}
