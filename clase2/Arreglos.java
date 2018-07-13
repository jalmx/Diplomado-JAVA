public class Arreglos {

    public static void main(String[] args) {

        int arreglo[] = { 2, 5, 6, 4, 8, 5, 9 };

        System.out.println("En la posición 0 hay el valor " + arreglo[0]);
        System.out.println("En la posición 1 hay el valor " + arreglo[1]);
        System.out.println("En la posición 3 hay el valor " + arreglo[3]);
        System.out.println("En la posición 6 hay el valor " + arreglo[6]);

        System.out.print("---------------------\n");// separador visual

        int arreglo2[] = new int[4]; // array de 4 espacios
        arreglo2[0] = 8; // ingresando datos
        arreglo2[1] = 6; // ingresando datos
        arreglo2[2] = 9; // ingresando datos
        arreglo2[3] = 7; // ingresando datos

        System.out.println("En la posición 0 hay el valor " + arreglo2[0]);
        System.out.println("En la posición 1 hay el valor " + arreglo2[1]);
        System.out.println("En la posición 2 hay el valor " + arreglo2[2]);
        System.out.println("En la posición 3 hay el valor " + arreglo2[3]);
    }

}