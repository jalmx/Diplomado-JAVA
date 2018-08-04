package excepciones;

public class PersonaException extends IllegalArgumentException{

    public PersonaException(){
        super();
    }
    
    public PersonaException(int edad) {
        super("Edad no valida " + edad);
    }
    
    
}
