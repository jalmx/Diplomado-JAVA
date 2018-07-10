public class SegundaLey{

    public static void main(String[] args) {
        System.out.println("Ejercicio de segunda Ley");

        double aceleracion = 10; //metros/seg^2
        double masa = 2.5; //masa en kilogramos

        double fuerza = aceleracion * masa;
        
        System.out.println("La aceleracion es " + aceleracion+ "m/s2 y la masa es " + masa +"kgs = " + fuerza +" Newtons");

        //segunda parte del problema

        aceleracion = 12.6; //metros/segundo^2, reasigno valor
        fuerza = aceleracion * masa;

        System.out.println("La aceleracion es " +
        aceleracion+ "m/s2 y la masa es " +    
        masa +"kgs = " + fuerza +" Newtons");

    }//termina método main
}