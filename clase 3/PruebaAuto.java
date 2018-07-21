import java.util.Scanner;

public class PruebaAuto {
    
    public static void main(String[] args) {
        
        Auto vochito = new Auto();//he creado una instancia de Auto

        vochito.arrancar();//estoy llamando al método arrancar
        vochito.acelerar();//estoy llamando al método acelerar

        vochito.kilometraje = 10000;
        vochito.noPuertas = 2;
        
        System.out.println("El kilometraje es " + vochito.kilometraje );
        System.out.println("No de puertas es " + vochito.noPuertas);
    }
}