public class Perimetro {
    static double circulo(double radio){
        //1-Declaro e inicializo mi VL
        double perim = 2*radio*Math.PI;
        //2-Valor de retorno
        return perim;

    }

    static double rectangulo(double base, double altura){
        //1-Declaro VL
        double perim = 2*base+2*altura;
        //2-Retorno del valor
        return perim;
    }

    static double cuadrado(double lado){
        //Declaro VL
        double perim = 4*lado;
        //Valor de retorno
        return perim;
    }
    

}
