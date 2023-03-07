public class Main {
    public static void main(String[] args) {

    System.out.println(Perimetro.circulo(1));
    System.out.println(Perimetro.circulo(2));
    System.out.println(Perimetro.circulo(15));
    System.out.println(Perimetro.circulo(32));

    System.out.println(Superficie.rectangulo(2,5));

    System.out.println(Superficie.cilindro(1,10));

    //Redondeo de resultados
    double redondeo = Math.round(Superficie.cilindro(1,10)*1000);

    System.out.println(redondeo/1000); 
        
    }      

}
