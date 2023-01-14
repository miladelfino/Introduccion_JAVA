public class SentenciaBreakContinue{
    public static void main(String[] args) {
        
        //Declaro variables e inicializo
        int intento = 0;
        String clave = "5";
        String claveControl = "124";

        //Bucle for
        for(int i = 1; i<=3; i++){
            if(clave == claveControl){
                System.out.println("Contraseña correcta");
                System.out.println("Intentos "+i);
                intento ++;
                continue;
            }
            System.out.println("Intentos "+i);
        }

            if (intento == 1)
            System.out.println("Se utilizó un break y produjo un solo bucle i=" + intento);

            if(intento == 3)
            System.out.println("Se utilizo un continue por lo tanto hubieron 3 recorridos" + intento);

            System.out.println("** El programa finalizo **");

    }
    
}
