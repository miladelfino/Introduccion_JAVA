import java.util.*;

/*
* Programar un sistema de créditos que pida el nombre del usuario y su ingreso medio,
* A partir de los datos ingresados  el programa arrojará el máximo crédito disponible.
* Las lineas de crédito son
* Ingresos inferiores a $ 50000 son clase A
* Ingresos entre $50000 y 100000 son clase B
* Ingresos mayores a 100000 son clase C
*
* En todos los casos el valor de la cuota no debe superar 1/3 del ingreso
* Hasta en 24 cuotas
*
* */

public class DesafioDeClase {
    public static void main(String[] args) {

    //Declaracion de variables
    String nombre;
    double ingresoMedio;
    char clasificacion = 'A';

    //Declaramos nuestro objeto Scanner
    Scanner miTeclado;

    //Inicializacion del objeto
    miTeclado = new Scanner(System.in);

    //Instrucciones de E-S
    System.out.println("Por favor ingrese su nombre:");
    nombre = miTeclado.nextLine();

    System.out.println("Por favor detalle su ingreso medio");
    ingresoMedio = miTeclado.nextDouble();

    //Estructura IF-ELSE-IF
    if(ingresoMedio <= 50000){
        clasificacion = 'A';
    }else if(ingresoMedio>50000 && ingresoMedio<=100000){
        clasificacion = 'B';
    }else if (ingresoMedio > 100000){
        clasificacion = 'C';
    }else{
        System.out.println("Algo no funcionó bien");
    }

    //Procesos
    double valorCuota;
    double valorPrestamo;

    //Inicializamos las nuevas variables
    valorCuota = ingresoMedio/3;
    valorPrestamo = valorCuota*24;

    //Estructura Switch
    switch(clasificacion){
    case 'A':
System.out.println("Hola "+nombre);
System.out.println("Sus ingresos son clasificados como tipo: "+clasificacion);
System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
System.out.println("A devolverlos en 24 cuotas de: $"+ valorCuota);
                break;
case 'B':
System.out.println("Hola "+nombre);
System.out.println("Sus ingresos son clasificados como tipo: "+clasificacion);
System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
System.out.println("A devolverlos en 24 cuotas de: $"+ valorCuota);
                break;
case 'C':
System.out.println("Hola "+nombre);
System.out.println("Sus ingresos son clasificados como tipo: "+clasificacion);
System.out.println("Usted puede pedir un prestamo de hasta: $" + valorPrestamo);
System.out.println("A devolverlos en 24 cuotas de: $"+ valorCuota);
                break;

    }     


    }
    
}
