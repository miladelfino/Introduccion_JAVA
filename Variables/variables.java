public class Main {

    public static void main(String[] args) {

     //Dclaramos variables
     String nombre;
     String nombrE;

     //Inicializamos
     nombre = "Fulano";
     nombrE = "Mengano";

     //Por instruccion de salida
     System.out.println("nombre es "+ nombre);
     System.out.println("nombrE es "+ nombrE);

      //Operadores de asignacion
      //Declaro variables en una sola linea
      int c, f, g;

      //Inicializo mis variables
      c = f = g = 5;

      //Operaciones con operadores compuestos
      c +=5;   // c = c+5
      f -=2;   // f = f-2
      g *=2;    // g = g*2 

      //Instrucciones de salida
      System.out.println("c es " + c); 
      System.out.println("f es " + f); 
      System.out.println("g es " + g); 

    //Incrementales
    //Declaracion de variables e inicializacion la hago en el mismo renglon

    int a = 1;
    int b = 1;

    //a= a+1   ++a 

    //Instrucciones de salida
    //System.out.println("a con preincremento vale "+ ++a);
    System.out.println("a con postincremento vale "+ a++);
    System.out.println("a luegro del postincremento es "+ a);  

    //Operaciones relaciones < > == != ===
    //Declaramos variables
    boolean cond1, cond2;

    //Inicializamos
    cond1 = 3<5;
    cond2 = 6 == 7;

    //Instrucciones de salida
    System.out.println("Condicion 1 "+ cond1);
    System.out.println("Condicion 2 "+ cond2);

    //Operaciones Logicas AND && OR || NOT !
    boolean name = true;
    boolean nick = false;
    boolean pass = true;

    //Imprimimos por consola 
    System.out.println("La verificacion del nombre del usuario "+(name || nick));
    System.out.println("La verificacion de usr y cntr es "+ ((name||nick)&&pass));
    System.out.println("La negacion de lo anterior es "+ !((name||nick)&&pass));


    }

}
