package objetos;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona pedrito = new Persona();//creando una instancia de Persona
        
        pedrito.nombre = "Pedro"; //llamo a su campo nombre y le asigno un valor
        pedrito.edad = 20;//llamo a su campo edad y le asigno un valor
        
        pedrito.saludar();//llamo al método saludar()
        pedrito.decirEdad(); //llamo al método decirEdad()
        
        pedrito.calcularEdadActual(1989);
        
        pedrito.cenar("Huevo","Café");
        
        String hobby = pedrito.hobby();
        
        System.out.println("Mi hobby favorito es " + hobby);
        
        String mascota = pedrito.mascota("CaBAlLo");
        
        System.out.println("Mi mascota es un " + mascota);
    }
    
}
