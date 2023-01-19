public class Promedios {
    public static void main(String[] args) {
        //Declaracion e inicializacion del array
        int[] notas = {8,7,9,5,6,3,8,10,3,7};
        int suma = 0; //esto es un acumulador
        double promedio = 0;

        //Estructura for-each

        for(int i:notas){

            suma += i; //Es lo mismo que decir suma = suma + i
        }

        //Procesos
        promedio = suma/notas.length;

        System.out.println("El promedio total es "+promedio);

    }
}
