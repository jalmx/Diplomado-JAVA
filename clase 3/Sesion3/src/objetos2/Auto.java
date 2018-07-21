package objetos2;

import java.util.Arrays;

public class Auto {

    private String nombre;
    private String color;
    private boolean encendido = false;
    
    public Auto(){//constructor vacío
        this.nombre = "Sin nombre";
    }
    public Auto(String nombre){//constructor que recibe un String
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void arrancar() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public void aceleracion() {
        System.out.println("Acelera a 20 km/h");
    }

    public void aceleracion(int tiempo) {
        System.out.println("Acelera a " + (20 * tiempo) + " km/h");
    }

    public void aceleracion(double tiempo) {
        System.out.println("Acelera a " + (20 * tiempo) + " km/h");
    }

    public void aceleracion(double tiempo, int distancia) {
        System.out.println("Acelera a " + (distancia * tiempo) + " km/h");
    }

    public void aceleracion(int distancia, double tiempo) {
        System.out.println("Acelera a " + (distancia * tiempo) + " km/h");
    }

    public void aceleracion(String mensaje) {
        System.out.println("Acelera con " + mensaje);
    }
    
    public void darPasajeros(String... pasajeros){
        System.out.println(Arrays.toString(pasajeros));
    }
    
    
}
