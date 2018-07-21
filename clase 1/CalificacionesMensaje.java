import java.util.Scanner;//importando la libreria Scanner

public class CalificacionesMensaje {

    public static void main(String[] args) {
        Scanner patito = new Scanner(System.in);//instancia de Scanner

        System.out.println("Ingresar calificacion");
        double calificacion = patito.nextDouble();//recibe lo escrito en pantalla

        if (calificacion > 10 || calificacion < 0) {
            System.out.println("No es posible");
        }

        if (calificacion < 6 && calificacion >= 0) {
            System.out.println("Lastima margarito");
        }

        if ((calificacion >= 6) && (calificacion < 7)) {
            System.out.println("De panzaso");
        }

        if ((calificacion >= 7) && (calificacion < 8)) {
            System.out.println("Echale mas punch");
        }

        if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Bien, puedes mejorar");
        }
        if (calificacion >= 9 && calificacion < 10) {
            System.out.println("Muy bien, te falto tantito");
        }

        if (calificacion == 10) {
            System.out.println("Excelente");
        }

    }
}