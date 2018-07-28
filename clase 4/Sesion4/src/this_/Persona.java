package this_;

public class Persona {
    
    private String nombre;
    
    public Persona(){
//        this("Sin nombre");//estoy llamando al constructor con argumento
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        if(nombre == null){
            nombre = "Sin nombre";
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void personaNueva(Persona persona){
        
        if(persona == null){
            System.out.println("La persona se llama " + new Persona("Juan").getNombre());
        }else{
            System.out.println("La persona se llama " + persona.getNombre());
        }
    }
    
    public static void main(String[] a){
        Persona persona = new Persona();
        System.out.println(persona.getNombre());
        
        persona.personaNueva(null);
        
        
    }
}
