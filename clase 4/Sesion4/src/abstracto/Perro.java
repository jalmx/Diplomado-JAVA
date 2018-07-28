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
public class Perro extends Mamifero{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void correr() {
        System.out.println("Corriendo muy rápido");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Como mucha " + comida);
    }
    
    public void ladrar(){
        System.out.println("goousss!!!");
    }
    
}
