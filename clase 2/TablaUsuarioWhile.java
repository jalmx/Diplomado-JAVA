import java.util.Scanner;

public class TablaUsuarioWhile{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Qué tabla deseas?");
        int  tabla = leer.nextInt();

        int contador = 1;
        
        while(contador <= 10){
            int resultado = contador * tabla;
            System.out.println(tabla + " X " + contador + " = " + resultado);
            contador++;
        }
    }
}