public class OperadorTernario{
    public static void main(String[] args) {
        
      //Declaro la variable
      int num = 70;

      //Operador ternario
      String txt = (num > 60 )?"Aprobado":"Reprobado";

      System.out.println("El alumno está "+txt);
      System.out.println("*** El programa finalizó ***");   

    }
    
}
