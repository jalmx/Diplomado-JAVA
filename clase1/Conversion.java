public class Conversion{

    public static void main(String[] args) {
        // 2.54cm = 1 pulg
        double centimetros = 2.54;
        double pulgada = 1;

        double variable = 5;//centímetros

        double resultado = (variable * pulgada) /centimetros;

        System.out.println(variable +" cm es " + resultado + " pulgadas");

        System.out.printf("%.2f cm es %.4f pulgadas\n",variable,resultado);
    }
}