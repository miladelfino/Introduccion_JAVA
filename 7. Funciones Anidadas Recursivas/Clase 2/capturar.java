import java.util.Scanner;

public class Capturar {
    //Codifico las funciones capturar
    static int miTeclado(int variable){
        //Declaracion de objeto e instanciacion en una sola linea
        Scanner miTeclado = new Scanner(System.in);
        variable = miTeclado.nextInt();
        //Valor de retorno
        return variable;
    }

    static String miTeclado(String variable){
        //Declaracion de objeto e instanciacion en una sola linea
        Scanner miTeclado = new Scanner(System.in);
        variable = miTeclado.nextLine();
        //Valor de retorno
        return variable;
    }
}
