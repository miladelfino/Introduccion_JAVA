import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Scanner;

/**
 *  Crea una aplicación llamada Calculadora, nos pedirá 2 operandos (int) y un signo aritmético (String),
 *  según este último se realizara la operación correspondiente.
 *  Al final mostrara el resultado en consola.
 *
 * Los signos aritméticos disponibles son:
 *
 * +: suma los dos operandos.
 * -: resta los operandos.
 * *: multiplica los operandos.
 * /: divide los operandos, este debe dar un resultado con decimales (double)
 * ^:  1º operando como base y 2º como exponente.
 * %:  módulo, resto de la división entre num1 y num2.
 * */

public class Calculadora {

    public static void main(String[] args) {
        //Objeto icono
        Icon miIcono = new ImageIcon("calculadora.gif");
        Icon miIcono2 = new ImageIcon("calculadora-120.png");

        //Bienvenida
        JOptionPane.showMessageDialog(null,"Te doy la bienvenida a la calculadora","Bienvenida",-1,miIcono);

        //Declaracion de variables
        double num1, num2;
        String operacion, str1, str2;
        double resultado=0; // La inicializo en 0

        //Instrucciones con Inputs Dialogs se almacenan primero en string luego se los parsea
        str1 = (String) JOptionPane.showInputDialog(null,"Escriba el primer numero","Primer numero",-1,miIcono,null,"");
        num1 = Double.parseDouble(str1);

        //Menu
        operacion= (String) JOptionPane.showInputDialog(null,"Escribe el codigo de operacion\n[+] suma\n[-] resta\n[*] multiplicacion\n[/]division\n[^] potencia\n[%] modulo ","Calculadora", -1,miIcono,null,"");

        //Instruccion salida-entrada
        str2 = (String) JOptionPane.showInputDialog(null,"Escriba el segundo numero","Primer numero",-1,miIcono,null,"");
        num2 = Double.parseDouble(str2);

        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
                resultado=num1+num2;
                break;
            case "-":
                resultado=num1-num2;
                break;
            case "*":
                resultado=num1*num2;
                break;
            case "/":
                resultado=num1/num2;
                break;
            case "^":
                resultado=(int)Math.pow(num1, num2);
                break;
            case "%":
                resultado=num1%num2;
                break;
        }

        //Resultado
        JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+resultado,"Resultado",-1, miIcono2);

    }
}
