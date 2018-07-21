import java.util.Scanner;

public class Sexo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);// crear instancia de Scanner

        System.out.println("Cual es tu sexo?\n1)Hombre\n2)Mujer");
        int valor = leer.nextInt();

        String sexo = valor == 1 ? "Hombre" : "Mujer";

        System.out.println("Tu sexo es " + sexo);
    }
}