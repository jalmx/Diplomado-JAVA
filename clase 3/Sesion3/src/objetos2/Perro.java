package objetos2;

import java.util.Random;

public class Perro {
    
    private String nombre;
    private String raza;
    
    public void asignarNombre(String nombrePerro){
        nombre = nombrePerro;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void asignarRaza(String razaPerro){
        raza = razaPerro;
    }
    
    public String obtenerRaza(){
        return raza;
    }
    
    public void ladrar(){
        System.out.println("grr grrr grrr!!!");
    }
    
    public void correr(int velocidad){
        System.out.println("Corriendo a " +velocidad);
    }
    
    public String jugar(){
        String[] juegos = {"Chancla", "Pelota", "Hueso"};
        
        return juegos[new Random().nextInt(juegos.length)];
    }
}
