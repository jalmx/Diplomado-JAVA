import java.util.Scanner;

public class CalculadoraInfinita {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora infinita");
            System.out.printf("1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n5)Salir\n");
            int opcion = leer.nextInt();

            int valor1;
            int valor2;

            switch (opcion) {
            case 1:
                System.out.println("Dar valor 1");
                valor1 = leer.nextInt();
                System.out.println("Dar valor 2");
                valor2 = leer.nextInt();
                System.out.println("El resultado es: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Dar valor 1");
                valor1 = leer.nextInt();
                System.out.println("Dar valor 2");
                valor2 = leer.nextInt();
                System.out.println("El resultado es: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Dar valor 1");
                valor1 = leer.nextInt();
                System.out.println("Dar valor 2");
                valor2 = leer.nextInt();
                System.out.println("El resultado es: " + (valor1 * valor2));
                break;
            case 4:
                System.out.println("Dar valor 1");
                valor1 = leer.nextInt();
                System.out.println("Dar valor 2");
                valor2 = leer.nextInt();
                System.out.println("El resultado es: " + ((double) valor1 / valor2));
                break;
            case 5:
                System.out.println("Hasta la vista baby! - - ¬ ");
                break;
            default:
                System.out.println("No existe la opcion");
            }// termina el switch

            if (opcion == 5)
                break;
            
        } // termina while
    }
}