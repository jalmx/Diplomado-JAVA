import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creo la instancia 
        double suma = 0.0;//declaro variable double, donde voy sumar el total

        System.out.println("Cuántos valores tienen?");
        int total = sc.nextInt();

        double datos[] = new double[total];
        //datos.length// el tamaño del array

        for (int i = 0; i < datos.length; i++) { // guardo los datos
            System.out.println("Dar el valor " + (i + 1));
            double dato = sc.nextDouble();
            datos[i] = dato;
            suma += dato;
        }

        double media = suma / total;

        double sumaDesv = 0;

        for (int i = 0; i < total; i++) {
            sumaDesv += Math.pow(datos[i] - media, 2);
        }

        double desviacionEstandar = Math.sqrt(sumaDesv / datos.length);

        System.out.printf("La media es: %.2f\nla desviación estandar es: %.2f\ntamanio de muesta %d\n", media, desviacionEstandar,total);

    }
}