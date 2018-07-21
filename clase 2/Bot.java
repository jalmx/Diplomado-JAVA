import java.util.*;

public class Bot {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String dialogos[] = { "vamos por un vaso de agua", "toma el dinero de tu mama", "vamonos por las cheves",
                "vamos de pinta", "Vamos a jugar!, vente conmigo" };

        System.out.println("Hola, Como te llamas?");
        String nombre = sc.nextLine();

        System.out.println("Mucho gusto!, tienes un lindo nombre, " + nombre);

        Thread.sleep(1000);
        System.out.println("Cuantos anios tienes?");
        int edad = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Orale!, yo tengo " + (edad + new Random().nextInt(6)));
        Thread.sleep(1000);
        System.out.println("Te gustan los juegos?");
        String juego = sc.next();

        if (juego.equalsIgnoreCase("si")) {
            System.out.println("A mi tambien!");
            Thread.sleep(1000);
            while (true) {
                System.out.println("Quieres jugar conmigo?");
                juego = sc.next();
                if (juego.equalsIgnoreCase("si")) {
                    Thread.sleep(1000);
                    System.out.println(dialogos[new Random().nextInt(dialogos.length)]);
                    break;
                } else {
                    Thread.sleep(1000);
                    System.out.println("Nos vemos en tus pesadillas >:(");
                }
            }
        } else {
            Thread.sleep(1000);
            System.out.println("Nos vemos en tus pesadillas >:(");
        }

    }
}