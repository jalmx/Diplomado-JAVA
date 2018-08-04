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
public class Canino extends SerVivo<Salchicha>{

    public Canino(Salchicha e) {
        super(e);
        setNombre(e);
        setRaza(e);
    }

    @Override
    public void setNombre(Salchicha e) {
        super.nombre = e.getNombre();
    }

    @Override
    public String getNombre() {
        return super.nombre;
    }

    @Override
    public void setRaza(Salchicha e) {
        this.raza = e.getRaza();
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public Salchicha getSer() {
        return this.e;
    }

    
        
}
