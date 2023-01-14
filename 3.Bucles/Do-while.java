public class DoWhile{
    public static void main(String[] args) {
        //Declaramos variables e inicializamos
        int n = 5; //El numero a hacer factorial
        int f = 1; //Es un acumulador 
        int i = 1; //Es un contador

        //Bloque do-while
        do{
            f = f*i;
            i++;
        }while(i<=5);

        System.out.println("El factorial de " +n+" es: "+f);
        System.out.println("** El programa finalizó **");



    }
    
}
