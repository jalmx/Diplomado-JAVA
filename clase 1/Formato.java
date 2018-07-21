
public class Formato {

    public static void main(String[] args) {
        
        double numero = 8934.4645623;
        String texto = "Mensaje";
        int digito = 35;

        System.out.printf("El digito es: %d\n", digito);
        System.out.printf("El numero es: %2.2f\n", numero);
        System.out.printf("El texto es: %.2s\n", texto);
    }
}