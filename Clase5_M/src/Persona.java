
import java.time.LocalDate;


public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        
        if(edad <= 0 || edad > 110){
            throw new IllegalArgumentException("La edad no es posible: "+ edad);
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        
        if(edad <= 0 || edad > 110){
            throw new IllegalArgumentException("La edad no es posible: "+ edad);
        }
        
        this.edad = edad;
    }

    public int getNacimiento(){
        return new Nacimiento(edad).calcularNacimiento();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    private class Nacimiento{
      
        private final int edad;
        
        public Nacimiento(int edad){
            this.edad = edad;
        }
        
        public int calcularNacimiento(){
            return LocalDate.now().getYear() - this.edad;
        }
    }
    
}
