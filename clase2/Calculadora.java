import java.util.Scanner;

public class Calculadora {

    public static void main(String[] a) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Qué operación deseas?\n1)Suma\n2)Resta\n3)Multiplicación\n4)División");
        int opcion = leer.nextInt();

        int resultado = 0;
        System.out.println("Dar primer valor");
        int valor1 = leer.nextInt();
        System.out.println("Dar segundo valor");
        int valor2 = leer.nextInt();

        switch (opcion) {
        case 1:
            resultado = valor1 + valor2;
            System.out.println("El resultado es " + resultado);
            break;
        case 2:
            resultado = valor1 - valor2;
            System.out.println("El resultado es " + resultado);
            break;
        case 3:
            resultado = valor1 * valor2;
            System.out.println("El resultado es " + resultado);
            break;
        case 4:
            resultado = valor1 / valor2;
            System.out.println("El resultado es " + resultado);
            break;
        default:
            System.out.println("No existe operación");
        }

    }

}