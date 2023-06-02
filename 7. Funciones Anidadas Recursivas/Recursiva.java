public class Recursiva {
    //Hacemos una funcion factorial recursiva
    static long factorial(long n){
        if(n==0){
            return 1; //Esto es el caso base
        }else {
            return n*(factorial(n-1)); //Aquí se produce la recursividad
        }
    }

    public static void main(String[] args) {
     
        //Pruebo la funcion factorial con n=5 y la guardo dentro de una variable long
        
        long t1 = System.nanoTime(); 
        long factorial1= factorial(5);
        long t2 = System.nanoTime();

        System.out.println(factorial1);

        //Realizo un bucle for para compararlo con la funcion recursiva
        long acumulador = 1;

        long t3 = System.nanoTime();
        for(int i=5; i>=1; i--){
            acumulador *= i;   //acumulador = acumulador * i; 
        }
        long t4 = System.nanoTime();

        System.out.println("El tiempo de la funcion recursiva es "+ (t2-t1));
        System.out.println("El tiempo del bucle for es "+ (t4-t3));
    }
}
