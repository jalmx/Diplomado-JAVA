/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author josef
 */
public abstract class Mamifero extends Animal{
    
    public Mamifero(String nombre) {
        super(nombre);
    }
    
    abstract void comer(String comida);
    
}
