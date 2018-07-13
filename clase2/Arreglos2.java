import java.util.Random;

public class Arreglos2{

    public static void main(String[] args) {
        
        int arreglo[] = {2,5,6,4,8,5,9};//array con datos definidos

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("En la posición %d hay el valor %d\n",i, arreglo[i]);
        }

        System.out.println("-----------------------------");

        Random random = new Random();//creo una instancia de un objeto Random

        int arreglo2[] = new int[5]; //array con 5 espacios, vacíos

        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = random.nextInt(10); //guardo un número random menor a 10
        }

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("El valor almacenado es: " + arreglo2[i]);
        }

    }
    
}