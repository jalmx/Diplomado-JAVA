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
public abstract class Pokemon {

    private final String nombre;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
