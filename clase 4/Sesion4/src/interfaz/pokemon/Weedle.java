
package interfaz.pokemon;

public class Weedle extends Pokemon implements Bicho, Veneno {

    public Weedle(String nombre) {
        super(nombre);
    }

    @Override
    public void arrastrarse() {
        System.out.println("Ataque rápido");
    }

    @Override
    public void envenenamiento() {
        System.out.println("Mordida super venenosa");
    }
    
}
