
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josef
 */
public class Suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

//        try {

            System.out.println("Dar un valor entero");
            valor1 = sc.nextInt();

             System.out.println("Dar un valor entero");
            valor2 = sc.nextInt();
            
            System.out.println("El division: " + valor1/valor2);

//        }catch (Exception e) {

//            System.out.println( "Hubo un error de tipo: " + e.getMessage());
            //System.out.println( "no se puede dividir entre cero");

//        }
//        catch(InputMismatchException e){
//            
//            System.out.println("No se aceptan letras");
//        }

    }

}
