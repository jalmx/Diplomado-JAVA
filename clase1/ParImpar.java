public class ParImpar{

    public static void main(String[] a){
        int numero = 13;
        int residuo = numero % 2;

        if(residuo == 0){
            System.out.println(numero + " Es par");
            if(numero > 10){
                System.out.println("Es mayor a 10");
            }
        }

        if(residuo != 0){
            System.out.println(numero +" Es Impar");
            if(numero > 10){
                System.out.println("Es mayor a 10");
            }
        }
    }
}