/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.pokemon;

/**
 *
 * @author josef
 */
public class Bulbasaur extends Pokemon implements Planta, Veneno{

    public Bulbasaur(String nombre) {
        super(nombre);
    }

    @Override
    public void lanzarSemillas() {
        System.out.println("Lanza semillas");
    }

    @Override
    public void envenenamiento() {
        System.out.println("Mordida venenosa");
    }
    
}
