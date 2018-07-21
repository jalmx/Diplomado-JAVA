import java.util.Scanner;

public class IgnorarPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int x = 0; x <= 1000; x++) {
            System.out.println("Dar un valor");
            int valor = sc.nextInt();

            if (valor == -1) {
                break;// rompe el for y salte
            }

            if (valor % 2 == 0) {
                System.out.println("Es par y se ingnora");
                continue;// ignora todo lo que está por debajo de él
            }
            suma += valor;
        }

        System.out.println("La suma es: " + suma);
    }
}