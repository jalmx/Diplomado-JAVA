/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author josef
 */
public abstract class SerVivo <E> {
    
    protected String nombre;
    protected String raza;
    protected E e;
    
    public SerVivo(E e){
        this.e = e;
    }
    
    public abstract void setNombre(E e);
    public abstract String getNombre();
    
    public abstract void setRaza(E e);
    public abstract String getRaza();
    
    public abstract E getSer();
}
