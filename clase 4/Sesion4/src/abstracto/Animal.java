
package abstracto;

public abstract class Animal {
    
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    abstract void correr();
    
}
