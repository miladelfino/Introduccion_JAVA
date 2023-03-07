public class Superficie {
    
    static double circulo(double radio){
        //VL
        double sup = Math.PI*radio*radio;
        //Valor de retorno
        return sup;
    }
    
    static double rectangulo(double base, double altura){
        //Variable local
        double sup = base*altura;
        //Valor de retorno
        return sup;
    }

    static double cuadrado(double lado){
        //Variable local
        double sup = lado*lado;
        //Valor de retorno
        return sup;
    }

    //Funciones anidadas
    //Superficie del cilindro
    static double cilindro(double radio , double altura){
        //Superficies de tapa y piso
        double supCirculos = 2*circulo(radio);
        //Hallamos la base del rectangulo
        double base = Perimetro.circulo(radio);
        //Hallamos la superficie del rect
        double supRectangulo = rectangulo(base, altura);
        //Valor de retorno
        return supCirculos+supRectangulo;
    }

}
