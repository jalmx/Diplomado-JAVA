import java.util.Scanner;

public class TablaUsuarioFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué tabla quieres saber?");
        int tabla = sc.nextInt();

        System.out.println("Hasta qué valor quieres?");
        int tope = sc.nextInt();

        for (int x = 2; x <= tope; x+=2 ) {
            int resultado = tabla * x;
            System.out.println(tabla + " X " + x + " = " + resultado);
        }
    }

}