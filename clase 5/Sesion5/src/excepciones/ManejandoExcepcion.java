package excepciones;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class ManejandoExcepcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de divisiones");
        Object object = null;

        double v1, v2;

        try {//inicia el try

            System.out.println("Dar el primer valor");
            v1 = sc.nextDouble();
            System.out.println("Dar el segundo valor");
            v2 = sc.nextDouble();
            double resultado = v1 / v2;
            
            //System.out.printf("resultado: %f\n"+ resultado);
            System.out.println(object.getClass());

        }//termina el try
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocurrio un error");
        }
        

    }

}
