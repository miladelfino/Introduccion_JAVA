/*
Objetivo obtener de numeros enteros comprendidos en un rango entre dos numeros cualesquiera
1- Veremos el método random, vamos a programar un bucle for y veremos qué números arroja.
2- Lo vamos a afectar de un número entero para ver que resulta.
3- Lo vamos a afectar de un rango numerico para ver que resulta.
4- Lo vamos a redondear con el método floor.
5- Casteamos al tipo Int para poder utilizarlo como índice en un array.
*/

public class MetodoRandom {
public static void main(String[] args) {

 //1- Metodo random
 System.out.println(Math.random());

 //2- Metodo random afectado de una constante
 System.out.println(Math.random()*100);

 //3-Lo escribimos dentro de un for
 for(int i =0; i<10; i++){
  System.out.println(Math.random()*100);
 }
 
  //4- Quiero generar numero cualesquiera entre el 50 y el 100
  for(int i =0; i<10; i++){
  System.out.println(Math.random()*(100-50)+50);
 }

  //5- Quiero generar numero cualesquiera entre el 50 y el 100 que sean enteros
  for(int i =0; i<10; i++){
  System.out.println(Math.floor(Math.random()*(100-50)+50));
 }

 for(int i =0; i<10; i++){
  int numRandom = (int)Math.floor(Math.random()*(100-50)+50);   
  System.out.println(numRandom);
 } 
}
}
