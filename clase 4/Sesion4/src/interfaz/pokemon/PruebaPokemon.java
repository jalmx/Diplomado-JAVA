package interfaz.pokemon;

public class PruebaPokemon {

    public static void main(String[] args) {
        
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
        Weedle weedle = new Weedle("Weedle");
        
        bulbasaur.envenenamiento();
        weedle.envenenamiento();
        
    }
    
}
