import java.util.Scanner;

public class Ternario{

    public static void main(String[] a){

        System.out.println("Dar un valor");
        int valor = new Scanner(System.in).nextInt();

        // int resultado = valor > 5 ? 10 : 0;
        int resultado = resultado(valor);

        String mensaje = valor > 5 ? "Es mayor" : "Es menor";

        System.out.println("El valor es, " +mensaje + ", " + resultado);
    }

}