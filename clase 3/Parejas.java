import java.util.Random;
import java.util.Scanner;

public class Parejas{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas parejas son?");
        int total = scanner.nextInt();

        String nombres[][] = new String[2][total];

        for(int x = 0; x< nombres[0].length; x++){
            System.out.printf("Dar el nombre del hombre no %d: ", (x+1));
            nombres[0][x] = scanner.next();
            System.out.printf("Dar el nombre de la mujer no %d: ", (x+1));
            nombres[1][x] = scanner.next();
        }

        Random random = new Random();

        for (int i = 0; i < nombres[0].length; i++) {
            System.out.printf("Las parejas son: %s con %s  \n",
            nombres[0][random.nextInt(total)], nombres[1][random.nextInt(total)]);
        }
     }
}