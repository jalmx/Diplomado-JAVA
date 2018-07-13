import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //creo una instancia de Scanner

        System.out.println("Cuántos valores darás?");
        int total = leer.nextInt();// guardo el valor total de números que va a ingresar el usuario
        int suma = 0;//declaro mi variable en donde voy a guardar la suma

        for (int i = 0; i < total; i++) {
            System.out.printf("Dar el valor %d\n", i + 1);
            int valor = leer.nextInt();
            suma += valor;
        }

        double resultado = (double) suma / total;

        System.out.println("La media es " + resultado);
    }
}