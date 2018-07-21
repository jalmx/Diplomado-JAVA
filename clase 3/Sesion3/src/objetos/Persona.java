package objetos;

import java.time.LocalDate;
import java.util.Random;

public class Persona {

    public String nombre;
    public int edad;

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public void decirEdad() {
        System.out.println("Mi edad es " + edad);
    }

    public void calcularEdadActual(int anioNacimiento) {
        int anioActual = LocalDate.now().getYear(); //obtengo el año actual
        int edadActual = anioActual - anioNacimiento;//calculo la edad
        System.out.println("Mi edad es " + edadActual);//imprimir mensaje con la edad
    }

    public void cenar(String comida, String bebida) {
        System.out.println("Voy a cenar " + comida + " con un vaso de " + bebida);
    }

    public String hobby() {
        String[] hobbys = {"leer", "correr", "bailar"};
        String h = hobbys[new Random().nextInt(hobbys.length)];

        return h;
    }

    public String mascota(String tipo) {
        String[] perros = {"Chihuahua", "Salchicha", "Labrador"};
        String[] caballos = {"Ponny", "Unicornio", "Pegaso","Pura sangre"};
        
        if (tipo.equalsIgnoreCase("perro")) {
            return perros[new Random().nextInt(perros.length)];
        } else if (tipo.equalsIgnoreCase("caballo")) {
            return caballos[new Random().nextInt(caballos.length)];
        } else {
            return "sin mascota";
        }

    }
}
