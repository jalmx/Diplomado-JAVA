package objetos2;

public class Persona {

    private String nombre;
    private int edad;

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre
                + " tengo " + edad + " años");
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {        
        return nombre;
    }

    public void asignarEdad(int edadPersona) {
        edad = edadPersona;
    }

    public int obtenerEdad() {
        return edad;
    }

    private String generarGeneracion(){
        if (edad > 0) {
            if (edad >= 50) {
                return "Eres generación X";
            } else {
                return "Eres mileniam";
            }
        }else{
            return "No se encuentra generación";
        }
    }

    public String obtenerGeneracion() {  
        return this.generarGeneracion();
    }
}
