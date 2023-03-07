import java.util.Scanner;

public class Capturar {

    static int miTeclado(int variable){
        //Declaro el objeto y lo instancio en una linea
        Scanner miTeclado = new Scanner(System.in);
        variable = miTeclado.nextInt();
        return variable;
    }

    static String miTeclado(String variable){
        //Declaro el objeto y lo instancio en una linea
        Scanner miTeclado = new Scanner(System.in);
        variable = miTeclado.nextLine();
        return variable;
    }


}
