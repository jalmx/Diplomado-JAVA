package objetos2;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.asignarNombre("Manuel");
        persona.asignarEdad(20);

        System.out.println("Mi nombre es " + persona.obtenerNombre());
        System.out.println("Mi edad es " + persona.obtenerEdad());

        persona.saludar();
        
        System.out.println(persona.obtenerGeneracion());
        
    }

}
