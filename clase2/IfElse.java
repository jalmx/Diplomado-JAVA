import java.util.Scanner;

public class IfElse{

    public static void main(String[] a){
        Scanner leer = new Scanner(System.in);

        System.out.println("Cual es tu sexo?\n1)Hombre\n2)Mujer");
        int valor = leer.nextInt();

        if(valor == 1){
            System.out.println("Macho alfa lomo plateado");
        }else{
            System.out.println("Eres una linda señorita");
        }

    }

}