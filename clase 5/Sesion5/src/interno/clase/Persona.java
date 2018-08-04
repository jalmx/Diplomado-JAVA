package interno.clase;

import java.time.LocalDate;

public class Persona {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAnioNacimiento() {
        
        Fecha fecha = new Fecha(edad);
        int anioNacimiento = fecha.getYearActual();
        
        return anioNacimiento;
    }

    private class Fecha {

        private final int year;

        public Fecha(int year) {
            this.year = year;
        }

        public int getYearActual() {
            return LocalDate.now().getYear() - this.year;
        }

    }
}
