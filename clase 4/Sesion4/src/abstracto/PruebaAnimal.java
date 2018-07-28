package abstracto;

public class PruebaAnimal {

    public static void main(String[] args) {
        
        Animal manchas = new Perro("Manchitas");
        manchas.correr();
        System.out.println("Mi perrito se llama " + manchas.getNombre());
        
        Mamifero firulais = new Perro("Firulais");
        firulais.comer("Croquetas");
        firulais.correr();
        
        Perro botas = new Perro("botas");
        botas.ladrar();
        botas.comer("Pollo");
        botas.correr();
        
        //Animal animales[] = {manchas, firulais, botas};
        
        Perro n = (Perro) manchas;//casting
        n.ladrar();
    }
    
}
