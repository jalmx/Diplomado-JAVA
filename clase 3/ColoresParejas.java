import java.util.Random;

public class ColoresParejas {
    public static void main(String[] args) {
        Random r = new Random();//creando instancia

        String datos[][] = {
            {"Jose", "Maria", "Susana"},
            {"Rojo","Morado","Naranja","Cafe","Amarillo","Azul","Blanco","Negro"}
        }; 

        for (int i = 0; i < datos[0].length; i++) {
            System.out.println(datos[0][i] + " le toca el color " + datos[1][r.nextInt(datos[1].length)] );
        }
        
    }

}