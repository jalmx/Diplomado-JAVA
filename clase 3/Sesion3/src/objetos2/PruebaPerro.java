package objetos2;

public class PruebaPerro {

    public static void main(String[] args) {
        Perro perrito = new Perro();
        
        perrito.asignarNombre("botas");
        perrito.asignarRaza("ElectricoSalchicha");
        
        System.out.println("Mi perrito se llama " + perrito.obtenerNombre() + 
                " es de raza " + perrito.obtenerRaza());
        
        perrito.ladrar();
        
        System.out.println(perrito.obtenerNombre() + " le gusta jugar con " + 
                perrito.jugar());
    }
    
}
